// Generated from grammar/JavaQuery.g4 by ANTLR 4.10.1
package JavaQueryParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaQueryParser}.
 */
public interface JavaQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#queryInput}.
	 * @param ctx the parse tree
	 */
	void enterQueryInput(JavaQueryParser.QueryInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#queryInput}.
	 * @param ctx the parse tree
	 */
	void exitQueryInput(JavaQueryParser.QueryInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#subQuery}.
	 * @param ctx the parse tree
	 */
	void enterSubQuery(JavaQueryParser.SubQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#subQuery}.
	 * @param ctx the parse tree
	 */
	void exitSubQuery(JavaQueryParser.SubQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(JavaQueryParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(JavaQueryParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classLikeDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassLikeDecl(JavaQueryParser.ClassLikeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classLikeDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassLikeDecl(JavaQueryParser.ClassLikeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(JavaQueryParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(JavaQueryParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classLikeKeyWord}.
	 * @param ctx the parse tree
	 */
	void enterClassLikeKeyWord(JavaQueryParser.ClassLikeKeyWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classLikeKeyWord}.
	 * @param ctx the parse tree
	 */
	void exitClassLikeKeyWord(JavaQueryParser.ClassLikeKeyWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(JavaQueryParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(JavaQueryParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(JavaQueryParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(JavaQueryParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaQueryParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaQueryParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaQueryParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaQueryParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JavaQueryParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JavaQueryParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaQueryParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaQueryParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaQueryParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaQueryParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaQueryParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaQueryParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaQueryParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaQueryParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaQueryParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaQueryParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaQueryParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaQueryParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JavaQueryParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JavaQueryParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaQueryParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaQueryParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaQueryParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaQueryParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaQueryParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaQueryParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaQueryParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaQueryParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaQueryParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaQueryParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaQueryParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaQueryParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JavaQueryParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JavaQueryParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaQueryParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaQueryParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaQueryParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaQueryParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JavaQueryParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JavaQueryParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JavaQueryParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JavaQueryParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JavaQueryParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JavaQueryParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaQueryParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaQueryParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaQueryParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaQueryParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JavaQueryParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JavaQueryParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaQueryParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaQueryParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JavaQueryParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JavaQueryParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JavaQueryParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JavaQueryParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaQueryParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaQueryParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaQueryParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaQueryParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(JavaQueryParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(JavaQueryParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCommonBodyDeclaration(JavaQueryParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCommonBodyDeclaration(JavaQueryParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaQueryParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaQueryParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaQueryParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaQueryParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaQueryParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaQueryParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaQueryParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaQueryParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaQueryParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaQueryParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaQueryParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaQueryParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaQueryParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaQueryParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JavaQueryParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JavaQueryParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaQueryParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaQueryParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JavaQueryParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JavaQueryParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaQueryParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaQueryParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaQueryParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaQueryParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaQueryParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaQueryParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIList(JavaQueryParser.LambdaLVTIListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIList(JavaQueryParser.LambdaLVTIListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIParameter(JavaQueryParser.LambdaLVTIParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIParameter(JavaQueryParser.LambdaLVTIParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaQueryParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaQueryParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaQueryParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaQueryParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JavaQueryParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JavaQueryParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JavaQueryParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JavaQueryParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(JavaQueryParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(JavaQueryParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaQueryParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaQueryParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JavaQueryParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JavaQueryParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaQueryParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaQueryParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaQueryParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaQueryParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaQueryParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaQueryParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaQueryParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaQueryParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaQueryParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaQueryParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaQueryParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaQueryParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(JavaQueryParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(JavaQueryParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(JavaQueryParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(JavaQueryParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(JavaQueryParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(JavaQueryParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(JavaQueryParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(JavaQueryParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaQueryParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaQueryParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(JavaQueryParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(JavaQueryParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(JavaQueryParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(JavaQueryParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(JavaQueryParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(JavaQueryParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(JavaQueryParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(JavaQueryParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(JavaQueryParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(JavaQueryParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(JavaQueryParser.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(JavaQueryParser.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(JavaQueryParser.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(JavaQueryParser.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(JavaQueryParser.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(JavaQueryParser.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(JavaQueryParser.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(JavaQueryParser.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaQueryParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaQueryParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaQueryParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaQueryParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaQueryParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaQueryParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JavaQueryParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JavaQueryParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JavaQueryParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JavaQueryParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaQueryParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaQueryParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(JavaQueryParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(JavaQueryParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JavaQueryParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JavaQueryParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(JavaQueryParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(JavaQueryParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(JavaQueryParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(JavaQueryParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(JavaQueryParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(JavaQueryParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(JavaQueryParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(JavaQueryParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#tryWithRescource}.
	 * @param ctx the parse tree
	 */
	void enterTryWithRescource(JavaQueryParser.TryWithRescourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#tryWithRescource}.
	 * @param ctx the parse tree
	 */
	void exitTryWithRescource(JavaQueryParser.TryWithRescourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(JavaQueryParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(JavaQueryParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#synchronizedStmt}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStmt(JavaQueryParser.SynchronizedStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#synchronizedStmt}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStmt(JavaQueryParser.SynchronizedStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(JavaQueryParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(JavaQueryParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#throwStmt}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmt(JavaQueryParser.ThrowStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#throwStmt}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmt(JavaQueryParser.ThrowStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(JavaQueryParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(JavaQueryParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(JavaQueryParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(JavaQueryParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(JavaQueryParser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(JavaQueryParser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(JavaQueryParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(JavaQueryParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#switchExpStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpStmt(JavaQueryParser.SwitchExpStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#switchExpStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpStmt(JavaQueryParser.SwitchExpStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#labelStmt}.
	 * @param ctx the parse tree
	 */
	void enterLabelStmt(JavaQueryParser.LabelStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#labelStmt}.
	 * @param ctx the parse tree
	 */
	void exitLabelStmt(JavaQueryParser.LabelStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaQueryParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaQueryParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaQueryParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaQueryParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JavaQueryParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JavaQueryParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaQueryParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaQueryParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JavaQueryParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JavaQueryParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaQueryParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaQueryParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaQueryParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaQueryParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaQueryParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaQueryParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JavaQueryParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JavaQueryParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaQueryParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaQueryParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JavaQueryParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JavaQueryParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JavaQueryParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JavaQueryParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaQueryParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaQueryParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaQueryParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaQueryParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaQueryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaQueryParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(JavaQueryParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(JavaQueryParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaQueryParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaQueryParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JavaQueryParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JavaQueryParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JavaQueryParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JavaQueryParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaQueryParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaQueryParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(JavaQueryParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(JavaQueryParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabeledRule(JavaQueryParser.SwitchLabeledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabeledRule(JavaQueryParser.SwitchLabeledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGuardedPattern(JavaQueryParser.GuardedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGuardedPattern(JavaQueryParser.GuardedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRuleOutcome(JavaQueryParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRuleOutcome(JavaQueryParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaQueryParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaQueryParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JavaQueryParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JavaQueryParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JavaQueryParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JavaQueryParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JavaQueryParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JavaQueryParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JavaQueryParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JavaQueryParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JavaQueryParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JavaQueryParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JavaQueryParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JavaQueryParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaQueryParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaQueryParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JavaQueryParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JavaQueryParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JavaQueryParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JavaQueryParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JavaQueryParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JavaQueryParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JavaQueryParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JavaQueryParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaQueryParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaQueryParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaQueryParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaQueryParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JavaQueryParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JavaQueryParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(JavaQueryParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(JavaQueryParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaQueryParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaQueryParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaQueryParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaQueryParser.ArgumentsContext ctx);
}