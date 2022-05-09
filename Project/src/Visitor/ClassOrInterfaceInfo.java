package Visitor;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * 用于存储类及接口声明的信息，除基类中信息外暂未保存其他信息。
 */
public class ClassOrInterfaceInfo extends DeclarationBaseInfo {
    public ClassOrInterfaceInfo(TerminalNode name, JavaParser.ModifierContext modifier, ParserRuleContext context) {
        super(name, modifier, context);
    }

    /**
     * 用类或接口的名称进行过滤
     * @param classOrInterfaceInfos: 待过滤的类或接口声明的列表
     * @param name: 作为过滤条件的名称
     * @return: 过滤后的类或接口声明的列表
     */
    public static List<ClassOrInterfaceInfo> classOrInterfaceInfoFilter(List<ClassOrInterfaceInfo> classOrInterfaceInfos, String name) {
        return declarationBaseInfoFilter(classOrInterfaceInfos,name); //调用其父类的方法
    }
}
