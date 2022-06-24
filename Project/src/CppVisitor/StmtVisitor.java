package CppVisitor;

import AstGenerator.CppAstInfo;
import CppParser.CppBaseVisitor;
import CppParser.CppParser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StmtVisitor extends CppBaseVisitor<List<StatementContext>> {
    private enum STMT {
        IF,
        SWITCH,
        FOR,
        WHILE,
        DO_WHILE,
        BREAK,
        CONTINUE,
        RETURN,
    }
    private STMT target;


    @Override
    public List<StatementContext> visitIfStmt(IfStmtContext ctx) {
        if (target == STMT.IF) return new ArrayList<>(List.of((StatementContext) ctx.getParent()));
        return super.visitIfStmt(ctx);
    }

    @Override
    public List<StatementContext> visitSwitchStmt(SwitchStmtContext ctx) {
        if (target == STMT.SWITCH) return new ArrayList<>(List.of((StatementContext) ctx.getParent()));
        return super.visitSwitchStmt(ctx);
    }

    @Override
    public List<StatementContext> visitWhileStmt(WhileStmtContext ctx) {
        if (target == STMT.WHILE) return new ArrayList<>(List.of((StatementContext) ctx.getParent()));
        return super.visitWhileStmt(ctx);
    }

    @Override
    public List<StatementContext> visitDoWhileStmt(DoWhileStmtContext ctx) {
        if (target == STMT.DO_WHILE) return new ArrayList<>(List.of((StatementContext) ctx.getParent()));
        return super.visitDoWhileStmt(ctx);
    }

    @Override
    public List<StatementContext> visitForStmt(ForStmtContext ctx) {
        if (target == STMT.FOR) return new ArrayList<>(List.of((StatementContext) ctx.getParent()));
        return super.visitForStmt(ctx);
    }

    @Override
    public List<StatementContext> visitBreakStmt(BreakStmtContext ctx) {
        if (target == STMT.BREAK) return new ArrayList<>(List.of((StatementContext) ctx.getParent()));
        return super.visitBreakStmt(ctx);
    }

    @Override
    public List<StatementContext> visitContinueStmt(ContinueStmtContext ctx) {
        if (target == STMT.CONTINUE) return new ArrayList<>(List.of((StatementContext) ctx.getParent()));
        return super.visitContinueStmt(ctx);
    }

    @Override
    public List<StatementContext> visitReturnStmt(ReturnStmtContext ctx) {
        if (target == STMT.RETURN) return new ArrayList<>(List.of((StatementContext) ctx.getParent()));
        return super.visitReturnStmt(ctx);
    }

    @Override
    protected List<StatementContext> aggregateResult(List<StatementContext> aggregate, List<StatementContext> nextResult) {
        if (aggregate == null) return nextResult;   // 父结点结果为空, 则返回子结点的结果
        if (nextResult == null) return aggregate;   // 子结点结果为空, 则返回父结点的结果
        aggregate.addAll(nextResult);               // 否则, 返回父子结点结果的拼接
        return aggregate;
    }

    public List<StatementContext> ifStmtVisitor(ParserRuleContext ctx) {
        target = STMT.IF;
        return visit(ctx);
    }

    public List<StatementContext> ifStmtFilter(List<StatementContext> list, String cond) {
        if (list == null) return null;
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx -> 
                    s.equals(ctx.ifStmt().condition().getText())
            ).toList();
        }
        return list;
    }

    public List<StatementContext> switchStmtVisitor(ParserRuleContext ctx) {
        target = STMT.SWITCH;
        return visit(ctx);
    }

    public List<StatementContext> switchStmtFilter(List<StatementContext> list, String cond) {
        if (list == null) return null;
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx ->
                    s.equals(ctx.switchStmt().condition().getText())
            ).toList();
        }
        return list;
    }

    public List<StatementContext> whileStmtVisitor(ParserRuleContext ctx) {
        target = STMT.WHILE;
        return visit(ctx);
    }

    public List<StatementContext> whileStmtFilter(List<StatementContext> list, String cond) {
        if (list == null) return null;
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx ->
                    s.equals(ctx.whileStmt().condition().getText())
            ).toList();
        }
        return list;
    }

    public List<StatementContext> doWhileStmtVisitor(ParserRuleContext ctx) {
        target = STMT.DO_WHILE;
        return visit(ctx);
    }

    public List<StatementContext> doWhileStmtFilter(List<StatementContext> list, String cond) {
        if (list == null) return null;
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx ->
                    s.equals(ctx.doWhileStmt().condition().getText())
            ).toList();
        }
        return list;
    }
    
    public List<StatementContext> forStmtVisitor(ParserRuleContext ctx) {
        target = STMT.FOR;
        return visit(ctx);
    }
    
    public List<StatementContext> forStmtFilter(List<StatementContext> list, String forInit, String forCond, String forUpdate) {
        if (list == null) return null;
        if (forInit != null) {// 根据for的初始化语句过滤
            String s = forInit.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(stmtCtx ->
                    stmtCtx.forStmt().forInit() != null && s.equals(stmtCtx.forStmt().forInit().getText())
            ).toList();
        }
        if (forCond != null) {// 根据for的循环条件过滤
            String s = forCond.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(stmtCtx ->
                    stmtCtx.forStmt().condition() != null && s.equals(stmtCtx.forStmt().condition().getText())
            ).toList();
        }
        if (forUpdate != null) {// 根据for的更新语句过滤
            String s = forUpdate.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(stmtCtx ->
                    stmtCtx.forStmt().forUpdate() != null && s.equals(stmtCtx.forStmt().forUpdate().getText())
            ).toList();
        }
        return list;
    }

    public List<StatementContext> breakStmtVisitor(ParserRuleContext ctx) {
        target = STMT.BREAK;
        return visit(ctx);
    }

    public List<StatementContext> continueStmtVisitor(ParserRuleContext ctx) {
        target = STMT.CONTINUE;
        return visit(ctx);
    }

    public List<StatementContext> returnStmtVisitor(ParserRuleContext ctx) {
        target = STMT.RETURN;
        return visit(ctx);
    }

    public List<StatementContext> returnStmtFilter(List<StatementContext> list, String expr) {
        if (list == null) return null;
        if (expr != null) {
            String s = expr.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx -> {
                String t = ctx.returnStmt().expression() == null ?
                        ctx.returnStmt().bracedInitList().getText() :
                        ctx.returnStmt().expression().getText();
                return s.equals(t);
            }).toList();
        }
        return list;
    }


    private static void output(List<StatementContext> res) {
        res.stream().map(RuleContext::getText).forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        CppAstInfo cppAstInfo = new CppAstInfo("Project/test/CppTest/test.cpp");
        TranslationUnitContext root = cppAstInfo.getRoot();
        StmtVisitor stmtVisitor = new StmtVisitor();

        // if test
        output(stmtVisitor.ifStmtFilter(stmtVisitor.ifStmtVisitor(root), "i == 0"));
        // switch test
        output((stmtVisitor.switchStmtFilter(stmtVisitor.switchStmtVisitor(root), "i")));
        // while test
        output(stmtVisitor.whileStmtFilter(stmtVisitor.whileStmtVisitor(root), "i < 5"));
        // do-while test
        output(stmtVisitor.doWhileStmtFilter(stmtVisitor.doWhileStmtVisitor(root), "i < 5"));
        // for test
        output(stmtVisitor.forStmtFilter(stmtVisitor.forStmtVisitor(root), "int i=0", "i<1", "i++"));
        // break
        output(stmtVisitor.breakStmtVisitor(root));
        // continue
        output(stmtVisitor.continueStmtVisitor(root));
        // return
        output(stmtVisitor.returnStmtFilter(stmtVisitor.returnStmtVisitor(root), "input"));
    }
}
