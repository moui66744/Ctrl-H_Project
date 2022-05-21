package Info;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * 用于存储类及接口声明的信息，除基类中信息外暂未保存其他信息。
 */
public class ClassInfo extends DeclarationBaseInfo {
    public ClassInfo(TerminalNode name, JavaParser.ModifierContext modifier, ParserRuleContext context) {
        super(name, modifier, context);
    }

    /**
     * 用类或接口的名称进行过滤
     * @param classInfos: 待过滤的类或接口声明的列表
     * @param name: 作为过滤条件的名称
     * @return: 过滤后的类或接口声明的列表
     */
    public static List<ClassInfo> classInfoFilter(List<ClassInfo> classInfos, String name) {
        return declarationBaseInfoFilter(classInfos,name); //调用其父类的方法
    }
}
