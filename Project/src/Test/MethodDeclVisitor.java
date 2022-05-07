package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MethodDeclVisitor extends JavaBaseVisitor<List<JavaParser.MemberDeclContext>> {

    private static MethodInfo getMethodInfo(JavaParser.MemberDeclContext member) {
        boolean flag = false;
        try {
            if (member.genericMethodOrConstructorDecl() != null) {
                return new MethodInfo(member.genericMethodOrConstructorDecl().genericMethodOrConstructorRest().Identifier(),
                        null,// TODO: 2022/5/7
                        member,
                        member.genericMethodOrConstructorDecl().genericMethodOrConstructorRest().type(),
                        member.genericMethodOrConstructorDecl().genericMethodOrConstructorRest().VOID() != null,
                        getFormalParameters(member),
                        member.genericMethodOrConstructorDecl().typeParameters(),
                        getMethodBody(member));
            }
        } catch (Exception ignored) {
        }
        try {
            if (member.memberDeclaration().methodDeclaration() != null) {
                return new MethodInfo(member.memberDeclaration().methodDeclaration().Identifier(),
                        null,// TODO: 2022/5/7
                        member,
                        member.memberDeclaration().type(),
                        false,
                        getFormalParameters(member),
                        null,
                        getMethodBody(member));
            }
        } catch (Exception ignored) {
        }
        try {
            if (member.voidMethodDeclaratorRest() != null) {
                return new MethodInfo(member.Identifier(),
                        null,// TODO: 2022/5/7
                        member,
                        null,
                        true,
                        getFormalParameters(member),
                        null,
                        getMethodBody(member));
            }
        } catch (Exception ignored) {
        }
        try {
            if (member.constructorDeclaratorRest() != null) {
                return new MethodInfo(member.Identifier(),
                        null,// TODO: 2022/5/7
                        member,
                        null,
                        false,
                        getFormalParameters(member),
                        null,
                        getMethodBody(member));
            }
        } catch (Exception ignored) {
        }
        return null;
    }

    public static List<MethodInfo> getMethodDeclaration(ParserRuleContext root) {
        List<MethodInfo> ret = new ArrayList<>();
        if (root == null) return ret;
        if (root instanceof JavaParser.MemberDeclContext member) {
            MethodInfo methodInfo = getMethodInfo(member);
            if (methodInfo != null) {
                ret.add(methodInfo);
            }
        }
        if (root.children == null) return ret;
        for (var iChild : root.children) {
            if (iChild instanceof ParserRuleContext)
                ret.addAll(getMethodDeclaration((ParserRuleContext) iChild));
        }
        return ret;
    }

    public static List<MethodInfo> getMethodDeclaration(ParserRuleContext root, String name) {
        if (root == null) return new ArrayList<>();
        List<MethodInfo> methodInfos = getMethodDeclaration(root);
        return MethodInfo.methodInfoFilter(methodInfos, name);
    }

    public static List<MethodInfo> getMethodDeclaration(ParserRuleContext root, JavaParser.TypeContext type) {
        if (root == null) return new ArrayList<>();
        List<MethodInfo> methodInfos = getMethodDeclaration(root);
        return MethodInfo.methodInfoFilter(methodInfos, type);
    }

    public static List<MethodInfo> getMethodDeclaration(ParserRuleContext root, boolean voidBoolean) {
        if (root == null) return new ArrayList<>();
        List<MethodInfo> methodInfos = getMethodDeclaration(root);
        return MethodInfo.methodInfoFilter(methodInfos, voidBoolean);
    }

    public static JavaParser.FormalParameterDeclsContext getFormalParameters(ParserRuleContext method) {
//        因为可能会出现多组参数，实际上只有第一组是当前函数的
//        虽然递归过程中method参数并不总代表方法，但正式使用时，用户可以将其作为提示
        if (method == null) return null;
        if (method instanceof JavaParser.FormalParameterDeclsContext) {
            return (JavaParser.FormalParameterDeclsContext) method;
        }
        JavaParser.FormalParameterDeclsContext ret = null;
        if (method.children == null) return ret;
        for (var iChild : method.children) {
            if (iChild instanceof ParserRuleContext) {
                ret = getFormalParameters((ParserRuleContext) iChild);
                if (ret != null) return ret;
            }
        }
        return ret;
    }

    public static JavaParser.BlockContext getMethodBody(ParserRuleContext method) {
//        实际上是寻找第一个block
        if (method == null) return null;
        if (method instanceof JavaParser.BlockContext) {
            return (JavaParser.BlockContext) method;
        }
        JavaParser.BlockContext ret = null;
        if (method.children == null) return ret;
        for (var iChild : method.children) {
            if (iChild instanceof ParserRuleContext) {
                ret = getMethodBody((ParserRuleContext) iChild);
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
        List<MethodInfo> methodDecls = getMethodDeclaration(root, "main");
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
