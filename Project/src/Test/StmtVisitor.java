package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 功能: 用于查询语句Statement的类.
 * 当前支持查询：if-else/switch/for/while/do-while/try-catch-finally/throw
 * */
public class StmtVisitor extends JavaBaseVisitor<List<StatementContext>> {
    /**
     * 查询语句的类型.
     * */
    private enum STMT {
        IF,
        SWITCH,
        FOR,
        WHILE,
        DOWHILE,
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
    private IF_TYPE ifType;     // if语句类型, 是否有else
    private TRY_TYPE tryType;   // try语句类型, 是否有catch/finally
    
    /**
     * 功能: 访问到叶子节点时的行为.
     * */
    @Override
    public List<StatementContext> visitTerminal(TerminalNode node) {
        List<StatementContext> result = new ArrayList<>();
        switch (target) {
            case IF -> {// 查询的目标是if语句
                if (node.getText().equals("if")) {// 当前叶子结点为if
                    StatementContext parent = (StatementContext) (node.getParent());// 父结点为if语句
                    // 根据查询请求, 将不同if语句类型加入到返回结果中
                    if (ifType == IF_TYPE.WITH_ELSE && parent.ELSE() != null) {
                        result.add(parent);
                    } else if (ifType == IF_TYPE.WITHOUT_ELSE && parent.ELSE() == null) {
                        result.add(parent);
                    } else if (ifType == IF_TYPE.DONT_CARE) {
                        result.add(parent);
                    }
                }
            }
            case SWITCH -> {// 查询目标是switch语句
                if (node.getText().equals("switch")) {// 当前叶子结点为switch
                    result.add((StatementContext) node.getParent());// 父结点为switch语句
                }
            }
            case FOR -> {// 查询目标是for语句
                if (node.getText().equals("for")) {// 当前叶子结点为for
                    result.add((StatementContext) node.getParent());// 父结点为for语句
                }
            }
            case WHILE -> {// 查询目标是while语句
                if (node.getText().equals("while")) {// 当前叶子结点为while 
                    StatementContext parent = (StatementContext) (node.getParent());// 父结点可能是while/do-while
                    if (parent.WHILE() != null) {// 如果父结点是while语句
                        result.add(parent); 
                    }
                }
            }
            case DOWHILE -> {// 查询目标是do-while语句
                if (node.getText().equals("do")) {// 当前叶子结点为do
                    result.add((StatementContext) node.getParent());// 父结点为do-while语句
                }
            }
            case TRY -> {// 查询目标是try语句
                if (node.getText().equals("try")) {// 当前叶子结点为try
                    StatementContext parent = (StatementContext) (node.getParent());// 父结点为try语句
                    // 根据查询请求, 将不同try语句类型加入到返回结果中
                    if (tryType == TRY_TYPE.WITH_CATCH_WITH_FINALLY && parent.catches() != null && parent.finallyBlock() != null) {
                        result.add(parent);
                    } else if (tryType == TRY_TYPE.WITH_CATCH_WITHOUT_FINALLY && parent.catches() != null && parent.finallyBlock() == null) {
                        result.add(parent);
                    } else if (tryType == TRY_TYPE.WITHOUT_CATCH_WITH_FINALLY && parent.catches() == null && parent.finallyBlock() != null) {
                        result.add(parent);
                    } else if (tryType == TRY_TYPE.DONT_CARE) {
                        result.add(parent);
                    }
                }
            }
            case THROW -> {// 查询目标是throw语句
                if (node.getText().equals("throw")) {// 当前叶子结点是throw
                    result.add((StatementContext) node.getParent());// 父结点是throw语句
                }
            }
        }
        return result;
    }
    
    /**
     * 功能: 如何根据子结点返回结果得到父结点的返回结果(聚集).
     * 输入:
     * aggregate: 当前父结点的返回结果
     * nextResult: 子结点的返回结果
     * 输出:
     * 聚集后父结点的返回结果
     * */
    @Override
    protected List<StatementContext> aggregateResult(List<StatementContext> aggregate, List<StatementContext> nextResult) {
        if (aggregate == null) return nextResult;// 父结点结果为空, 则返回子结点的结果
        if (nextResult == null) return aggregate;// 子结点结果为空, 则返回父结点的结果
        aggregate.addAll(nextResult);// 否则, 返回父子结点结果的拼接
        return aggregate;
    }

