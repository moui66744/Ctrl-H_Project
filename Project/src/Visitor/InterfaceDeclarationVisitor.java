package Visitor;

import AstGenerator.AstInfo;
import Info.InterfaceInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InterfaceDeclarationVisitor extends JavaBaseVisitor<List<JavaParser.InterfaceDeclarationContext>> {
    /**
     * 通过所传入的类或声明内容所在子树的根节点，提取信息并生成对应的信息类
     *
     * @param context: 待查询的类或接口子树的根节点
     * @return: 查询得到的该子树中的信息
     */
    public static InterfaceInfo getInterfaceInfo(JavaParser.InterfaceDeclarationContext context) {
        return new InterfaceInfo(context.identifier().IDENTIFIER(),
                null,// TODO: 2022/5/21
                context);
    }

    /**
     * 从所给的根节点开始查询，获取其子树中所具有的所有类或接口声明并提取其基本信息生成对应的信息类，总结成列表输出
     *
     * @param root: 所给的任意节点（待查询子树的根节点）
     * @return: 子树中所具有的所有类或接口声明列表
     */
    public static List<InterfaceInfo> getInterfaceDeclaration(ParserRuleContext root) {
        List<InterfaceInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.InterfaceDeclarationContext) { // 如果当前节点是一个类或接口声明
            // 将当前节点从ParserRuleContext转换成InterfaceDeclarationContext的类型
            InterfaceInfo interfaceInfo = getInterfaceInfo((JavaParser.InterfaceDeclarationContext) root);
            ret.add(interfaceInfo); // 作为返回列表中的一项
        }
        // 继续查询，且当前已找到节点的子树也包含在查询范围内
        if (root.children == null) return ret; // 没有孩子节点，返回
        for (var iChild : root.children
        ) {
            if (iChild instanceof ParserRuleContext) // 确认其孩子节点不是根节点
                ret.addAll(getInterfaceDeclaration((ParserRuleContext) iChild)); // 对孩子节点进行搜索
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        //        main method is just for testing
        AstInfo astInfo = new AstInfo("test/DummyTestInterface.java");
        var root = astInfo.getRoot();
        List<InterfaceInfo> interfaceInfos = getInterfaceDeclaration(root);
        List<InterfaceInfo> interfaceInfos1 = InterfaceInfo.interfaceInfoFilter(interfaceInfos, "DummyTestInterface", true);
        for (var iNode : interfaceInfos1) {
            System.out.println(astInfo.getTokenStream().getText(iNode.Context.start, iNode.Context.stop));
        }

    }
}
