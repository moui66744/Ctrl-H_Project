package Info;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;

public class VariableInfo extends DeclarationBaseInfo {
    public String type;
    public String variableInitializer;

    /**
     * 用于存储变量的声明信息
     *
     * @param name:     变量名
     * @param modifier: 修饰符
     * @param context:  所在子树的根节点
     * @param type:     变量类型
     */
    public VariableInfo(TerminalNode name, JavaParser.ModifierContext modifier, ParserRuleContext context, String type, String variableInitializer) {
        super(name.getText(), modifier, context);
        this.type = type;
        this.variableInitializer = variableInitializer;
    }

    public boolean typeMatch(String s) {
        return this.type.equals(s);
    }

    public static List<VariableInfo> variableInfoFilterByType(List<VariableInfo> t, String type) {
        return t.stream().filter(item -> item.typeMatch(type)).collect(Collectors.toList());
    }

}
