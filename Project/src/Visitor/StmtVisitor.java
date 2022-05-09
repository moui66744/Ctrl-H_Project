package Visitor;

import AstGenerator.AstInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * 用于查询语句Statement的类.
 * 当前支持查询：if-else/switch/for/while/do-while/try-catch-finally/throw
 * */
public class StmtVisitor extends JavaBaseVisitor<ArrayList<StatementContext>> {
    /**
     * 查询语句的类型.
     * */
    private enum STMT {
        IF,
        SWITCH,
        FOR,
        WHILE,
        DO_WHILE,
        TRY,
        THROW,
    }
    /**
     * 对于if语句，其后是否含有else语句.
     * */
    public enum IF_TYPE {
        DONT_CARE,
        WITH_ELSE,
        WITHOUT_ELSE,
    }
    /**
     * 对于try语句，其后是否有catch/finally语句.
     * */
    public enum TRY_TYPE {
        DONT_CARE,
        WITH_CATCH_WITH_FINALLY,
        WITH_CATCH_WITHOUT_FINALLY,
        WITHOUT_CATCH_WITH_FINALLY,
    }

    private STMT target;        // 查询语句类型
    
    /**
     * 访问到叶子节点时的行为.
     * @param node: AST叶子结点
     * @return 叶子节点返回结果
     * @date 2022/05/05
     * */
    @Override
    public ArrayList<StatementContext> visitTerminal(TerminalNode node) {
        ArrayList<StatementContext> result = new ArrayList<>();
        ParseTree parent = node.getParent();
        if ((target == STMT.IF && node.getText().equals("if")) ||
            (target == STMT.SWITCH && node.getText().equals("switch")) ||
            (target == STMT.FOR && node.getText().equals("for")) ||
            (target == STMT.WHILE && node.getText().equals("while") && ((StatementContext)parent).WHILE() != null) ||
            (target == STMT.DO_WHILE && node.getText().equals("do")) ||
            (target == STMT.TRY && node.getText().equals("try")) ||
            (target == STMT.THROW && node.getText().equals("throw"))
        ) result.add((StatementContext) parent);// 如果 查询语句类型 与 叶子结点相匹配, 则说明父结点是 待查询语句
        return result;
    }

    /**
     * 如何根据子结点返回结果得到父结点的返回结果(聚集).
     * @param aggregate: 当前父结点的返回结果
     * @param nextResult: 子结点的返回结果
     * @return 聚集后父结点的返回结果
     * @date 2022/05/05
     * */
    @Override
    protected ArrayList<StatementContext> aggregateResult(ArrayList<StatementContext> aggregate, ArrayList<StatementContext> nextResult) {
        if (aggregate == null) return nextResult;   // 父结点结果为空, 则返回子结点的结果
        if (nextResult == null) return aggregate;   // 子结点结果为空, 则返回父结点的结果
        aggregate.addAll(nextResult);               // 否则, 返回父子结点结果的拼接
        return aggregate;
    }

    /**
     * 查找所有if语句结点.
     * @param ctx: AST根结点
     * @return 所有if语句结点
     * @date 2022/05/05
     * */
    public ArrayList<StatementContext> ifStmtVisitor(CompilationUnitContext ctx) {
        this.target = STMT.IF;
        return visit(ctx);
    }

