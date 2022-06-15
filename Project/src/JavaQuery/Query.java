package JavaQuery;

import AstGenerator.AstInfo;
import Info.ClassInfo;
import Info.DeclarationBaseInfo;
import Info.MethodInfo;
import Info.VariableInfo;
import JavaParser.JavaParser;
import JavaQueryParser.JavaQueryParser;
import JavaQueryParser.JavaQueryLexer;
import JavaQueryParser.QueryChecker;
import Visitor.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import util.QueryResult;

import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Query {
    Map<Integer, List<QueryResult>> queryResult;
    AstInfo astInfo;

    public Query(AstInfo info){
        queryResult = new HashMap<>();
        astInfo = info;
    }

    /**
     * 匹配语法树和查询树
     * @param ctx: 语法树根结点
     * @param qCtx: 查询树根结点
     * @return 语法树中满足查询树的结果
     */
    public Map<Integer, List<QueryResult>> query(
            JavaParser.CompilationUnitContext ctx,
            JavaQueryParser.QueryInputContext qCtx
    ) {
        var res = queryHandler(ctx, qCtx, false);
        if (res == null)
            return null;
        else {
            queryResult.put(
              0,
              res
            );
            return queryResult;
        }
    }

    // ****************************** 以下对外隐藏 ******************************

    /**
     * 递归在子树上处理subQuery
     * @param ctx: 语法树上结点
     * @param subQueryCtx: 查询树上一个subQueryContext
     * @return 子树上满足查询子树的结点
     * */
    private Map<Integer, List<QueryResult>> subQuery(
            ParserRuleContext ctx,
            JavaQueryParser.SubQueryContext subQueryCtx
    ) {
        JavaQueryParser.QueryInputContext qCtx = subQueryCtx.queryInput();
        boolean isNot = subQueryCtx.notOp != null;
        var queryHandlerResult = queryHandler(ctx, qCtx, isNot);

        if (queryHandlerResult == null)
            return null;
        int label ;
        if (subQueryCtx.queryLabel() == null){
            return queryResult;
        }
        label = Integer.parseInt(subQueryCtx.queryLabel().integerLiteral().getText());
        queryResult.merge(label, queryHandlerResult,(oldValue,newValue)-> {
            List<QueryResult> a = new ArrayList<>();
            a.addAll(oldValue);
            a.addAll(newValue);
            return a;
        });
        return queryResult;
    }

    /**
     * 完成一次query/subQuery中的具体查询类型的分发和处理
     * @param ctx: 语法树上一结点, 代表语法树子树
     * @param qCtx: 查询树上一QueryInput结点, 代表一次query/subQuery
     * @return query/subQuery的查询结果(对于subQuery的查询结果, 目前未使用)
     */
    private List<QueryResult> queryHandler(
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
        } else if ((qTypeCtx = qTryStmtCtx(qCtx)) != null) {
            result = queryTry(ctx, (JavaQueryParser.TryStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qThrowStmtCtx(qCtx)) != null) {
            result = queryThrow(ctx, (JavaQueryParser.ThrowStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qBreakStmtCtx(qCtx)) != null) {
            result = queryBreak(ctx, (JavaQueryParser.BreakStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qContinueStmtCtx(qCtx)) != null) {
            result = queryContinue(ctx, (JavaQueryParser.ContinueStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qReturnStmtCtx(qCtx)) != null) {
            result = queryReturn(ctx, (JavaQueryParser.ReturnStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qAssertStmtCtx(qCtx)) != null) {
            result = queryAssert(ctx, (JavaQueryParser.AssertStmtContext) qTypeCtx);
        } else if ((qTypeCtx = qExpressionStmtCtx(qCtx)) != null) {
            result = queryExprStmt(ctx, (JavaQueryParser.ExpressionContext) qTypeCtx);
        } else if ((qTypeCtx = qImportDecl(qCtx)) != null) {
            result = queryImport(ctx, (JavaQueryParser.ImportDeclarationContext) qTypeCtx);
        } else if ((qTypeCtx = qClassLikeDecl(qCtx)) != null) {
            result = queryClassLike(ctx, (JavaQueryParser.ClassLikeDeclContext) qTypeCtx);
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
            result = new ArrayList<>(List.of(new QueryResult(ctx)));
        else if (isNot)
            result = null;
        return result;
    }

    private String tryGetText(ParserRuleContext ctx) {
        return ctx == null ? null : ctx.getText();
    }

    // *******************************************************************************************
    // ****************************** 从QueryInput中获取具体的查询类型 ******************************
    // *******************************************************************************************

    /**
     * 获取QueryInput中的ifStmt
     * @param qCtx: QueryInput
     * @return 如果QueryInput中有ifStmt, 则返回; 否则返回null
     */
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
    private JavaQueryParser.TryStmtContext qTryStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().tryStmt();
    }
    private JavaQueryParser.ThrowStmtContext qThrowStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().throwStmt();
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
    private JavaQueryParser.AssertStmtContext qAssertStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().assertStmt();
    }
    private JavaQueryParser.ExpressionContext qExpressionStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.statement() == null ? null : qCtx.statement().statementExpression;
    }
    private JavaQueryParser.ImportDeclarationContext qImportDecl(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.importDeclaration();
    }
    private JavaQueryParser.ClassLikeDeclContext qClassLikeDecl(JavaQueryParser.QueryInputContext qCtx) {
        return qCtx.decl() == null ? null : qCtx.decl().classLikeDecl();
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

    // *********************************************************************************
    // ****************************** 处理QueryInput的查询 ******************************
    // *********************************************************************************
    // 一次查询可能找到多个满足条件的Ctx
    // 对于一次查询, 只要有一个Ctx满足查询子树的所有subQuery, 就算查询成功(或逻辑)
    // 对于一个Ctx, 只要有一个subQuery不满足, 就算查询失败(与逻辑)

    /**
     * 处理一次QueryInput中的if语句查询
     * @param ctx: 语法树上一结点, 代表语法树子树
     * @param queryIfStmtCtx: 查询树上ifStmt结点
     * @return 与当前语法树子树上与查询树子树匹配的if语句
     */
    private List<QueryResult> queryIf(
            ParserRuleContext ctx,
            JavaQueryParser.IfStmtContext queryIfStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String cond = tryGetText(queryIfStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.ifStmtFilter(
                stmtVisitor.ifStmtVisitor(ctx),
                cond,
                StmtVisitor.IF_TYPE.DONT_CARE
        );
        if (stmtCtxs == null) return null;
        for (JavaParser.StatementContext stmtCtx : stmtCtxs) {// 或逻辑, 每一个查询到的if
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
                if (stmtCtx.ifStmt().ELSE() == null) continue;
                JavaQueryParser.BlockContext blockContext1 = queryIfStmtCtx.block(1);
                for (JavaQueryParser.SubQueryContext subQueryContext : blockContext1.subQuery()) {
                    if (subQuery(stmtCtx.ifStmt().statement(1), subQueryContext) == null) {
                        flag = false;// 某一subQuery匹配失败, 则该if匹配失败
                        break;
                    }
                }
            }
            if (flag) {// 与逻辑, 只有两个block中的subQuery都满足, 才认为匹配成功
                var node = new QueryResult(stmtCtx);
                for (var item : stmtCtx.ifStmt().statement()){
                    if (item.block() != null){
                        var start = astInfo.getTokenStream().get(item.block().LBRACE().getSymbol().getTokenIndex() + 1);
                        var stop = astInfo.getTokenStream().get(item.block().RBRACE().getSymbol().getTokenIndex() -1);
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
        if (result.size() == 0)
            return null;
        return result;
    }

    private List<QueryResult> querySwitch(
            ParserRuleContext ctx,
            JavaQueryParser.SwitchStmtContext querySwiStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String cond = tryGetText(querySwiStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.switchStmtFilter(
                stmtVisitor.switchStmtVisitor(ctx),
                cond
        );
        if (stmtCtxs == null) return null;
        for (JavaParser.StatementContext stmtCtx : stmtCtxs) {
            JavaQueryParser.BlockContext blockContext = querySwiStmtCtx.block();
            JavaParser.SwitchContentContext switchContentContext = stmtCtx.switchStmt().switchContent();
            boolean flag = true;
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(switchContentContext, subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(new QueryResult(stmtCtx).addSubNode(stmtCtx.switchStmt().switchContent()));
            }
        }
        return result;
    }

    private List<QueryResult> queryCase(
            ParserRuleContext ctx,
            JavaQueryParser.CaseStmtContext queryCaseStmtCtx
    ) {
//        List<ParserRuleContext> result = null;
//        String cond = tryGetText(queryCaseStmtCtx.expression());
//
//        StmtVisitor stmtVisitor = new StmtVisitor();
//        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.caseStmtFilter(
//                stmtVisitor.caseStmtVisitor(ctx),
//                cond
//        );
//        if (stmtCtxs == null) return null;
//        for (JavaParser.StatementContext stmtCtx : stmtCtxs) {
//            JavaQueryParser.BlockContext blockContext = querySwiStmtCtx.block();
//            JavaParser.SwitchContentContext switchContentContext = stmtCtx.switchStmt().switchContent();
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

    private List<QueryResult> queryFor(
            ParserRuleContext ctx,
            JavaQueryParser.ForStmtContext queryForStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        JavaQueryParser.ForControlContext forControl = queryForStmtCtx.forControl();
        String forInit = tryGetText(forControl.forInit());
        String cond = tryGetText(forControl.expression());
        String forUpdate = tryGetText(forControl.forUpdate);

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.forStmtFilter(
                stmtVisitor.forStmtVisitor(ctx),
                forInit,
                cond,
                forUpdate
        );
        if (stmtCtxs == null) return null;
        for (JavaParser.StatementContext stmtCtx : stmtCtxs) {
            boolean flag = true;
            JavaQueryParser.BlockContext blockContext = queryForStmtCtx.block();
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(stmtCtx.forStmt().statement(), subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                var node = new QueryResult(stmtCtx);
                var item = stmtCtx.forStmt().statement();
                if (item.block() != null){
                    var start = astInfo.getTokenStream().get(item.block().LBRACE().getSymbol().getTokenIndex() + 1);
                    var stop = astInfo.getTokenStream().get(item.block().RBRACE().getSymbol().getTokenIndex() -1);
                    node.addSubNode(
                            start.getLine(),
                            start.getCharPositionInLine(),
                            stop.getLine(),
                            stop.getCharPositionInLine(),
                            start.getStartIndex(),
                            stop.getStopIndex()

                    );
                }else {
                    node.addSubNode(stmtCtx.forStmt().statement());
                }
                result.add(node);
            }
        }
        if (result.size() == 0)return  result;
        return result;
    }

    private List<QueryResult> queryWhile(
            ParserRuleContext ctx,
            JavaQueryParser.WhileStmtContext queryWhileStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String cond = tryGetText(queryWhileStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.whileStmtFilter(
                stmtVisitor.whileStmtVisitor(ctx),
                cond
        );
        if (stmtCtxs == null) return null;
        for (JavaParser.StatementContext stmtCtx : stmtCtxs) {
            boolean flag = true;
            JavaQueryParser.BlockContext blockContext = queryWhileStmtCtx.block();
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(stmtCtx.whileStmt().statement(), subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                var node = new QueryResult(stmtCtx);
                var item = stmtCtx.whileStmt().statement();
                if (item.block() != null){
                    var start = astInfo.getTokenStream().get(item.block().LBRACE().getSymbol().getTokenIndex() + 1);
                    var stop = astInfo.getTokenStream().get(item.block().RBRACE().getSymbol().getTokenIndex() -1);
                    node.addSubNode(
                            start.getLine(),
                            start.getCharPositionInLine() ,
                            stop.getLine(),
                            stop.getCharPositionInLine(),
                            start.getStartIndex(),
                            stop.getStopIndex()

                    );
                }else {
                    node.addSubNode(stmtCtx.whileStmt().statement());
                }
                result.add(node);
            }
        }
        if (result.size() == 0)return null;
        return result;
    }

    private List<QueryResult> queryDoWhile(
            ParserRuleContext ctx,
            JavaQueryParser.DoWhileStmtContext queryDoWhileStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String cond = tryGetText(queryDoWhileStmtCtx.parExpression().expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.doWhileStmtFilter(
                stmtVisitor.doWhileStmtVisitor(ctx),
                cond
        );
        if (stmtCtxs == null) return null;
        for (JavaParser.StatementContext stmtCtx : stmtCtxs) {
            boolean flag = true;
            JavaQueryParser.BlockContext blockContext = queryDoWhileStmtCtx.block();
            for (JavaQueryParser.SubQueryContext subQueryContext : blockContext.subQuery()) {
                if (subQuery(stmtCtx.doWhileStmt().statement(), subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                var node = new QueryResult(stmtCtx);
                var item = stmtCtx.doWhileStmt().statement();
                if (item.block() != null){
                    var start = astInfo.getTokenStream().get(item.block().LBRACE().getSymbol().getTokenIndex() + 1);
                    var stop = astInfo.getTokenStream().get(item.block().RBRACE().getSymbol().getTokenIndex() -1);
                    node.addSubNode(
                            start.getLine(),
                            start.getCharPositionInLine(),
                            stop.getLine(),
                            stop.getCharPositionInLine(),
                            start.getStartIndex(),
                            stop.getStopIndex()
                    );
                }else {
                    node.addSubNode(stmtCtx.doWhileStmt().statement());
                }
                result.add(node);
            }
        }
        return result;
    }

    private List<QueryResult> queryTry(
            ParserRuleContext ctx,
            JavaQueryParser.TryStmtContext queryTryStmtCtx
    ) {
        List<QueryResult> result = new ArrayList<>();
        String s = tryGetText(queryTryStmtCtx.catchClause(0));
        String cond = s == null ? null : s.split("[()]")[1];

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.tryStmtFilter(
                stmtVisitor.tryStmtVisitor(ctx),
                cond,
                StmtVisitor.TRY_TYPE.DONT_CARE
        );
        if (stmtCtxs == null) return null;
        for (JavaParser.StatementContext stmtCtx : stmtCtxs) {
            boolean flag = true;
            if (queryTryStmtCtx.catchClause(0) != null) {// 如果有catch语句
                JavaQueryParser.BlockContext block = queryTryStmtCtx.catchClause(0).block();// 只取查询语言中的第一个catch
                for (JavaQueryParser.SubQueryContext subQueryContext : block.subQuery()) {
                    if (subQuery(stmtCtx.tryStmt().catchClause(0).block(), subQueryContext) == null) {
                        flag = false;
                        break;
                    }
                }

            }
            if (!flag) continue;
            if (queryTryStmtCtx.finallyBlock() != null) {// 如果有finally语句
                if (stmtCtx.tryStmt().finallyBlock() == null) continue;
                JavaQueryParser.BlockContext block = queryTryStmtCtx.finallyBlock().block();
                for (JavaQueryParser.SubQueryContext subQueryContext : block.subQuery()) {
                    if (subQuery(stmtCtx.tryStmt().catchClause(0).block(), subQueryContext) == null) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                var node = new QueryResult(stmtCtx);
                if (stmtCtx.tryStmt().catchClause() != null) {
                    for (var item : stmtCtx.tryStmt().catchClause()){
                        var start = astInfo.getTokenStream().get(item.block().LBRACE().getSymbol().getTokenIndex() + 1);
                        var stop = astInfo.getTokenStream().get(item.block().RBRACE().getSymbol().getTokenIndex() -1);
                        node.addSubNode(
                                start.getLine(),
                                start.getCharPositionInLine(),
                                stop.getLine(),
                                stop.getCharPositionInLine(),
                                start.getStartIndex(),
                                stop.getStopIndex()
                        );
                    }
                }
                var finallyContext = stmtCtx.tryStmt().finallyBlock();
                if (finallyContext != null ){
                    var start = astInfo.getTokenStream().get(finallyContext.block().LBRACE().getSymbol().getTokenIndex() + 1);
                    var stop = astInfo.getTokenStream().get(finallyContext.block().RBRACE().getSymbol().getTokenIndex() -1);
                    node.addSubNode(
                            start.getLine(),
                            start.getCharPositionInLine(),
                            stop.getLine(),
                            stop.getCharPositionInLine(),
                            start.getStartIndex(),
                            stop.getStopIndex()
                    );
                }
                result.add(node);
            }
        }
        if (result.isEmpty()) return null;
        return result;
    }

    private List<QueryResult> queryThrow(
        ParserRuleContext ctx,
        JavaQueryParser.ThrowStmtContext queryThrowStmtCtx
    ) {
        String cond = tryGetText(queryThrowStmtCtx.expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.throwStmtFilter(
            stmtVisitor.throwStmtVisitor(ctx),
            cond
        );
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(QueryResult::new).toList();
    }

    private List<QueryResult> queryBreak(
        ParserRuleContext ctx,
        JavaQueryParser.BreakStmtContext queryBrkStmtCtx
    ) {
        String ident = tryGetText(queryBrkStmtCtx.identifier());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.breakStmtFilter(
            stmtVisitor.breakStmtVisitor(ctx),
            ident
        );
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(QueryResult::new).toList();
    }

    private List<QueryResult> queryContinue(
        ParserRuleContext ctx,
        JavaQueryParser.ContinueStmtContext queryContinueStmtCtx
    ) {
        String ident = tryGetText(queryContinueStmtCtx.identifier());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.continueStmtFilter(
            stmtVisitor.continueStmtVisitor(ctx),
            ident
        );
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(QueryResult::new).toList();
    }

    private List<QueryResult> queryReturn(
        ParserRuleContext ctx,
        JavaQueryParser.ReturnStmtContext queryReturnStmtCtx
    ) {
        String expr = tryGetText(queryReturnStmtCtx.expression());

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.returnStmtFilter(
                stmtVisitor.returnStmtVisitor(ctx),
                expr
        );
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(QueryResult::new).toList();
    }

    private List<QueryResult> queryAssert(
        ParserRuleContext ctx,
        JavaQueryParser.AssertStmtContext queryAssertStmtCtx
    ) {
        String text = queryAssertStmtCtx.getText();
        String expr = text.substring("assert".length(), text.length()-1);

        StmtVisitor stmtVisitor = new StmtVisitor();
        List<JavaParser.StatementContext> stmtCtxs = stmtVisitor.assertStmtFilter(
                stmtVisitor.assertStmtVisitor(ctx),
                expr
        );
        if (stmtCtxs == null) return null;
        return stmtCtxs.stream().map(QueryResult::new).toList();
    }

    private List<QueryResult> queryExprStmt(
            ParserRuleContext ctx,
            JavaQueryParser.ExpressionContext queryExprCtx
    ) {
        return queryExpr(ctx, queryExprCtx);
    }

    private List<QueryResult> queryImport(
        ParserRuleContext ctx,
        JavaQueryParser.ImportDeclarationContext queryImportDeclCtx
    ) {
        String cond = tryGetText(queryImportDeclCtx.qualifiedName());

        ImportVisitor importVisitor = new ImportVisitor();
        List<JavaParser.ImportDeclarationContext> importCtx = importVisitor.importfilter(
                importVisitor.importVisitor(ctx),
                cond
        );
        if (importCtx == null) return null;
        return importCtx.stream().map(QueryResult::new).toList();
    }

    private List<QueryResult> queryClassLike(
            ParserRuleContext ctx,
            JavaQueryParser.ClassLikeDeclContext queryClassLikeDeclCtx
    ) {
        if (queryClassLikeDeclCtx.classLikeKeyWord().CLASS() != null) {
            return queryClass(ctx, queryClassLikeDeclCtx);
        } else if (queryClassLikeDeclCtx.classLikeKeyWord().INTERFACE() != null) {
            return queryInterface(ctx, queryClassLikeDeclCtx);
        } else {
            System.out.println("unimplemented");
            return null;
        }
    }

    private List<QueryResult> queryClass(
            ParserRuleContext ctx,
            JavaQueryParser.ClassLikeDeclContext queryClassDeclCtx
    ) {
        // search and filter
        ClassDeclarationVisitor classDeclarationVisitor = new ClassDeclarationVisitor();
        List<ClassInfo> list = classDeclarationVisitor.visit(ctx);
        // name filter
        String ident = queryClassDeclCtx.identifier().getText();
        list = ClassInfo.classInfosFilterByName(list, ident);
        // modifier filter
        List<JavaQueryParser.ModifierContext> modifier = queryClassDeclCtx.modifiers().modifier();
        List<DeclarationBaseInfo.ModifierType> modifierTypes = modifier.stream().map(m ->
                DeclarationBaseInfo.javaQueryTerminalNodeToModifierType((TerminalNode) m.getChild(0))
        ).toList();
        list = ClassInfo.classInfoFilterByModifier(list, modifierTypes);
        // extends filter
        if (queryClassDeclCtx.EXTENDS() != null) {
            List<String> extendString = queryClassDeclCtx.typeList(0).typeType().stream().map(RuleContext::getText).toList();
            list = ClassInfo.classInfosFilterByExtends(list, extendString);
        }
        // implements filter
        if (queryClassDeclCtx.IMPLEMENTS() != null) {
            List<String> implementString = queryClassDeclCtx.typeList(1).typeType().stream().map(RuleContext::getText).toList();
            list = ClassInfo.classInfosFilterByImplements(list, implementString);
        }
        if (list == null) return null;

        // subQuery
        List<QueryResult> result = new ArrayList<>();
        for (ClassInfo classInfo : list) {
            JavaParser.ClassBodyContext classBodyContext = classInfo.getClassBody();
            boolean flag = true;
            for (JavaQueryParser.SubQueryContext subQueryContext : queryClassDeclCtx.block().subQuery()) {
                if (subQuery(classBodyContext, subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                var start = astInfo.getTokenStream().get(classBodyContext.LBRACE().getSymbol().getTokenIndex() + 1);
                var stop = astInfo.getTokenStream().get(classBodyContext.RBRACE().getSymbol().getTokenIndex() -1);
                result.add(new QueryResult(classInfo.Context).addSubNode(
                        start.getLine(),
                        start.getCharPositionInLine(),
                        stop.getLine(),
                        stop.getCharPositionInLine(),
                        start.getStartIndex(),
                        stop.getStopIndex()
                ));
            }
        }
        if (result.isEmpty()) return null;
        return result;
    }

    private List<QueryResult> queryInterface(
            ParserRuleContext ctx,
            JavaQueryParser.ClassLikeDeclContext queryInterfaceDeclCtx
    ) {
        // search and filter
        InterfaceDeclarationVisitor interfaceDeclarationVisitor = new InterfaceDeclarationVisitor();
        List<ClassInfo> list = interfaceDeclarationVisitor.visit(ctx);
        // name filter
        String ident = queryInterfaceDeclCtx.identifier().getText();
        list = ClassInfo.classInfosFilterByName(list, ident);
        // modifier filter
        List<JavaQueryParser.ModifierContext> modifiers = queryInterfaceDeclCtx.modifiers().modifier();
        List<DeclarationBaseInfo.ModifierType> modifierTypes = modifiers.stream().map(modifier ->
                DeclarationBaseInfo.javaQueryTerminalNodeToModifierType((TerminalNode) modifier.getChild(0))
        ).toList();
        list = ClassInfo.classInfoFilterByModifier(list, modifierTypes);
        // extends filter
        if (queryInterfaceDeclCtx.EXTENDS() != null) {
            List<String> extendString = queryInterfaceDeclCtx.typeList(0).typeType().stream().map(RuleContext::getText).toList();
            list = ClassInfo.classInfosFilterByExtends(list, extendString);
        }
        // implements filter
        if (queryInterfaceDeclCtx.IMPLEMENTS() != null) {
            List<String> implementString = queryInterfaceDeclCtx.typeList(1).typeType().stream().map(RuleContext::getText).toList();
            list = ClassInfo.classInfosFilterByImplements(list, implementString);
        }
        if (list == null) return null;

        // subQuery
        List<QueryResult> result = new ArrayList<>();
        for (ClassInfo classInfo : list) {
            JavaParser.InterfaceBodyContext interfaceBodyContext = classInfo.getInterfaceBody();
            boolean flag = true;
            for (JavaQueryParser.SubQueryContext subQueryContext : queryInterfaceDeclCtx.block().subQuery()) {
                if (subQuery(interfaceBodyContext, subQueryContext) == null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                var start = astInfo.getTokenStream().get(interfaceBodyContext.LBRACE().getSymbol().getTokenIndex() + 1);
                var stop = astInfo.getTokenStream().get(interfaceBodyContext.RBRACE().getSymbol().getTokenIndex() -1);
                result.add(new QueryResult(classInfo.Context).addSubNode(
                        start.getLine(),
                        start.getCharPositionInLine(),
                        stop.getLine(),
                        stop.getCharPositionInLine(),
                        start.getStartIndex(),
                        stop.getStopIndex()
                ));
            }
        }
        if (result.isEmpty()) return null;
        return result;
    }

    private List<QueryResult> queryMethodDecl(
            ParserRuleContext ctx,
            JavaQueryParser.MethodDeclContext qMethodDeclCtx
    ) {
        List<MethodInfo> list = MethodDeclVisitor.getMethodDeclaration(ctx);
//        // modifier filter
//        List<JavaQueryParser.ModifierContext> modifiers = qMethodDeclCtx.modifiers().modifier();
//        List<DeclarationBaseInfo.ModifierType> modifierTypes = modifiers.stream().map(modifier ->
//                DeclarationBaseInfo.javaQueryTerminalNodeToModifierType((TerminalNode) modifier.getChild(0))
//        ).toList();
//        list = MethodInfo.methodInfoFilterByModifier(list, modifierTypes);
        // name filter
        String ident = qMethodDeclCtx.identifier().getText();
        list = MethodInfo.methodInfoFilterByName(list, ident);
        // type filter
        if (qMethodDeclCtx.typeTypeOrVoid() != null) {
            String type = qMethodDeclCtx.typeTypeOrVoid().getText();
            list = MethodInfo.methodInfoFilterByType(list, type);
        }
        // parameter filter
        if (qMethodDeclCtx.formalParameterList() != null) {
            String formalParameters = "(" + qMethodDeclCtx.formalParameterList().getText() + ")";
            list = MethodInfo.methodInfoFilterByFormalParameters(list, formalParameters);
        }
        // typePrarmeter filter
        if (qMethodDeclCtx.typeParameters() != null) {
            String typeParameters = qMethodDeclCtx.typeParameters().getText();
            list = MethodInfo.methodInfoFilterByTypeParamters(list, typeParameters);
        }
        List<QueryResult> result = null;
        for (MethodInfo methodInfo : list) {
            boolean flag = true;
            for (JavaQueryParser.SubQueryContext subQueryContext : qMethodDeclCtx.block().subQuery()) {
                if (subQuery(methodInfo.getMethodBody(), subQueryContext) == null) {
                    flag = false;
                }
            }
            if (flag) {
                var start = astInfo.getTokenStream().get(methodInfo.getMethodBody().block().LBRACE().getSymbol().getTokenIndex() + 1);
                var stop = astInfo.getTokenStream().get(methodInfo.getMethodBody().block().RBRACE().getSymbol().getTokenIndex() - 1);
                result.add(new QueryResult(methodInfo.Context).addSubNode(
                        start.getLine(),
                        start.getCharPositionInLine(),
                        stop.getLine(),
                        stop.getCharPositionInLine(),
                        start.getStartIndex(),
                        stop.getStopIndex()
                ));
            }
        }
        return result;
    }

    private List<QueryResult> queryVarDecl(
            ParserRuleContext ctx,
            JavaQueryParser.VarDeclContext qVarDeclCtx
    ) {
        // search
        List<VariableInfo> list = VariableDeclaratorVisitor.getVariableDeclarator(ctx);
        // name filter
        String name = qVarDeclCtx.identifier().getText();
        list = VariableInfo.variableInfoFilterByName(list, name);
        // TODO: modifier filter

        // type filter
        String type = qVarDeclCtx.typeTypeOrVoid().getText();
        list = VariableInfo.variableInfoFilterByType(list, type);

        if (list == null) return null;
        List<QueryResult> result = new ArrayList<>();
        for (VariableInfo variableInfo : list) {
            result.add(new QueryResult(variableInfo.Context));
        }
        return result;
    }

    private List<QueryResult> queryExpr(
            ParserRuleContext ctx,
            JavaQueryParser.ExpressionContext qExprCtx
    ) {
        ExpVisitor expVisitor = new ExpVisitor();
        return expVisitor.filterByExp(expVisitor.visit(ctx), qExprCtx.getText())
                .stream().map(QueryResult::new).toList();
    }


    public static void main(String[] args) throws IOException {
        AstInfo astInfo = new AstInfo("test/DummyTest.java");

        String[] needle = {
//"""
//if (a == 0) {
//    [1] if (b == 0) {
//    }
//    if (d == 0) {
//    }
//}
//""",
"""
if (a == 0) {
    \\if (b == 0) {
    }
    [1] a=0;
    [1] b=0
}
""",
//"""
//for (i = 0; i < 5; i++) {
//    if (a == 0) {
//    }
//}
//""",
//"""
//while (i < 5) {
//    while (j < 10) {
//        continue;
//    }
//}
//""",
//"""
//do {
//    if (a == 0) {
//        break;
//    }
//} while (i < 5);
//""",
//"""
//switch (i) {
//    if () {
//        assert a == 0;
//    }
//}
//""",
//"""
//if () {
//} else {
//}
//""",
//"""
//return input;
//""",
//"""
//try {
//} catch (Exception e2) {
//}
//""",
//"""
//try {
//} finally {
//}
//""",
//"""
//import JavaParser.JavaBaseVisitor;
//""",
//"""
//public class DummyTest {
//    try {
//    } catch (Exception e2) {
//    } /*finally {
//    }*/
//    try {
//    } finally {
//    }
//}
//""",
//"""
//public interface inter1 extends inter2 {
//}
//""",
//"""
//int retinput() {
//}
//""",
//"""
//for (i = 0; i < 5; i++) {
//    if (a == 0) {
//        a = 0;
//        b = 0;
//    }
//    System.out.println(i);
//}
//""",
        };

        for (String s : needle) {
            CharStream charStream = CharStreams.fromString(s);
            JavaQueryLexer javaQueryLexer = new JavaQueryLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(javaQueryLexer);
            JavaQueryParser javaQueryParser = new JavaQueryParser(commonTokenStream);
            QueryChecker javaQueryBaseListener = new QueryChecker();
            javaQueryParser.addParseListener(javaQueryBaseListener);

            var query = new Query(astInfo).query(astInfo.getRoot(), javaQueryParser.queryInput());

            if (query != null)
                for (var i : query.entrySet()) {
                    System.out.println("["+i.getKey()+"]");
                    i.getValue().stream().map(QueryResult::getText).forEach(System.out::println);
                }
            System.out.println();
        }
    }
}
