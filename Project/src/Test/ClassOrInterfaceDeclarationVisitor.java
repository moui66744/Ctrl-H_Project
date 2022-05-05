package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassOrInterfaceDeclarationVisitor extends JavaBaseVisitor<List<JavaParser.ClassOrInterfaceDeclarationContext>> {

    public static List<JavaParser.ClassOrInterfaceDeclarationContext> getClassOrInterfaceDeclaration(ParserRuleContext root) {
        if (root == null) return null;
        List<JavaParser.ClassOrInterfaceDeclarationContext> ret = new ArrayList<>();
        if (root instanceof JavaParser.ClassOrInterfaceDeclarationContext) {
            ret.add((JavaParser.ClassOrInterfaceDeclarationContext) root);
        } else {
            for (var iChild : root.children
            ) {
                if (iChild instanceof ParserRuleContext)
                    ret.addAll(getClassOrInterfaceDeclaration((ParserRuleContext) iChild));
            }
        }
        return ret;
    }

    public static List<JavaParser.ClassOrInterfaceDeclarationContext> getClassOrInterfaceDeclaration(ParserRuleContext root, String classOrInterfaceName) {
        if (root == null) return null;
        List<JavaParser.ClassOrInterfaceDeclarationContext> ret = new ArrayList<>();
        if (root instanceof JavaParser.ClassOrInterfaceDeclarationContext decl) {
            String name;
//            都没有考虑枚举的情况
            try {
                name = decl.classDeclaration().normalClassDeclaration().Identifier().getText();
            } catch (Exception e) {
                name = decl.interfaceDeclaration().normalInterfaceDeclaration().Identifier().getText();
            }
            if (classOrInterfaceName.equals(name))
                ret.add(decl);
        } else {
            for (var iChild : root.children
            ) {
                if (iChild instanceof ParserRuleContext)
                    ret.addAll(getClassOrInterfaceDeclaration((ParserRuleContext) iChild, classOrInterfaceName));
            }
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
        AstInfo astInfo = new AstInfo("test/DummyTest.java");
        ClassOrInterfaceDeclarationVisitor classOrInterfaceDeclarationVisitor = new ClassOrInterfaceDeclarationVisitor();
        var root = astInfo.getRoot();
        List<JavaParser.ClassOrInterfaceDeclarationContext> classOrInterfaceDeclarations = classOrInterfaceDeclarationVisitor.getClassOrInterfaceDeclaration(root, "DummyTest");
        for (var iNode : classOrInterfaceDeclarations) {
            System.out.println(astInfo.getTokenStream().getText(iNode.start, iNode.stop));
        }

    }
}
