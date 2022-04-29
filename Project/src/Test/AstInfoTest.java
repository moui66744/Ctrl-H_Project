package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import JavaParser.JavaVisitor;
import org.antlr.runtime.tree.TreeWizard;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.file.Files;

public class AstInfoTest {
    static String inputFileName = "testcase/test.java";
    static CharStream src;
    public static void parseArg(String [] args) throws IOException {
        src = CharStreams.fromFileName(inputFileName);
    }
    public static void main(String[] args) throws IOException {
        parseArg(args);
        AstInfo astInfo = new AstInfo(src);

    }
}
