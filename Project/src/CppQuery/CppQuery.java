package CppQuery;

import AstGenerator.CppAstInfo;
import CppParser.CppParser;
import CppVisitor.DeclVisitor;
import JavaQueryParser.*;
import CppVisitor.StmtVisitor;
import CppVisitor.ExpVisitor;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CppQuery {
    public List<ParserRuleContext> query(
            CppParser.TranslationUnitContext ctx,
            JavaQueryParser.QueryInputContext qCtx
    ) {
        return queryHandler(ctx, qCtx, false);
    }

    private List<ParserRuleContext> subQuery(
            ParserRuleContext ctx,
            JavaQueryParser.SubQueryContext subQueryCtx
    ) {
        JavaQueryParser.QueryInputContext qCtx = subQueryCtx.queryInput();
        boolean isNot = subQueryCtx.notOp != null;
        return queryHandler(ctx, qCtx, isNot);
    }

    private List<ParserRuleContext> queryHandler(
            ParserRuleContext ctx,
            JavaQueryParser.QueryInputContext qCtx,
            boolean isNot
    ) {
        List<ParserRuleContext> result = null;

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

        if (isNot && result == null)
            result = new ArrayList<>(List.of(ctx));
        else if (isNot)
            result = null;
        return result;
    }

    private JavaQueryParser.IfStmtContext qIfStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().ifStmt();
    }
    private JavaQueryParser.SwitchStmtContext qSwitchStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().switchStmt();
    }
    private JavaQueryParser.CaseStmtContext qCaseStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().caseStmt();
    }
    private JavaQueryParser.ForStmtContext qForStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().forStmt();
    }
    private JavaQueryParser.WhileStmtContext qWhileStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().whileStmt();
    }
    private JavaQueryParser.DoWhileStmtContext qDoWhileStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().doWhileStmt();
    }
    private JavaQueryParser.BreakStmtContext qBreakStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().breakStmt();
    }
    private JavaQueryParser.ContinueStmtContext qContinueStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().continueStmt();
    }
    private JavaQueryParser.ReturnStmtContext qReturnStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().returnStmt();
    }
    private JavaQueryParser.ExpressionContext qExpressionStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().statementExpression;
    }
    private JavaQueryParser.MethodDeclContext qMethodDecl(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.decl() == null ? null : qCtx.decl().methodDecl();
    }
    private JavaQueryParser.VarDeclContext qVarDecl(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.decl() == null ? null : qCtx.decl().varDecl();
    }
    private JavaQueryParser.ExpressionContext qExpr(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.expression();
    }

    private String tryGetText(ParserRuleContext ctx) {
        return ctx == null ? null : ctx.getText();
    }

    private List<ParserRuleContext> queryIf(
            ParserRuleContext ctx,
            JavaQueryParser.IfStmtContext queryIfStmtCtx
    ) {
        List<ParserRuleContext> result = null;
        String cond = tryGetText(queryIfStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.ifStmtFilter(
                stmtVisitor.ifStmtVisitor(ctx),
                cond
        );
        if (stmtCtxs == null) return null;
        for (CppParser.StatementContext stmtCtx : stmtCtxs) {// 或逻辑, 每一个查询到的if
            boolean flag = true;
            JavaQueryParser.BlockContext blockContext0 = queryIfStmtCtx.block(0);
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext0.subQuery()) {
                if (subQuery(stmtCtx.ifStmt().statement(0), subQueryContext) == null) {
                    flag = false;// 某一subQuery匹配失败, 则该if匹配失败
                    break;
                }
            }
            if (!flag) continue;
            if (queryIfStmtCtx.ELSE() != null) {
                if (stmtCtx.ifStmt().Else() == null) continue;
                JavaQueryParser.BlockContext blockContext1 = queryIfStmtCtx.block(1);
                for (JavaQueryParser.SubQueryContext subQueryContext : blockContext1.subQuery()) {
                    if (subQuery(stmtCtx.ifStmt().statement(1), subQueryContext) == null) {
                        flag = false;// 某一subQuery匹配失败, 则该if匹配失败
                        break;
                    }
                }
            }
            if (flag) {// 与逻辑, 只有两个block中的subQuery都满足, 才认为匹配成功
                if (result == null) result = new ArrayList<>();
                result.add(stmtCtx);
            }
        }
        return result;
    }

    private List<ParserRuleContext> querySwitch(
            ParserRuleContext ctx,
            JavaQueryParser.SwitchStmtContext querySwiStmtCtx
    ) {
        List<ParserRuleContext> result = null;
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
                if (result == null) result = new ArrayList<>();
                result.add(stmtCtx);
            }
        }
        return result;
    }

    private List<ParserRuleContext> queryCase(
            ParserRuleContext ctx,
            JavaQueryParser.CaseStmtContext queryCaseStmtCtx
    ) {
//        List<ParserRuleContext> result = null;
//        String cond = tryGetText(queryCaseStmtCtx.expression());
//
//        StmtVisitor stmtVisitor = new StmtVisitor();
//        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.caseStmtFilter(
//                stmtVisitor.caseStmtVisitor(ctx),
//                cond
//        );
//        if (stmtCtxs == null) return null;
//        for (CppParser.StatementContext stmtCtx : stmtCtxs) {
//            JavaQueryParser.BlockContext blockContext = querySwiStmtCtx.block();
//            CppParser.SwitchContentContext switchContentContext = stmtCtx.switchStmt().switchContent();
//            boolean flag = true;
//            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
//                if (subQuery(switchContentContext, subQueryContext) == null) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                if (result == null) result = new ArrayList<>();
//                result.add(stmtCtx);
//            }
//        }
        return null;
    }

    private List<ParserRuleContext> queryFor(
            ParserRuleContext ctx,
            JavaQueryParser.ForStmtContext queryForStmtCtx
    ) {
        List<ParserRuleContext> result = null;
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
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(stmtCtx.forStmt().statement(), subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (result == null) result = new ArrayList<>();
                result.add(stmtCtx);
            }
        }
        return result;
    }

    private List<ParserRuleContext> queryWhile(
            ParserRuleContext ctx,
            JavaQueryParser.WhileStmtContext queryWhileStmtCtx
    ) {
        List<ParserRuleContext> result = null;
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
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(stmtCtx.whileStmt().statement(), subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (result == null) result = new ArrayList<>();
                result.add(stmtCtx);
            }
        }
        return result;
    }

    private List<ParserRuleContext> queryDoWhile(
            ParserRuleContext ctx,
            JavaQueryParser.DoWhileStmtContext queryDoWhileStmtCtx
    ) {
        List<ParserRuleContext> result = null;
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
                if (result == null) result = new ArrayList<>();
                result.add(stmtCtx);
            }
        }
        return result;
    }
    
    private List<ParserRuleContext> queryBreak(
            ParserRuleContext ctx,
            JavaQueryParser.BreakStmtContext queryBrkStmtCtx
    ) {
        String ident = tryGetText(queryBrkStmtCtx.identifier());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.breakStmtVisitor(ctx);
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(stmt -> (ParserRuleContext)stmt).toList();
    }

    private List<ParserRuleContext> queryContinue(
            ParserRuleContext ctx,
            JavaQueryParser.ContinueStmtContext queryContinueStmtCtx
    ) {
        String ident = tryGetText(queryContinueStmtCtx.identifier());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<CppParser.StatementContext> stmtCtxs = stmtVisitor.continueStmtVisitor(ctx);
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(stmt -> (ParserRuleContext) stmt).toList();
    }

    private List<ParserRuleContext> queryReturn(
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
        return stmtCtxs.stream().map(stmt -> (ParserRuleContext)stmt).toList();
    }

    private List<ParserRuleContext> queryExprStmt(
            ParserRuleContext ctx,
            JavaQueryParser.ExpressionContext queryExprCtx
    ) {
        return queryExpr(ctx, queryExprCtx);
    }

    private List<ParserRuleContext> queryMethodDecl(
            ParserRuleContext ctx,
            JavaQueryParser.MethodDeclContext qMethodDeclCtx
    ) {
        DeclVisitor declVisitor = new DeclVisitor();
        // name filter
        String ident = qMethodDeclCtx.identifier().getText();
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
        List<ParserRuleContext> result = null;
        for (CppParser.BlockDeclarationContext blockDeclCtx : list) {
            boolean flag = true;
            for (JavaQueryParser.SubQueryContext subQueryContext : qMethodDeclCtx.block().subQuery()) {
                if (subQuery(blockDeclCtx.functionDefinition().functionBody(), subQueryContext) == null) {
                    flag = false;
                }
            }
            if (flag) {
                if (result == null) result = new ArrayList<>();
                result.add(blockDeclCtx);
            }
        }
        return result;
    }

    private List<ParserRuleContext> queryVarDecl(
            ParserRuleContext ctx,
            JavaQueryParser.VarDeclContext qVarDeclCtx
    ) {
        DeclVisitor declVisitor = new DeclVisitor();
        // name filter
        String name = qVarDeclCtx.identifier().getText();
        // type filter
        String type = qVarDeclCtx.typeTypeOrVoid().getText();
        List<CppParser.BlockDeclarationContext> list = declVisitor.varDeclFilter(
                declVisitor.varDeclVisitor(ctx),
                type,
                name
        );
        if (list == null) return null;
        return new ArrayList<>(list);
    }

    private List<ParserRuleContext> queryExpr(
            ParserRuleContext ctx,
            JavaQueryParser.ExpressionContext qExprCtx
    ) {
        ExpVisitor expVisitor = new ExpVisitor();
        return expVisitor.filterByExp(expVisitor.visit(ctx), qExprCtx.getText())
                .stream().map(c -> (ParserRuleContext) c).toList();
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

            List<ParserRuleContext> query = new CppQuery().query(astInfo.getRoot(), javaQueryParser.queryInput());

            if (query != null)
                query.stream().map(RuleContext::getText).forEach(System.out::println);
            System.out.println();
        }
    }
}
