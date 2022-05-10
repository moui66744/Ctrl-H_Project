package runtime;

import AstGenerator.AstInfo;
import Visitor.ExpVisitor;
import Visitor.StmtVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
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

    public static Map<String, List<ParserRuleContext>> execSearch(CLIParseInfo cliInfo) throws IOException {
        Map<String, List<ParserRuleContext>> result = new HashMap<>();

        // 打开 路径下所有文件 / 文件
        astList = readFile(cliInfo.path);

        for (AstInfo astInfo: astList) {
            List<ParserRuleContext> res = new ArrayList<>();
            switch (cliInfo.target) {
                // 语句查询
                case "if" -> res = execIfSearch(astInfo, cliInfo.cond, cliInfo.ifType);
                case "switch" -> res = execSwitchSearch(astInfo, cliInfo.cond);
                case "for" -> res = execForSearch(astInfo, cliInfo.forInit, cliInfo.cond, cliInfo.forUpdate);
                case "while" -> res = execWhileSearch(astInfo, cliInfo.cond);
                case "do_while" -> res = execDoWhileSearch(astInfo, cliInfo.cond);
                case "try" -> res = execTrySearch(astInfo, cliInfo.cond, cliInfo.tryType);
                case "throw" -> res = execThrowSearch(astInfo, cliInfo.cond);
                // TODO: 声明查询

                // TODO: 表达式查询
                case "expr" -> res = execExprSearch(astInfo, cliInfo.expr);
            }
            result.put(astInfo.getPath(), res);
        }



        return result;
    }

    private static List<ParserRuleContext> execIfSearch(AstInfo astInfo, String cond, StmtVisitor.IF_TYPE ifType) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        var res = stmtVisitor.ifStmtVisitor(astInfo.getRoot());
        return new ArrayList<>(stmtVisitor.ifStmtFilter(res, cond, ifType));
    }

    private static List<ParserRuleContext> execSwitchSearch(AstInfo astInfo, String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        var res = stmtVisitor.switchStmtVisitor(astInfo.getRoot());
        return new ArrayList<>(stmtVisitor.switchStmtFilter(res, cond));
    }

    private static List<ParserRuleContext> execForSearch(AstInfo astInfo, String forInit, String cond, String forUpdate) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        var res = stmtVisitor.forStmtVisitor(astInfo.getRoot());
        return new ArrayList<>(stmtVisitor.forStmtFilter(res, forInit, cond, forUpdate));
    }

    private static List<ParserRuleContext> execWhileSearch(AstInfo astInfo, String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        var res = stmtVisitor.whileStmtVisitor(astInfo.getRoot());
        return new ArrayList<>(stmtVisitor.whileStmtFilter(res, cond));
    }

    private static List<ParserRuleContext> execDoWhileSearch(AstInfo astInfo, String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        var res = stmtVisitor.doWhileStmtVisitor(astInfo.getRoot());
        return new ArrayList<>(stmtVisitor.doWhileStmtFilter(res, cond));
    }

    private static List<ParserRuleContext> execTrySearch(AstInfo astInfo, String cond, StmtVisitor.TRY_TYPE tryType) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        var res = stmtVisitor.tryStmtVisitor(astInfo.getRoot());
        return new ArrayList<>(stmtVisitor.tryStmtFilter(res, cond, tryType));
    }

    private static List<ParserRuleContext> execThrowSearch(AstInfo astInfo, String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        var res = stmtVisitor.throwStmtVisitor(astInfo.getRoot());
        return new ArrayList<>(stmtVisitor.throwStmtFilter(res, cond));
    }

    private static List<ParserRuleContext> execExprSearch(AstInfo ast, String expr) {
        var exprVisitor = new ExpVisitor();
        exprVisitor.patternPreCompile(expr);
        var res = exprVisitor.visitCompilationUnit(ast.getRoot());
        res = exprVisitor.filter(res, ast.getTokenStream());
        return new ArrayList<>(res);
    }
}
