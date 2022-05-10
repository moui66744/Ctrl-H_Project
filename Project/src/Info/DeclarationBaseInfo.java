package Info;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Objects;

public class DeclarationBaseInfo {
    /**
     * 用于进行声明类型信息的存储，作为基类
     * @param name: 声明对象的名称
     * @param modifier: 声明对象的修饰符（暂未实现）
     * @param context: 声明对象的整个子树的根节点
     */
    public DeclarationBaseInfo(TerminalNode name, JavaParser.ModifierContext modifier, ParserRuleContext context) {
        Name = name;
        Modifier = modifier;
        Context = context;
    }

    public TerminalNode Name;
    public JavaParser.ModifierContext Modifier;
    public ParserRuleContext Context;

    /**
     * 根据其名称进行过滤
     * @param declarationBaseInfos: 待过滤的列表
     * @param name: 作为过滤条件的名称
     * @return: 过滤后的列表
     * @param <T>: 某种作为信息基类的子类型
     */
    public static <T extends DeclarationBaseInfo> List<T> declarationBaseInfoFilter(List<T> declarationBaseInfos, String name) {
        List<T> ret = new ArrayList<>();
        if (declarationBaseInfos == null) return ret;
        for (var declarationBaseInfo : declarationBaseInfos) { // 对输入类型的每一项
            if (Objects.equals(declarationBaseInfo.Name.getText(), name)) { // 当其名称与过滤条件中的名称相符合
                ret.add(declarationBaseInfo); // 符合过滤条件，加入待返回列表
            }
        }
        return ret;
    }
}
