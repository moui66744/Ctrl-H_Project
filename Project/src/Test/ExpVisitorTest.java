package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import Visitor.ExpVisitor;

import java.io.IOException;
import java.util.List;

public class ExpVisitorTest {
    static String inputFileName = "test/DummyTest.java";
    public static void main(String [] argv) throws IOException {
        AstInfo ast = new AstInfo(inputFileName);
        ExpVisitor expVisitor = new ExpVisitor();
        List<JavaParser.ExpressionContext> allExp = expVisitor.visitCompilationUnit(ast.getRoot());
        //test 1: find all expression
        for (var item :allExp){
            System.out.println(item.getText());
        }

        var PartialMatchResult = expVisitor.filter(allExp, "i++");

        System.out.println("//////////////////////////////\n Partial Match Filter");
        for (var item : PartialMatchResult) {
            System.out.println(item.getText());
        }
        System.out.println("//////////////////////////////\n Full Match Filter");
        expVisitor.setMatchMode(ExpVisitor.MatchMode.FullMatch);
        var fullMatchResult = expVisitor.filter(allExp, "i");

        for (var item : fullMatchResult) {
            System.out.println(item.getText());
        }


    }
}
