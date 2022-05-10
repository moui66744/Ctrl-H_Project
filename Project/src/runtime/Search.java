package runtime;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import Visitor.ExpVisitor;
import Visitor.StmtVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Search {
    /*
    TODO: 要同时记录所属文件, 可以使用/完善utils/SourcePosition类
     */
    static List<AstInfo> astList;

    private static List<AstInfo> readFile(String path) throws IOException {
        List<AstInfo> list = new ArrayList<>();
        Stream<Path> walk = Files.walk(Paths.get(path));
        for (String fileName : walk.map(Path::toString).filter(f -> f.endsWith(".java")).toList()) {
            list.add(new AstInfo(fileName));
        }
        return list;
    }

    public static HashMap<String, List<ParserRuleContext>> execSearch(CLIParseInfo cliInfo) throws IOException {
        HashMap<String, List<ParserRuleContext>> result = new HashMap<>();

        // 打开 路径下所有文件 / 文件
        astList = readFile(cliInfo.path);

        for (AstInfo astInfo: astList) {
            List<ParserRuleContext> res = new ArrayList<>();
            switch (cliInfo.target) {
                // 语句查询
                case "if" -> res = execIfSearch(cliInfo.cond, cliInfo.ifType);
                case "switch" -> res = execSwitchSearch(cliInfo.cond);
                case "for" -> res = execForSearch(cliInfo.forInit, cliInfo.cond, cliInfo.forUpdate);
                case "while" -> res = execWhileSearch(cliInfo.cond);
                case "do_while" -> res = execDoWhileSearch(cliInfo.cond);
                case "try" -> res = execTrySearch(cliInfo.cond, cliInfo.tryType);
                case "throw" -> res = execThrowSearch(cliInfo.cond);
                // TODO: 声明查询

                // TODO: 表达式查询
                case "expr" -> res = execExprSearch(cliInfo.expr);
            }
            result.put(astInfo.getPath(), res);
        }



        return result;
    }

    private static List<ParserRuleContext> execIfSearch(String cond, StmtVisitor.IF_TYPE ifType) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        List<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.ifStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.ifStmtFilter(res, cond, ifType));
        }
        return result;
    }

    private static List<ParserRuleContext> execSwitchSearch(String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        List<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.switchStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.switchStmtFilter(res, cond));
        }
        return result;
    }

    private static List<ParserRuleContext> execForSearch(String forInit, String cond, String forUpdate) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        List<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.forStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.forStmtFilter(res, forInit, cond, forUpdate));
        }
        return result;
    }

    private static List<ParserRuleContext> execWhileSearch(String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        List<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.whileStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.whileStmtFilter(res, cond));
        }
        return result;
    }

    private static List<ParserRuleContext> execDoWhileSearch(String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        List<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.doWhileStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.doWhileStmtFilter(res, cond));
        }
        return result;
    }

    private static List<ParserRuleContext> execTrySearch(String cond, StmtVisitor.TRY_TYPE tryType) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        List<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.tryStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.tryStmtFilter(res, cond, tryType));
        }
        return result;
    }

    private static List<ParserRuleContext> execThrowSearch(String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        List<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.throwStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.throwStmtFilter(res, cond));
        }
        return result;
    }

    private static List<ParserRuleContext> execExprSearch(String expr) {
        var exprVisitor = new ExpVisitor();
        List<ParserRuleContext> result = new ArrayList<>();
        exprVisitor.patternPreCompile(expr);
        for (var ast : astList) {
            var res = exprVisitor.visitCompilationUnit(ast.getRoot());
            res = exprVisitor.filter(res, ast.getTokenStream());
            result.addAll(res);
        }
        return result;
    }
}
