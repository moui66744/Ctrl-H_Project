package Visitor;

import AstGenerator.AstInfo;
import Info.ClassInfo;
import Info.DeclarationBaseInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClassDeclarationVisitor extends JavaBaseVisitor<List<ClassInfo>> {
    @Override
    protected List<ClassInfo> aggregateResult(List<ClassInfo> aggregate, List<ClassInfo> nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        aggregate.addAll(nextResult);
        return aggregate;
    }

    @Override
    public List<ClassInfo> visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        if (ctx.classDeclaration() == null){
            return super.visitTypeDeclaration(ctx);
        }

        return new ArrayList<>(Collections.singleton(new ClassInfo(ctx.classDeclaration(),
                ctx.classOrInterfaceModifier())));
    }

    @Override
    public List<ClassInfo> visitLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx) {
        if (ctx.classDeclaration() == null){
            return super.visitLocalTypeDeclaration(ctx);
        }

        return new ArrayList<>(Collections.singleton(new ClassInfo(ctx.classDeclaration(),
                ctx.classOrInterfaceModifier())));
    }

    /**
     * 通过所传入的类或声明内容所在子树的根节点，提取信息并生成对应的信息类
     *
     * @param context: 待查询的类或接口子树的根节点
     * @return 查询得到的该子树中的信息
     */

    public static ClassInfo getClassInfo(JavaParser.ClassDeclarationContext context) {
        return new ClassInfo(context.identifier().IDENTIFIER(),
                null,// TODO: 2022/5/21
                context);
    }

    /**
     * 从所给的根节点开始查询，获取其子树中所具有的所有类或接口声明并提取其基本信息生成对应的信息类，总结成列表输出
     *
     * @param root: 所给的任意节点（待查询子树的根节点）
     * @return 子树中所具有的所有类或接口声明列表
     */
    public static List<ClassInfo> getClassDeclaration(ParserRuleContext root) {
        List<ClassInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.ClassDeclarationContext) { // 如果当前节点是一个类或接口声明
            // 将当前节点从ParserRuleContext转换成ClassOrInterfaceDeclarationContext的类型
            ClassInfo classInfo = getClassInfo((JavaParser.ClassDeclarationContext) root);
            ret.add(classInfo); // 作为返回列表中的一项
        }
        // 继续查询，且当前已找到节点的子树也包含在查询范围内
        if (root.children == null) return ret; // 没有孩子节点，返回
        for (var iChild : root.children
        ) {
            if (iChild instanceof ParserRuleContext) // 确认其孩子节点不是根节点
                ret.addAll(getClassDeclaration((ParserRuleContext) iChild)); // 对孩子节点进行搜索
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        //        main method is just for testing
        AstInfo astInfo = new AstInfo("test/DummyTestBackup.java");
        var root = astInfo.getRoot();
        ClassDeclarationVisitor vis = new ClassDeclarationVisitor();
        List<ClassInfo> classInfos = vis.visitCompilationUnit(root);
//        List<ClassInfo> classInfos1 = ClassInfo.classInfoFilter(classInfos, "DummyTest", true);
//        classInfos = ClassInfo.classInfoFilterByModifier(classInfos, List.of(DeclarationBaseInfo.ModifierType.PRIVATE));
        for (var iNode : classInfos) {
            System.out.println(astInfo.getTokenStream().getText(iNode.Context.start, iNode.Context.stop));
        }

    }
}
