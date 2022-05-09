package Info;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MethodInfo extends DeclarationBaseInfo {
    /**
     * 用于进行声明类型信息的存储，作为基类
     * @param name: 声明方法的名称
     * @param modifier: 声明方法的修饰符（暂未实现）
     * @param context: 声明方法的整个子树的根节点
     * @param type: 声明方法的类型
     * 注：当方法为空类型、构造函数等情况时，其不具有Type，此处将表示为null
     * @param voidBoolean: 由于void方法的void并不是一种类型，因此这里记录该方法是否为void类型方法
     * 注：此处为false时，可能的含义包括：该方法是构造函数所以没有类型，或，该方法是其他类型的方法
     * @param formalParamater: 用于记录该方法参数，存储方式为该参数声明内容所在子树的根节点
     * @param typeParameters: 用于记录该方法的TypeParameters，如果没有，则表示为null
     * @param body: 用于记录该方法的函数体部分
     */
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

    public JavaParser.TypeContext Type;
    public boolean VoidBoolean;
    public JavaParser.FormalParameterDeclsContext FormalParameter;
    public JavaParser.TypeParametersContext TypeParameters;
    public JavaParser.BlockContext Body;

    /**
     * 用方法名对方法进行过滤
     * @param methodInfos: 待过滤的方法列表
     * @param name: 使用方法名来过滤
     * @return: 过滤后的所有方法列表
     */
    public static List<MethodInfo> methodInfoFilter(List<MethodInfo> methodInfos, String name) {
        return declarationBaseInfoFilter(methodInfos, name); // 调用父类中的过滤方法
    }

    /**
     * 用方法类型对方法进行过滤
     * @param methodInfos: 待过滤的方法列表
     * @param type: 使用方法类型进行过滤
     * @return: 过滤后的所有方法列表
     */
    public static List<MethodInfo> methodInfoFilter(List<MethodInfo> methodInfos, JavaParser.TypeContext type) {
        // TODO: 2022/5/9 由于输入是一个子树，实际上似乎并不能直接使用equals进行匹配，需要进一步了解ANTLR的匹配机制
        List<MethodInfo> ret = new ArrayList<>();
        try { // 因为可能存在Type为空的方法，其不能进行equals操作，所以使用try-catch
            for (var methodInfo : methodInfos) {
                if (Objects.equals(methodInfo.Type, type)) { // 方法的类型和所给类型一致
                    ret.add(methodInfo); // 通过过滤，作为返回列表中的一项
                }
            }
        } catch (Exception ignored) {
        }
        return ret;
    }

    /**
     * 用该方法是否为void类型来对方法进行过滤
     * @param methodInfos: 待过滤的方法列表
     * @param voidBoolean: 根据当前方法是否是void来进行过滤
     * @return: 过滤后的所有方法列表
     */
    public static List<MethodInfo> methodInfoFilter(List<MethodInfo> methodInfos, boolean voidBoolean) {
        List<MethodInfo> ret = new ArrayList<>();
        for (var methodInfo : methodInfos) { // 对输入列表中的每一个进行判断
            if (Objects.equals(methodInfo.VoidBoolean, voidBoolean)) { // 如果函数为void的判断结果与所需的一致
                ret.add(methodInfo); // 通过过滤，作为返回列表中的一项
            }
        }
        return ret;
    }

    /**
     * 输入类型名称字符串，以此来进行方法的过滤
     * @param methodInfos: 待过滤的方法列表
     * @param type: 方法类型字符串
     *            注：1、不能包含空格
     *            2、支持void类型，参数type取"void"即可
     *            3、数组目前也会匹配到，因为int a[]中的type项仍是int
     * @return: 过滤后的所有方法列表
     */
    public static List<MethodInfo> methodInfoTypeStringFilter(List<MethodInfo> methodInfos, String type) {
        if (Objects.equals(type, "void")) { // 如果所给的类型是void
            return methodInfoFilter(methodInfos, true); // 使用VoidBoolean为真的条件即可过滤得到结果
        }
        List<MethodInfo> ret = new ArrayList<>();
        for (var methodInfo : methodInfos) { // 对输入列表中的每一个进行判断
            try { // 因为可能存在Type为空的方法，其不能进行equals操作，所以使用try-catch
                if (Objects.equals(methodInfo.Type.getText(), type)) { // 该方法的返回类型在字符串上与所需类型一致
                    ret.add(methodInfo); // 通过过滤，作为返回列表中的一项
                }
            } catch (Exception ignored) {
            }
        }
        return ret;
    }
}
