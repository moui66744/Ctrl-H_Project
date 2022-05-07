package Test;

import JavaParser.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClassOrInterfaceInfo extends DeclarationBaseInfo {
    public ClassOrInterfaceInfo(TerminalNode name, JavaParser.ModifierContext modifier, ParserRuleContext context) {
        super(name, modifier, context);
    }

    public static List<ClassOrInterfaceInfo> classOrInterfaceInfoFilter(List<ClassOrInterfaceInfo> classOrInterfaceInfos, String name) {
        return declarationBaseInfoFilter(classOrInterfaceInfos,name);
    }
}
