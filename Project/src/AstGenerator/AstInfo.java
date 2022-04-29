package AstGenerator;

import JavaParser.JavaLexer;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public class AstInfo {
    JavaLexer lexer;
    JavaParser parser;
    CommonTokenStream tokenStream;
    public AstInfo(CharStream input) {
        lexer = new JavaLexer(input);
        tokenStream = new CommonTokenStream(lexer);
        parser = new JavaParser(tokenStream);
        JavaParser.CompilationUnitContext tree = parser.compilationUnit();
    }
    public String getIdentEqualsTo(String identName) {
        Token t = null;
        return makeTokenInfo(t);
    }

    String makeTokenInfo(Token token) {
        return "Line:" + token.getLine() + " Offset:" + token.getCharPositionInLine() + "\n" + "content:"
                + token.getText();

    }
}
