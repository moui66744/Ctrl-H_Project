package Visitor;

import AstGenerator.AstInfo;
import Info.ClassOrInterfaceInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class ClassOrInterfaceDeclarationVisitor extends JavaBaseVisitor<List<JavaParser.ClassOrInterfaceDeclarationContext>> {
    /**
     * 通过所传入的类或声明内容所在子树的根节点，提取信息并生成对应的信息类
     *
     * @param context: 待查询的类或接口子树的根节点
     * @return: 查询得到的该子树中的信息
     */
    public static ClassOrInterfaceInfo getClassOrInterfaceInfo(JavaParser.ClassOrInterfaceDeclarationContext context) {
        try {
            return new ClassOrInterfaceInfo(context.classDeclaration().normalClassDeclaration().Identifier(),
                    null,// TODO: 2022/5/7
                    context);
        } catch (Exception ignored) {
        }
        try {
            return new ClassOrInterfaceInfo(context.interfaceDeclaration().normalInterfaceDeclaration().Identifier(),
                    null,// TODO: 2022/5/7
                    context);
        } catch (Exception ignored) {
        }
        try {
            return new ClassOrInterfaceInfo(context.interfaceDeclaration().annotationTypeDeclaration().Identifier(),
                    null,// TODO: 2022/5/11
                    context);
        } catch (Exception ignored) {
        }
        return null;
    }

    /**
     * 从所给的根节点开始查询，获取其子树中所具有的所有类或接口声明并提取其基本信息生成对应的信息类，总结成列表输出
     *
     * @param root: 所给的任意节点（待查询子树的根节点）
     * @return: 子树中所具有的所有类或接口声明列表
     */
    public static List<ClassOrInterfaceInfo> getClassOrInterfaceDeclaration(ParserRuleContext root) {
        List<ClassOrInterfaceInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.ClassOrInterfaceDeclarationContext) { // 如果当前节点是一个类或接口声明
            // 将当前节点从ParserRuleContext转换成ClassOrInterfaceDeclarationContext的类型
            ClassOrInterfaceInfo classOrInterfaceInfo = getClassOrInterfaceInfo((JavaParser.ClassOrInterfaceDeclarationContext) root);
            if (classOrInterfaceInfo != null) ret.add(classOrInterfaceInfo); // 作为返回列表中的一项
        }
        // 继续查询，且当前已找到节点的子树也包含在查询范围内
        if (root.children == null) return ret; // 没有孩子节点，返回
        for (var iChild : root.children
        ) {
            if (iChild instanceof ParserRuleContext) // 确认其孩子节点不是根节点
                ret.addAll(getClassOrInterfaceDeclaration((ParserRuleContext) iChild)); // 对孩子节点进行搜索
        }

        return ret;
    }

    /**
     * 通过所传入的类或声明内容所在子树的根节点，提取名称信息并返回对应的终结节点
     *
     * @param classOrInterfaceDeclarationContext: 待查询的类或声明内容所在子树的根节点
     * @return: 其名称所在的终结节点
     */
    public static TerminalNode getName(JavaParser.ClassOrInterfaceDeclarationContext classOrInterfaceDeclarationContext) {
        TerminalNode name = null;
        // 当其为类时，接口相关的函数无法被唤起，因此使用try-catch，反之亦然
        try {
//            class
            name = classOrInterfaceDeclarationContext.classDeclaration().normalClassDeclaration().Identifier(); // 获取其名称所在的标识符节点
        } catch (Exception ignored) {
        }
        try {
//            interface
            name = classOrInterfaceDeclarationContext.interfaceDeclaration().normalInterfaceDeclaration().Identifier(); // 获取其名称所在的标识符节点
        } catch (Exception ignored) {
        }
        return name;
    }

    //
    public static void main(String[] args) throws IOException {
        //        main method is just for testing
        AstInfo astInfo = new AstInfo("test/DummyTest.java");
        var root = astInfo.getRoot();
        List<ClassOrInterfaceInfo> classOrInterfaceInfos = getClassOrInterfaceDeclaration(root);
        for (var iNode : classOrInterfaceInfos) {
            System.out.println(astInfo.getTokenStream().getText(iNode.Context.start, iNode.Context.stop));
        }

    }
}
