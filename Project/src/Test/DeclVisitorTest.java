package Test;

import AstGenerator.AstInfo;

import java.io.IOException;

public class DeclVisitorTest {
    public static void main(String[] args) throws IOException {
        AstInfo astInfo = new AstInfo("test/DummyTest.java");
        ClassOrInterfaceDeclarationVisitor classOrInterfaceDeclarationVisitor = new ClassOrInterfaceDeclarationVisitor();
        var root = astInfo.getRoot();
        System.out.println(classOrInterfaceDeclarationVisitor.getClassOrInterfaceDeclaration(root));

    }
}
