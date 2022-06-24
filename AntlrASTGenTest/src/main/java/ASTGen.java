import gen.JavaLexer;
import gen.JavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ASTGen {
    public static String readFile(String fileName) throws IOException {
        File file = new File(fileName);
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, StandardCharsets.UTF_8);
    }

    /**
     * 递归打印AST
     * */
    public static void printAST(ParserRuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = JavaParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName + " -> " + ctx.getText());
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof ParserRuleContext) {
                printAST((ParserRuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String inputString = readFile("src\\main\\java\\Test.java");// 读目标文件
        CharStream input = CharStreams.fromString(inputString);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParserRuleContext ctx = parser.classDeclaration();
        printAST(ctx, false, 0);
    }
}