    /**
     * 功能: 查询if语句.
     * 输入:
     * ctx: AST根结点
     * cond: if语句的判断条件. 若为空, 则本项不作为查询条件
     * ifType: if语句的类型, 是否有else语句
     * 输出:
     * 所有满足输入的if语句结点
     * */
    public List<StatementContext> IfStmt(CompilationUnitContext ctx, String cond, IF_TYPE ifType) {
        this.target = STMT.IF;
        this.ifType = ifType;
        List<StatementContext> result = visit(ctx);
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            result = result.stream().filter(statementContext ->
                s.equals(statementContext.getChild(1).getChild(1).getText())
            ).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * 功能: 查询switch语句.
     * 输入:
     * ctx: AST根结点
     * cond: switch语句的判断条件. 若为空, 则本项不作为查询条件
     * 输出:
     * 所有满足输入的switch语句结点
     * */
    public List<StatementContext> SwitchStmt(CompilationUnitContext ctx, String cond) {
        target = STMT.SWITCH;
        List<StatementContext> result = visit(ctx);
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            result = result.stream().filter(statementContext ->
                    s.equals(statementContext.getChild(1).getChild(1).getText())
            ).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * 功能: 查询for语句.
     * 输入:
     * ctx: AST根结点
     * forInit: for语句的初始化语句. 若为空, 则本项不作为查询条件
     * forCond: for语句循环结束的判断条件. 若为空, 则本项不作为查询条件
     * forUpdate: for语句的循环更新语句. 若为空, 则本项不作为查询条件
     * 输出:
     * 所有满足输入的for语句结点
     * */
    public List<StatementContext> ForStmt(CompilationUnitContext ctx, String forInit, String forCond, String forUpdate) {
        target = STMT.FOR;
        List<StatementContext> result = visit(ctx);
        if (forInit != null) {
            String s = forInit.replaceAll("[ \\t\\n]", "");
            result = result.stream().filter(statementContext ->
                s.equals(statementContext.getChild(2).getChild(0).getText())
            ).collect(Collectors.toList());
        }
        if (forCond != null) {
            String s = forCond.replaceAll("[ \\t\\n]", "");
            result = result.stream().filter(statementContext ->
                s.equals(statementContext.getChild(2).getChild(2).getText())
            ).collect(Collectors.toList());
        }
        if (forUpdate != null) {
            String s = forUpdate.replaceAll("[ \\t\\n]", "");
            result = result.stream().filter(statementContext ->
                s.equals(statementContext.getChild(2).getChild(4).getText())
            ).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * 功能: 查询while语句.
     * 输入:
     * ctx: AST根结点
     * cond: while语句循环结束的判断条件. 若为空, 则本项不作为查询条件
     * 输出:
     * 所有满足输入的while语句结点
     * */
    public List<StatementContext> WhileStmt(CompilationUnitContext ctx, String cond) {
        target = STMT.WHILE;
        List<StatementContext> result = visit(ctx);
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            result = result.stream().filter(statementContext ->
                s.equals(statementContext.parExpression().expression().getText())
            ).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * 功能: 查询do-while语句.
     * 输入:
     * ctx: AST根结点
     * cond: do-while语句循环结束的判断条件. 若为空, 则本项不作为查询条件
     * 输出:
     * 所有满足输入的do-while语句结点
     * */
    public List<StatementContext> DoWhileStmt(CompilationUnitContext ctx, String cond) {
        target = STMT.DOWHILE;
        List<StatementContext> result = visit(ctx);
        if (cond != null) {
            String s = cond.replaceAll("[ \\t\\n]", "");
            result = result.stream().filter(statementContext -> {
                int n = statementContext.getChildCount();
                return s.equals(statementContext.getChild(n-2).getChild(1).getText());
            }).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * 功能: 查询try语句.
     * 输入:
     * ctx: AST根结点
     * tryType: try语句的类型, 是否有catch/finally语句
     * catchCond: catch语句的捕获条件, 每个捕获条件依次对应. 若为空, 则本项不作为查询条件
     * 输出:
     * 所有满足输入的try语句结点
     * */
    public List<StatementContext> TryStmt(CompilationUnitContext ctx, TRY_TYPE tryType, String[] catchCond) {
        this.target = STMT.TRY;
        this.tryType = tryType;
        List<StatementContext> result = visit(ctx);
        if (catchCond != null) {
            for (int i=0; i<catchCond.length; i++) {
                final int idx = i;
                String s = catchCond[idx].replaceAll(" ", "");
                result = result.stream().filter(statementContext -> {
                    if (statementContext.catches() == null || statementContext.catches().catchClause(idx) == null)
                        return false;
                    else
                        return s.equals(statementContext.catches().catchClause(idx).getText().split("\\(|\\)")[1]);
                }).collect(Collectors.toList());
            }
        }
        return result;
    }

    /**
     * 功能: 查询throw语句.
     * 输入:
     * ctx: AST根结点
     * expr: throw语句抛出的表达式. 若为空, 则本项不作为查询条件
     * 输出:
     * 所有满足输入的throw语句结点
     * */
    public List<StatementContext> ThrowStmt(CompilationUnitContext ctx, String expr) {
        target = STMT.THROW;
        List<StatementContext> result = visit(ctx);
        if (expr != null) {
            String s = expr.replaceAll("[ \\t\\n]", "");
            result = result.stream().filter(statementContext ->
                s.equals(statementContext.expression(0).getText())
            ).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * 测试用输出函数
     * */
    private static void output(List<StatementContext> stmts) {
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

        System.out.println("\n@ if statement test");
        System.out.println("# find all if with else, condition: i == 0");
        String c1 = "i == 0";
        List<StatementContext> s1 = stmtVisitor.IfStmt(root, c1, IF_TYPE.WITH_ELSE);
        output(s1);
        System.out.println("# find all if without else, condition: i == 1");
        String c2 = "i == 1";
        List<StatementContext> s2 = stmtVisitor.IfStmt(root, c2, IF_TYPE.WITHOUT_ELSE);
        output(s2);

        System.out.println("\n@ switch statement test");
        System.out.println("# find all switch, condition: i");
        String c3 = "i";
        List<StatementContext> s3 = stmtVisitor.SwitchStmt(root, c3);
        output(s3);

        System.out.println("\n@ for statement test");
        System.out.println("# find all for statement, forInit: i = 0");
        String c4 = " i = 0";
        List<StatementContext> s4 = stmtVisitor.ForStmt(root, c4, null, null);
        output(s4);

        System.out.println("\n@ while statement test");
        System.out.println("# find all while statement, condition: null");
        List<StatementContext> s5 = stmtVisitor.WhileStmt(root, null);
        output(s5);

        System.out.println("\n@ do-while statement test");
        System.out.println("# find all do-while statement, condition: i < 5");
        String c6 = "i < 5";
        List<StatementContext> s6 = stmtVisitor.DoWhileStmt(root, c6);
        output(s6);

        System.out.println("\n@ try statement test");
        System.out.println("find all try statement, with two catch statement");
        System.out.println(", without finally statement, condition: [IOException e1, Exception e2]");
        String[] c7 = new String[2];
        c7[0] = "IOException e1";
        c7[1] = "Exception e2";
        List<StatementContext> s7 = stmtVisitor.TryStmt(root, TRY_TYPE.WITH_CATCH_WITHOUT_FINALLY, c7);
        output(s7);
        System.out.println("find all try statement, without catch statement, with finally statement");
        List<StatementContext> s8 = stmtVisitor.TryStmt(root, TRY_TYPE.WITHOUT_CATCH_WITH_FINALLY, null);
        output(s8);

        System.out.println("\n@ throw statement test");
        System.out.println("find all throw statement, condition: new RuntimeException()");
        String c9 = "new RuntimeException()";
        List<StatementContext> s9 = stmtVisitor.ThrowStmt(root, c9);
        output(s9);

        System.out.println("=====statement test over=====");
    }
}
