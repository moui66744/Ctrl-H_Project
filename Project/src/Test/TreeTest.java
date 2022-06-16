package Test;

import AstGenerator.JavaAstInfo;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import java.io.IOException;

public class TreeTest {
    static final String src = "test/DummyTestBackup.java";
    public static void main(String [] argv) throws IOException {
        JavaAstInfo javaAstInfo = new JavaAstInfo(src);
        var parser = javaAstInfo.getParser();
        String pattern = "i=<expression>";
        System.out.println(javaAstInfo.getRoot().getText());
        String xpath = "//blockStatement/*";
        ParseTreePattern p = parser.compileParseTreePattern(pattern, JavaParser.RULE_expression);
        var res = p.findAll(javaAstInfo.getRoot(), xpath);
        for (var item : res) {
            System.out.println(item);
        }
    }
}
