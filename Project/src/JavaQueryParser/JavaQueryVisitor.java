// Generated from grammar/JavaQuery.g4 by ANTLR 4.10.1
package JavaQueryParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#queryInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryInput(JavaQueryParser.QueryInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#subQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQuery(JavaQueryParser.SubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(JavaQueryParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classLikeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLikeDecl(JavaQueryParser.ClassLikeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(JavaQueryParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classLikeKeyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLikeKeyWord(JavaQueryParser.ClassLikeKeyWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(JavaQueryParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(JavaQueryParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaQueryParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaQueryParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(JavaQueryParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaQueryParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaQueryParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaQueryParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaQueryParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaQueryParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaQueryParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JavaQueryParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaQueryParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaQueryParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaQueryParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaQueryParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaQueryParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaQueryParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JavaQueryParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaQueryParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaQueryParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(JavaQueryParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(JavaQueryParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(JavaQueryParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaQueryParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaQueryParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JavaQueryParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaQueryParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(JavaQueryParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(JavaQueryParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaQueryParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaQueryParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(JavaQueryParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCommonBodyDeclaration(JavaQueryParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaQueryParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaQueryParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaQueryParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaQueryParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaQueryParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaQueryParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaQueryParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JavaQueryParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaQueryParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JavaQueryParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaQueryParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaQueryParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaQueryParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIList(JavaQueryParser.LambdaLVTIListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIParameter(JavaQueryParser.LambdaLVTIParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JavaQueryParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaQueryParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(JavaQueryParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(JavaQueryParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(JavaQueryParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaQueryParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(JavaQueryParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaQueryParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaQueryParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaQueryParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaQueryParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaQueryParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaQueryParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(JavaQueryParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(JavaQueryParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(JavaQueryParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(JavaQueryParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaQueryParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(JavaQueryParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(JavaQueryParser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(JavaQueryParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(JavaQueryParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(JavaQueryParser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#recordHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordHeader(JavaQueryParser.RecordHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#recordComponentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponentList(JavaQueryParser.RecordComponentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#recordComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponent(JavaQueryParser.RecordComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#recordBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordBody(JavaQueryParser.RecordBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaQueryParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaQueryParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaQueryParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JavaQueryParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(JavaQueryParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaQueryParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#assertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmt(JavaQueryParser.AssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(JavaQueryParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(JavaQueryParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(JavaQueryParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#doWhileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(JavaQueryParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#tryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStmt(JavaQueryParser.TryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#tryWithRescource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithRescource(JavaQueryParser.TryWithRescourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#switchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(JavaQueryParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#synchronizedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStmt(JavaQueryParser.SynchronizedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JavaQueryParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#throwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStmt(JavaQueryParser.ThrowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(JavaQueryParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(JavaQueryParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#yieldStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStmt(JavaQueryParser.YieldStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#emptyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(JavaQueryParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#switchExpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpStmt(JavaQueryParser.SwitchExpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#labelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelStmt(JavaQueryParser.LabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#caseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStmt(JavaQueryParser.CaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaQueryParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaQueryParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JavaQueryParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaQueryParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(JavaQueryParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JavaQueryParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaQueryParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaQueryParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JavaQueryParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaQueryParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(JavaQueryParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JavaQueryParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaQueryParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaQueryParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaQueryParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(JavaQueryParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JavaQueryParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JavaQueryParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JavaQueryParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JavaQueryParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(JavaQueryParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabeledRule(JavaQueryParser.SwitchLabeledRuleContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedPattern(JavaQueryParser.GuardedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchRuleOutcome(JavaQueryParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaQueryParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JavaQueryParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(JavaQueryParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JavaQueryParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JavaQueryParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JavaQueryParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(JavaQueryParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaQueryParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(JavaQueryParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(JavaQueryParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(JavaQueryParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(JavaQueryParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaQueryParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaQueryParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(JavaQueryParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(JavaQueryParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaQueryParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaQueryParser.ArgumentsContext ctx);
}