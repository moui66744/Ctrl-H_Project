package Test;

import AstGenerator.JavaAstInfo;
import JavaParser.JavaParser;
import Visitor.ExpVisitor;

import java.io.IOException;
import java.util.List;

public class ExpVisitorTest {
    static String inputFileName = "test/DummyTest.java";
    public static void main(String [] argv) throws IOException {
        JavaAstInfo ast = new JavaAstInfo(inputFileName);
        ExpVisitor expVisitor = new ExpVisitor();
        List<JavaParser.ExpressionContext> allExp = expVisitor.visitCompilationUnit(ast.getRoot());
        //test 1: find all expression
        for (var item :allExp){
            System.out.println(item.getText());
        }

        System.out.println("//////////////////////////////\n Partial Match Filter");
        expVisitor.patternPreCompile("1 *    2");

        var PartialMatchResult = expVisitor.filter(allExp, ast.getTokenStream());
        for (var item : PartialMatchResult) {
            System.out.println(item.getText());
        }
        System.out.println("//////////////////////////////\n Full Match Filter");
        expVisitor.setMatchMode(ExpVisitor.MatchMode.FullMatch);
        expVisitor.patternPreCompile("1*2");
        var fullMatchResult = expVisitor.filter(allExp, ast.getTokenStream());

        for (var item : fullMatchResult) {
            System.out.println(item.getText());
        }


    }
}
