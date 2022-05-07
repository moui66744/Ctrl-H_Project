package Test;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DeclarationBaseInfo {
    public DeclarationBaseInfo(TerminalNode name, JavaParser.ModifierContext modifier, ParserRuleContext context) {
        Name = name;
        Modifier = modifier;
        Context = context;
    }

    TerminalNode Name;
    JavaParser.ModifierContext Modifier;
    ParserRuleContext Context;

    public static <T extends DeclarationBaseInfo> List<T> declarationBaseInfoFilter(List<T> declarationBaseInfos, String name) {
        List<T> ret = new ArrayList<>();
        if (declarationBaseInfos == null) return ret;
        for (var declarationBaseInfo : declarationBaseInfos) {
            if (Objects.equals(declarationBaseInfo.Name.getText(), name)) {
                ret.add(declarationBaseInfo);
            }
        }
        return ret;
    }
}