    /**
     * 过滤满足条件的if语句结点
     * @param stmtList: if语句结点列表
     * @param cond: if语句的判断条件, 若为空, 则本项不作为查询条件
     * @param ifType: if语句的类型, 是否有else语句
     * @return: 满足条件的if语句结点
     * @date 2022/05/06
     */
    public ArrayList<StatementContext> ifStmtFilter(ArrayList<StatementContext> stmtList, String cond, IF_TYPE ifType) {
        // 根据if语句的类型过滤
        stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
            (ifType == IF_TYPE.WITH_ELSE && stmtCtx.ELSE() != null) ||   // 有else语句
            (ifType == IF_TYPE.WITHOUT_ELSE && stmtCtx.ELSE() == null) ||// 无else语句
            (ifType == IF_TYPE.DONT_CARE)                                // 不关心是否有else语句
        ).collect(Collectors.toList());
        // 根据if语句的判断条件过滤, 如果条件一致则保留
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
                s.equals(stmtCtx.parExpression().expression().getText())
            ).collect(Collectors.toList());
        }
        return stmtList;
    }

    /**
     * 查询所有switch语句结点.
     * @param ctx: AST根结点
     * @return 所有switch语句结点
     * @date 2022/05/05
     * */
    public ArrayList<StatementContext> switchStmtVisitor(CompilationUnitContext ctx) {
        this.target = STMT.SWITCH;
        return visit(ctx);
    }

    /**
     * 过滤满足条件的switch语句结点
     * @param stmtList: switch语句结点列表
     * @param cond: switch语句的判断条件. 若为空, 则本项不作为查询条件
     * @return: 满足条件的switch语句结点
     * @date 2022/05/06
     */
    public ArrayList<StatementContext> switchStmtFilter(ArrayList<StatementContext> stmtList, String cond) {
        // 根据switch语句的判断条件过滤
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
                s.equals(stmtCtx.parExpression().expression().getText())
            ).collect(Collectors.toList());
        }
        return stmtList;
    }

    /**
     * 查询所有for语句结点.
     * @param ctx: AST根结点
     * @return 所有for语句结点
     * @date 2022/05/05
     * */
    public ArrayList<StatementContext> forStmtVisitor(CompilationUnitContext ctx) {
        this.target = STMT.FOR;
        return visit(ctx);

    }

    /**
     * 过滤满足条件的for语句结点
     * @param stmtList: for语句结点列表
     * @param forInit: for语句的初始化语句. 若为空, 则本项不作为查询条件
     * @param forCond: for语句循环结束的判断条件. 若为空, 则本项不作为查询条件
     * @param forUpdate: for语句的循环更新语句. 若为空, 则本项不作为查询条件
     * @return: 满足条件的for语句结点
     * @date 2022/05/06
     */
    public ArrayList<StatementContext> forStmtFilter(ArrayList<StatementContext> stmtList, String forInit, String forCond, String forUpdate) {
        if (forInit != null) {// 根据for的初始化语句过滤
            String s = forInit.replaceAll("[ \\t\\n]", "");
            stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
                s.equals(stmtCtx.forControl().forInit().getText())
            ).collect(Collectors.toList());
        }
        if (forCond != null) {// 根据for的循环条件过滤
            String s = forCond.replaceAll("[ \\t\\n]", "");
            stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
                s.equals(stmtCtx.forControl().expression().getText())
            ).collect(Collectors.toList());
        }
        if (forUpdate != null) {// 根据for的更新语句过滤
            String s = forUpdate.replaceAll("[ \\t\\n]", "");
            stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
                s.equals(stmtCtx.forControl().forUpdate().getText())
            ).collect(Collectors.toList());
        }
        return stmtList;
    }

    /**
     * 查询所有while语句结点.
     * @param ctx: AST根结点
     * @return 所有while语句结点
     * @date 2022/05/05
     * */
    public ArrayList<StatementContext> whileStmtVisitor(CompilationUnitContext ctx) {
        this.target = STMT.WHILE;
        return visit(ctx);
    }

    /**
     * 过滤满足条件的while语句结点.
     * @param stmtList: while语句结点列表
     * @param cond: while语句循环结束的判断条件. 若为空, 则本项不作为查询条件
     * @return: 满足条件的while语句结点
     * @date 2022/05/06
     */
    public ArrayList<StatementContext> whileStmtFilter(ArrayList<StatementContext> stmtList, String cond) {
        // 根据while语句的循环条件过滤
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
                s.equals(stmtCtx.parExpression().expression().getText())
            ).collect(Collectors.toList());
        }
        return stmtList;
    }

    /**
     * 查询所有do-while语句结点.
     * @param ctx: AST根结点
     * @return 所有do-while语句结点
     * @date 2022/05/05
     * */
    public ArrayList<StatementContext> doWhileStmtVisitor(CompilationUnitContext ctx) {
        this.target = STMT.DO_WHILE;
        return visit(ctx);
    }

    /**
     * 过滤满足条件的do-while语句结点
     * @param stmtList: do-while语句结点列表
     * @param cond: do-while语句循环结束的判断条件. 若为空, 则本项不作为查询条件
     * @return: 满足条件的do-while语句结点
     * @date 2022/05/06
     */
    public ArrayList<StatementContext> doWhileStmtFilter(ArrayList<StatementContext> stmtList, String cond) {
        // 根据do-while语句的循环条件过滤
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
                s.equals(stmtCtx.parExpression().expression().getText())
            ).collect(Collectors.toList());
        }
        return stmtList;
    }

    /**
     * 查询所有try语句.
     * @param ctx: AST根结点
     * @return 所有try语句结点
     * @date 2022/05/05
     * */
    public ArrayList<StatementContext> tryStmtVisitor(CompilationUnitContext ctx) {
        this.target = STMT.TRY;
        return visit(ctx);
    }

    /**
     * 过滤满足条件的try语句结点.
     * @param stmtList: 所有try语句结点列表
     * @param tryType: try语句的类型, 是否有catch/finally语句
     * @param catchCond: catch语句的捕获条件, 每个捕获条件依次对应. 若为空, 则本项不作为查询条件
     * @return: 满足条件的try语句结点.
     * @date 0222/05/06
     */
    public ArrayList<StatementContext> tryStmtFilter(ArrayList<StatementContext> stmtList, TRY_TYPE tryType, String[] catchCond) {
        // 根据try-catch-finally语句的类型过滤: 是否有catch/finally
        stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
            (tryType == TRY_TYPE.WITH_CATCH_WITH_FINALLY && stmtCtx.catches() != null && stmtCtx.finallyBlock() != null) ||
            (tryType == TRY_TYPE.WITH_CATCH_WITHOUT_FINALLY && stmtCtx.catches() != null && stmtCtx.finallyBlock() == null) ||
            (tryType == TRY_TYPE.WITHOUT_CATCH_WITH_FINALLY && stmtCtx.catches() == null && stmtCtx.finallyBlock() != null) ||
            (tryType == TRY_TYPE.DONT_CARE)
        ).collect(Collectors.toList());
        // 根据catch的捕获条件过滤
        if (catchCond != null) {
            for (int i=0; i<catchCond.length; i++) {
                final int idx = i;
                String s = catchCond[idx].replaceAll(" ", "");
                stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx -> {
                    // 若没有catch语句, 或catch语句数量不足, 则过滤
                    if (stmtCtx.catches() == null || stmtCtx.catches().catchClause(idx) == null) return false;
                    // 否则保留
                    else return s.equals(stmtCtx.catches().catchClause(idx).getText().split("[()]")[1]);
                }).collect(Collectors.toList());
            }
        }
        return stmtList;
    }

    /**
     * 查询所有throw语句结点.
     * @param ctx: AST根结点
     * @return 所有throw语句结点
     * @date 2022/05/05
     * */
    public ArrayList<StatementContext> throwStmtVisitor(CompilationUnitContext ctx) {
        this.target = STMT.THROW;
        return visit(ctx);
    }

    /**
     * 过滤满足条件的throw语句结点
     * @param stmtList: throw语句结点列表
     * @param expr: throw语句抛出的表达式. 若为null, 则本项不作为过滤条件
     * @return: 满足条件的throw语句结点
     */
    public ArrayList<StatementContext> throwStmtFilter(ArrayList<StatementContext> stmtList, String expr) {
        // 根据throw语句抛出的表达式过滤
        if (expr != null) {
            String s = expr.replaceAll("[ \\t\\n]", "");
            stmtList = (ArrayList<StatementContext>) stmtList.stream().filter(stmtCtx ->
                s.equals(stmtCtx.expression(0).getText())
            ).collect(Collectors.toList());
        }
        return stmtList;
    }

    /**
     * 测试用输出函数
     * */
    private static void output(ArrayList<StatementContext> stmts) {
        for (StatementContext stmt: stmts) {
            System.out.println(stmt.getText());
        }
    }

    /**
     * 测试函数
     * */
    public static void main(String[] args) throws IOException {
        String fileName = "Project/test/DummyTest.java";
        AstInfo astInfo = new AstInfo(fileName);
        CompilationUnitContext root = astInfo.getRoot();
        StmtVisitor stmtVisitor = new StmtVisitor();

        System.out.println("\n\u001b[36;4m@ if statement test\u001b[0m");
        System.out.println("# find all if with else, condition: i == 0");
        String c1 = "i == 0";
        ArrayList<StatementContext> s1 = stmtVisitor.ifStmtVisitor(root);
        s1 = stmtVisitor.ifStmtFilter(s1, c1, IF_TYPE.WITH_ELSE);
        output(s1);
        System.out.println("# find all if without else, condition: i == 1");
        String c2 = "i == 1";
        ArrayList<StatementContext> s2 = stmtVisitor.ifStmtVisitor(root);
        s2 = stmtVisitor.ifStmtFilter(s2, c2, IF_TYPE.WITHOUT_ELSE);
        output(s2);

        System.out.println("\n\u001b[36;4m@ switch statement test\u001b[0m");
        System.out.println("# find all switch, condition: i");
        String c3 = "i";
        ArrayList<StatementContext> s3 = stmtVisitor.switchStmtVisitor(root);
        s3 = stmtVisitor.switchStmtFilter(s3, c3);
        output(s3);

        System.out.println("\n\u001b[36;4m@ for statement test\u001b[0m");
        System.out.println("# find all for statement, forInit: i = 0");
        String c4 = " i = 0";
        ArrayList<StatementContext> s4 = stmtVisitor.forStmtVisitor(root);
        s4 = stmtVisitor.forStmtFilter(s4, c4, null, null);
        output(s4);

        System.out.println("\n\u001b[36;4m@ while statement test\u001b[0m");
        System.out.println("# find all while statement, condition: null");
        ArrayList<StatementContext> s5 = stmtVisitor.whileStmtVisitor(root);
        s5 = stmtVisitor.whileStmtFilter(s5, null);
        output(s5);

        System.out.println("\n\u001b[36;4m@ do-while statement test\u001b[0m");
        System.out.println("# find all do-while statement, condition: i < 5");
        String c6 = "i < 5";
        ArrayList<StatementContext> s6 = stmtVisitor.doWhileStmtVisitor(root);
        s6 = stmtVisitor.doWhileStmtFilter(s6, c6);
        output(s6);

        System.out.println("\n\u001b[36;4m@ try statement test\u001b[0m");
        System.out.println("# find all try statement, with two catch statement, without finally statement,");
        System.out.println(" condition: [IOException e1, Exception e2]");
        String[] c7 = new String[2];
        c7[0] = "IOException e1";
        c7[1] = "Exception e2";
        ArrayList<StatementContext> s7 = stmtVisitor.tryStmtVisitor(root);
        s7 = stmtVisitor.tryStmtFilter(s7, TRY_TYPE.WITH_CATCH_WITHOUT_FINALLY, c7);
        output(s7);
        System.out.println("# find all try statement, without catch statement, with finally statement");
        ArrayList<StatementContext> s8 = stmtVisitor.tryStmtVisitor(root);
        s8 = stmtVisitor.tryStmtFilter(s8, TRY_TYPE.WITHOUT_CATCH_WITH_FINALLY, null);
        output(s8);

        System.out.println("\n\u001b[36;4m@ throw statement test\u001b[0m");
        System.out.println("# find all throw statement, condition: new RuntimeException()");
        String c9 = "new RuntimeException()";
        ArrayList<StatementContext> s9 = stmtVisitor.throwStmtVisitor(root);
        s9 = stmtVisitor.throwStmtFilter(s9, c9);
        output(s9);

        System.out.println("=====statement test over=====");
    }
}
