package AstGenerator;

import JavaParser.JavaLexer;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class AstInfo {
    JavaLexer lexer;
    JavaParser parser;
    CommonTokenStream tokenStream;
    JavaParser.CompilationUnitContext root;
    static TokenStreamRewriter tokenStreamRewriter;
    public AstInfo(CharStream input) {
        lexer = new JavaLexer(input);
        tokenStream = new CommonTokenStream(lexer);
        parser = new JavaParser(tokenStream);
        root = parser.compilationUnit();
        tokenStreamRewriter = new TokenStreamRewriter(tokenStream);
    }
    public AstInfo(File inputFile) throws IOException {
        this(CharStreams.fromPath(Paths.get(inputFile.getPath())));
    }

    public AstInfo(String inputFileName) throws IOException {
        this(CharStreams.fromFileName(inputFileName));
    }

    public JavaParser.CompilationUnitContext getRoot(){
        return root;
    }
    public CommonTokenStream getTokenStream() {
        return tokenStream;
    }
    public TokenStreamRewriter getTokenStreamRewriter() {
        return tokenStreamRewriter;
    }
    public static  <T extends ParserRuleContext> void replace(T context, String text) {
        tokenStreamRewriter.replace(context.start,context.stop, text);
    }
}
