package Visitor;

import AstGenerator.AstInfo;
import Info.VariableInfo;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class VariableDeclaratorVisitor {
    /**
     * 通过传入的变量声明内容所在的子树的根节点，提取信息并生成对应的信息类
     *
     * @param context: 待提取信息的变量声明内容所在子树的根节点
     * @return: 包含了提取后的信息的变量声明信息类
     */
    private static VariableInfo getVariableInfo(JavaParser.VariableDeclaratorContext context) {
        return new VariableInfo(context.variableDeclaratorId().identifier().IDENTIFIER(), // 变量名称所在的标识符终结节点
                null,// TODO: 2022/5/7 修饰符
                context, // 变量声明所在的子树的根节点
                getType(context)); // 变量类型所在结点
    }

    /**
     * 从所给的根节点开始查询，获取其子树中所具有的所有变量声明并提取其基本信息生成对应的信息类，总结成列表输出
     *
     * @param root: 待查询的子树的根节点
     * @return: 包含子树中所有变量声明机器信息的变量声明信息类列表
     */
    public static List<VariableInfo> getVariableDeclarator(ParserRuleContext root) {
        List<VariableInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.VariableDeclaratorContext) { // 如果当前节点是一个变量声明
            VariableInfo variableInfo = getVariableInfo((JavaParser.VariableDeclaratorContext) root); // 提取其信息并转化成一个信息类
            ret.add(variableInfo); // 加入到待输出列表中
        } else {
            if (root.children == null) return ret; // 如果有孩子节点
            for (var iChild : root.children) { // 对每个孩子节点
                if (iChild instanceof ParserRuleContext) // 如果孩子节点不为终结节点
                    ret.addAll(getVariableDeclarator((ParserRuleContext) iChild)); // 将孩子节点的搜索结果加入到其中
            }
        }
        return ret;
    }

    /**
     * 获取当前变量声明的类型
     *
     * @param varDecls: 变量声明节点
     * @return: 被声明的变量的类型
     */
    public static JavaParser.TypeTypeContext getType(JavaParser.VariableDeclaratorContext varDecls) {
        ParserRuleContext parent = (ParserRuleContext) varDecls.parent.parent; // 向上查询两次父节点
        if (parent instanceof JavaParser.LocalVariableDeclarationContext localVariableDeclarationContext) { // 根据语法树，此时如果是本地临时变量则其下已经可以查询到变量类型了
            return localVariableDeclarationContext.typeType();
        } else { // 否则说明其是类的成员变量，需要再找一次父节点才能获取其类型信息
            JavaParser.FieldDeclarationContext fieldDeclarationContext = (JavaParser.FieldDeclarationContext) parent;
            return fieldDeclarationContext.typeType();
        }
    }

    public static void main(String[] args) throws IOException {
        //        main method is just for testing
        AstInfo astInfo = new AstInfo("test/DummyTest.java");
        MethodDeclVisitor methodDeclVisitor = new MethodDeclVisitor();
        var root = astInfo.getRoot();
        List<VariableInfo> variableInfos = getVariableDeclarator(root);
        List<VariableInfo> variableInfos1 = VariableInfo.variableInfoFilter(variableInfos, "i");
        List<VariableInfo> variableInfos2 = VariableInfo.variableInfoTypeStringFilter(variableInfos, "int");
        for (var varDecls : variableInfos2) {
            System.out.println(varDecls.Name.getText());
        }

    }
}
