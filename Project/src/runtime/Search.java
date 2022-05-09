package runtime;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import Visitor.ExpVisitor;
import Visitor.StmtVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Search {
    /*
    TODO: 要同时记录所属文件, 可以使用/完善utils/SourcePosition类
     */
    static ArrayList<AstInfo> astList;

    private static ArrayList<AstInfo> readFile(String path) throws IOException {
        File file = new File(path);
        ArrayList<AstInfo> result = new ArrayList<>();
        if (!file.isDirectory()){
            if (file.getName().contains(".java"))
                result.add(new AstInfo(path));
        } else if (file.isDirectory()){
            String [] s = file.list();
            if (s == null)
                throw new IOException("Empty Directory");
            for (var f : s){
                var fileItem = new File(path + f);
                if (fileItem.isDirectory()){
                    readFile(fileItem.getAbsolutePath());
                } else {
                    if (fileItem.getName().contains(".java"))
                        result.add(new AstInfo(fileItem));
                }
            }
        }
        if (result.size() == 0) {
            throw new IOException("Invalid file name/path");
        }
        return result;
    }

    public static ArrayList<ParserRuleContext> execSearch(CLIParseInfo cliInfo) throws IOException {
        ArrayList<ParserRuleContext> result = null;

        // 打开 路径下所有文件 / 文件
        astList = readFile(cliInfo.path);

        switch (cliInfo.target) {
            // 语句查询
            case "if" -> result = execIfSearch(cliInfo.cond, cliInfo.ifType);
            case "switch" -> result = execSwitchSearch(cliInfo.cond);
            case "for" -> result = execForSearch(cliInfo.forInit, cliInfo.cond, cliInfo.forUpdate);
            case "while" -> result = execWhileSearch(cliInfo.cond);
            case "do_while" -> result = execDoWhileSearch(cliInfo.cond);
            case "try" -> result = execTrySearch(cliInfo.cond, cliInfo.tryType);
            case "throw" -> result = execThrowSearch(cliInfo.cond);
            // TODO: 声明查询

            // TODO: 表达式查询
            case "expr" -> result = execExprSearch(cliInfo.expr);
        }
        return result;
    }

    private static ArrayList<ParserRuleContext> execIfSearch(String cond, StmtVisitor.IF_TYPE ifType) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        ArrayList<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.ifStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.ifStmtFilter(res, cond, ifType));
        }
        return result;
    }

    private static ArrayList<ParserRuleContext> execSwitchSearch(String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        ArrayList<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.switchStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.switchStmtFilter(res, cond));
        }
        return result;
    }

    private static ArrayList<ParserRuleContext> execForSearch(String forInit, String cond, String forUpdate) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        ArrayList<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.forStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.forStmtFilter(res, forInit, cond, forUpdate));
        }
        return result;
    }

    private static ArrayList<ParserRuleContext> execWhileSearch(String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        ArrayList<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.whileStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.whileStmtFilter(res, cond));
        }
        return result;
    }

    private static ArrayList<ParserRuleContext> execDoWhileSearch(String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        ArrayList<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.doWhileStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.doWhileStmtFilter(res, cond));
        }
        return result;
    }

    private static ArrayList<ParserRuleContext> execTrySearch(String cond, StmtVisitor.TRY_TYPE tryType) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        ArrayList<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.tryStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.tryStmtFilter(res, cond, tryType));
        }
        return result;
    }

    private static ArrayList<ParserRuleContext> execThrowSearch(String cond) {
        StmtVisitor stmtVisitor = new StmtVisitor();
        ArrayList<ParserRuleContext> result = new ArrayList<>();
        for (AstInfo astInfo : astList) {
            var res = stmtVisitor.throwStmtVisitor(astInfo.getRoot());
            result.addAll(stmtVisitor.throwStmtFilter(res, cond));
        }
        return result;
    }

    private static ArrayList<ParserRuleContext> execExprSearch(String expr) {
        var exprVisitor = new ExpVisitor();
        ArrayList<ParserRuleContext> result = new ArrayList<>();
        exprVisitor.patternPreCompile(expr);
        for (var ast : astList) {
            var res = exprVisitor.visitCompilationUnit(ast.getRoot());
            res = exprVisitor.filter(res, ast.getTokenStream());
            result.addAll(res);
        }
        return result;
    }
}
