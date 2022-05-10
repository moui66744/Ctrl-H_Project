package Test;

import AstGenerator.AstInfo;
import JavaParser.JavaParser;
import JavaParser.JavaVisitor;
import org.antlr.runtime.tree.TreeWizard;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class AstInfoTest {
    static String inputFileName = "test/DummyTest.java";
    static CharStream src;
    public static void parseArg(String [] args) throws IOException {
        src = CharStreams.fromFileName(inputFileName);
    }
    public static class VarDeclVisitor implements JavaVisitor<List<JavaParser.VariableDeclaratorContext>> {

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
            if(ctx == null) return null;
            List<JavaParser.VariableDeclaratorContext> result = new ArrayList<>();
            for (var data: ctx.typeDeclaration()){
                var res = visitTypeDeclaration(data);
                if (res != null) {
                    if (res.size() != 0){
                        result.addAll(res);
                    }
                }
            }
            var res = visitClassOrInterfaceDeclaration(ctx.classOrInterfaceDeclaration());
            return result;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
            if(ctx == null) return null;
            return visitClassOrInterfaceDeclaration(ctx.classOrInterfaceDeclaration());
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitClassOrInterfaceDeclaration(JavaParser.ClassOrInterfaceDeclarationContext ctx) {
            if(ctx == null) return null;
            List<JavaParser.VariableDeclaratorContext> result = new ArrayList<>();
            var res = visitClassDeclaration(ctx.classDeclaration());
            if (res != null) result.addAll(res);
            return result;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitClassOrInterfaceModifiers(JavaParser.ClassOrInterfaceModifiersContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitModifiers(JavaParser.ModifiersContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
            if(ctx == null) return null;
            return visitNormalClassDeclaration(ctx.normalClassDeclaration());
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx) {
            if(ctx == null) return null;
            return visitClassBody(ctx.classBody());
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeParameters(JavaParser.TypeParametersContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeParameter(JavaParser.TypeParameterContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeBound(JavaParser.TypeBoundContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitEnumBody(JavaParser.EnumBodyContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitEnumConstants(JavaParser.EnumConstantsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitEnumConstant(JavaParser.EnumConstantContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitNormalInterfaceDeclaration(JavaParser.NormalInterfaceDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeList(JavaParser.TypeListContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitClassBody(JavaParser.ClassBodyContext ctx) {
            if(ctx == null) return null;
            List<JavaParser.VariableDeclaratorContext> result = new ArrayList<>();
            for (var node: ctx.classBodyDeclaration()){
                var res = visitClassBodyDeclaration(node);
                if (res != null) result.addAll(res);
            }
            return result;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
            if(ctx == null) return null;
            List<JavaParser.VariableDeclaratorContext> result = new ArrayList<>();
            var res = visitBlock(ctx.block());
            if (res != null) result.addAll(res);
            res = visitMemberDecl(ctx.memberDecl());
            if (res != null) result.addAll(res);
            return result;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitMemberDecl(JavaParser.MemberDeclContext ctx) {
            if(ctx == null) return null;
            List<JavaParser.VariableDeclaratorContext> result = new ArrayList<>();
            var res = visitClassDeclaration(ctx.classDeclaration());
            if (res != null) result.addAll(res);
            res = visitMemberDeclaration(ctx.memberDeclaration());
            if (res != null) result.addAll(res);
            try {
                res = visitBlock(ctx.voidMethodDeclaratorRest().methodBody().block());
            }catch (NullPointerException e){
                return result;
            }
            if (res != null) result.addAll(res);
            return result;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
            if(ctx == null) return null;
            List<JavaParser.VariableDeclaratorContext> result = new ArrayList<>();
            var res = visitFieldDeclaration(ctx.fieldDeclaration());
            if(res != null) result.addAll(res);
            res = visitMethodDeclaration(ctx.methodDeclaration());
            if(res != null) result.addAll(res);
            return result;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitGenericMethodOrConstructorDecl(JavaParser.GenericMethodOrConstructorDeclContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitGenericMethodOrConstructorRest(JavaParser.GenericMethodOrConstructorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
            if (ctx == null)return null;
            List<JavaParser.VariableDeclaratorContext> result = new ArrayList<>();
            var res = visitBlock(ctx.methodDeclaratorRest().methodBody().block());
            return result;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
            if (ctx == null) return null;
            return new ArrayList<>(ctx.variableDeclarators().variableDeclarator());
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInterfaceMemberDecl(JavaParser.InterfaceMemberDeclContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInterfaceMethodOrFieldDecl(JavaParser.InterfaceMethodOrFieldDeclContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInterfaceMethodOrFieldRest(JavaParser.InterfaceMethodOrFieldRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitMethodDeclaratorRest(JavaParser.MethodDeclaratorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitVoidMethodDeclaratorRest(JavaParser.VoidMethodDeclaratorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInterfaceMethodDeclaratorRest(JavaParser.InterfaceMethodDeclaratorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInterfaceGenericMethodDecl(JavaParser.InterfaceGenericMethodDeclContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitVoidInterfaceMethodDeclaratorRest(JavaParser.VoidInterfaceMethodDeclaratorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConstructorDeclaratorRest(JavaParser.ConstructorDeclaratorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
            if (ctx == null) return null;
            return new ArrayList<>(ctx.variableDeclarator());
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConstantDeclaratorsRest(JavaParser.ConstantDeclaratorsRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConstantDeclaratorRest(JavaParser.ConstantDeclaratorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitModifier(JavaParser.ModifierContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitPackageOrTypeName(JavaParser.PackageOrTypeNameContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeName(JavaParser.TypeNameContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitType(JavaParser.TypeContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitVariableModifier(JavaParser.VariableModifierContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeArguments(JavaParser.TypeArgumentsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeArgument(JavaParser.TypeArgumentContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitFormalParameters(JavaParser.FormalParametersContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitFormalParameterDecls(JavaParser.FormalParameterDeclsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitFormalParameterDeclsRest(JavaParser.FormalParameterDeclsRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitMethodBody(JavaParser.MethodBodyContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConstructorBody(JavaParser.ConstructorBodyContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitQualifiedName(JavaParser.QualifiedNameContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitLiteral(JavaParser.LiteralContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotations(JavaParser.AnnotationsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotation(JavaParser.AnnotationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotationName(JavaParser.AnnotationNameContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitElementValuePair(JavaParser.ElementValuePairContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitElementValue(JavaParser.ElementValueContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitDefaultValue(JavaParser.DefaultValueContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitBlock(JavaParser.BlockContext ctx) {
            if (ctx == null)return null;
            List<JavaParser.VariableDeclaratorContext> result = new ArrayList<>();
            for (var node : ctx.blockStatement()){
                var res = visitBlockStatement(node);
                if (res != null) result.addAll(res);
            }
            return result;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitBlockStatement(JavaParser.BlockStatementContext ctx) {
            if (ctx == null) return null;
            var innerVal1 = ctx.localVariableDeclarationStatement();
            if ( innerVal1 == null )
                return null;
            var innerVal2 = innerVal1.localVariableDeclaration();
            if ( innerVal2 == null) {
                return null;
            }
            return visitVariableDeclarators(innerVal2.variableDeclarators());
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitVariableModifiers(JavaParser.VariableModifiersContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitStatement(JavaParser.StatementContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitCatches(JavaParser.CatchesContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitCatchClause(JavaParser.CatchClauseContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitCatchType(JavaParser.CatchTypeContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitFinallyBlock(JavaParser.FinallyBlockContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitResources(JavaParser.ResourcesContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitResource(JavaParser.ResourceContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitFormalParameter(JavaParser.FormalParameterContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitSwitchBlockStatementGroups(JavaParser.SwitchBlockStatementGroupsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitSwitchLabel(JavaParser.SwitchLabelContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitForControl(JavaParser.ForControlContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitForInit(JavaParser.ForInitContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitForUpdate(JavaParser.ForUpdateContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitParExpression(JavaParser.ParExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitExpressionList(JavaParser.ExpressionListContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitStatementExpression(JavaParser.StatementExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConstantExpression(JavaParser.ConstantExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitExpression(JavaParser.ExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAssignmentOperator(JavaParser.AssignmentOperatorContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConditionalExpression(JavaParser.ConditionalExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConditionalOrExpression(JavaParser.ConditionalOrExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitConditionalAndExpression(JavaParser.ConditionalAndExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInclusiveOrExpression(JavaParser.InclusiveOrExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitExclusiveOrExpression(JavaParser.ExclusiveOrExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAndExpression(JavaParser.AndExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitEqualityExpression(JavaParser.EqualityExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInstanceOfExpression(JavaParser.InstanceOfExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitRelationalExpression(JavaParser.RelationalExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitRelationalOp(JavaParser.RelationalOpContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitShiftExpression(JavaParser.ShiftExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitShiftOp(JavaParser.ShiftOpContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitAdditiveExpression(JavaParser.AdditiveExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitMultiplicativeExpression(JavaParser.MultiplicativeExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitUnaryExpression(JavaParser.UnaryExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitUnaryExpressionNotPlusMinus(JavaParser.UnaryExpressionNotPlusMinusContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitCastExpression(JavaParser.CastExpressionContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitPrimary(JavaParser.PrimaryContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitIdentifierSuffix(JavaParser.IdentifierSuffixContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitCreator(JavaParser.CreatorContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitCreatedName(JavaParser.CreatedNameContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitInnerCreator(JavaParser.InnerCreatorContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitSelector(JavaParser.SelectorContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitSuperSuffix(JavaParser.SuperSuffixContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitArguments(JavaParser.ArgumentsContext ctx) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visit(ParseTree parseTree) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitChildren(RuleNode ruleNode) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitTerminal(TerminalNode terminalNode) {
            return null;
        }

        @Override
        public List<JavaParser.VariableDeclaratorContext> visitErrorNode(ErrorNode errorNode) {
            return null;
        }
    }
    public static <T extends ParserRuleContext> String makeResult(T res, AstInfo astInfo) {

        return  "///////////////////////////////////\n" +
                "Line:"+ res.start.getLine() +
                ",Offset" + res.start.getCharPositionInLine() +
                "\nContent:\n\n" +astInfo.getTokenStream().getText(res.start, res.stop);
    }
    public static void main(String[] args) throws IOException {
        parseArg(args);
        AstInfo astInfo = new AstInfo(inputFileName);
        VarDeclVisitor varDeclVisitor = new VarDeclVisitor();
        List<JavaParser.VariableDeclaratorContext> result;
        result = varDeclVisitor.visitCompilationUnit(astInfo.getRoot());

        for (var res : result){
            System.out.println(
                makeResult(res,astInfo)
            );
        }
        var context= result.get(1);
        astInfo.replace(context, "data = 12343543");
        System.out.println(astInfo.getTokenStreamRewriter().getText());
    }
}
