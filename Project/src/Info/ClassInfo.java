package Info;

import JavaParser.JavaParser;
import JavaQueryParser.JavaQueryParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 用于存储类及接口声明的信息，除基类中信息外暂未保存其他信息。
 */
public class ClassInfo extends DeclarationBaseInfo {
    Set<String>  _extends;
    Set<String> _implements;
    Set<String> _permits;
    JavaParser.TypeParametersContext _typeParameters;
    SubType _type;
    public enum SubType{
        CLASS,
        INTERFACE,
        ENUM
    }

    public JavaParser.ClassBodyContext getClassBody() {
        try{
            return ((JavaParser.TypeDeclarationContext)(this.Context)).classDeclaration().classBody();
        } catch (ClassCastException e){
            return ((JavaParser.LocalTypeDeclarationContext)(this.Context)).classDeclaration().classBody();
        }
    }

    public JavaParser.InterfaceBodyContext getInterfaceBody() {
        return ((JavaParser.TypeDeclarationContext)(this.Context)).interfaceDeclaration().interfaceBody();
    }

    public boolean typeParametersMatch(){
        return true;
    }

    public boolean extendsMatch(List<String> s) {
        if (_extends == null) return s == null || s.size() == 0;
        return _extends.containsAll(s);
    }

    public boolean implementsMatch(List<String> s) {
        if (_implements == null) return s== null || s.size() == 0;
        return _implements.containsAll(s);
    }

    public boolean permitsMatch(List<String> s) {
        if (_implements == null ) return s == null || s.size() == 0;
        return _permits.containsAll(s);
    }
    public ClassInfo(JavaParser.ClassDeclarationContext ctx, List<JavaParser.ClassOrInterfaceModifierContext> modifiers) {
        // process extends
        super(ctx.identifier().getText(),
                modifiers.stream()
                        .map(item
                                -> item.annotation() == null ?
                                (TerminalNode)item.getChild(0)
                                : null
                        ).filter(Objects::nonNull)
                        .collect(Collectors.toList()),ctx.getParent(),true);
        _type = SubType.CLASS;
        _extends = ctx.EXTENDS() == null ? null : new HashSet<>(Collections.singleton(ctx.typeType().getText()));
        _implements = ctx.IMPLEMENTS() == null ? null : ctx.typeList(0).typeType().stream().map(RuleContext::getText).collect(Collectors.toSet());
        _permits = ctx.PERMITS() == null ? null : ctx.typeList(ctx.IMPLEMENTS() == null ? 0 : 1).typeType()
                .stream().map(RuleContext::getText).collect(Collectors.toSet());
    }

    public ClassInfo(JavaParser.InterfaceDeclarationContext ctx, List<JavaParser.ClassOrInterfaceModifierContext> modifiers) {
        super(ctx.identifier().getText(),
                modifiers.stream()
                        .map(item
                                -> item.annotation() == null ?
                                (TerminalNode)item.getChild(0)
                                : null
                        ).filter(Objects::nonNull)
                        .collect(Collectors.toList()),ctx.getParent(),true);
        _type = SubType.CLASS;
        _extends = ctx.EXTENDS() == null ? null : ctx.typeList(0).typeType()
                .stream().map(RuleContext::getText).collect(Collectors.toSet());
        _permits = ctx.PERMITS() == null ? null : ctx.typeList(ctx.EXTENDS() == null ? 0 : 1).typeType()
                .stream().map(RuleContext::getText).collect(Collectors.toSet());
    }
    public ClassInfo(String name, List<JavaParser.ModifierContext> modifiers, ParserRuleContext context) {
        super(name, modifiers, context);
    }
    public ClassInfo(TerminalNode name, JavaParser.ModifierContext modifierContext, ParserRuleContext context) {
        super(name.getText(), new ArrayList<>(Collections.singleton(modifierContext)) ,context);
    }

    /**
     * 用类或接口的名称进行过滤
     * @param classInfos: 待过滤的类或接口声明的列表
     * @param name: 作为过滤条件的名称
     * @param filterMode: 过滤模式. true: 正向过滤; false: 反向过滤
     * @return 过滤后的类或接口声明的列表
     */
    public static List<ClassInfo> classInfoFilter(List<ClassInfo> classInfos, String name, boolean filterMode) {
        return declarationBaseInfoFilter(classInfos, name, filterMode); //调用其父类的方法
    }

    public static List<ClassInfo> classInfosFilterByName(List<ClassInfo> l, String name){
        return declarationBaseInfoFilterByName(l,name);
    }

    public static List<ClassInfo> classInfoFilterByModifier(List<ClassInfo> l, List<ModifierType> mod){
        return declarationBaseInfoFilterByModifier(l,mod);
    }

    public static List<ClassInfo> classInfosFilterByExtends(List<ClassInfo> l, List<String> extend){
        return l.stream().filter(item -> item.extendsMatch(extend)).collect(Collectors.toList());
    }
    public static List<ClassInfo> classInfosFilterByImplements(List<ClassInfo> l, List<String> imp){
        return l.stream().filter(item -> item.implementsMatch(imp)).collect(Collectors.toList());
    }
    public static List<ClassInfo> classInfosFilterByPermits(List<ClassInfo> l, List<String> per){
        return l.stream().filter(item -> item.permitsMatch(per)).collect(Collectors.toList());
    }
}
