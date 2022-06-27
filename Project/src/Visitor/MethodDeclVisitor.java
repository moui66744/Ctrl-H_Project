package Visitor;

import AstGenerator.JavaAstInfo;
import Info.MethodInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MethodDeclVisitor extends JavaBaseVisitor<List<JavaParser.MemberDeclarationContext>> {
    /**
     * 通过所传入的方法声明内容所在子树的根节点，提取信息并生成对应的信息类
     *
     * @param member: 方法声明内容所在子树的根节点
     * @return 提取的信息形成的信息类
     */
    private static MethodInfo getMethodInfo(JavaParser.MemberDeclarationContext member) {
        try { // 当其为泛型方法时
            if (member.genericMethodDeclaration() != null && member.genericMethodDeclaration().methodDeclaration() !=  null) {
                return new MethodInfo(member.genericMethodDeclaration().methodDeclaration().identifier().IDENTIFIER(), // 方法名称标识符所在的终结节点
                        null,// TODO: 2022/5/7 修饰符
                        member, // 该子树的根节点
                        member.genericMethodDeclaration().methodDeclaration().typeTypeOrVoid().getText(), // 方法类型
                        member.genericMethodDeclaration().methodDeclaration().formalParameters().getText(), // 方法的参数
//                        member.genericMethodDeclaration().typeParameters().getText(), // 方法的typeParameters
                        null,
                        member.genericMethodDeclaration().methodDeclaration().methodBody().block()); // 方法的主体
            }
        } catch (Exception ignored) {
        }
        try { // 当其为成员方法声明时
            if (member.methodDeclaration() != null) {
                return new MethodInfo(member.methodDeclaration().identifier().IDENTIFIER(), // 方法名称标识符所在的终结节点
                        null,// TODO: 2022/5/7 修饰符
                        member, // 该子树的根节点
                        member.methodDeclaration().typeTypeOrVoid().getText(), // 方法类型
                        member.methodDeclaration().formalParameters().getText(), // 方法的参数
                        null, // 方法的typeParameters
                        member.methodDeclaration().methodBody().block()); // 方法的主体
            }
        } catch (Exception ignored) {
        }
        try { // 当方法为构造函数时
            if (member.constructorDeclaration() != null) {
                return new MethodInfo(member.constructorDeclaration().identifier().IDENTIFIER(), // 方法名称标识符所在的终结节点
                        null,// TODO: 2022/5/7 修饰符
                        member, // 该子树的根节点
                        null, // 方法类型
                        member.constructorDeclaration().formalParameters().getText(), // 方法的参数
                        null, // 方法的typeParameters
                        member.constructorDeclaration().constructorBody); // 方法的主体
            }
        } catch (Exception ignored) {
        }
        return null;
    }

    /**
     * 从所给的根节点开始查询，获取其子树中所具有的所有方法声明并提取其基本信息生成对应的信息类，总结成列表输出
     *
     * @param root: 待查询的子树的根节点，支持将任意节点作为子树根节点进行查询
     * @return 所有方法声明组成的信息类列表
     */
    public static List<MethodInfo> getMethodDeclaration(ParserRuleContext root) {
        List<MethodInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.MemberDeclarationContext member) { // 如果当前节点是一个成员声明
            MethodInfo methodInfo = getMethodInfo(member); // 进一步查看当前成员声明的信息是否符合方法声明
            if (methodInfo != null) { // 如果符合，则其不为空
                ret.add(methodInfo); // 将其加入到待返回列表中
            }
        }
        if (root.children == null) return ret; // 孩子节点不为空
        for (var iChild : root.children) { // 对每个孩子节点
            if (iChild instanceof ParserRuleContext) // 孩子节点是否不为终结节点
                ret.addAll(getMethodDeclaration((ParserRuleContext) iChild)); // 对孩子节点进行搜索
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
//        main method is just for testing
        JavaAstInfo javaAstInfo = new JavaAstInfo("test/DummyTest.java");
        MethodDeclVisitor methodDeclVisitor = new MethodDeclVisitor();
        var root = javaAstInfo.getRoot();
        List<MethodInfo> methodDecls = getMethodDeclaration(root);
//        JavaParser.BlockContext methodBody = getMethodBody(root);
//        System.out.println(methodBody.getText());
//        System.out.println(getFormalParameters(root).getText());
//        List<MethodInfo> methodInfos = MethodInfo.methodInfoFilter(methodDecls, "retinput", true);
//        List<MethodInfo> methodInfos1 = MethodInfo.methodInfoTypeStringFilter(methodDecls, "int", true);
        for (var iNode : methodDecls) {
            System.out.println(iNode.name);
            System.out.println(iNode.formalParameters);
//            System.out.println(astInfo.getTokenStream().getText(iNode.Context.start, iNode.Context.stop));
        }
    }
}
