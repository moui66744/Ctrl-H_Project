package Visitor;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VariableDeclaratorVisitor {

    private static VariableInfo getVariableInfo(JavaParser.VariableDeclaratorContext context) {
        return new VariableInfo(context.variableDeclaratorId().Identifier(),
                null,// TODO: 2022/5/7
                context,
                getType(context));
    }

    public static List<VariableInfo> getVariableDeclarator(ParserRuleContext root) {
        List<VariableInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.VariableDeclaratorContext) {
            VariableInfo variableInfo = getVariableInfo((JavaParser.VariableDeclaratorContext) root);
            ret.add(variableInfo);
        } else {
            if (root.children == null) return ret;
            for (var iChild : root.children) {
                if (iChild instanceof ParserRuleContext)
                    ret.addAll(getVariableDeclarator((ParserRuleContext) iChild));
            }
        }
        return ret;
    }

    public static List<VariableInfo> getVariableDeclarator(ParserRuleContext root, String name) {
        if (root == null) return new ArrayList<>();
        List<VariableInfo> variableInfos = getVariableDeclarator(root);
        return VariableInfo.variableInfoFilter(variableInfos, name);
    }

    public static List<VariableInfo> getVariableDeclarator(ParserRuleContext root, JavaParser.TypeContext type) {
        if (root == null) return new ArrayList<>();
        List<VariableInfo> variableInfos = getVariableDeclarator(root);
        return VariableInfo.variableInfoFilter(variableInfos, type);
    }

    public static JavaParser.TypeContext getType(JavaParser.VariableDeclaratorContext varDecls) {
        ParserRuleContext parent = (ParserRuleContext) varDecls.parent.parent;
        if (parent instanceof JavaParser.LocalVariableDeclarationContext localVariableDeclarationContext) {
            return localVariableDeclarationContext.type();
        } else {
            JavaParser.MemberDeclarationContext memberDeclarationContext = (JavaParser.MemberDeclarationContext) parent.parent;
            return memberDeclarationContext.type();
        }
    }

    public static void main(String[] args) throws IOException {
        //        main method is just for testing
        AstInfo astInfo = new AstInfo("test/DummyTest.java");
        MethodDeclVisitor methodDeclVisitor = new MethodDeclVisitor();
        var root = astInfo.getRoot();
        List<VariableInfo> variableInfos = getVariableDeclarator(root,"i");
        for (var varDecls : variableInfos) {
            System.out.println(varDecls.Type.getText());
        }

    }
}
