package AstGenerator;

import CppParser.CppLexer;
import CppParser.CppParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class CppAstInfo implements AstInfo{
    String path;
    CppLexer lexer;
    CppParser parser;
    CommonTokenStream tokenStream;
    CppParser.TranslationUnitContext root;
    TokenStreamRewriter tokenStreamRewriter;

    public CppAstInfo(CharStream input) {
        lexer = new CppLexer(input);
        tokenStream = new CommonTokenStream(lexer);
        parser = new CppParser(tokenStream);
        root = parser.translationUnit();
        tokenStreamRewriter = new TokenStreamRewriter(tokenStream);
    }
    public CppAstInfo(File inputFile) throws IOException {
        this(CharStreams.fromPath(Paths.get(inputFile.getPath())));

    }
    public CppAstInfo(String inputFileName) throws IOException {
        this(CharStreams.fromFileName(inputFileName));
         path = inputFileName;
    }

    public String getPath() {
        return path;
    }

    public CppLexer getLexer() {
        return lexer;
    }

    public CppParser getParser() {
        return parser;
    }

    public CommonTokenStream getTokenStream() {
        return tokenStream;
    }

    public CppParser.TranslationUnitContext getRoot() {
        return root;
    }

    public TokenStreamRewriter getTokenStreamRewriter() {
        return tokenStreamRewriter;
    }

    public <T extends ParserRuleContext> void replace(T context, String text) {
        tokenStreamRewriter.replace(context.start, context.stop, text);
    }

    public String getText(ParserRuleContext ctx) {
        return this.tokenStream.getText(ctx.start, ctx.stop);
    }
}
