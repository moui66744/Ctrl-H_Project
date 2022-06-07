package Info;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;

public class MethodInfo extends DeclarationBaseInfo {
    /**
     * 用于进行声明类型信息的存储，作为基类
     *
     * @param name:             声明方法的名称
     * @param modifier:         声明方法的修饰符（暂未实现）
     * @param context:          声明方法的整个子树的根节点
     * @param type:             声明方法的类型
     *                          注：当方法为空类型、构造函数等情况时，其不具有Type，此处将表示为null
     *                          注：此处为false时，可能的含义包括：该方法是构造函数所以没有类型，或，该方法是其他类型的方法
     * @param formalParameters: 用于记录该方法参数，存储方式为该参数声明内容所在子树的根节点
     * @param typeParameters:   用于记录该方法的TypeParameters，如果没有，则表示为null
     * @param body:             用于记录该方法的函数体部分
     */
    public MethodInfo(TerminalNode name,
                      JavaParser.ModifierContext modifier,
                      ParserRuleContext context,
                      String type,
                      String formalParameters,
                      String typeParameters,
                      JavaParser.BlockContext body) {
        // TODO: 2022/5/21 并不是所有 methodBody 都是 block，但为了统一性先这样构造
        super(name.getText(), modifier, context);
        this.type = type;
        this.formalParameters = formalParameters;
        this.typeParameters = typeParameters;
        this.body = body;
    }

    public String type;
    public String formalParameters;
    public String typeParameters;
    public JavaParser.BlockContext body;

    public boolean typeMatch(String s) {
        return this.type.equals(s);
    }

    public boolean formalParametersMatch(String s) {
        return this.formalParameters.equals(s);
    }

    public boolean typeParametersMatch(String s) {
        return this.typeParameters.equals(s);
    }

    public JavaParser.MethodBodyContext getMethodBody() {
        return ((JavaParser.MemberDeclarationContext)(this.Context)).methodDeclaration().methodBody();
    }

    public static List<MethodInfo> methodInfoFilterByType(List<MethodInfo> t, String type) {
        if (t == null) return null;
        return t.stream().filter(item -> item.typeMatch(type)).collect(Collectors.toList());
    }

    public static List<MethodInfo> methodInfoFilterByFormalParameters(List<MethodInfo> t, String formalParameters) {
        if (t == null) return null;
        return t.stream().filter(item -> item.formalParametersMatch(formalParameters)).collect(Collectors.toList());
    }

    public static List<MethodInfo> methodInfoFilterByTypeParamters(List<MethodInfo> t, String typeParameters) {
        if (t == null) return null;
        return t.stream().filter(item -> item.typeParametersMatch(typeParameters)).collect(Collectors.toList());
    }

    public static List<MethodInfo> methodInfoFilterByName(List<MethodInfo> t, String name) {
        return declarationBaseInfoFilterByName(t, name);
    }

    public static List<MethodInfo> methodInfoFilterByModifier(List<MethodInfo> t, List<ModifierType> mod) {
        return declarationBaseInfoFilterByModifier(t, mod);
    }
}
