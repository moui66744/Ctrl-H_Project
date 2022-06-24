package AstGenerator;

import JavaParser.JavaLexer;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public interface AstInfo {
    String path = null;
    CommonTokenStream tokenStream = null;
    JavaParser.CompilationUnitContext root = null;
    TokenStreamRewriter tokenStreamRewriter = null;

    String getPath() ;
    CommonTokenStream getTokenStream();


    TokenStreamRewriter getTokenStreamRewriter();
    <T extends ParserRuleContext> void replace(T context, String text) ;
    String getText(ParserRuleContext ctx) ;
}
