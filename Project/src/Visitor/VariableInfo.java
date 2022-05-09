package Visitor;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VariableInfo extends DeclarationBaseInfo {
    public VariableInfo(TerminalNode name, JavaParser.ModifierContext modifier, ParserRuleContext context, JavaParser.TypeContext type) {
        super(name, modifier, context);
        Type = type;
    }

    JavaParser.TypeContext Type;

    public static List<VariableInfo> variableInfoFilter(List<VariableInfo> variableInfos, String name) {
        return declarationBaseInfoFilter(variableInfos, name);
    }

    public static List<VariableInfo> variableInfoFilter(List<VariableInfo> variableInfos, JavaParser.TypeContext type) {
        List<VariableInfo> ret = new ArrayList<>();
        for (var variableInfo : variableInfos) {
            if (Objects.equals(variableInfo.Type, type)) {
                ret.add(variableInfo);
            }
        }
        return ret;
    }
}
