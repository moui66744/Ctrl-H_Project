package Visitor;

import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import JavaParser.JavaParser.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ImportVisitor extends JavaBaseVisitor<List<ImportDeclarationContext>> {
    @Override
    public List<ImportDeclarationContext> visitImportDeclaration(ImportDeclarationContext ctx) {
        return new ArrayList<>(List.of(ctx));
    }

    @Override
    protected List<ImportDeclarationContext> aggregateResult(List<ImportDeclarationContext> aggregate, List<ImportDeclarationContext> nextResult) {
        if (aggregate == null) return nextResult;   // 父结点结果为空, 则返回子结点的结果
        if (nextResult == null) return aggregate;   // 子结点结果为空, 则返回父结点的结果
        aggregate.addAll(nextResult);               // 否则, 返回父子结点结果的拼接
        return aggregate;
    }

    public List<ImportDeclarationContext> importVisitor(ParserRuleContext ctx) {
        return visit(ctx);
    }

    public List<ImportDeclarationContext> importfilter(List<ImportDeclarationContext> list, String cond) {
        if (list == null) return null;
        if (cond != null) {
            list = list.stream().filter(ctx -> cond.equals(ctx.qualifiedName().getText())).toList();
        }
        return list;
    }
}
