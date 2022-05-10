package runtime;

import AstGenerator.AstInfo;
import Info.ClassOrInterfaceInfo;
import Info.MethodInfo;
import Info.VariableInfo;
import Visitor.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public class Search {
    public static int cnt;
    public static Map<AstInfo, List<ParserRuleContext>> execSearch(CLIParseInfo cliInfo) {
        Map<AstInfo, List<ParserRuleContext>> result = new HashMap<>();
        cnt = 0;
        for (AstInfo astInfo : IO.getAstList()) {
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
                // 声明查询
                case "class" -> res = execClassOrInterfaceSearch(astInfo, cliInfo.name);
                case "interface" -> res = execClassOrInterfaceSearch(astInfo, cliInfo.name);
                case "method" -> res = execMethodSearch(astInfo, cliInfo.name, cliInfo.type);
                case "variable" -> res = execVarDeclSearch(astInfo, cliInfo.name, cliInfo.type);
                // 表达式查询
                case "expr" -> res = execExprSearch(astInfo, cliInfo.expr);
            }
            result.put(astInfo, res);
            cnt += res.size();
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
        var res = exprVisitor.visitCompilationUnit(ast.getRoot());
        if (expr != null) {
            exprVisitor.patternPreCompile(expr);
            res = exprVisitor.filter(res, ast.getTokenStream());
        }
        return new ArrayList<>(res);
    }

    private static List<ParserRuleContext> execClassOrInterfaceSearch(AstInfo ast, String name) {
        var res = ClassOrInterfaceDeclarationVisitor.getClassOrInterfaceDeclaration(ast.getRoot());
        if (name != null)
            res = ClassOrInterfaceInfo.classOrInterfaceInfoFilter(res, name);
        return res.stream().map(item -> item.Context).collect(Collectors.toList());
    }

    private static List<ParserRuleContext> execMethodSearch(AstInfo ast, String name, String type) {
        var res = MethodDeclVisitor.getMethodDeclaration(ast.getRoot());
        if (name != null)
            res = MethodInfo.methodInfoFilter(res, name);
        if (type != null)
            res = MethodInfo.methodInfoTypeStringFilter(res, type);
//        res = MethodInfo.methodInfoFilter(res, voidBoolean);
        return res.stream().map(item -> item.Context).collect(Collectors.toList());
    }

    private static List<ParserRuleContext> execVarDeclSearch(AstInfo ast, String name, String type) {
        var res = VariableDeclaratorVisitor.getVariableDeclarator(ast.getRoot());
        if (name != null)
            res = VariableInfo.variableInfoFilter(res, name);
        if (type != null)
            res = VariableInfo.variableInfoTypeStringFilter(res, type);
        return res.stream().map(item -> item.Context).collect(Collectors.toList());
    }
}
