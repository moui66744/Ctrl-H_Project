package Visitor;

import Info.ClassInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceDeclarationVisitor extends JavaBaseVisitor<List<ClassInfo>> {

    @Override
    protected List<ClassInfo> aggregateResult(List<ClassInfo> aggregate, List<ClassInfo> nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        aggregate.addAll(nextResult);
        return aggregate;
    }

    @Override
    public List<ClassInfo> visitLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx) {
        if (ctx.interfaceDeclaration() == null) {
            return super.visitLocalTypeDeclaration(ctx);
        } else {
            return new ArrayList<>(Collections.singleton(new ClassInfo(ctx.interfaceDeclaration(), ctx.classOrInterfaceModifier())));
        }
    }

    @Override
    public List<ClassInfo> visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        if (ctx.interfaceDeclaration() != null )
            return new ArrayList<>(Collections.singleton(new ClassInfo(ctx.interfaceDeclaration(), ctx.classOrInterfaceModifier())));
        return super.visitTypeDeclaration(ctx);
    }
}
