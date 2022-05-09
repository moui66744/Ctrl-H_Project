package Visitor;

import AstGenerator.AstInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MethodDeclVisitor extends JavaBaseVisitor<List<JavaParser.MemberDeclContext>> {
    /**
     * 通过所传入的方法声明内容所在子树的根节点，提取信息并生成对应的信息类
     * @param member: 方法声明内容所在子树的根节点
     * @return: 提取的信息形成的信息类
     */
    private static MethodInfo getMethodInfo(JavaParser.MemberDeclContext member) {
        try { // 当其为泛型方法时
            if (member.genericMethodOrConstructorDecl() != null) {
                return new MethodInfo(member.genericMethodOrConstructorDecl().genericMethodOrConstructorRest().Identifier(), // 方法名称标识符所在的终结节点
                        null,// TODO: 2022/5/7 修饰符
                        member, // 该子树的根节点
                        member.genericMethodOrConstructorDecl().genericMethodOrConstructorRest().type(), // 方法类型
                        member.genericMethodOrConstructorDecl().genericMethodOrConstructorRest().VOID() != null, // 方法是否为void
                        getFormalParameters(member), // 方法的参数
                        member.genericMethodOrConstructorDecl().typeParameters(), // 方法的typeParameters
                        getMethodBody(member)); // 方法的主体
            }
        } catch (Exception ignored) {
        }
        try { // 当其为成员方法声明时
            if (member.memberDeclaration().methodDeclaration() != null) {
                return new MethodInfo(member.memberDeclaration().methodDeclaration().Identifier(), // 方法名称标识符所在的终结节点
                        null,// TODO: 2022/5/7 修饰符
                        member, // 该子树的根节点
                        member.memberDeclaration().type(), // 方法类型
                        false, // 方法不为void
                        getFormalParameters(member), // 方法的参数
                        null, // 方法的typeParameters
                        getMethodBody(member)); // 方法的主体
            }
        } catch (Exception ignored) {
        }
        try { // 当方法为void类型方法时
            if (member.voidMethodDeclaratorRest() != null) {
                return new MethodInfo(member.Identifier(), // 方法名称标识符所在的终结节点
                        null,// TODO: 2022/5/7 修饰符
                        member, // 该子树的根节点
                        null, // 方法类型
                        true, // 方法为void
                        getFormalParameters(member), // 方法的参数
                        null, // 方法的typeParameters
                        getMethodBody(member)); // 方法的主体
            }
        } catch (Exception ignored) {
        }
        try { // 当方法为构造函数时
            if (member.constructorDeclaratorRest() != null) {
                return new MethodInfo(member.Identifier(), // 方法名称标识符所在的终结节点
                        null,// TODO: 2022/5/7 修饰符
                        member, // 该子树的根节点
                        null, // 方法类型
                        false, // 方法不为void
                        getFormalParameters(member), // 方法的参数
                        null, // 方法的typeParameters
                        getMethodBody(member)); // 方法的主体
            }
        } catch (Exception ignored) {
        }
        return null;
    }

    /**
     * 从所给的根节点开始查询，获取其子树中所具有的所有方法声明并提取其基本信息生成对应的信息类，总结成列表输出
     * @param root: 待查询的子树的根节点，支持将任意节点作为子树根节点进行查询
     * @return: 所有方法声明组成的信息类列表
     */
    public static List<MethodInfo> getMethodDeclaration(ParserRuleContext root) {
        List<MethodInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.MemberDeclContext member) { // 如果当前节点是一个成员声明
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

    /**
     * 通过所传入的方法声明内容所在子树的根节点，提取其函数参数，并返回参数所在子树的根节点
     * @param method: 方法所在子树的根节点
     * @return: 获取到的其参数子树的根节点
     */
    public static JavaParser.FormalParameterDeclsContext getFormalParameters(ParserRuleContext method) {
//        因为可能会出现多组参数，实际上只有第一组是当前函数的
//        虽然递归过程中method参数并不总代表方法，但正式使用时，用户可以将其作为提示
        if (method == null) return null;
        if (method instanceof JavaParser.FormalParameterDeclsContext) { // 如果当前节点是参数声明，则返回
            return (JavaParser.FormalParameterDeclsContext) method;
        }
        JavaParser.FormalParameterDeclsContext ret = null;
        if (method.children == null) return ret; // 没有孩子节点，则不可能出现参数声明
        for (var iChild : method.children) {
            if (iChild instanceof ParserRuleContext) { // 孩子节点是否不为终结节点
                ret = getFormalParameters((ParserRuleContext) iChild); // 查询每个孩子节点中是否有参数声明
                if (ret != null) return ret;
            }
        }
        return ret;
    }

    /**
     * 通过所传入的方法声明内容所在子树的根节点，提取其函数体，并返回函数体所在子树的根节点
     * @param method: 待查找的方法这一子树的根节点
     * @return: 获取到的其函数体所在子树的根节点
     */
    public static JavaParser.BlockContext getMethodBody(ParserRuleContext method) {
//        实际上是寻找第一个block
        if (method == null) return null;
        if (method instanceof JavaParser.BlockContext) { // 如果当前节点是语句块声明，则返回
            return (JavaParser.BlockContext) method;
        }
        JavaParser.BlockContext ret = null;
        if (method.children == null) return ret; // 没有孩子节点，则不可能出现语句块声明
        for (var iChild : method.children) {
            if (iChild instanceof ParserRuleContext) { // 孩子节点不为终结节点
                ret = getMethodBody((ParserRuleContext) iChild); // 查询每个孩子节点中是否有语句块声明
                if (ret != null) return ret;
            }
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
//        main method is just for testing
        AstInfo astInfo = new AstInfo("test/DummyTest.java");
        MethodDeclVisitor methodDeclVisitor = new MethodDeclVisitor();
        var root = astInfo.getRoot();
        List<MethodInfo> methodDecls = getMethodDeclaration(root);
//        JavaParser.BlockContext methodBody = getMethodBody(root);
//        System.out.println(methodBody.getText());
//        System.out.println(getFormalParameters(root).getText());
        for (var iNode : methodDecls) {
            System.out.println(iNode.Name.getText());
            System.out.println(iNode.FormalParameter.getText());
//            System.out.println(astInfo.getTokenStream().getText(iNode.Context.start, iNode.Context.stop));
        }
    }
}
