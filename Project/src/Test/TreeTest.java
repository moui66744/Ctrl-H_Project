package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import java.io.IOException;

public class TreeTest {
    static final String src = "test/DummyTestBackup.java";
    public static void main(String [] argv) throws IOException {
        AstInfo astInfo = new AstInfo(src);
        var parser = astInfo.getParser();
        String pattern = "i=<expression>";
        System.out.println(astInfo.getRoot().getText());
        String xpath = "//blockStatement/*";
        ParseTreePattern p = parser.compileParseTreePattern(pattern, JavaParser.RULE_expression);
        var res = p.findAll(astInfo.getRoot(), xpath);
        for (var item : res) {
            System.out.println(item);
        }
    }
}
