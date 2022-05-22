package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import Visitor.StmtVisitor;

import java.io.IOException;
import java.util.List;

public class StmtVisitorTest {
    /**
     * 测试用输出函数
     * */
    private static void output(List<JavaParser.StatementContext> stmts) {
        for (JavaParser.StatementContext stmt: stmts) {
            System.out.println(stmt.getText());
        }
    }

    /**
     * 测试函数
     * */
    public static void main(String[] args) throws IOException {
        String fileName = "Project/test/DummyTest.java";
        AstInfo astInfo = new AstInfo(fileName);
        JavaParser.CompilationUnitContext root = astInfo.getRoot();
        StmtVisitor stmtVisitor = new StmtVisitor();

        System.out.println("\n\u001b[36;4m@ if statement test\u001b[0m");
        System.out.println("# find all if with else, condition: i == 0");
        String c1 = "i == 0";
        List<JavaParser.StatementContext> s1 = stmtVisitor.ifStmtVisitor(root);
        s1 = stmtVisitor.ifStmtFilter(s1, c1, StmtVisitor.IF_TYPE.WITH_ELSE, true);
        output(s1);
        System.out.println("# find all if without else, condition: i == 1");
        String c2 = "i == 1";
        List<JavaParser.StatementContext> s2 = stmtVisitor.ifStmtVisitor(root);
        s2 = stmtVisitor.ifStmtFilter(s2, c2, StmtVisitor.IF_TYPE.WITHOUT_ELSE, true);
        output(s2);

        System.out.println("\n\u001b[36;4m@ switch statement test\u001b[0m");
        System.out.println("# find all switch, condition: i");
        String c3 = "i";
        List<JavaParser.StatementContext> s3 = stmtVisitor.switchStmtVisitor(root);
        s3 = stmtVisitor.switchStmtFilter(s3, c3, true);
        output(s3);

        System.out.println("\n\u001b[36;4m@ for statement test\u001b[0m");
        System.out.println("# find all for statement, forInit: i = 0");
        String c4 = " i = 0";
        List<JavaParser.StatementContext> s4 = stmtVisitor.forStmtVisitor(root);
        s4 = stmtVisitor.forStmtFilter(s4, c4, null, null, true);
        output(s4);

        System.out.println("\n\u001b[36;4m@ while statement test\u001b[0m");
        System.out.println("# find all while statement, condition: null");
        List<JavaParser.StatementContext> s5 = stmtVisitor.whileStmtVisitor(root);
        s5 = stmtVisitor.whileStmtFilter(s5, null, true);
        output(s5);

        System.out.println("\n\u001b[36;4m@ do-while statement test\u001b[0m");
        System.out.println("# find all do-while statement, condition: i < 5");
        String c6 = "i < 5";
        List<JavaParser.StatementContext> s6 = stmtVisitor.doWhileStmtVisitor(root);
        s6 = stmtVisitor.doWhileStmtFilter(s6, c6, true);
        output(s6);

        System.out.println("\n\u001b[36;4m@ try statement test\u001b[0m");
//        System.out.println("# find all try statement, with two catch statement, without finally statement,");
//        System.out.println(" condition: [IOException e1, Exception e2]");
//        String[] c7 = new String[2];
//        c7[0] = "IOException e1";
//        c7[1] = "Exception e2";
//        List<StatementContext> s7 = stmtVisitor.tryStmtVisitor(root);
//        s7 = stmtVisitor.tryStmtFilter(s7, c7, TRY_TYPE.WITH_CATCH_WITHOUT_FINALLY);
//        output(s7);
        System.out.println("# find all try statement, without catch statement, with finally statement");
        List<JavaParser.StatementContext> s8 = stmtVisitor.tryStmtVisitor(root);
        s8 = stmtVisitor.tryStmtFilter(s8, null, StmtVisitor.TRY_TYPE.WITHOUT_CATCH_WITH_FINALLY, true);
        output(s8);

        System.out.println("\n\u001b[36;4m@ throw statement test\u001b[0m");
        System.out.println("# find all throw statement, condition: new RuntimeException()");
        String c9 = "new RuntimeException()";
        List<JavaParser.StatementContext> s9 = stmtVisitor.throwStmtVisitor(root);
        s9 = stmtVisitor.throwStmtFilter(s9, c9, true);
        output(s9);

        System.out.println("=====statement test over=====");
    }
}
