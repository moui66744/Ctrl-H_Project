package Query;

import AstGenerator.CppAstInfo;
import CppParser.CppParser;
import CppVisitor.DeclVisitor;
import JavaQueryParser.*;
import CppVisitor.StmtVisitor;
import CppVisitor.ExpVisitor;
import org.antlr.v4.runtime.*;
import util.QueryResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CppQuery extends Query{

    CppAstInfo astInfo;

    public CppQuery(CppAstInfo astInfo){
        this.astInfo = astInfo;
        queryResult = new HashMap<>();
    }

    public Map<Integer, List<QueryResult>> query(
            CppParser.TranslationUnitContext ctx,
            JavaQueryParser.QueryInputContext qCtx
    ) {
        var res = queryHandler(ctx, qCtx, false);
        if(res == null){
            return null;
        } else {
            queryResult.put(0,res);
            return queryResult;
        }
    }


    protected List<QueryResult> queryHandler(
            ParserRuleContext ctx,
            JavaQueryParser.QueryInputContext qCtx,
            boolean isNot
    ) {
        List<QueryResult> result = null;

        ParserRuleContext qTypeCtx;
        if ((qTypeCtx = qIfStmtCtx(qCtx)) != null) {
            result = queryIf(ctx, (JavaQueryParser.IfStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qSwitchStmtCtx(qCtx)) != null) {
            result = querySwitch(ctx, (JavaQueryParser.SwitchStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qCaseStmtCtx(qCtx)) != null) {
            result = queryCase(ctx, (JavaQueryParser.CaseStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qForStmtCtx(qCtx)) != null) {
            result = queryFor(ctx, (JavaQueryParser.ForStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qWhileStmtCtx(qCtx)) != null) {
            result = queryWhile(ctx, (JavaQueryParser.WhileStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qDoWhileStmtCtx(qCtx)) != null) {
            result = queryDoWhile(ctx, (JavaQueryParser.DoWhileStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qBreakStmtCtx(qCtx)) != null) {
            result = queryBreak(ctx, (JavaQueryParser.BreakStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qContinueStmtCtx(qCtx)) != null) {
            result = queryContinue(ctx, (JavaQueryParser.ContinueStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qReturnStmtCtx(qCtx)) != null) {
            result = queryReturn(ctx, (JavaQueryParser.ReturnStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qExpressionStmtCtx(qCtx)) != null) {
            result = queryExprStmt(ctx, (JavaQueryParser.ExpressionContext) qTypeCtx);
        } else if ((qTypeCtx = qMethodDecl(qCtx)) != null) {
            result = queryMethodDecl(ctx, (JavaQueryParser.MethodDeclContext) qTypeCtx);
        } else if ((qTypeCtx = qVarDecl(qCtx)) != null) {
            result = queryVarDecl(ctx, (JavaQueryParser.VarDeclContext) qTypeCtx);
        } else if ((qTypeCtx = qExpr(qCtx)) != null) {
            result = queryExpr(ctx, (JavaQueryParser.ExpressionContext) qTypeCtx);
        }

        else {
            System.out.println("unimplemented");
        }

        if (result != null && result.isEmpty()) result = null;
        if (isNot)
            return result == null ? new ArrayList<>(List.of(new QueryResult(ctx))) : null;
        return result;
    }


    protected JavaQueryParser.IfStmtContext qIfStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().ifStmt();
    }


    protected JavaQueryParser.SwitchStmtContext qSwitchStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().switchStmt();
    }

	protected JavaQueryParser.CaseStmtContext qCaseStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().caseStmt();
    }

	protected JavaQueryParser.ForStmtContext qForStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().forStmt();
    }

	protected JavaQueryParser.WhileStmtContext qWhileStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().whileStmt();
    }

	protected JavaQueryParser.DoWhileStmtContext qDoWhileStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().doWhileStmt();
    }

	protected JavaQueryParser.BreakStmtContext qBreakStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().breakStmt();
    }

	protected JavaQueryParser.ContinueStmtContext qContinueStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().continueStmt();
    }

	protected JavaQueryParser.ReturnStmtContext qReturnStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().returnStmt();
    }

	protected JavaQueryParser.ExpressionContext qExpressionStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().statementExpression;
    }

	protected JavaQueryParser.MethodDeclContext qMethodDecl(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.decl() == null ? null : qCtx.decl().methodDecl();
    }

	protected JavaQueryParser.VarDeclContext qVarDecl(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.decl() == null ? null : qCtx.decl().varDecl();
    }

	protected JavaQueryParser.ExpressionContext qExpr(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.expression();
    }


	protected String tryGetText(ParserRuleContext ctx) {
        return ctx == null ? null : ctx.getText();
    }


	protected List<QueryResult> queryIf(
            ParserRuleContext ctx,
            JavaQueryParser.IfStmtContext queryIfStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String cond = tryGetText(queryIfStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.ifStmtFilter(
                stmtVisitor.ifStmtVisitor(ctx),
                cond
        );
        if (stmtCtxs == null) return null;
        for (CppParser.StatementContext stmtCtx : stmtCtxs) {// ?????????, ?????????????????????if
            boolean flag = true;
            JavaQueryParser.BlockContext blockContext0 = queryIfStmtCtx.block(0);
            var constrainContext = blockContext0.blockConstraint();
            if (constrainContext != null ){
                if (constrainContext.EMPTY_BLOCK() != null) {
                    flag = stmtCtx.ifStmt().statement(0).compoundStatement() == null || stmtCtx.ifStmt().statement(0).compoundStatement().statementSeq().isEmpty();
                }
            } else {
                for (JavaQueryParser.SubQueryContext subQueryContext : blockContext0.subQuery()) {
                    if (subQuery(stmtCtx.ifStmt().statement(0), subQueryContext) == null) {
                        flag = false;// ??????subQuery????????????, ??????if????????????
                        break;
                    }
                }
            }
            if (!flag) continue;
            if (queryIfStmtCtx.ELSE() != null) {
                JavaQueryParser.BlockContext blockContext1 = queryIfStmtCtx.block(1);
                constrainContext = blockContext1.blockConstraint();
                if (constrainContext != null){
                    if (constrainContext.NULL_BLOCK() != null){
                        flag = stmtCtx.ifStmt().Else() == null;
                    } else if (constrainContext.EMPTY_BLOCK() != null){
                        if (stmtCtx.ifStmt().Else() == null)
                            flag = false;
                        else if (stmtCtx.ifStmt().statement(1).compoundStatement() != null )
                            flag = stmtCtx.ifStmt().statement(1).compoundStatement().statementSeq().isEmpty();
                        else
                            flag = false;
                    }
                } else {
                    if (stmtCtx.ifStmt().Else() == null )
                        flag = false;
                    else for (JavaQueryParser.SubQueryContext subQueryContext : blockContext1.subQuery()) {
                        if (subQuery(stmtCtx.ifStmt().statement(1), subQueryContext) == null) {
                            flag = false;// ??????subQuery????????????, ??????if????????????
                            break;
                        }
                    }
                }
            }
            if (flag) {// ?????????, ????????????block??????subQuery?????????, ?????????????????????
                var node = new QueryResult(stmtCtx);
                for (var item : stmtCtx.ifStmt().statement()){
                    if (item.compoundStatement() != null){
                        var start = astInfo.getTokenStream().get(item.compoundStatement().LeftBrace().getSymbol().getTokenIndex() + 1);
                        var stop = astInfo.getTokenStream().get(item.compoundStatement().RightBrace().getSymbol().getTokenIndex() - 1);
                        node.addSubNode(
                                start.getLine(),
                                start.getCharPositionInLine(),
                                stop.getLine(),
                                stop.getCharPositionInLine(),
                                start.getStartIndex(),
                                stop.getStopIndex()

                        );
                    } else {
                        node.addSubNode(item);
                    }
                }
                result.add(node);
            }
        }
        if (result.isEmpty())return null;
        return result;
    }


	protected List<QueryResult> querySwitch(
            ParserRuleContext ctx,
            JavaQueryParser.SwitchStmtContext querySwiStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String cond = tryGetText(querySwiStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.switchStmtFilter(
                stmtVisitor.switchStmtVisitor(ctx),
                cond
        );
        if (stmtCtxs == null) return null;
        for (CppParser.StatementContext stmtCtx : stmtCtxs) {
            JavaQueryParser.BlockContext blockContext = querySwiStmtCtx.block();
            CppParser.StatementContext statementContext = stmtCtx.switchStmt().statement();
            boolean flag = true;
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(statementContext, subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                var subBlockContext = stmtCtx.switchStmt().statement().compoundStatement();
                addStatementToSubNode(result, stmtCtx, subBlockContext, stmtCtx.switchStmt().statement());
            }
        }
        if (result.isEmpty())return null;
        return result;
    }


	protected List<QueryResult> queryCase(
            ParserRuleContext ctx,
            JavaQueryParser.CaseStmtContext queryCaseStmtCtx
    ) {
        return null;
    }


	protected List<QueryResult> queryFor(
            ParserRuleContext ctx,
            JavaQueryParser.ForStmtContext queryForStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        JavaQueryParser.ForControlContext forControl = queryForStmtCtx.forControl();
        String forInit = tryGetText(forControl.forInit());
        String cond = tryGetText(forControl.expression());
        String forUpdate = tryGetText(forControl.forUpdate);

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.forStmtFilter(
                stmtVisitor.forStmtVisitor(ctx),
                forInit,
                cond,
                forUpdate
        );
        if (stmtCtxs == null) return null;
        for (CppParser.StatementContext stmtCtx : stmtCtxs) {
            boolean flag = true;
            JavaQueryParser.BlockContext blockContext = queryForStmtCtx.block();
            var constraint = blockContext.blockConstraint();
            if (constraint != null){
                if (constraint.EMPTY_BLOCK() != null){
                    if (stmtCtx.forStmt().statement().compoundStatement() != null)
                        flag = stmtCtx.forStmt().statement().compoundStatement().statementSeq().isEmpty();
                    else
                        flag = false;
                }
            } else {
                for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                    if (subQuery(stmtCtx.forStmt().statement(), subQueryContext) == null) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                var subBlockContext = stmtCtx.forStmt().statement().compoundStatement();
                addStatementToSubNode(result, stmtCtx, subBlockContext,stmtCtx.forStmt().statement());
            }
        }
        if (result.isEmpty()) return null;
        return result;
    }

    private <T extends ParserRuleContext>void addStatementToSubNode(List<QueryResult> result, T stmtCtx, CppParser.CompoundStatementContext subBlockContext, T subNodeContext) {
        if (subBlockContext != null){
            var start = astInfo.getTokenStream().get(subBlockContext.LeftBrace().getSymbol().getTokenIndex() + 1);
            var stop = astInfo.getTokenStream().get(subBlockContext.RightBrace().getSymbol().getTokenIndex() - 1);
            result.add(new QueryResult(stmtCtx).addSubNode(
                    start.getLine(),
                    start.getCharPositionInLine(),
                    stop.getLine(),
                    stop.getCharPositionInLine(),
                    start.getStartIndex(),
                    stop.getStopIndex()

            ));
        } else {
            result.add(new QueryResult(stmtCtx).addSubNode(subNodeContext));
        }
    }


	protected List<QueryResult> queryWhile(
            ParserRuleContext ctx,
            JavaQueryParser.WhileStmtContext queryWhileStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String cond = tryGetText(queryWhileStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.whileStmtFilter(
                stmtVisitor.whileStmtVisitor(ctx),
                cond
        );
        if (stmtCtxs == null) return null;
        for (CppParser.StatementContext stmtCtx : stmtCtxs) {
            boolean flag = true;
            JavaQueryParser.BlockContext blockContext = queryWhileStmtCtx.block();
            var constraint = blockContext.blockConstraint();
            if (constraint != null) {
                if (constraint.EMPTY_BLOCK() != null){
                    if (stmtCtx.whileStmt().statement().compoundStatement() != null)
                        flag = stmtCtx.whileStmt().statement().compoundStatement().statementSeq().isEmpty();
                    else
                        flag = false;
                }
            }
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(stmtCtx.whileStmt().statement(), subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                var subBlockContext = stmtCtx.whileStmt().statement().compoundStatement();
                addStatementToSubNode(result, stmtCtx, subBlockContext,stmtCtx.whileStmt());
            }
        }
        if (result.isEmpty()) return null;
        return result;
    }


	protected List<QueryResult> queryDoWhile(
            ParserRuleContext ctx,
            JavaQueryParser.DoWhileStmtContext queryDoWhileStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String cond = tryGetText(queryDoWhileStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.doWhileStmtFilter(
                stmtVisitor.doWhileStmtVisitor(ctx),
                cond
        );
        if (stmtCtxs == null) return null;
        for (CppParser.StatementContext stmtCtx : stmtCtxs) {
            boolean flag = true;
            JavaQueryParser.BlockContext blockContext = queryDoWhileStmtCtx.block();
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(stmtCtx.doWhileStmt().statement(), subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                var subBlockContext = stmtCtx.doWhileStmt().statement().compoundStatement();
                addStatementToSubNode(result, stmtCtx, subBlockContext,stmtCtx.doWhileStmt());
            }
        }
        if (result.isEmpty()) return null;
        return result;
    }
    

	protected List<QueryResult> queryBreak(
            ParserRuleContext ctx,
            JavaQueryParser.BreakStmtContext queryBrkStmtCtx
    ) {
        String ident = tryGetText(queryBrkStmtCtx.identifier());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.breakStmtVisitor(ctx);
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(QueryResult::new).toList();
    }


	protected List<QueryResult> queryContinue(
            ParserRuleContext ctx,
            JavaQueryParser.ContinueStmtContext queryContinueStmtCtx
    ) {
        String ident = tryGetText(queryContinueStmtCtx.identifier());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.continueStmtVisitor(ctx);
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(QueryResult::new).toList();
    }


	protected List<QueryResult> queryReturn(
            ParserRuleContext ctx,
            JavaQueryParser.ReturnStmtContext queryReturnStmtCtx
    ) {
        String expr = tryGetText(queryReturnStmtCtx.expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.returnStmtFilter(
                stmtVisitor.returnStmtVisitor(ctx),
                expr
        );
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(QueryResult::new).toList();
    }


	protected List<QueryResult> queryExprStmt(
            ParserRuleContext ctx,
            JavaQueryParser.ExpressionContext queryExprCtx
    ) {
        return queryExpr(ctx, queryExprCtx);
    }


	protected List<QueryResult> queryMethodDecl(
            ParserRuleContext ctx,
            JavaQueryParser.MethodDeclContext qMethodDeclCtx
    ) {
        DeclVisitor declVisitor = new DeclVisitor();
        // name filter
        String ident = qMethodDeclCtx.identifier().WILDCARD() == null ? qMethodDeclCtx.identifier().getText() : null;
        // type filter
        String type = qMethodDeclCtx.typeTypeOrVoid() == null ? null : qMethodDeclCtx.typeTypeOrVoid().getText();
        // parameter filter
        String formalParameters = qMethodDeclCtx.formalParameterList() == null ? null : qMethodDeclCtx.formalParameterList().getText();
        List<CppParser.BlockDeclarationContext> list = declVisitor.funcDeclFilter(
                declVisitor.funcDeclVisitor(ctx),
                type,
                ident,
                formalParameters
        );
        if (list == null) return null;
        List<QueryResult> result = new ArrayList<>();
        for (CppParser.BlockDeclarationContext blockDeclCtx : list) {
            boolean flag = true;
            var constraint = qMethodDeclCtx.block().blockConstraint();
            if (constraint != null){
                if (constraint.EMPTY_BLOCK() != null){
                    flag = blockDeclCtx.functionDefinition().functionBody().compoundStatement().statementSeq().isEmpty();
                }
            } else {
                for (JavaQueryParser.SubQueryContext subQueryContext : qMethodDeclCtx.block().subQuery()) {
                    if (subQuery(blockDeclCtx.functionDefinition().functionBody(), subQueryContext) == null) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                var subBlockContext = blockDeclCtx.functionDefinition().functionBody().compoundStatement();
                addStatementToSubNode(result, blockDeclCtx, subBlockContext,null);
            }
        }
        return result;
    }


	protected List<QueryResult> queryVarDecl(
            ParserRuleContext ctx,
            JavaQueryParser.VarDeclContext qVarDeclCtx
    ) {
        DeclVisitor declVisitor = new DeclVisitor();
        // name filter
        String name = qVarDeclCtx.identifier().WILDCARD() == null ? qVarDeclCtx.identifier().getText() : null;
        // type filter
        String type = qVarDeclCtx.typeTypeOrVoid().getText();
        List<CppParser.BlockDeclarationContext> list = declVisitor.varDeclFilter(
                declVisitor.varDeclVisitor(ctx),
                type,
                name
        );
        if (list == null) return null;
        return list.stream().map(QueryResult::new).toList();
    }


	protected List<QueryResult> queryExpr(
            ParserRuleContext ctx,
            JavaQueryParser.ExpressionContext qExprCtx
    ) {
        ExpVisitor expVisitor = new ExpVisitor();
        return expVisitor.filterByExp(expVisitor.visit(ctx), qExprCtx.getText())
                .stream().map(QueryResult::new).toList();
    }


    public static void main(String[] args) throws IOException {
        CppAstInfo astInfo = new CppAstInfo("Project/test/CppTest/test.cpp");

        String[] needle = {
""" 
if (a == 0) {
    if (b == 0) {
    }
    if (d == 0) {
    }
}
""",
"""
if (a == 0) {
    \\if (b == 0) {
    }
}
""",
"""
for (i = 0; i < 5; i++) {
    if (a == 0) {
    }
}
""",
"""
while (i < 5) {
    while (j < 10) {
        continue;
    }
}
""",
"""
do {
    if (a == 0) {
        break;
    }
} while (i < 5);
""",
"""
switch (i) {
    if () {}
}
""",
"""
if () {
} else {
}
""",
"""
return input;
""",
"""
int retinput() {
}
""",
"""
for (i = 0; i < 5; i++) {
    if (a == 0) {
        a = 0;
        b = 0;
    }
    System.out.println(i);
}
""",
        };

        for (String s : needle) {
            CharStream charStream = CharStreams.fromString(s);
            JavaQueryLexer javaQueryLexer = new JavaQueryLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(javaQueryLexer);
            JavaQueryParser javaQueryParser = new JavaQueryParser(commonTokenStream);

            var query = new CppQuery(astInfo).query(astInfo.getRoot(), javaQueryParser.queryInput());

            if (query != null)
                for (var i : query.entrySet()) {
                    System.out.println("["+i.getKey()+"]");
                    i.getValue().stream().map(QueryResult::getText).forEach(System.out::println);
                }
            System.out.println();
            System.out.println();
        }
    }
}
