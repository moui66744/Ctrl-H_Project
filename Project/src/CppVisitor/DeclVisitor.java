package CppVisitor;

import AstGenerator.CppAstInfo;
import CppParser.CppBaseVisitor;
import CppParser.CppParser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeclVisitor extends CppBaseVisitor<List<BlockDeclarationContext>> {
    public enum DECL {
        FUNC,
        VAR,
    }
    private DECL target;

    @Override
    public List<BlockDeclarationContext> visitFunctionDefinition(FunctionDefinitionContext ctx) {
        if (target == DECL.FUNC) return new ArrayList<>(List.of((BlockDeclarationContext) ctx.getParent()));
        return super.visitFunctionDefinition(ctx);
    }

    @Override
    public List<BlockDeclarationContext> visitSimpleDeclaration(SimpleDeclarationContext ctx) {
        if (target == DECL.VAR) return new ArrayList<>(List.of((BlockDeclarationContext) ctx.getParent()));
        return super.visitSimpleDeclaration(ctx);
    }

    @Override
    protected List<BlockDeclarationContext> aggregateResult(List<BlockDeclarationContext> aggregate, List<BlockDeclarationContext> nextResult) {
        if (aggregate == null) return nextResult;   // 父结点结果为空, 则返回子结点的结果
        if (nextResult == null) return aggregate;   // 子结点结果为空, 则返回父结点的结果
        aggregate.addAll(nextResult);               // 否则, 返回父子结点结果的拼接
        return aggregate;
    }

    public List<BlockDeclarationContext> funcDeclVisitor(ParserRuleContext ctx) {
        target = DECL.FUNC;
        return visit(ctx);
    }

    public List<BlockDeclarationContext> funcDeclFilter(List<BlockDeclarationContext> list, String returnType, String name, String parameter) {
        if (list == null) return null;
        if (returnType != null) {
            String s = returnType.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx ->

                ctx.functionDefinition().declSpecifierSeq() != null &&
                s.equals(ctx.functionDefinition().declSpecifierSeq().getText())
            ).toList();
        }
        if (name != null) {
            String s = name.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx ->
                s.equals(ctx.functionDefinition().declarator().pointerDeclarator().noPointerDeclarator().noPointerDeclarator().getText())
            ).toList();
        }
        if (parameter != null) {
            String s = parameter.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx ->
                s.equals(ctx.functionDefinition().declarator().pointerDeclarator().noPointerDeclarator().parametersAndQualifiers().parameterDeclarationClause().getText())
            ).toList();
        }
        return list;
    }

    public List<BlockDeclarationContext> varDeclVisitor(ParserRuleContext ctx) {
        target = DECL.VAR;
        return visit(ctx);
    }

    public List<BlockDeclarationContext> varDeclFilter(List<BlockDeclarationContext> list, String type, String name) {
        if (list == null) return null;
        if (type != null) {
            String s = type.replaceAll("[ \\t\\n]", "");
            list = list.stream().filter(ctx ->
                ctx.simpleDeclaration().declSpecifierSeq() != null &&
                s.equals(ctx.simpleDeclaration().declSpecifierSeq().getText())
            ).toList();
        }
        if (name != null) {
            String s = name.replaceAll("[ \\t\\n]", "");
            list=  list.stream().filter(ctx ->
                ctx.simpleDeclaration().initDeclaratorList() != null &&
                s.equals(ctx.simpleDeclaration().initDeclaratorList().expression(0).initDeclarator().declarator().getText())
            ).toList();
        }
        return list;
    }

    private static void output(List<BlockDeclarationContext> list) {
        if (list != null)
            list.stream().map(RuleContext::getText).forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        CppAstInfo cppAstInfo = new CppAstInfo("Project/test/CppTest/test.cpp");
        TranslationUnitContext root = cppAstInfo.getRoot();
        DeclVisitor declVisitor = new DeclVisitor();
        // func decl test
        output(declVisitor.funcDeclFilter(declVisitor.funcDeclVisitor(root), "int", "retinput", "int input"));
        // var decl test
        output(declVisitor.varDeclFilter(declVisitor.varDeclVisitor(root), "int", "j"));
    }
}
