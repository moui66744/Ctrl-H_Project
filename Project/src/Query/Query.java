package Query;

import JavaQueryParser.JavaQueryParser;
import org.antlr.v4.runtime.ParserRuleContext;
import util.QueryResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Query {
    Map<Integer, List<QueryResult>> queryResult;

    /**
     * 递归在子树上处理subQuery
     * @param ctx: 语法树上结点
     * @param subQueryCtx: 查询树上一个subQueryContext
     * @return 子树上满足查询子树的结点
     * */
    protected Map<Integer, List<QueryResult>> subQuery(
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
        return null;
    }
    protected JavaQueryParser.SwitchStmtContext qSwitchStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }
    protected JavaQueryParser.CaseStmtContext qCaseStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }
    protected JavaQueryParser.ForStmtContext qForStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }
    protected JavaQueryParser.WhileStmtContext qWhileStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }
    protected JavaQueryParser.DoWhileStmtContext qDoWhileStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }
    protected JavaQueryParser.BreakStmtContext qBreakStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }
    protected JavaQueryParser.ContinueStmtContext qContinueStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }
    protected JavaQueryParser.ReturnStmtContext qReturnStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }
    protected JavaQueryParser.ExpressionContext qExpressionStmtCtx(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }

    protected JavaQueryParser.MethodDeclContext qMethodDecl(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }

    protected JavaQueryParser.VarDeclContext qVarDecl(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }

    protected JavaQueryParser.ExpressionContext qExpr(JavaQueryParser.QueryInputContext qCtx) {
        return null;
    }

    protected String tryGetText(ParserRuleContext ctx) {
        return null;
    }

    protected List<QueryResult> queryIf(
            ParserRuleContext ctx,
            JavaQueryParser.IfStmtContext queryIfStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> querySwitch(
            ParserRuleContext ctx,
            JavaQueryParser.SwitchStmtContext querySwiStmtCtx
    ) {
        return null;
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
        return null;
    }

    protected List<QueryResult> queryWhile(
            ParserRuleContext ctx,
            JavaQueryParser.WhileStmtContext queryWhileStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryDoWhile(
            ParserRuleContext ctx,
            JavaQueryParser.DoWhileStmtContext queryDoWhileStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryTry(
            ParserRuleContext ctx,
            JavaQueryParser.TryStmtContext queryTryStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryThrow(
            ParserRuleContext ctx,
            JavaQueryParser.ThrowStmtContext queryThrowStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryBreak(
            ParserRuleContext ctx,
            JavaQueryParser.BreakStmtContext queryBrkStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryContinue(
            ParserRuleContext ctx,
            JavaQueryParser.ContinueStmtContext queryContinueStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryReturn(
            ParserRuleContext ctx,
            JavaQueryParser.ReturnStmtContext queryReturnStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryAssert(
            ParserRuleContext ctx,
            JavaQueryParser.AssertStmtContext queryAssertStmtCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryExprStmt(
            ParserRuleContext ctx,
            JavaQueryParser.ExpressionContext queryExprCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryImport(
            ParserRuleContext ctx,
            JavaQueryParser.ImportDeclarationContext queryImportDeclCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryClassLike(
            ParserRuleContext ctx,
            JavaQueryParser.ClassLikeDeclContext queryClassLikeDeclCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryClass(
            ParserRuleContext ctx,
            JavaQueryParser.ClassLikeDeclContext queryClassDeclCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryInterface(
            ParserRuleContext ctx,
            JavaQueryParser.ClassLikeDeclContext queryInterfaceDeclCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryMethodDecl(
            ParserRuleContext ctx,
            JavaQueryParser.MethodDeclContext qMethodDeclCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryVarDecl(
            ParserRuleContext ctx,
            JavaQueryParser.VarDeclContext qVarDeclCtx
    ) {
        return null;
    }

    protected List<QueryResult> queryExpr(
            ParserRuleContext ctx,
            JavaQueryParser.ExpressionContext qExprCtx
    ) {
        return null;
    }

}
