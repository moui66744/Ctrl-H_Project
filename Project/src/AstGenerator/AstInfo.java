package AstGenerator;

import JavaParser.JavaLexer;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class AstInfo {
    String path;
    JavaLexer lexer;
    JavaParser parser;
    CommonTokenStream tokenStream;
    JavaParser.CompilationUnitContext root;
    TokenStreamRewriter tokenStreamRewriter;
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
        path = inputFileName;
    }

    public String getPath() {
        return path;
    }
    public JavaParser.CompilationUnitContext getRoot(){
        return root;
    }
    public CommonTokenStream getTokenStream() {
        return tokenStream;
    }

    public JavaLexer getLexer() {
        return lexer;
    }
    public JavaParser getParser() {
        return parser;
    }

    public TokenStreamRewriter getTokenStreamRewriter() {
        return tokenStreamRewriter;
    }
    public <T extends ParserRuleContext> void replace(T context, String text) {
        tokenStreamRewriter.replace(context.start,context.stop, text);
    }
    public String getText(ParserRuleContext ctx) {
        return this.tokenStream.getText(ctx.start, ctx.stop);
    }
}
