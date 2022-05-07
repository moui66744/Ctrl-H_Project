package Test;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MethodInfo extends DeclarationBaseInfo {
    public MethodInfo(TerminalNode name,
                      JavaParser.ModifierContext modifier,
                      ParserRuleContext context,
                      JavaParser.TypeContext type,
                      Boolean voidBoolean,
                      JavaParser.FormalParameterDeclsContext formalParamater,
                      JavaParser.TypeParametersContext typeParameters,
                      JavaParser.BlockContext body) {
        super(name, modifier, context);
        Type = type;
        VoidBoolean = voidBoolean;
        FormalParameter = formalParamater;
        TypeParameters = typeParameters;
        Name = name;
        Body = body;
    }

    JavaParser.TypeContext Type;
    boolean VoidBoolean;
    JavaParser.FormalParameterDeclsContext FormalParameter;
    JavaParser.TypeParametersContext TypeParameters;
    JavaParser.BlockContext Body;

    public static List<MethodInfo> methodInfoFilter(List<MethodInfo> methodInfos, String name) {
        return declarationBaseInfoFilter(methodInfos, name);
    }

    public static List<MethodInfo> methodInfoFilter(List<MethodInfo> methodInfos, JavaParser.TypeContext type) {
        List<MethodInfo> ret = new ArrayList<>();
        for (var methodInfo : methodInfos) {
            if (Objects.equals(methodInfo.Type, type)) {
                ret.add(methodInfo);
            }
        }
        return ret;
    }

    public static List<MethodInfo> methodInfoFilter(List<MethodInfo> methodInfos, boolean voidBoolean) {
        List<MethodInfo> ret = new ArrayList<>();
        for (var methodInfo : methodInfos) {
            if (Objects.equals(methodInfo.VoidBoolean, voidBoolean)) {
                ret.add(methodInfo);
            }
        }
        return ret;
    }
}
