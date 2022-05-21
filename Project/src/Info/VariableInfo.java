package Info;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Objects;

public class VariableInfo extends DeclarationBaseInfo {
    /**
     * 用于存储变量的声明信息
     * @param name: 变量名
     * @param modifier: 修饰符
     * @param context: 所在子树的根节点
     * @param type: 变量类型
     */
    public VariableInfo(TerminalNode name, JavaParser.ModifierContext modifier, ParserRuleContext context, JavaParser.TypeTypeContext type) {
        super(name, modifier, context);
        Type = type;
    }

    public JavaParser.TypeTypeContext Type;

    /**
     * 根据变量名对输入的变量信息类列表进行过滤
     * @param variableInfos: 待过滤的变量声明信息类列表
     * @param name: 用于过滤的变量名条件
     * @return: 过滤后的变量声明信息类列表
     */
    public static List<VariableInfo> variableInfoFilter(List<VariableInfo> variableInfos, String name) {
        return declarationBaseInfoFilter(variableInfos, name); // 直接调用父类方法
    }

    /**
     * 根据变量类型对输入的变量信息列表进行过滤
     * @param variableInfos: 待过滤的变量声明信息类列表
     * @param type: 用于过滤的变量类型条件
     * @return: 过滤后的变量声明信息类列表
     */
    public static List<VariableInfo> variableInfoFilter(List<VariableInfo> variableInfos, JavaParser.TypeTypeContext type) {
        List<VariableInfo> ret = new ArrayList<>();
        for (var variableInfo : variableInfos) { // 对列表中的每个变量声明信息类实例
            if (Objects.equals(variableInfo.Type, type)) { // TODO: 2022/5/9 如果其与所需的类型符合
                ret.add(variableInfo); // 通过过滤，将其作为待返回列表的一部分
            }
        }
        return ret;
    }

    /**
     * 根据变量类型的字符串对输入的变量信息列表进行过滤
     * @param variableInfos: 待过滤的变量声明信息类列表
     * @param type: 用于过滤的变量类型条件（字符串类型）
     * @return: 过滤后的变量声明信息类列表
     */
    public static List<VariableInfo> variableInfoTypeStringFilter(List<VariableInfo> variableInfos, String type) {
        List<VariableInfo> ret = new ArrayList<>();
        for (var variableInfo : variableInfos) { // 对列表中的每个变量声明信息类实例
            if (Objects.equals(variableInfo.Type.getText(), type)) { // 其类型的字符串形式是否与过滤条件符合
                ret.add(variableInfo); // 通过过滤，将其作为待返回列表的一部分
            }
        }
        return ret;
    }
}
