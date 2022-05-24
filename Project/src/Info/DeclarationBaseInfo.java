package Info;

import JavaParser.JavaParser;
import JavaParser.JavaLexer;
import JavaQueryParser.JavaQueryLexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;


import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class DeclarationBaseInfo {
    /**
     * 用于进行声明类型信息的存储，作为基类
     * field name: 声明对象的名称
     * field modifiers: 声明对象的修饰符（暂未实现）
     * field context: 声明对象的整个子树的根节点
     */

    public String name;

    public Set<ModifierType> modifiers;
    public ParserRuleContext Context;

    public enum ModifierType {
        PUBLIC,
        PRIVATE,
        PROTECTED,
        STATIC,
        ABSTRACT,
        FINAL,
        VOLATILE,
        NATIVE
    }

    public ModifierType javaTerminalNodeToModifierType(TerminalNode t) {
        return switch (t.getSymbol().getType()) {
            case JavaLexer.FINAL -> ModifierType.FINAL;
            case JavaLexer.VOLATILE -> ModifierType.VOLATILE;
            case JavaLexer.NATIVE -> ModifierType.NATIVE;
            case JavaLexer.ABSTRACT -> ModifierType.ABSTRACT;
            case JavaLexer.STATIC -> ModifierType.STATIC;
            case JavaLexer.PUBLIC -> ModifierType.PUBLIC;
            case JavaLexer.PRIVATE -> ModifierType.PRIVATE;
            case JavaLexer.PROTECTED -> ModifierType.PROTECTED;
            default -> throw new IllegalStateException("Unexpected value: " + t.getSymbol().getType());
        };
    }

    public ModifierType javaQueryTerminalNodeToModifierType(TerminalNode t) {
        return switch (t.getSymbol().getType()) {
            case JavaQueryLexer.FINAL -> ModifierType.FINAL;
            case JavaQueryLexer.VOLATILE -> ModifierType.VOLATILE;
            case JavaQueryLexer.NATIVE -> ModifierType.NATIVE;
            case JavaQueryLexer.ABSTRACT -> ModifierType.ABSTRACT;
            case JavaQueryLexer.STATIC -> ModifierType.STATIC;
            case JavaQueryLexer.PUBLIC -> ModifierType.PUBLIC;
            case JavaQueryLexer.PRIVATE -> ModifierType.PRIVATE;
            case JavaQueryLexer.PROTECTED -> ModifierType.PROTECTED;
            default -> throw new IllegalStateException("Unexpected value: " + t.getSymbol().getType());
        };
    }

    public DeclarationBaseInfo(String name, List<TerminalNode> nodes, ParserRuleContext ctx, boolean a) {
        this.name = name;
        this.modifiers = new HashSet<>(nodes.stream().map(this::javaTerminalNodeToModifierType).collect(Collectors.toUnmodifiableSet()));
        this.Context = ctx;
    }

    public DeclarationBaseInfo(String name, List<JavaParser.ModifierContext> modifiers, ParserRuleContext context) {
        this.name = name;
        this.modifiers = new HashSet<>();
        this.Context = context;
        if (modifiers == null) return;
        for (var item : modifiers) {
            if (item.classOrInterfaceModifier() == null) {
                this.modifiers.add(javaTerminalNodeToModifierType((TerminalNode) item.getChild(0)));
            } else {
                if (item.classOrInterfaceModifier().annotation() != null) continue;
                this.modifiers.add(javaTerminalNodeToModifierType((TerminalNode) item.classOrInterfaceModifier().getChild(0)));
            }
        }
    }

    public DeclarationBaseInfo(String name, JavaParser.ModifierContext modifiers, ParserRuleContext context) {
        this(name, modifiers != null ? new ArrayList<>(Collections.singleton(modifiers)) : null, context);
    }

    public boolean modifierMatch(List<ModifierType> s) {
        if (modifiers == null) return s == null || s.size() == 0;
        return modifiers.containsAll(s);
    }

    public boolean nameMatch(String s) {
        return this.name.equals(s);
    }

    /**
     * 根据其名称进行过滤
     *
     * @param declarationBaseInfos: 待过滤的列表
     * @param name:                 作为过滤条件的名称
     * @param filterMode:           过滤模式. true: 正向过滤; false: 反向过滤
     * @param <T>:                  某种作为信息基类的子类型
     * @return 过滤后的列表
     */
    public static <T extends DeclarationBaseInfo> List<T> declarationBaseInfoFilter(List<T> declarationBaseInfos, String name, boolean filterMode) {
        List<T> ret = new ArrayList<>();
        if (declarationBaseInfos == null) return ret;
        for (var declarationBaseInfo : declarationBaseInfos) { // 对输入类型的每一项
            if (filterMode == Objects.equals(declarationBaseInfo.name, name)) { // 当其名称与过滤条件中的名称相符合
                ret.add(declarationBaseInfo); // 符合过滤条件，加入待返回列表
            }
        }
        return ret;
    }

    public static <T extends DeclarationBaseInfo> List<T> declarationBaseInfoFilterByName(List<T> t, String name) {
        if (t == null) return null;
        return t.stream().filter(item -> item.nameMatch(name)).collect(Collectors.toList());
    }

    public static <T extends DeclarationBaseInfo> List<T> declarationBaseInfoFilterByModifier(List<T> t, List<ModifierType> mod) {
        if (t == null) return null;
        return t.stream().filter(item -> item.modifierMatch(mod)).collect(Collectors.toList());
    }
}
