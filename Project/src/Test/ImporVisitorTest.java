package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import Visitor.ImportVisitor;
import org.antlr.v4.runtime.RuleContext;

import java.io.IOException;
import java.util.List;

public class ImporVisitorTest {
    public static void output(List<JavaParser.ImportDeclarationContext> list) {
        if (list != null)
            list.stream().map(RuleContext::getText).forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        AstInfo astInfo = new AstInfo("Project/test/DummyTest.java");
        ImportVisitor importVisitor = new ImportVisitor();
        List<JavaParser.ImportDeclarationContext> importfilter = importVisitor.importfilter(
                importVisitor.importVisitor(astInfo.getRoot()),
                "JavaParser.JavaBaseVisitor"
        );
        output(importfilter);
    }
}
