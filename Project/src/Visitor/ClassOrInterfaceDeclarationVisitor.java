package Visitor;

import AstGenerator.AstInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassOrInterfaceDeclarationVisitor extends JavaBaseVisitor<List<JavaParser.ClassOrInterfaceDeclarationContext>> {

    public static ClassOrInterfaceInfo getClassOrInterfaceInfo(JavaParser.ClassOrInterfaceDeclarationContext context) {
        return new ClassOrInterfaceInfo(context.classDeclaration().normalClassDeclaration().Identifier(),
                null,// TODO: 2022/5/7
                context);
    }

    public static List<ClassOrInterfaceInfo> getClassOrInterfaceDeclaration(ParserRuleContext root) {
        List<ClassOrInterfaceInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.ClassOrInterfaceDeclarationContext) {
            ClassOrInterfaceInfo classOrInterfaceInfo = getClassOrInterfaceInfo((JavaParser.ClassOrInterfaceDeclarationContext) root);
            ret.add(classOrInterfaceInfo);
        }
        if (root.children == null) return ret;
        for (var iChild : root.children
        ) {
            if (iChild instanceof ParserRuleContext)
                ret.addAll(getClassOrInterfaceDeclaration((ParserRuleContext) iChild));
        }

        return ret;
    }

    public static List<ClassOrInterfaceInfo> getClassOrInterfaceDeclaration(ParserRuleContext root, String name) {
        if (root == null) return new ArrayList<>();
        List<ClassOrInterfaceInfo> classOrInterfaceInfos = getClassOrInterfaceDeclaration(root);
        return ClassOrInterfaceInfo.classOrInterfaceInfoFilter(classOrInterfaceInfos, name);
    }

    public static TerminalNode getName(JavaParser.ClassOrInterfaceDeclarationContext classOrInterfaceDeclarationContext) {
        TerminalNode name = null;
        try {
//            class
            name = classOrInterfaceDeclarationContext.classDeclaration().normalClassDeclaration().Identifier();
        } catch (Exception ignored) {
        }
        try {
//            interface
            name = classOrInterfaceDeclarationContext.interfaceDeclaration().normalInterfaceDeclaration().Identifier();
        } catch (Exception ignored) {
        }
        return name;
    }

    public static void main(String[] args) throws IOException {
        //        main method is just for testing
        AstInfo astInfo = new AstInfo("test/DummyTest.java");
        ClassOrInterfaceDeclarationVisitor classOrInterfaceDeclarationVisitor = new ClassOrInterfaceDeclarationVisitor();
        var root = astInfo.getRoot();
        List<ClassOrInterfaceInfo> classOrInterfaceInfos = classOrInterfaceDeclarationVisitor.getClassOrInterfaceDeclaration(root, "DummyTest");
        for (var iNode : classOrInterfaceInfos) {
            System.out.println(astInfo.getTokenStream().getText(iNode.Context.start, iNode.Context.stop));
        }

    }
}
