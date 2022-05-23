// Generated from grammar/JavaQuery.g4 by ANTLR 4.10.1
package JavaQueryParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ABSTRACT=2, ASSERT=3, BOOLEAN=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, 
		CHAR=9, CLASS=10, CONST=11, CONTINUE=12, DEFAULT=13, DO=14, DOUBLE=15, 
		ELSE=16, ENUM=17, EXTENDS=18, FINAL=19, FINALLY=20, FLOAT=21, FOR=22, 
		IF=23, GOTO=24, IMPLEMENTS=25, IMPORT=26, INSTANCEOF=27, INT=28, INTERFACE=29, 
		LONG=30, NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, 
		RETURN=37, SHORT=38, STATIC=39, STRICTFP=40, SUPER=41, SWITCH=42, SYNCHRONIZED=43, 
		THIS=44, THROW=45, THROWS=46, TRANSIENT=47, TRY=48, VOID=49, VOLATILE=50, 
		WHILE=51, MODULE=52, OPEN=53, REQUIRES=54, EXPORTS=55, OPENS=56, TO=57, 
		USES=58, PROVIDES=59, WITH=60, TRANSITIVE=61, VAR=62, YIELD=63, RECORD=64, 
		SEALED=65, PERMITS=66, NON_SEALED=67, DECIMAL_LITERAL=68, HEX_LITERAL=69, 
		OCT_LITERAL=70, BINARY_LITERAL=71, FLOAT_LITERAL=72, HEX_FLOAT_LITERAL=73, 
		BOOL_LITERAL=74, CHAR_LITERAL=75, STRING_LITERAL=76, TEXT_BLOCK=77, NULL_LITERAL=78, 
		LPAREN=79, RPAREN=80, LBRACE=81, RBRACE=82, LBRACK=83, RBRACK=84, SEMI=85, 
		COMMA=86, DOT=87, ASSIGN=88, GT=89, LT=90, BANG=91, TILDE=92, QUESTION=93, 
		COLON=94, EQUAL=95, LE=96, GE=97, NOTEQUAL=98, AND=99, OR=100, INC=101, 
		DEC=102, ADD=103, SUB=104, MUL=105, DIV=106, BITAND=107, BITOR=108, CARET=109, 
		MOD=110, ADD_ASSIGN=111, SUB_ASSIGN=112, MUL_ASSIGN=113, DIV_ASSIGN=114, 
		AND_ASSIGN=115, OR_ASSIGN=116, XOR_ASSIGN=117, MOD_ASSIGN=118, LSHIFT_ASSIGN=119, 
		RSHIFT_ASSIGN=120, URSHIFT_ASSIGN=121, ARROW=122, COLONCOLON=123, AT=124, 
		ELLIPSIS=125, WS=126, COMMENT=127, LINE_COMMENT=128, IDENTIFIER=129;
	public static final int
		RULE_queryInput = 0, RULE_subQuery = 1, RULE_decl = 2, RULE_classLikeDecl = 3, 
		RULE_modifiers = 4, RULE_classLikeKeyWord = 5, RULE_varDecl = 6, RULE_methodDecl = 7, 
		RULE_importDeclaration = 8, RULE_modifier = 9, RULE_classOrInterfaceModifier = 10, 
		RULE_variableModifier = 11, RULE_classDeclaration = 12, RULE_typeParameters = 13, 
		RULE_typeParameter = 14, RULE_typeBound = 15, RULE_enumDeclaration = 16, 
		RULE_enumConstants = 17, RULE_enumConstant = 18, RULE_enumBodyDeclarations = 19, 
		RULE_interfaceDeclaration = 20, RULE_classBody = 21, RULE_interfaceBody = 22, 
		RULE_classBodyDeclaration = 23, RULE_memberDeclaration = 24, RULE_methodDeclaration = 25, 
		RULE_methodBody = 26, RULE_typeTypeOrVoid = 27, RULE_genericMethodDeclaration = 28, 
		RULE_genericConstructorDeclaration = 29, RULE_constructorDeclaration = 30, 
		RULE_fieldDeclaration = 31, RULE_interfaceBodyDeclaration = 32, RULE_interfaceMemberDeclaration = 33, 
		RULE_constDeclaration = 34, RULE_constantDeclarator = 35, RULE_interfaceMethodDeclaration = 36, 
		RULE_interfaceMethodModifier = 37, RULE_genericInterfaceMethodDeclaration = 38, 
		RULE_interfaceCommonBodyDeclaration = 39, RULE_variableDeclarators = 40, 
		RULE_variableDeclarator = 41, RULE_variableDeclaratorId = 42, RULE_variableInitializer = 43, 
		RULE_arrayInitializer = 44, RULE_classOrInterfaceType = 45, RULE_typeArgument = 46, 
		RULE_qualifiedNameList = 47, RULE_formalParameters = 48, RULE_receiverParameter = 49, 
		RULE_formalParameterList = 50, RULE_formalParameter = 51, RULE_lastFormalParameter = 52, 
		RULE_lambdaLVTIList = 53, RULE_lambdaLVTIParameter = 54, RULE_qualifiedName = 55, 
		RULE_literal = 56, RULE_integerLiteral = 57, RULE_floatLiteral = 58, RULE_altAnnotationQualifiedName = 59, 
		RULE_annotation = 60, RULE_elementValuePairs = 61, RULE_elementValuePair = 62, 
		RULE_elementValue = 63, RULE_elementValueArrayInitializer = 64, RULE_annotationTypeDeclaration = 65, 
		RULE_annotationTypeBody = 66, RULE_annotationTypeElementDeclaration = 67, 
		RULE_annotationTypeElementRest = 68, RULE_annotationMethodOrConstantRest = 69, 
		RULE_annotationMethodRest = 70, RULE_annotationConstantRest = 71, RULE_defaultValue = 72, 
		RULE_moduleDeclaration = 73, RULE_moduleBody = 74, RULE_moduleDirective = 75, 
		RULE_requiresModifier = 76, RULE_recordDeclaration = 77, RULE_recordHeader = 78, 
		RULE_recordComponentList = 79, RULE_recordComponent = 80, RULE_recordBody = 81, 
		RULE_block = 82, RULE_blockStatement = 83, RULE_localVariableDeclaration = 84, 
		RULE_identifier = 85, RULE_localTypeDeclaration = 86, RULE_statement = 87, 
		RULE_assertStmt = 88, RULE_ifStmt = 89, RULE_forStmt = 90, RULE_whileStmt = 91, 
		RULE_doWhileStmt = 92, RULE_tryStmt = 93, RULE_tryWithRescource = 94, 
		RULE_switchStmt = 95, RULE_synchronizedStmt = 96, RULE_returnStmt = 97, 
		RULE_throwStmt = 98, RULE_breakStmt = 99, RULE_continueStmt = 100, RULE_yieldStmt = 101, 
		RULE_emptyStmt = 102, RULE_switchExpStmt = 103, RULE_labelStmt = 104, 
		RULE_caseStmt = 105, RULE_catchClause = 106, RULE_catchType = 107, RULE_finallyBlock = 108, 
		RULE_resourceSpecification = 109, RULE_resources = 110, RULE_resource = 111, 
		RULE_switchBlockStatementGroup = 112, RULE_switchLabel = 113, RULE_forControl = 114, 
		RULE_forInit = 115, RULE_enhancedForControl = 116, RULE_parExpression = 117, 
		RULE_expressionList = 118, RULE_methodCall = 119, RULE_expression = 120, 
		RULE_pattern = 121, RULE_lambdaExpression = 122, RULE_lambdaParameters = 123, 
		RULE_lambdaBody = 124, RULE_primary = 125, RULE_switchExpression = 126, 
		RULE_switchLabeledRule = 127, RULE_guardedPattern = 128, RULE_switchRuleOutcome = 129, 
		RULE_classType = 130, RULE_creator = 131, RULE_createdName = 132, RULE_innerCreator = 133, 
		RULE_arrayCreatorRest = 134, RULE_classCreatorRest = 135, RULE_explicitGenericInvocation = 136, 
		RULE_typeArgumentsOrDiamond = 137, RULE_nonWildcardTypeArgumentsOrDiamond = 138, 
		RULE_nonWildcardTypeArguments = 139, RULE_typeList = 140, RULE_typeType = 141, 
		RULE_primitiveType = 142, RULE_typeArguments = 143, RULE_superSuffix = 144, 
		RULE_explicitGenericInvocationSuffix = 145, RULE_arguments = 146;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryInput", "subQuery", "decl", "classLikeDecl", "modifiers", "classLikeKeyWord", 
			"varDecl", "methodDecl", "importDeclaration", "modifier", "classOrInterfaceModifier", 
			"variableModifier", "classDeclaration", "typeParameters", "typeParameter", 
			"typeBound", "enumDeclaration", "enumConstants", "enumConstant", "enumBodyDeclarations", 
			"interfaceDeclaration", "classBody", "interfaceBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"genericMethodDeclaration", "genericConstructorDeclaration", "constructorDeclaration", 
			"fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "genericInterfaceMethodDeclaration", "interfaceCommonBodyDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument", 
			"qualifiedNameList", "formalParameters", "receiverParameter", "formalParameterList", 
			"formalParameter", "lastFormalParameter", "lambdaLVTIList", "lambdaLVTIParameter", 
			"qualifiedName", "literal", "integerLiteral", "floatLiteral", "altAnnotationQualifiedName", 
			"annotation", "elementValuePairs", "elementValuePair", "elementValue", 
			"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
			"annotationMethodRest", "annotationConstantRest", "defaultValue", "moduleDeclaration", 
			"moduleBody", "moduleDirective", "requiresModifier", "recordDeclaration", 
			"recordHeader", "recordComponentList", "recordComponent", "recordBody", 
			"block", "blockStatement", "localVariableDeclaration", "identifier", 
			"localTypeDeclaration", "statement", "assertStmt", "ifStmt", "forStmt", 
			"whileStmt", "doWhileStmt", "tryStmt", "tryWithRescource", "switchStmt", 
			"synchronizedStmt", "returnStmt", "throwStmt", "breakStmt", "continueStmt", 
			"yieldStmt", "emptyStmt", "switchExpStmt", "labelStmt", "caseStmt", "catchClause", 
			"catchType", "finallyBlock", "resourceSpecification", "resources", "resource", 
			"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", 
			"enhancedForControl", "parExpression", "expressionList", "methodCall", 
			"expression", "pattern", "lambdaExpression", "lambdaParameters", "lambdaBody", 
			"primary", "switchExpression", "switchLabeledRule", "guardedPattern", 
			"switchRuleOutcome", "classType", "creator", "createdName", "innerCreator", 
			"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\'", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
			"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'module'", 
			"'open'", "'requires'", "'exports'", "'opens'", "'to'", "'uses'", "'provides'", 
			"'with'", "'transitive'", "'var'", "'yield'", "'record'", "'sealed'", 
			"'permits'", "'non-sealed'", null, null, null, null, null, null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", 
			"'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
			"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
			"THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "MODULE", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE", "VAR", "YIELD", "RECORD", "SEALED", "PERMITS", "NON_SEALED", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"TEXT_BLOCK", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryInputContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public QueryInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterQueryInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitQueryInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitQueryInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryInputContext queryInput() throws RecognitionException {
		QueryInputContext _localctx = new QueryInputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryInput);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				importDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubQueryContext extends ParserRuleContext {
		public Token notOp;
		public QueryInputContext queryInput() {
			return getRuleContext(QueryInputContext.class,0);
		}
		public SubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubQueryContext subQuery() throws RecognitionException {
		SubQueryContext _localctx = new SubQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(300);
				((SubQueryContext)_localctx).notOp = match(T__0);
				}
			}

			setState(303);
			queryInput();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public ClassLikeDeclContext classLikeDecl() {
			return getRuleContext(ClassLikeDeclContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				classLikeDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				methodDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				varDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassLikeDeclContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassLikeKeyWordContext classLikeKeyWord() {
			return getRuleContext(ClassLikeKeyWordContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaQueryParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaQueryParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassLikeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classLikeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassLikeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassLikeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassLikeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassLikeDeclContext classLikeDecl() throws RecognitionException {
		ClassLikeDeclContext _localctx = new ClassLikeDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classLikeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			modifiers();
			setState(311);
			classLikeKeyWord();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(312);
				typeParameters();
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(315);
				match(EXTENDS);
				setState(316);
				typeType();
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(319);
				match(IMPLEMENTS);
				setState(320);
				typeList();
				}
			}

			setState(323);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
					modifier();
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassLikeKeyWordContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaQueryParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaQueryParser.INTERFACE, 0); }
		public TerminalNode ENUM() { return getToken(JavaQueryParser.ENUM, 0); }
		public TerminalNode AT() { return getToken(JavaQueryParser.AT, 0); }
		public ClassLikeKeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classLikeKeyWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassLikeKeyWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassLikeKeyWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassLikeKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassLikeKeyWordContext classLikeKeyWord() throws RecognitionException {
		ClassLikeKeyWordContext _localctx = new ClassLikeKeyWordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classLikeKeyWord);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(CLASS);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(INTERFACE);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(ENUM);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(AT);
				setState(335);
				match(INTERFACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaQueryParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			modifiers();
			setState(339);
			typeTypeOrVoid();
			setState(340);
			identifier();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(341);
				match(ASSIGN);
				setState(342);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaQueryParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			modifiers();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(346);
				typeParameters();
				}
			}

			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(349);
				typeTypeOrVoid();
				}
				break;
			}
			setState(352);
			identifier();
			setState(353);
			match(LPAREN);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(354);
				formalParameterList();
				}
			}

			setState(357);
			match(RPAREN);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(358);
				match(THROWS);
				setState(359);
				qualifiedNameList();
				}
			}

			setState(362);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaQueryParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaQueryParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaQueryParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaQueryParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(IMPORT);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(365);
				match(STATIC);
				}
			}

			setState(368);
			qualifiedName();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(369);
				match(DOT);
				setState(370);
				match(MUL);
				}
			}

			setState(373);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaQueryParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaQueryParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaQueryParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaQueryParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifier);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaQueryParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaQueryParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaQueryParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaQueryParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaQueryParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaQueryParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaQueryParser.STRICTFP, 0); }
		public TerminalNode SEALED() { return getToken(JavaQueryParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(JavaQueryParser.NON_SEALED, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classOrInterfaceModifier);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				match(STATIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				match(ABSTRACT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				match(FINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(389);
				match(STRICTFP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(390);
				match(SEALED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(391);
				match(NON_SEALED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaQueryParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableModifier);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(FINAL);
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaQueryParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaQueryParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaQueryParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaQueryParser.PERMITS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(CLASS);
			setState(399);
			identifier();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(400);
				typeParameters();
				}
			}

			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(403);
				match(EXTENDS);
				setState(404);
				typeType();
				}
			}

			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(407);
				match(IMPLEMENTS);
				setState(408);
				typeList();
				}
			}

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(411);
				match(PERMITS);
				setState(412);
				typeList();
				}
			}

			setState(415);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaQueryParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaQueryParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(LT);
			setState(418);
			typeParameter();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(419);
				match(COMMA);
				setState(420);
				typeParameter();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaQueryParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(428);
					annotation();
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(434);
			identifier();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(435);
				match(EXTENDS);
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(436);
						annotation();
						}
						} 
					}
					setState(441);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(442);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaQueryParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaQueryParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			typeType();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(446);
				match(BITAND);
				setState(447);
				typeType();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaQueryParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaQueryParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaQueryParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(ENUM);
			setState(454);
			identifier();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(455);
				match(IMPLEMENTS);
				setState(456);
				typeList();
				}
			}

			setState(459);
			match(LBRACE);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(460);
				enumConstants();
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(463);
				match(COMMA);
				}
			}

			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(466);
				enumBodyDeclarations();
				}
			}

			setState(469);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			enumConstant();
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472);
					match(COMMA);
					setState(473);
					enumConstant();
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					annotation();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(485);
			identifier();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(486);
				arguments();
				}
			}

			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(489);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(SEMI);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOID - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(493);
				classBodyDeclaration();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaQueryParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaQueryParser.EXTENDS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaQueryParser.PERMITS, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(INTERFACE);
			setState(500);
			identifier();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(501);
				typeParameters();
				}
			}

			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(504);
				match(EXTENDS);
				setState(505);
				typeList();
				}
			}

			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(508);
				match(PERMITS);
				setState(509);
				typeList();
				}
			}

			setState(512);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(LBRACE);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOID - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(515);
				classBodyDeclaration();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(LBRACE);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DEFAULT - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOID - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(524);
				interfaceBodyDeclaration();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaQueryParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(533);
					match(STATIC);
					}
				}

				setState(536);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(537);
						modifier();
						}
						} 
					}
					setState(542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(543);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_memberDeclaration);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(549);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(551);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(553);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(554);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(555);
				recordDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaQueryParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaQueryParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaQueryParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaQueryParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaQueryParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			typeTypeOrVoid();
			setState(559);
			identifier();
			setState(560);
			formalParameters();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(561);
				match(LBRACK);
				setState(562);
				match(RBRACK);
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(568);
				match(THROWS);
				setState(569);
				qualifiedNameList();
				}
			}

			setState(572);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodBody);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaQueryParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeTypeOrVoid);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			typeParameters();
			setState(583);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			typeParameters();
			setState(586);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaQueryParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			identifier();
			setState(589);
			formalParameters();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(590);
				match(THROWS);
				setState(591);
				qualifiedNameList();
				}
			}

			setState(594);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			typeType();
			setState(597);
			variableDeclarators();
			setState(598);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600);
						modifier();
						}
						} 
					}
					setState(605);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(606);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceMemberDeclaration);
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(614);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(615);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(616);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(617);
				recordDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			typeType();
			setState(621);
			constantDeclarator();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(622);
				match(COMMA);
				setState(623);
				constantDeclarator();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaQueryParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaQueryParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaQueryParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaQueryParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaQueryParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			identifier();
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(632);
				match(LBRACK);
				setState(633);
				match(RBRACK);
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(639);
			match(ASSIGN);
			setState(640);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					interfaceMethodModifier();
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(648);
			interfaceCommonBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaQueryParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaQueryParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaQueryParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaQueryParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaQueryParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_interfaceMethodModifier);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(655);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_genericInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (DEFAULT - 2)) | (1L << (PUBLIC - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(658);
				interfaceMethodModifier();
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			typeParameters();
			setState(665);
			interfaceCommonBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceCommonBodyDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaQueryParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaQueryParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaQueryParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaQueryParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaQueryParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCommonBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterInterfaceCommonBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitInterfaceCommonBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitInterfaceCommonBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() throws RecognitionException {
		InterfaceCommonBodyDeclarationContext _localctx = new InterfaceCommonBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_interfaceCommonBodyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
					annotation();
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(673);
			typeTypeOrVoid();
			setState(674);
			identifier();
			setState(675);
			formalParameters();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(676);
				match(LBRACK);
				setState(677);
				match(RBRACK);
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(683);
				match(THROWS);
				setState(684);
				qualifiedNameList();
				}
			}

			setState(687);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			variableDeclarator();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(690);
				match(COMMA);
				setState(691);
				variableDeclarator();
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaQueryParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			variableDeclaratorId();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(698);
				match(ASSIGN);
				setState(699);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaQueryParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaQueryParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaQueryParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaQueryParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			identifier();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(703);
				match(LBRACK);
				setState(704);
				match(RBRACK);
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableInitializer);
		try {
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(LBRACE);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LBRACE - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(715);
				variableInitializer();
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(716);
						match(COMMA);
						setState(717);
						variableInitializer();
						}
						} 
					}
					setState(722);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(723);
					match(COMMA);
					}
				}

				}
			}

			setState(728);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaQueryParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaQueryParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			identifier();
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(731);
				typeArguments();
				}
				break;
			}
			setState(741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(734);
					match(DOT);
					setState(735);
					identifier();
					setState(737);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(736);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaQueryParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaQueryParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaQueryParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeArgument);
		int _la;
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(745);
					annotation();
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(751);
				match(QUESTION);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(752);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(753);
					typeType();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			qualifiedName();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(759);
				match(COMMA);
				setState(760);
				qualifiedName();
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaQueryParser.COMMA, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(LPAREN);
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(767);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(770);
				receiverParameter();
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(771);
					match(COMMA);
					setState(772);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(775);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(780);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaQueryParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaQueryParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaQueryParser.DOT, i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			typeType();
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(783);
				identifier();
				setState(784);
				match(DOT);
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				formalParameter();
				setState(798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(794);
						match(COMMA);
						setState(795);
						formalParameter();
						}
						} 
					}
					setState(800);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(801);
					match(COMMA);
					setState(802);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(808);
					variableModifier();
					}
					} 
				}
				setState(813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(814);
			typeType();
			setState(815);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaQueryParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(817);
					variableModifier();
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(823);
			typeType();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(824);
				annotation();
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(830);
			match(ELLIPSIS);
			setState(831);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLVTIListContext extends ParserRuleContext {
		public List<LambdaLVTIParameterContext> lambdaLVTIParameter() {
			return getRuleContexts(LambdaLVTIParameterContext.class);
		}
		public LambdaLVTIParameterContext lambdaLVTIParameter(int i) {
			return getRuleContext(LambdaLVTIParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public LambdaLVTIListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLambdaLVTIList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLambdaLVTIList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLambdaLVTIList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaLVTIListContext lambdaLVTIList() throws RecognitionException {
		LambdaLVTIListContext _localctx = new LambdaLVTIListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lambdaLVTIList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			lambdaLVTIParameter();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(834);
				match(COMMA);
				setState(835);
				lambdaLVTIParameter();
				}
				}
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLVTIParameterContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaQueryParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LambdaLVTIParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLambdaLVTIParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLambdaLVTIParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLambdaLVTIParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaLVTIParameterContext lambdaLVTIParameter() throws RecognitionException {
		LambdaLVTIParameterContext _localctx = new LambdaLVTIParameterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lambdaLVTIParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(841);
					variableModifier();
					}
					} 
				}
				setState(846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(847);
			match(VAR);
			setState(848);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaQueryParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaQueryParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			identifier();
			setState(855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(851);
					match(DOT);
					setState(852);
					identifier();
					}
					} 
				}
				setState(857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JavaQueryParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaQueryParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JavaQueryParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JavaQueryParser.NULL_LITERAL, 0); }
		public TerminalNode TEXT_BLOCK() { return getToken(JavaQueryParser.TEXT_BLOCK, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(860);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(861);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(862);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(863);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(864);
				match(TEXT_BLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaQueryParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaQueryParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaQueryParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaQueryParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaQueryParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaQueryParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaQueryParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaQueryParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaQueryParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAltAnnotationQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAltAnnotationQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAltAnnotationQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(871);
				identifier();
				setState(872);
				match(DOT);
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(879);
			match(AT);
			setState(880);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaQueryParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(882);
				match(AT);
				setState(883);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(884);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(887);
				match(LPAREN);
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(888);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(889);
					elementValue();
					}
					break;
				}
				setState(892);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			elementValuePair();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(896);
				match(COMMA);
				setState(897);
				elementValuePair();
				}
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaQueryParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			identifier();
			setState(904);
			match(ASSIGN);
			setState(905);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementValue);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(LBRACE);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LBRACE - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(913);
				elementValue();
				setState(918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(914);
						match(COMMA);
						setState(915);
						elementValue();
						}
						} 
					}
					setState(920);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
			}

			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(923);
				match(COMMA);
				}
			}

			setState(926);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaQueryParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaQueryParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(AT);
			setState(929);
			match(INTERFACE);
			setState(930);
			identifier();
			setState(931);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(LBRACE);
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (SEMI - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(934);
				annotationTypeElementDeclaration();
				}
				}
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(942);
						modifier();
						}
						} 
					}
					setState(947);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				setState(948);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotationTypeElementRest);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				typeType();
				setState(953);
				annotationMethodOrConstantRest();
				setState(954);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				classDeclaration();
				setState(958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(957);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				interfaceDeclaration();
				setState(962);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(961);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(964);
				enumDeclaration();
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(965);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				annotationTypeDeclaration();
				setState(970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(969);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(972);
				recordDeclaration();
				setState(974);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(973);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotationMethodOrConstantRest);
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			identifier();
			setState(983);
			match(LPAREN);
			setState(984);
			match(RPAREN);
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(985);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaQueryParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(DEFAULT);
			setState(991);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(JavaQueryParser.MODULE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(JavaQueryParser.OPEN, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(993);
				match(OPEN);
				}
			}

			setState(996);
			match(MODULE);
			setState(997);
			qualifiedName();
			setState(998);
			moduleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}
		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class,i);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitModuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitModuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(LBRACE);
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << USES) | (1L << PROVIDES))) != 0)) {
				{
				{
				setState(1001);
				moduleDirective();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public TerminalNode REQUIRES() { return getToken(JavaQueryParser.REQUIRES, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public List<RequiresModifierContext> requiresModifier() {
			return getRuleContexts(RequiresModifierContext.class);
		}
		public RequiresModifierContext requiresModifier(int i) {
			return getRuleContext(RequiresModifierContext.class,i);
		}
		public TerminalNode EXPORTS() { return getToken(JavaQueryParser.EXPORTS, 0); }
		public TerminalNode TO() { return getToken(JavaQueryParser.TO, 0); }
		public TerminalNode OPENS() { return getToken(JavaQueryParser.OPENS, 0); }
		public TerminalNode USES() { return getToken(JavaQueryParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaQueryParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaQueryParser.WITH, 0); }
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterModuleDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitModuleDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitModuleDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_moduleDirective);
		int _la;
		try {
			int _alt;
			setState(1045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				match(REQUIRES);
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1010);
						requiresModifier();
						}
						} 
					}
					setState(1015);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(1016);
				qualifiedName();
				setState(1017);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(EXPORTS);
				setState(1020);
				qualifiedName();
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1021);
					match(TO);
					setState(1022);
					qualifiedName();
					}
				}

				setState(1025);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1027);
				match(OPENS);
				setState(1028);
				qualifiedName();
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1029);
					match(TO);
					setState(1030);
					qualifiedName();
					}
				}

				setState(1033);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1035);
				match(USES);
				setState(1036);
				qualifiedName();
				setState(1037);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1039);
				match(PROVIDES);
				setState(1040);
				qualifiedName();
				setState(1041);
				match(WITH);
				setState(1042);
				qualifiedName();
				setState(1043);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiresModifierContext extends ParserRuleContext {
		public TerminalNode TRANSITIVE() { return getToken(JavaQueryParser.TRANSITIVE, 0); }
		public TerminalNode STATIC() { return getToken(JavaQueryParser.STATIC, 0); }
		public RequiresModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiresModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterRequiresModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitRequiresModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitRequiresModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiresModifierContext requiresModifier() throws RecognitionException {
		RequiresModifierContext _localctx = new RequiresModifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_requiresModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_la = _input.LA(1);
			if ( !(_la==STATIC || _la==TRANSITIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordDeclarationContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(JavaQueryParser.RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordHeaderContext recordHeader() {
			return getRuleContext(RecordHeaderContext.class,0);
		}
		public RecordBodyContext recordBody() {
			return getRuleContext(RecordBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaQueryParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitRecordDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitRecordDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(RECORD);
			setState(1050);
			identifier();
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1051);
				typeParameters();
				}
			}

			setState(1054);
			recordHeader();
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1055);
				match(IMPLEMENTS);
				setState(1056);
				typeList();
				}
			}

			setState(1059);
			recordBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordHeaderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public RecordComponentListContext recordComponentList() {
			return getRuleContext(RecordComponentListContext.class,0);
		}
		public RecordHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterRecordHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitRecordHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitRecordHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordHeaderContext recordHeader() throws RecognitionException {
		RecordHeaderContext _localctx = new RecordHeaderContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(LPAREN);
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(1062);
				recordComponentList();
				}
			}

			setState(1065);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordComponentListContext extends ParserRuleContext {
		public List<RecordComponentContext> recordComponent() {
			return getRuleContexts(RecordComponentContext.class);
		}
		public RecordComponentContext recordComponent(int i) {
			return getRuleContext(RecordComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public RecordComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterRecordComponentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitRecordComponentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitRecordComponentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentListContext recordComponentList() throws RecognitionException {
		RecordComponentListContext _localctx = new RecordComponentListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			recordComponent();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1068);
				match(COMMA);
				setState(1069);
				recordComponent();
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordComponentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterRecordComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitRecordComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitRecordComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_recordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			typeType();
			setState(1076);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterRecordBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitRecordBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitRecordBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_recordBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(LBRACE);
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOID - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(1079);
				classBodyDeclaration();
				}
				}
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1085);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<SubQueryContext> subQuery() {
			return getRuleContexts(SubQueryContext.class);
		}
		public SubQueryContext subQuery(int i) {
			return getRuleContext(SubQueryContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			match(LBRACE);
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CASE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << MODULE) | (1L << OPEN) | (1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << TO) | (1L << USES) | (1L << PROVIDES) | (1L << WITH) | (1L << TRANSITIVE) | (1L << VAR) | (1L << YIELD))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RECORD - 64)) | (1L << (SEALED - 64)) | (1L << (PERMITS - 64)) | (1L << (NON_SEALED - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (OCT_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOAT_LITERAL - 64)) | (1L << (HEX_FLOAT_LITERAL - 64)) | (1L << (BOOL_LITERAL - 64)) | (1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1088);
				subQuery();
				}
				}
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1094);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_blockStatement);
		try {
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				localVariableDeclaration();
				setState(1097);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1100);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaQueryParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaQueryParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1103);
					variableModifier();
					}
					} 
				}
				setState(1108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1109);
				typeType();
				setState(1110);
				variableDeclarators();
				}
				break;
			case 2:
				{
				setState(1112);
				match(VAR);
				setState(1113);
				identifier();
				setState(1114);
				match(ASSIGN);
				setState(1115);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaQueryParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(JavaQueryParser.MODULE, 0); }
		public TerminalNode OPEN() { return getToken(JavaQueryParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(JavaQueryParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(JavaQueryParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(JavaQueryParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(JavaQueryParser.TO, 0); }
		public TerminalNode USES() { return getToken(JavaQueryParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaQueryParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaQueryParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(JavaQueryParser.TRANSITIVE, 0); }
		public TerminalNode YIELD() { return getToken(JavaQueryParser.YIELD, 0); }
		public TerminalNode SEALED() { return getToken(JavaQueryParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(JavaQueryParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(JavaQueryParser.RECORD, 0); }
		public TerminalNode VAR() { return getToken(JavaQueryParser.VAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLocalTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_localTypeDeclaration);
		try {
			int _alt;
			setState(1133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1121);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(1130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1127);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1128);
					interfaceDeclaration();
					}
					break;
				case RECORD:
					{
					setState(1129);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssertStmtContext assertStmt() {
			return getRuleContext(AssertStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public DoWhileStmtContext doWhileStmt() {
			return getRuleContext(DoWhileStmtContext.class,0);
		}
		public TryStmtContext tryStmt() {
			return getRuleContext(TryStmtContext.class,0);
		}
		public TryWithRescourceContext tryWithRescource() {
			return getRuleContext(TryWithRescourceContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public SynchronizedStmtContext synchronizedStmt() {
			return getRuleContext(SynchronizedStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public ThrowStmtContext throwStmt() {
			return getRuleContext(ThrowStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public YieldStmtContext yieldStmt() {
			return getRuleContext(YieldStmtContext.class,0);
		}
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchExpStmtContext switchExpStmt() {
			return getRuleContext(SwitchExpStmtContext.class,0);
		}
		public LabelStmtContext labelStmt() {
			return getRuleContext(LabelStmtContext.class,0);
		}
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_statement);
		try {
			setState(1157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				assertStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1137);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1138);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1139);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1140);
				doWhileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1141);
				tryStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1142);
				tryWithRescource();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1143);
				switchStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1144);
				synchronizedStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1145);
				returnStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1146);
				throwStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1147);
				breakStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1148);
				continueStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1149);
				yieldStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1150);
				emptyStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1151);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1152);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1154);
				switchExpStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1155);
				labelStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1156);
				caseStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(JavaQueryParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaQueryParser.COLON, 0); }
		public AssertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterAssertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitAssertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitAssertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStmtContext assertStmt() throws RecognitionException {
		AssertStmtContext _localctx = new AssertStmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(ASSERT);
			setState(1160);
			expression(0);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1161);
				match(COLON);
				setState(1162);
				expression(0);
				}
			}

			setState(1165);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaQueryParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaQueryParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(IF);
			setState(1168);
			parExpression();
			setState(1169);
			block();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1170);
				match(ELSE);
				setState(1171);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaQueryParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(FOR);
			setState(1175);
			match(LPAREN);
			setState(1176);
			forControl();
			setState(1177);
			match(RPAREN);
			setState(1178);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaQueryParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(WHILE);
			setState(1181);
			parExpression();
			setState(1182);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JavaQueryParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaQueryParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public DoWhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitDoWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStmtContext doWhileStmt() throws RecognitionException {
		DoWhileStmtContext _localctx = new DoWhileStmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(DO);
			setState(1185);
			block();
			setState(1186);
			match(WHILE);
			setState(1187);
			parExpression();
			setState(1188);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JavaQueryParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStmtContext tryStmt() throws RecognitionException {
		TryStmtContext _localctx = new TryStmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tryStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(TRY);
			setState(1191);
			block();
			setState(1201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATCH:
				{
				setState(1193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1192);
					catchClause();
					}
					}
					setState(1195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1197);
					finallyBlock();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(1200);
				finallyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithRescourceContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JavaQueryParser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryWithRescourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithRescource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTryWithRescource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTryWithRescource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTryWithRescource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithRescourceContext tryWithRescource() throws RecognitionException {
		TryWithRescourceContext _localctx = new TryWithRescourceContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tryWithRescource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(TRY);
			setState(1204);
			resourceSpecification();
			setState(1205);
			block();
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1206);
				catchClause();
				}
				}
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1212);
				finallyBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaQueryParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_switchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			match(SWITCH);
			setState(1216);
			parExpression();
			setState(1217);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStmtContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(JavaQueryParser.SYNCHRONIZED, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSynchronizedStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSynchronizedStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSynchronizedStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStmtContext synchronizedStmt() throws RecognitionException {
		SynchronizedStmtContext _localctx = new SynchronizedStmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_synchronizedStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(SYNCHRONIZED);
			setState(1220);
			parExpression();
			setState(1221);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaQueryParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(RETURN);
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1224);
				expression(0);
				}
			}

			setState(1227);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStmtContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(JavaQueryParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public ThrowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterThrowStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitThrowStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitThrowStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStmtContext throwStmt() throws RecognitionException {
		ThrowStmtContext _localctx = new ThrowStmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_throwStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(THROW);
			setState(1230);
			expression(0);
			setState(1231);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JavaQueryParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(BREAK);
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1234);
				identifier();
				}
			}

			setState(1237);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JavaQueryParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(CONTINUE);
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1240);
				identifier();
				}
			}

			setState(1243);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldStmtContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(JavaQueryParser.YIELD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public YieldStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterYieldStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitYieldStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitYieldStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStmtContext yieldStmt() throws RecognitionException {
		YieldStmtContext _localctx = new YieldStmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_yieldStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(YIELD);
			setState(1246);
			expression(0);
			setState(1247);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchExpStmtContext extends ParserRuleContext {
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public SwitchExpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSwitchExpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSwitchExpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSwitchExpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExpStmtContext switchExpStmt() throws RecognitionException {
		SwitchExpStmtContext _localctx = new SwitchExpStmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_switchExpStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			switchExpression();
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1252);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelStmtContext extends ParserRuleContext {
		public IdentifierContext identifierLabel;
		public TerminalNode COLON() { return getToken(JavaQueryParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLabelStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLabelStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLabelStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelStmtContext labelStmt() throws RecognitionException {
		LabelStmtContext _localctx = new LabelStmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_labelStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			((LabelStmtContext)_localctx).identifierLabel = identifier();
			setState(1256);
			match(COLON);
			setState(1257);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaQueryParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaQueryParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitCaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitCaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_caseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(CASE);
			setState(1260);
			expression(0);
			setState(1261);
			match(COLON);
			setState(1262);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaQueryParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(CATCH);
			setState(1265);
			match(LPAREN);
			setState(1269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1266);
					variableModifier();
					}
					} 
				}
				setState(1271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			setState(1272);
			catchType();
			setState(1273);
			identifier();
			setState(1274);
			match(RPAREN);
			setState(1275);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaQueryParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaQueryParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			qualifiedName();
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1278);
				match(BITOR);
				setState(1279);
				qualifiedName();
				}
				}
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaQueryParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(FINALLY);
			setState(1286);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaQueryParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(LPAREN);
			setState(1289);
			resources();
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1290);
				match(SEMI);
				}
			}

			setState(1293);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaQueryParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaQueryParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			resource();
			setState(1300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1296);
					match(SEMI);
					setState(1297);
					resource();
					}
					} 
				}
				setState(1302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaQueryParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaQueryParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_resource);
		try {
			int _alt;
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1303);
						variableModifier();
						}
						} 
					}
					setState(1308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1309);
					classOrInterfaceType();
					setState(1310);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1312);
					match(VAR);
					setState(1313);
					identifier();
					}
					break;
				}
				setState(1316);
				match(ASSIGN);
				setState(1317);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1323); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1322);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1325); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1327);
				blockStatement();
				}
				}
				setState(1330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (ASSERT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BREAK - 2)) | (1L << (BYTE - 2)) | (1L << (CASE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (CONTINUE - 2)) | (1L << (DO - 2)) | (1L << (DOUBLE - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NEW - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (RETURN - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SUPER - 2)) | (1L << (SWITCH - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (THIS - 2)) | (1L << (THROW - 2)) | (1L << (TRY - 2)) | (1L << (VOID - 2)) | (1L << (WHILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)) | (1L << (TEXT_BLOCK - 66)) | (1L << (NULL_LITERAL - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public IdentifierContext varName;
		public TerminalNode CASE() { return getToken(JavaQueryParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaQueryParser.COLON, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaQueryParser.IDENTIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaQueryParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_switchLabel);
		try {
			setState(1343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				match(CASE);
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1333);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1334);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1335);
					typeType();
					setState(1336);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1340);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				match(DEFAULT);
				setState(1342);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaQueryParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaQueryParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_forControl);
		int _la;
		try {
			setState(1357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1346);
					forInit();
					}
				}

				setState(1349);
				match(SEMI);
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1350);
					expression(0);
					}
				}

				setState(1353);
				match(SEMI);
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1354);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_forInit);
		try {
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaQueryParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaQueryParser.VAR, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1363);
					variableModifier();
					}
					} 
				}
				setState(1368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			setState(1371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1369);
				typeType();
				}
				break;
			case 2:
				{
				setState(1370);
				match(VAR);
				}
				break;
			}
			setState(1373);
			variableDeclaratorId();
			setState(1374);
			match(COLON);
			setState(1375);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_parExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(LPAREN);
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1378);
				expression(0);
				}
			}

			setState(1381);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			expression(0);
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1384);
				match(COMMA);
				setState(1385);
				expression(0);
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaQueryParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaQueryParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_methodCall);
		int _la;
		try {
			setState(1410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				identifier();
				setState(1392);
				match(LPAREN);
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1393);
					expressionList();
					}
				}

				setState(1396);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				match(THIS);
				setState(1399);
				match(LPAREN);
				setState(1401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1400);
					expressionList();
					}
				}

				setState(1403);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1404);
				match(SUPER);
				setState(1405);
				match(LPAREN);
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1406);
					expressionList();
					}
				}

				setState(1409);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaQueryParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaQueryParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaQueryParser.BITAND, i);
		}
		public TerminalNode ADD() { return getToken(JavaQueryParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaQueryParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaQueryParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaQueryParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(JavaQueryParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JavaQueryParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(JavaQueryParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JavaQueryParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaQueryParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaQueryParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JavaQueryParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaQueryParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaQueryParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaQueryParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JavaQueryParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaQueryParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaQueryParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaQueryParser.NOTEQUAL, 0); }
		public TerminalNode CARET() { return getToken(JavaQueryParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JavaQueryParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(JavaQueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaQueryParser.OR, 0); }
		public TerminalNode COLON() { return getToken(JavaQueryParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaQueryParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaQueryParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaQueryParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaQueryParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaQueryParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaQueryParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaQueryParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaQueryParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaQueryParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaQueryParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaQueryParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaQueryParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaQueryParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(JavaQueryParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(JavaQueryParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaQueryParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaQueryParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaQueryParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JavaQueryParser.INSTANCEOF, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1413);
				primary();
				}
				break;
			case 2:
				{
				setState(1414);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1415);
				match(NEW);
				setState(1416);
				creator();
				}
				break;
			case 4:
				{
				setState(1417);
				match(LPAREN);
				setState(1421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1418);
						annotation();
						}
						} 
					}
					setState(1423);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				setState(1424);
				typeType();
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1425);
					match(BITAND);
					setState(1426);
					typeType();
					}
					}
					setState(1431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1432);
				match(RPAREN);
				setState(1433);
				expression(22);
				}
				break;
			case 5:
				{
				setState(1435);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (INC - 101)) | (1L << (DEC - 101)) | (1L << (ADD - 101)) | (1L << (SUB - 101)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1436);
				expression(20);
				}
				break;
			case 6:
				{
				setState(1437);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1438);
				expression(19);
				}
				break;
			case 7:
				{
				setState(1439);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1440);
				switchExpression();
				}
				break;
			case 9:
				{
				setState(1441);
				typeType();
				setState(1442);
				match(COLONCOLON);
				setState(1448);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case LT:
				case IDENTIFIER:
					{
					setState(1444);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1443);
						typeArguments();
						}
					}

					setState(1446);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1447);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				{
				setState(1450);
				classType();
				setState(1451);
				match(COLONCOLON);
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1452);
					typeArguments();
					}
				}

				setState(1455);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1540);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1459);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1460);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (MUL - 105)) | (1L << (DIV - 105)) | (1L << (MOD - 105)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1461);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1462);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1463);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1464);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1465);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1473);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1466);
							match(LT);
							setState(1467);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1468);
							match(GT);
							setState(1469);
							match(GT);
							setState(1470);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1471);
							match(GT);
							setState(1472);
							match(GT);
							}
							break;
						}
						setState(1475);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1476);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1477);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (GT - 89)) | (1L << (LT - 89)) | (1L << (LE - 89)) | (1L << (GE - 89)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1478);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1479);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1480);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1481);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1482);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1483);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1484);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1485);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1486);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1487);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1488);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1489);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1490);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1491);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1492);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1493);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1494);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1495);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1496);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1497);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1498);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1499);
						expression(0);
						setState(1500);
						match(COLON);
						setState(1501);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1503);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1504);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (ASSIGN - 88)) | (1L << (ADD_ASSIGN - 88)) | (1L << (SUB_ASSIGN - 88)) | (1L << (MUL_ASSIGN - 88)) | (1L << (DIV_ASSIGN - 88)) | (1L << (AND_ASSIGN - 88)) | (1L << (OR_ASSIGN - 88)) | (1L << (XOR_ASSIGN - 88)) | (1L << (MOD_ASSIGN - 88)) | (1L << (LSHIFT_ASSIGN - 88)) | (1L << (RSHIFT_ASSIGN - 88)) | (1L << (URSHIFT_ASSIGN - 88)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1505);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1506);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1507);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1519);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1508);
							identifier();
							}
							break;
						case 2:
							{
							setState(1509);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1510);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1511);
							match(NEW);
							setState(1513);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1512);
								nonWildcardTypeArguments();
								}
							}

							setState(1515);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1516);
							match(SUPER);
							setState(1517);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1518);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1521);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1522);
						match(LBRACK);
						setState(1523);
						expression(0);
						setState(1524);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1526);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1527);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1528);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1529);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1532);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(1530);
							typeType();
							}
							break;
						case 2:
							{
							setState(1531);
							pattern();
							}
							break;
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1534);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1535);
						match(COLONCOLON);
						setState(1537);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1536);
							typeArguments();
							}
						}

						setState(1539);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1545);
					variableModifier();
					}
					} 
				}
				setState(1550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			setState(1551);
			typeType();
			setState(1555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1552);
					annotation();
					}
					} 
				}
				setState(1557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			setState(1558);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaQueryParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			lambdaParameters();
			setState(1561);
			match(ARROW);
			setState(1562);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public LambdaLVTIListContext lambdaLVTIList() {
			return getRuleContext(LambdaLVTIListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_lambdaParameters);
		int _la;
		try {
			setState(1586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				match(LPAREN);
				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1566);
					formalParameterList();
					}
				}

				setState(1569);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1570);
				match(LPAREN);
				setState(1571);
				identifier();
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1572);
					match(COMMA);
					setState(1573);
					identifier();
					}
					}
					setState(1578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1579);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1581);
				match(LPAREN);
				setState(1583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (FINAL - 19)) | (1L << (MODULE - 19)) | (1L << (OPEN - 19)) | (1L << (REQUIRES - 19)) | (1L << (EXPORTS - 19)) | (1L << (OPENS - 19)) | (1L << (TO - 19)) | (1L << (USES - 19)) | (1L << (PROVIDES - 19)) | (1L << (WITH - 19)) | (1L << (TRANSITIVE - 19)) | (1L << (VAR - 19)) | (1L << (YIELD - 19)) | (1L << (RECORD - 19)) | (1L << (SEALED - 19)) | (1L << (PERMITS - 19)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1582);
					lambdaLVTIList();
					}
				}

				setState(1585);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_lambdaBody);
		try {
			setState(1590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1588);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaQueryParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaQueryParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaQueryParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaQueryParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_primary);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				match(LPAREN);
				setState(1593);
				expression(0);
				setState(1594);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1597);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1598);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1599);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1600);
				typeTypeOrVoid();
				setState(1601);
				match(DOT);
				setState(1602);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1604);
				nonWildcardTypeArguments();
				setState(1608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case IDENTIFIER:
					{
					setState(1605);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1606);
					match(THIS);
					setState(1607);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchExpressionContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaQueryParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaQueryParser.RBRACE, 0); }
		public List<SwitchLabeledRuleContext> switchLabeledRule() {
			return getRuleContexts(SwitchLabeledRuleContext.class);
		}
		public SwitchLabeledRuleContext switchLabeledRule(int i) {
			return getRuleContext(SwitchLabeledRuleContext.class,i);
		}
		public SwitchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSwitchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSwitchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSwitchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExpressionContext switchExpression() throws RecognitionException {
		SwitchExpressionContext _localctx = new SwitchExpressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(SWITCH);
			setState(1613);
			parExpression();
			setState(1614);
			match(LBRACE);
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1615);
				switchLabeledRule();
				}
				}
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1621);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabeledRuleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaQueryParser.CASE, 0); }
		public SwitchRuleOutcomeContext switchRuleOutcome() {
			return getRuleContext(SwitchRuleOutcomeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaQueryParser.ARROW, 0); }
		public TerminalNode COLON() { return getToken(JavaQueryParser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NULL_LITERAL() { return getToken(JavaQueryParser.NULL_LITERAL, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaQueryParser.DEFAULT, 0); }
		public SwitchLabeledRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSwitchLabeledRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSwitchLabeledRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSwitchLabeledRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabeledRuleContext switchLabeledRule() throws RecognitionException {
		SwitchLabeledRuleContext _localctx = new SwitchLabeledRuleContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_switchLabeledRule);
		int _la;
		try {
			setState(1634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1623);
				match(CASE);
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1624);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1625);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1626);
					guardedPattern(0);
					}
					break;
				}
				setState(1629);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1630);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
				match(DEFAULT);
				setState(1632);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1633);
				switchRuleOutcome();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaQueryParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaQueryParser.AND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GuardedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterGuardedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitGuardedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitGuardedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardedPatternContext guardedPattern() throws RecognitionException {
		return guardedPattern(0);
	}

	private GuardedPatternContext guardedPattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GuardedPatternContext _localctx = new GuardedPatternContext(_ctx, _parentState);
		GuardedPatternContext _prevctx = _localctx;
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_guardedPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1637);
				match(LPAREN);
				setState(1638);
				guardedPattern(0);
				setState(1639);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				{
				setState(1644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1641);
						variableModifier();
						}
						} 
					}
					setState(1646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				setState(1647);
				typeType();
				setState(1651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1648);
						annotation();
						}
						} 
					}
					setState(1653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1654);
				identifier();
				setState(1659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1655);
						match(AND);
						setState(1656);
						expression(0);
						}
						} 
					}
					setState(1661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1664);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1665);
					match(AND);
					setState(1666);
					expression(0);
					}
					} 
				}
				setState(1671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SwitchRuleOutcomeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchRuleOutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchRuleOutcome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSwitchRuleOutcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSwitchRuleOutcome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSwitchRuleOutcome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchRuleOutcomeContext switchRuleOutcome() throws RecognitionException {
		SwitchRuleOutcomeContext _localctx = new SwitchRuleOutcomeContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_switchRuleOutcome);
		try {
			int _alt;
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1673);
						blockStatement();
						}
						} 
					}
					setState(1678);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaQueryParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1681);
				classOrInterfaceType();
				setState(1682);
				match(DOT);
				}
				break;
			}
			setState(1689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1686);
					annotation();
					}
					} 
				}
				setState(1691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			setState(1692);
			identifier();
			setState(1694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1693);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_creator);
		try {
			setState(1705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1696);
				nonWildcardTypeArguments();
				setState(1697);
				createdName();
				setState(1698);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1700);
				createdName();
				setState(1703);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1701);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1702);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaQueryParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaQueryParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_createdName);
		int _la;
		try {
			setState(1722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				identifier();
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1708);
					typeArgumentsOrDiamond();
					}
				}

				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1711);
					match(DOT);
					setState(1712);
					identifier();
					setState(1714);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1713);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1721);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			identifier();
			setState(1726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1725);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1728);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaQueryParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaQueryParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaQueryParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaQueryParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			match(LBRACK);
			setState(1758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1731);
				match(RBRACK);
				setState(1736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1732);
					match(LBRACK);
					setState(1733);
					match(RBRACK);
					}
					}
					setState(1738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1739);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1740);
				expression(0);
				setState(1741);
				match(RBRACK);
				setState(1748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1742);
						match(LBRACK);
						setState(1743);
						expression(0);
						setState(1744);
						match(RBRACK);
						}
						} 
					}
					setState(1750);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				setState(1755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1751);
						match(LBRACK);
						setState(1752);
						match(RBRACK);
						}
						} 
					}
					setState(1757);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			arguments();
			setState(1762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1761);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			nonWildcardTypeArguments();
			setState(1765);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaQueryParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaQueryParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_typeArgumentsOrDiamond);
		try {
			setState(1770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1767);
				match(LT);
				setState(1768);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1769);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaQueryParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaQueryParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				match(LT);
				setState(1773);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaQueryParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaQueryParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(LT);
			setState(1778);
			typeList();
			setState(1779);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			typeType();
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1782);
				match(COMMA);
				setState(1783);
				typeType();
				}
				}
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaQueryParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaQueryParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaQueryParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaQueryParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1789);
					annotation();
					}
					} 
				}
				setState(1794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			setState(1797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				{
				setState(1795);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1796);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1802);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1799);
						annotation();
						}
						}
						setState(1804);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1805);
					match(LBRACK);
					setState(1806);
					match(RBRACK);
					}
					} 
				}
				setState(1811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaQueryParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaQueryParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaQueryParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaQueryParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaQueryParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaQueryParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaQueryParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaQueryParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaQueryParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaQueryParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaQueryParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(LT);
			setState(1815);
			typeArgument();
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1816);
				match(COMMA);
				setState(1817);
				typeArgument();
				}
				}
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1823);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaQueryParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_superSuffix);
		int _la;
		try {
			setState(1834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1825);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826);
				match(DOT);
				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1827);
					typeArguments();
					}
				}

				setState(1830);
				identifier();
				setState(1832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1831);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaQueryParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				match(SUPER);
				setState(1837);
				superSuffix();
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1838);
				identifier();
				setState(1839);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaQueryParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			match(LPAREN);
			setState(1845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1844);
				expressionList();
				}
			}

			setState(1847);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 120:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 128:
			return guardedPattern_sempred((GuardedPatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean guardedPattern_sempred(GuardedPatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0081\u073a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u012b"+
		"\b\u0000\u0001\u0001\u0003\u0001\u012e\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0135\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u013a\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u013e\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0142\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004\u0147\b\u0004\n"+
		"\u0004\f\u0004\u014a\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0151\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0158\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u015c\b\u0007\u0001\u0007\u0003\u0007\u015f\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0164\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0169\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0003\b\u016f\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0174"+
		"\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u017d"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0189\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u018d"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0192\b\f\u0001\f\u0001\f\u0003"+
		"\f\u0196\b\f\u0001\f\u0001\f\u0003\f\u019a\b\f\u0001\f\u0001\f\u0003\f"+
		"\u019e\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u01a6"+
		"\b\r\n\r\f\r\u01a9\t\r\u0001\r\u0001\r\u0001\u000e\u0005\u000e\u01ae\b"+
		"\u000e\n\u000e\f\u000e\u01b1\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u01b6\b\u000e\n\u000e\f\u000e\u01b9\t\u000e\u0001\u000e\u0003"+
		"\u000e\u01bc\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01c1"+
		"\b\u000f\n\u000f\f\u000f\u01c4\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u01ca\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u01ce\b\u0010\u0001\u0010\u0003\u0010\u01d1\b\u0010\u0001\u0010\u0003"+
		"\u0010\u01d4\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u01db\b\u0011\n\u0011\f\u0011\u01de\t\u0011\u0001\u0012"+
		"\u0005\u0012\u01e1\b\u0012\n\u0012\f\u0012\u01e4\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u01e8\b\u0012\u0001\u0012\u0003\u0012\u01eb\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u01ef\b\u0013\n\u0013\f\u0013\u01f2"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01f7\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01fb\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u01ff\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0205\b\u0015\n\u0015\f\u0015\u0208\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u020e\b\u0016\n\u0016\f\u0016"+
		"\u0211\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0217\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u021b\b\u0017\n\u0017"+
		"\f\u0017\u021e\t\u0017\u0001\u0017\u0003\u0017\u0221\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u022d\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0234\b\u0019"+
		"\n\u0019\f\u0019\u0237\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u023b"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0241"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0245\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0251\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0005"+
		" \u025a\b \n \f \u025d\t \u0001 \u0001 \u0003 \u0261\b \u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u026b\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u0271\b\"\n\"\f\"\u0274\t\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0005#\u027b\b#\n#\f#\u027e\t#\u0001#\u0001#\u0001"+
		"#\u0001$\u0005$\u0284\b$\n$\f$\u0287\t$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u0291\b%\u0001&\u0005&\u0294\b&\n&\f&\u0297"+
		"\t&\u0001&\u0001&\u0001&\u0001\'\u0005\'\u029d\b\'\n\'\f\'\u02a0\t\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u02a7\b\'\n\'\f\'\u02aa\t\'"+
		"\u0001\'\u0001\'\u0003\'\u02ae\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0005(\u02b5\b(\n(\f(\u02b8\t(\u0001)\u0001)\u0001)\u0003)\u02bd\b)"+
		"\u0001*\u0001*\u0001*\u0005*\u02c2\b*\n*\f*\u02c5\t*\u0001+\u0001+\u0003"+
		"+\u02c9\b+\u0001,\u0001,\u0001,\u0001,\u0005,\u02cf\b,\n,\f,\u02d2\t,"+
		"\u0001,\u0003,\u02d5\b,\u0003,\u02d7\b,\u0001,\u0001,\u0001-\u0001-\u0003"+
		"-\u02dd\b-\u0001-\u0001-\u0001-\u0003-\u02e2\b-\u0005-\u02e4\b-\n-\f-"+
		"\u02e7\t-\u0001.\u0001.\u0005.\u02eb\b.\n.\f.\u02ee\t.\u0001.\u0001.\u0001"+
		".\u0003.\u02f3\b.\u0003.\u02f5\b.\u0001/\u0001/\u0001/\u0005/\u02fa\b"+
		"/\n/\f/\u02fd\t/\u00010\u00010\u00030\u0301\b0\u00010\u00010\u00010\u0003"+
		"0\u0306\b0\u00010\u00030\u0309\b0\u00030\u030b\b0\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00051\u0313\b1\n1\f1\u0316\t1\u00011\u00011\u0001"+
		"2\u00012\u00012\u00052\u031d\b2\n2\f2\u0320\t2\u00012\u00012\u00032\u0324"+
		"\b2\u00012\u00032\u0327\b2\u00013\u00053\u032a\b3\n3\f3\u032d\t3\u0001"+
		"3\u00013\u00013\u00014\u00054\u0333\b4\n4\f4\u0336\t4\u00014\u00014\u0005"+
		"4\u033a\b4\n4\f4\u033d\t4\u00014\u00014\u00014\u00015\u00015\u00015\u0005"+
		"5\u0345\b5\n5\f5\u0348\t5\u00016\u00056\u034b\b6\n6\f6\u034e\t6\u0001"+
		"6\u00016\u00016\u00017\u00017\u00017\u00057\u0356\b7\n7\f7\u0359\t7\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u0362\b8\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001;\u0005;\u036b\b;\n;\f;\u036e\t;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0003<\u0376\b<\u0001<\u0001<\u0001"+
		"<\u0003<\u037b\b<\u0001<\u0003<\u037e\b<\u0001=\u0001=\u0001=\u0005=\u0383"+
		"\b=\n=\f=\u0386\t=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0003"+
		"?\u038f\b?\u0001@\u0001@\u0001@\u0001@\u0005@\u0395\b@\n@\f@\u0398\t@"+
		"\u0003@\u039a\b@\u0001@\u0003@\u039d\b@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001B\u0001B\u0005B\u03a8\bB\nB\fB\u03ab\tB\u0001B\u0001"+
		"B\u0001C\u0005C\u03b0\bC\nC\fC\u03b3\tC\u0001C\u0001C\u0003C\u03b7\bC"+
		"\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03bf\bD\u0001D\u0001"+
		"D\u0003D\u03c3\bD\u0001D\u0001D\u0003D\u03c7\bD\u0001D\u0001D\u0003D\u03cb"+
		"\bD\u0001D\u0001D\u0003D\u03cf\bD\u0003D\u03d1\bD\u0001E\u0001E\u0003"+
		"E\u03d5\bE\u0001F\u0001F\u0001F\u0001F\u0003F\u03db\bF\u0001G\u0001G\u0001"+
		"H\u0001H\u0001H\u0001I\u0003I\u03e3\bI\u0001I\u0001I\u0001I\u0001I\u0001"+
		"J\u0001J\u0005J\u03eb\bJ\nJ\fJ\u03ee\tJ\u0001J\u0001J\u0001K\u0001K\u0005"+
		"K\u03f4\bK\nK\fK\u03f7\tK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0003K\u0400\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0408"+
		"\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0003K\u0416\bK\u0001L\u0001L\u0001M\u0001M\u0001M\u0003"+
		"M\u041d\bM\u0001M\u0001M\u0001M\u0003M\u0422\bM\u0001M\u0001M\u0001N\u0001"+
		"N\u0003N\u0428\bN\u0001N\u0001N\u0001O\u0001O\u0001O\u0005O\u042f\bO\n"+
		"O\fO\u0432\tO\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0005Q\u0439\bQ\nQ\f"+
		"Q\u043c\tQ\u0001Q\u0001Q\u0001R\u0001R\u0005R\u0442\bR\nR\fR\u0445\tR"+
		"\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u044e\bS\u0001"+
		"T\u0005T\u0451\bT\nT\fT\u0454\tT\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0003T\u045e\bT\u0001U\u0001U\u0001V\u0005V\u0463\bV\n"+
		"V\fV\u0466\tV\u0001V\u0001V\u0001V\u0003V\u046b\bV\u0001V\u0003V\u046e"+
		"\bV\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0003W\u0486\bW\u0001X\u0001X\u0001X\u0001X\u0003X\u048c"+
		"\bX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u0495\bY\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0004"+
		"]\u04aa\b]\u000b]\f]\u04ab\u0001]\u0003]\u04af\b]\u0001]\u0003]\u04b2"+
		"\b]\u0001^\u0001^\u0001^\u0001^\u0005^\u04b8\b^\n^\f^\u04bb\t^\u0001^"+
		"\u0003^\u04be\b^\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001"+
		"`\u0001a\u0001a\u0003a\u04ca\ba\u0001a\u0001a\u0001b\u0001b\u0001b\u0001"+
		"b\u0001c\u0001c\u0003c\u04d4\bc\u0001c\u0001c\u0001d\u0001d\u0003d\u04da"+
		"\bd\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001f\u0001f\u0001g\u0001"+
		"g\u0003g\u04e6\bg\u0001h\u0001h\u0001h\u0001h\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001j\u0001j\u0001j\u0005j\u04f4\bj\nj\fj\u04f7\tj\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0005k\u0501\bk\nk\fk\u0504"+
		"\tk\u0001l\u0001l\u0001l\u0001m\u0001m\u0001m\u0003m\u050c\bm\u0001m\u0001"+
		"m\u0001n\u0001n\u0001n\u0005n\u0513\bn\nn\fn\u0516\tn\u0001o\u0005o\u0519"+
		"\bo\no\fo\u051c\to\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u0523\bo"+
		"\u0001o\u0001o\u0001o\u0001o\u0003o\u0529\bo\u0001p\u0004p\u052c\bp\u000b"+
		"p\fp\u052d\u0001p\u0004p\u0531\bp\u000bp\fp\u0532\u0001q\u0001q\u0001"+
		"q\u0001q\u0001q\u0001q\u0003q\u053b\bq\u0001q\u0001q\u0001q\u0003q\u0540"+
		"\bq\u0001r\u0001r\u0003r\u0544\br\u0001r\u0001r\u0003r\u0548\br\u0001"+
		"r\u0001r\u0003r\u054c\br\u0003r\u054e\br\u0001s\u0001s\u0003s\u0552\b"+
		"s\u0001t\u0005t\u0555\bt\nt\ft\u0558\tt\u0001t\u0001t\u0003t\u055c\bt"+
		"\u0001t\u0001t\u0001t\u0001t\u0001u\u0001u\u0003u\u0564\bu\u0001u\u0001"+
		"u\u0001v\u0001v\u0001v\u0005v\u056b\bv\nv\fv\u056e\tv\u0001w\u0001w\u0001"+
		"w\u0003w\u0573\bw\u0001w\u0001w\u0001w\u0001w\u0001w\u0003w\u057a\bw\u0001"+
		"w\u0001w\u0001w\u0001w\u0003w\u0580\bw\u0001w\u0003w\u0583\bw\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0005x\u058c\bx\nx\fx\u058f\tx\u0001"+
		"x\u0001x\u0001x\u0005x\u0594\bx\nx\fx\u0597\tx\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u05a5"+
		"\bx\u0001x\u0001x\u0003x\u05a9\bx\u0001x\u0001x\u0001x\u0003x\u05ae\b"+
		"x\u0001x\u0001x\u0003x\u05b2\bx\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u05c2"+
		"\bx\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u05ea"+
		"\bx\u0001x\u0001x\u0001x\u0001x\u0003x\u05f0\bx\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u05fd\bx\u0001"+
		"x\u0001x\u0001x\u0003x\u0602\bx\u0001x\u0005x\u0605\bx\nx\fx\u0608\tx"+
		"\u0001y\u0005y\u060b\by\ny\fy\u060e\ty\u0001y\u0001y\u0005y\u0612\by\n"+
		"y\fy\u0615\ty\u0001y\u0001y\u0001z\u0001z\u0001z\u0001z\u0001{\u0001{"+
		"\u0001{\u0003{\u0620\b{\u0001{\u0001{\u0001{\u0001{\u0001{\u0005{\u0627"+
		"\b{\n{\f{\u062a\t{\u0001{\u0001{\u0001{\u0001{\u0003{\u0630\b{\u0001{"+
		"\u0003{\u0633\b{\u0001|\u0001|\u0003|\u0637\b|\u0001}\u0001}\u0001}\u0001"+
		"}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001"+
		"}\u0001}\u0001}\u0003}\u0649\b}\u0003}\u064b\b}\u0001~\u0001~\u0001~\u0001"+
		"~\u0005~\u0651\b~\n~\f~\u0654\t~\u0001~\u0001~\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u007f\u0003\u007f\u065c\b\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u0663\b\u007f\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080"+
		"\u066b\b\u0080\n\u0080\f\u0080\u066e\t\u0080\u0001\u0080\u0001\u0080\u0005"+
		"\u0080\u0672\b\u0080\n\u0080\f\u0080\u0675\t\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0005\u0080\u067a\b\u0080\n\u0080\f\u0080\u067d\t\u0080\u0003"+
		"\u0080\u067f\b\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u0684"+
		"\b\u0080\n\u0080\f\u0080\u0687\t\u0080\u0001\u0081\u0001\u0081\u0005\u0081"+
		"\u068b\b\u0081\n\u0081\f\u0081\u068e\t\u0081\u0003\u0081\u0690\b\u0081"+
		"\u0001\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u0695\b\u0082\u0001\u0082"+
		"\u0005\u0082\u0698\b\u0082\n\u0082\f\u0082\u069b\t\u0082\u0001\u0082\u0001"+
		"\u0082\u0003\u0082\u069f\b\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u06a8\b\u0083\u0003"+
		"\u0083\u06aa\b\u0083\u0001\u0084\u0001\u0084\u0003\u0084\u06ae\b\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u06b3\b\u0084\u0005\u0084"+
		"\u06b5\b\u0084\n\u0084\f\u0084\u06b8\t\u0084\u0001\u0084\u0003\u0084\u06bb"+
		"\b\u0084\u0001\u0085\u0001\u0085\u0003\u0085\u06bf\b\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086"+
		"\u06c7\b\u0086\n\u0086\f\u0086\u06ca\t\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086\u06d3"+
		"\b\u0086\n\u0086\f\u0086\u06d6\t\u0086\u0001\u0086\u0001\u0086\u0005\u0086"+
		"\u06da\b\u0086\n\u0086\f\u0086\u06dd\t\u0086\u0003\u0086\u06df\b\u0086"+
		"\u0001\u0087\u0001\u0087\u0003\u0087\u06e3\b\u0087\u0001\u0088\u0001\u0088"+
		"\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u06eb\b\u0089"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u06f0\b\u008a\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008c\u0001\u008c\u0001\u008c"+
		"\u0005\u008c\u06f9\b\u008c\n\u008c\f\u008c\u06fc\t\u008c\u0001\u008d\u0005"+
		"\u008d\u06ff\b\u008d\n\u008d\f\u008d\u0702\t\u008d\u0001\u008d\u0001\u008d"+
		"\u0003\u008d\u0706\b\u008d\u0001\u008d\u0005\u008d\u0709\b\u008d\n\u008d"+
		"\f\u008d\u070c\t\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u0710\b\u008d"+
		"\n\u008d\f\u008d\u0713\t\u008d\u0001\u008e\u0001\u008e\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0005\u008f\u071b\b\u008f\n\u008f\f\u008f"+
		"\u071e\t\u008f\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0003\u0090\u0725\b\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u0729\b"+
		"\u0090\u0003\u0090\u072b\b\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0001"+
		"\u0091\u0001\u0091\u0003\u0091\u0732\b\u0091\u0001\u0092\u0001\u0092\u0003"+
		"\u0092\u0736\b\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0000\u0002\u00f0"+
		"\u0100\u0093\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0000\u000f\u0002\u0000\u0012\u0012))\u0001\u0000DG\u0001\u0000HI\u0002"+
		"\u0000\'\'==\u0002\u00004B\u0081\u0081\u0001\u0000eh\u0001\u0000[\\\u0002"+
		"\u0000ijnn\u0001\u0000gh\u0002\u0000YZ`a\u0002\u0000__bb\u0002\u0000X"+
		"Xoy\u0001\u0000ef\u0002\u0000^^zz\b\u0000\u0004\u0004\u0006\u0006\t\t"+
		"\u000f\u000f\u0015\u0015\u001c\u001c\u001e\u001e&&\u07f2\u0000\u012a\u0001"+
		"\u0000\u0000\u0000\u0002\u012d\u0001\u0000\u0000\u0000\u0004\u0134\u0001"+
		"\u0000\u0000\u0000\u0006\u0136\u0001\u0000\u0000\u0000\b\u0148\u0001\u0000"+
		"\u0000\u0000\n\u0150\u0001\u0000\u0000\u0000\f\u0152\u0001\u0000\u0000"+
		"\u0000\u000e\u0159\u0001\u0000\u0000\u0000\u0010\u016c\u0001\u0000\u0000"+
		"\u0000\u0012\u017c\u0001\u0000\u0000\u0000\u0014\u0188\u0001\u0000\u0000"+
		"\u0000\u0016\u018c\u0001\u0000\u0000\u0000\u0018\u018e\u0001\u0000\u0000"+
		"\u0000\u001a\u01a1\u0001\u0000\u0000\u0000\u001c\u01af\u0001\u0000\u0000"+
		"\u0000\u001e\u01bd\u0001\u0000\u0000\u0000 \u01c5\u0001\u0000\u0000\u0000"+
		"\"\u01d7\u0001\u0000\u0000\u0000$\u01e2\u0001\u0000\u0000\u0000&\u01ec"+
		"\u0001\u0000\u0000\u0000(\u01f3\u0001\u0000\u0000\u0000*\u0202\u0001\u0000"+
		"\u0000\u0000,\u020b\u0001\u0000\u0000\u0000.\u0220\u0001\u0000\u0000\u0000"+
		"0\u022c\u0001\u0000\u0000\u00002\u022e\u0001\u0000\u0000\u00004\u0240"+
		"\u0001\u0000\u0000\u00006\u0244\u0001\u0000\u0000\u00008\u0246\u0001\u0000"+
		"\u0000\u0000:\u0249\u0001\u0000\u0000\u0000<\u024c\u0001\u0000\u0000\u0000"+
		">\u0254\u0001\u0000\u0000\u0000@\u0260\u0001\u0000\u0000\u0000B\u026a"+
		"\u0001\u0000\u0000\u0000D\u026c\u0001\u0000\u0000\u0000F\u0277\u0001\u0000"+
		"\u0000\u0000H\u0285\u0001\u0000\u0000\u0000J\u0290\u0001\u0000\u0000\u0000"+
		"L\u0295\u0001\u0000\u0000\u0000N\u029e\u0001\u0000\u0000\u0000P\u02b1"+
		"\u0001\u0000\u0000\u0000R\u02b9\u0001\u0000\u0000\u0000T\u02be\u0001\u0000"+
		"\u0000\u0000V\u02c8\u0001\u0000\u0000\u0000X\u02ca\u0001\u0000\u0000\u0000"+
		"Z\u02da\u0001\u0000\u0000\u0000\\\u02f4\u0001\u0000\u0000\u0000^\u02f6"+
		"\u0001\u0000\u0000\u0000`\u02fe\u0001\u0000\u0000\u0000b\u030e\u0001\u0000"+
		"\u0000\u0000d\u0326\u0001\u0000\u0000\u0000f\u032b\u0001\u0000\u0000\u0000"+
		"h\u0334\u0001\u0000\u0000\u0000j\u0341\u0001\u0000\u0000\u0000l\u034c"+
		"\u0001\u0000\u0000\u0000n\u0352\u0001\u0000\u0000\u0000p\u0361\u0001\u0000"+
		"\u0000\u0000r\u0363\u0001\u0000\u0000\u0000t\u0365\u0001\u0000\u0000\u0000"+
		"v\u036c\u0001\u0000\u0000\u0000x\u0375\u0001\u0000\u0000\u0000z\u037f"+
		"\u0001\u0000\u0000\u0000|\u0387\u0001\u0000\u0000\u0000~\u038e\u0001\u0000"+
		"\u0000\u0000\u0080\u0390\u0001\u0000\u0000\u0000\u0082\u03a0\u0001\u0000"+
		"\u0000\u0000\u0084\u03a5\u0001\u0000\u0000\u0000\u0086\u03b6\u0001\u0000"+
		"\u0000\u0000\u0088\u03d0\u0001\u0000\u0000\u0000\u008a\u03d4\u0001\u0000"+
		"\u0000\u0000\u008c\u03d6\u0001\u0000\u0000\u0000\u008e\u03dc\u0001\u0000"+
		"\u0000\u0000\u0090\u03de\u0001\u0000\u0000\u0000\u0092\u03e2\u0001\u0000"+
		"\u0000\u0000\u0094\u03e8\u0001\u0000\u0000\u0000\u0096\u0415\u0001\u0000"+
		"\u0000\u0000\u0098\u0417\u0001\u0000\u0000\u0000\u009a\u0419\u0001\u0000"+
		"\u0000\u0000\u009c\u0425\u0001\u0000\u0000\u0000\u009e\u042b\u0001\u0000"+
		"\u0000\u0000\u00a0\u0433\u0001\u0000\u0000\u0000\u00a2\u0436\u0001\u0000"+
		"\u0000\u0000\u00a4\u043f\u0001\u0000\u0000\u0000\u00a6\u044d\u0001\u0000"+
		"\u0000\u0000\u00a8\u0452\u0001\u0000\u0000\u0000\u00aa\u045f\u0001\u0000"+
		"\u0000\u0000\u00ac\u046d\u0001\u0000\u0000\u0000\u00ae\u0485\u0001\u0000"+
		"\u0000\u0000\u00b0\u0487\u0001\u0000\u0000\u0000\u00b2\u048f\u0001\u0000"+
		"\u0000\u0000\u00b4\u0496\u0001\u0000\u0000\u0000\u00b6\u049c\u0001\u0000"+
		"\u0000\u0000\u00b8\u04a0\u0001\u0000\u0000\u0000\u00ba\u04a6\u0001\u0000"+
		"\u0000\u0000\u00bc\u04b3\u0001\u0000\u0000\u0000\u00be\u04bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u04c3\u0001\u0000\u0000\u0000\u00c2\u04c7\u0001\u0000"+
		"\u0000\u0000\u00c4\u04cd\u0001\u0000\u0000\u0000\u00c6\u04d1\u0001\u0000"+
		"\u0000\u0000\u00c8\u04d7\u0001\u0000\u0000\u0000\u00ca\u04dd\u0001\u0000"+
		"\u0000\u0000\u00cc\u04e1\u0001\u0000\u0000\u0000\u00ce\u04e3\u0001\u0000"+
		"\u0000\u0000\u00d0\u04e7\u0001\u0000\u0000\u0000\u00d2\u04eb\u0001\u0000"+
		"\u0000\u0000\u00d4\u04f0\u0001\u0000\u0000\u0000\u00d6\u04fd\u0001\u0000"+
		"\u0000\u0000\u00d8\u0505\u0001\u0000\u0000\u0000\u00da\u0508\u0001\u0000"+
		"\u0000\u0000\u00dc\u050f\u0001\u0000\u0000\u0000\u00de\u0528\u0001\u0000"+
		"\u0000\u0000\u00e0\u052b\u0001\u0000\u0000\u0000\u00e2\u053f\u0001\u0000"+
		"\u0000\u0000\u00e4\u054d\u0001\u0000\u0000\u0000\u00e6\u0551\u0001\u0000"+
		"\u0000\u0000\u00e8\u0556\u0001\u0000\u0000\u0000\u00ea\u0561\u0001\u0000"+
		"\u0000\u0000\u00ec\u0567\u0001\u0000\u0000\u0000\u00ee\u0582\u0001\u0000"+
		"\u0000\u0000\u00f0\u05b1\u0001\u0000\u0000\u0000\u00f2\u060c\u0001\u0000"+
		"\u0000\u0000\u00f4\u0618\u0001\u0000\u0000\u0000\u00f6\u0632\u0001\u0000"+
		"\u0000\u0000\u00f8\u0636\u0001\u0000\u0000\u0000\u00fa\u064a\u0001\u0000"+
		"\u0000\u0000\u00fc\u064c\u0001\u0000\u0000\u0000\u00fe\u0662\u0001\u0000"+
		"\u0000\u0000\u0100\u067e\u0001\u0000\u0000\u0000\u0102\u068f\u0001\u0000"+
		"\u0000\u0000\u0104\u0694\u0001\u0000\u0000\u0000\u0106\u06a9\u0001\u0000"+
		"\u0000\u0000\u0108\u06ba\u0001\u0000\u0000\u0000\u010a\u06bc\u0001\u0000"+
		"\u0000\u0000\u010c\u06c2\u0001\u0000\u0000\u0000\u010e\u06e0\u0001\u0000"+
		"\u0000\u0000\u0110\u06e4\u0001\u0000\u0000\u0000\u0112\u06ea\u0001\u0000"+
		"\u0000\u0000\u0114\u06ef\u0001\u0000\u0000\u0000\u0116\u06f1\u0001\u0000"+
		"\u0000\u0000\u0118\u06f5\u0001\u0000\u0000\u0000\u011a\u0700\u0001\u0000"+
		"\u0000\u0000\u011c\u0714\u0001\u0000\u0000\u0000\u011e\u0716\u0001\u0000"+
		"\u0000\u0000\u0120\u072a\u0001\u0000\u0000\u0000\u0122\u0731\u0001\u0000"+
		"\u0000\u0000\u0124\u0733\u0001\u0000\u0000\u0000\u0126\u012b\u0003\u00ae"+
		"W\u0000\u0127\u012b\u0003\u0004\u0002\u0000\u0128\u012b\u0003\u00f0x\u0000"+
		"\u0129\u012b\u0003\u0010\b\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a"+
		"\u0127\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u0001\u0001\u0000\u0000\u0000\u012c"+
		"\u012e\u0005\u0001\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0003\u0000\u0000\u0000\u0130\u0003\u0001\u0000\u0000\u0000\u0131"+
		"\u0135\u0003\u0006\u0003\u0000\u0132\u0135\u0003\u000e\u0007\u0000\u0133"+
		"\u0135\u0003\f\u0006\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0005"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0003\b\u0004\u0000\u0137\u0139\u0003"+
		"\n\u0005\u0000\u0138\u013a\u0003\u001a\r\u0000\u0139\u0138\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0005\u0012\u0000\u0000\u013c\u013e\u0003\u011a"+
		"\u008d\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0019"+
		"\u0000\u0000\u0140\u0142\u0003\u0118\u008c\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0003\u00a4R\u0000\u0144\u0007\u0001\u0000\u0000"+
		"\u0000\u0145\u0147\u0003\u0012\t\u0000\u0146\u0145\u0001\u0000\u0000\u0000"+
		"\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\t\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014b\u0151\u0005\n\u0000\u0000\u014c\u0151"+
		"\u0005\u001d\u0000\u0000\u014d\u0151\u0005\u0011\u0000\u0000\u014e\u014f"+
		"\u0005|\u0000\u0000\u014f\u0151\u0005\u001d\u0000\u0000\u0150\u014b\u0001"+
		"\u0000\u0000\u0000\u0150\u014c\u0001\u0000\u0000\u0000\u0150\u014d\u0001"+
		"\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u000b\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0003\b\u0004\u0000\u0153\u0154\u00036"+
		"\u001b\u0000\u0154\u0157\u0003\u00aaU\u0000\u0155\u0156\u0005X\u0000\u0000"+
		"\u0156\u0158\u0003\u00f0x\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\r\u0001\u0000\u0000\u0000\u0159\u015b"+
		"\u0003\b\u0004\u0000\u015a\u015c\u0003\u001a\r\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001"+
		"\u0000\u0000\u0000\u015d\u015f\u00036\u001b\u0000\u015e\u015d\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0003\u00aaU\u0000\u0161\u0163\u0005O\u0000\u0000"+
		"\u0162\u0164\u0003d2\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0168"+
		"\u0005P\u0000\u0000\u0166\u0167\u0005.\u0000\u0000\u0167\u0169\u0003^"+
		"/\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0003\u00a4R\u0000"+
		"\u016b\u000f\u0001\u0000\u0000\u0000\u016c\u016e\u0005\u001a\u0000\u0000"+
		"\u016d\u016f\u0005\'\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u0173\u0003n7\u0000\u0171\u0172\u0005W\u0000\u0000\u0172\u0174\u0005"+
		"i\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0005U\u0000"+
		"\u0000\u0176\u0011\u0001\u0000\u0000\u0000\u0177\u017d\u0003\u0014\n\u0000"+
		"\u0178\u017d\u0005\u001f\u0000\u0000\u0179\u017d\u0005+\u0000\u0000\u017a"+
		"\u017d\u0005/\u0000\u0000\u017b\u017d\u00052\u0000\u0000\u017c\u0177\u0001"+
		"\u0000\u0000\u0000\u017c\u0178\u0001\u0000\u0000\u0000\u017c\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017b\u0001"+
		"\u0000\u0000\u0000\u017d\u0013\u0001\u0000\u0000\u0000\u017e\u0189\u0003"+
		"x<\u0000\u017f\u0189\u0005$\u0000\u0000\u0180\u0189\u0005#\u0000\u0000"+
		"\u0181\u0189\u0005\"\u0000\u0000\u0182\u0189\u0005\'\u0000\u0000\u0183"+
		"\u0189\u0005\u0002\u0000\u0000\u0184\u0189\u0005\u0013\u0000\u0000\u0185"+
		"\u0189\u0005(\u0000\u0000\u0186\u0189\u0005A\u0000\u0000\u0187\u0189\u0005"+
		"C\u0000\u0000\u0188\u017e\u0001\u0000\u0000\u0000\u0188\u017f\u0001\u0000"+
		"\u0000\u0000\u0188\u0180\u0001\u0000\u0000\u0000\u0188\u0181\u0001\u0000"+
		"\u0000\u0000\u0188\u0182\u0001\u0000\u0000\u0000\u0188\u0183\u0001\u0000"+
		"\u0000\u0000\u0188\u0184\u0001\u0000\u0000\u0000\u0188\u0185\u0001\u0000"+
		"\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0187\u0001\u0000"+
		"\u0000\u0000\u0189\u0015\u0001\u0000\u0000\u0000\u018a\u018d\u0005\u0013"+
		"\u0000\u0000\u018b\u018d\u0003x<\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u0017\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0005\n\u0000\u0000\u018f\u0191\u0003\u00aaU\u0000\u0190"+
		"\u0192\u0003\u001a\r\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0005\u0012\u0000\u0000\u0194\u0196\u0003\u011a\u008d\u0000\u0195\u0193"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0199"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0019\u0000\u0000\u0198\u019a"+
		"\u0003\u0118\u008c\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0005B\u0000\u0000\u019c\u019e\u0003\u0118\u008c\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0003*\u0015\u0000\u01a0\u0019\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0005Z\u0000\u0000\u01a2\u01a7\u0003\u001c\u000e"+
		"\u0000\u01a3\u01a4\u0005V\u0000\u0000\u01a4\u01a6\u0003\u001c\u000e\u0000"+
		"\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0005Y\u0000\u0000\u01ab\u001b\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ae\u0003x<\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01af\u0001"+
		"\u0000\u0000\u0000\u01b2\u01bb\u0003\u00aaU\u0000\u01b3\u01b7\u0005\u0012"+
		"\u0000\u0000\u01b4\u01b6\u0003x<\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bc\u0003\u001e\u000f\u0000"+
		"\u01bb\u01b3\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u001d\u0001\u0000\u0000\u0000\u01bd\u01c2\u0003\u011a\u008d\u0000"+
		"\u01be\u01bf\u0005k\u0000\u0000\u01bf\u01c1\u0003\u011a\u008d\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3"+
		"\u001f\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0005\u0011\u0000\u0000\u01c6\u01c9\u0003\u00aaU\u0000\u01c7\u01c8"+
		"\u0005\u0019\u0000\u0000\u01c8\u01ca\u0003\u0118\u008c\u0000\u01c9\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cd\u0005Q\u0000\u0000\u01cc\u01ce\u0003"+
		"\"\u0011\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01d1\u0005V\u0000"+
		"\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01d4\u0003&\u0013\u0000"+
		"\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005R\u0000\u0000\u01d6"+
		"!\u0001\u0000\u0000\u0000\u01d7\u01dc\u0003$\u0012\u0000\u01d8\u01d9\u0005"+
		"V\u0000\u0000\u01d9\u01db\u0003$\u0012\u0000\u01da\u01d8\u0001\u0000\u0000"+
		"\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd#\u0001\u0000\u0000\u0000"+
		"\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e1\u0003x<\u0000\u01e0\u01df"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e7"+
		"\u0003\u00aaU\u0000\u01e6\u01e8\u0003\u0124\u0092\u0000\u01e7\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001"+
		"\u0000\u0000\u0000\u01e9\u01eb\u0003*\u0015\u0000\u01ea\u01e9\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb%\u0001\u0000\u0000"+
		"\u0000\u01ec\u01f0\u0005U\u0000\u0000\u01ed\u01ef\u0003.\u0017\u0000\u01ee"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1"+
		"\'\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0005\u001d\u0000\u0000\u01f4\u01f6\u0003\u00aaU\u0000\u01f5\u01f7\u0003"+
		"\u001a\r\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\u0012"+
		"\u0000\u0000\u01f9\u01fb\u0003\u0118\u008c\u0000\u01fa\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0005B\u0000\u0000\u01fd\u01ff\u0003\u0118\u008c"+
		"\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0003,\u0016\u0000"+
		"\u0201)\u0001\u0000\u0000\u0000\u0202\u0206\u0005Q\u0000\u0000\u0203\u0205"+
		"\u0003.\u0017\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205\u0208\u0001"+
		"\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001"+
		"\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000\u0208\u0206\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0005R\u0000\u0000\u020a+\u0001\u0000\u0000"+
		"\u0000\u020b\u020f\u0005Q\u0000\u0000\u020c\u020e\u0003@ \u0000\u020d"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		"\u0212\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0005R\u0000\u0000\u0213-\u0001\u0000\u0000\u0000\u0214\u0221\u0005"+
		"U\u0000\u0000\u0215\u0217\u0005\'\u0000\u0000\u0216\u0215\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000"+
		"\u0000\u0000\u0218\u0221\u0003\u00a4R\u0000\u0219\u021b\u0003\u0012\t"+
		"\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000"+
		"\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021f\u0221\u00030\u0018\u0000\u0220\u0214\u0001\u0000\u0000\u0000"+
		"\u0220\u0216\u0001\u0000\u0000\u0000\u0220\u021c\u0001\u0000\u0000\u0000"+
		"\u0221/\u0001\u0000\u0000\u0000\u0222\u022d\u00032\u0019\u0000\u0223\u022d"+
		"\u00038\u001c\u0000\u0224\u022d\u0003>\u001f\u0000\u0225\u022d\u0003<"+
		"\u001e\u0000\u0226\u022d\u0003:\u001d\u0000\u0227\u022d\u0003(\u0014\u0000"+
		"\u0228\u022d\u0003\u0082A\u0000\u0229\u022d\u0003\u0018\f\u0000\u022a"+
		"\u022d\u0003 \u0010\u0000\u022b\u022d\u0003\u009aM\u0000\u022c\u0222\u0001"+
		"\u0000\u0000\u0000\u022c\u0223\u0001\u0000\u0000\u0000\u022c\u0224\u0001"+
		"\u0000\u0000\u0000\u022c\u0225\u0001\u0000\u0000\u0000\u022c\u0226\u0001"+
		"\u0000\u0000\u0000\u022c\u0227\u0001\u0000\u0000\u0000\u022c\u0228\u0001"+
		"\u0000\u0000\u0000\u022c\u0229\u0001\u0000\u0000\u0000\u022c\u022a\u0001"+
		"\u0000\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d1\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u00036\u001b\u0000\u022f\u0230\u0003\u00aaU\u0000"+
		"\u0230\u0235\u0003`0\u0000\u0231\u0232\u0005S\u0000\u0000\u0232\u0234"+
		"\u0005T\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0237\u0001"+
		"\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001"+
		"\u0000\u0000\u0000\u0236\u023a\u0001\u0000\u0000\u0000\u0237\u0235\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0005.\u0000\u0000\u0239\u023b\u0003^/"+
		"\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u00034\u001a\u0000"+
		"\u023d3\u0001\u0000\u0000\u0000\u023e\u0241\u0003\u00a4R\u0000\u023f\u0241"+
		"\u0005U\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u023f\u0001"+
		"\u0000\u0000\u0000\u02415\u0001\u0000\u0000\u0000\u0242\u0245\u0003\u011a"+
		"\u008d\u0000\u0243\u0245\u00051\u0000\u0000\u0244\u0242\u0001\u0000\u0000"+
		"\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u02457\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0003\u001a\r\u0000\u0247\u0248\u00032\u0019\u0000\u0248"+
		"9\u0001\u0000\u0000\u0000\u0249\u024a\u0003\u001a\r\u0000\u024a\u024b"+
		"\u0003<\u001e\u0000\u024b;\u0001\u0000\u0000\u0000\u024c\u024d\u0003\u00aa"+
		"U\u0000\u024d\u0250\u0003`0\u0000\u024e\u024f\u0005.\u0000\u0000\u024f"+
		"\u0251\u0003^/\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u0251\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0003"+
		"\u00a4R\u0000\u0253=\u0001\u0000\u0000\u0000\u0254\u0255\u0003\u011a\u008d"+
		"\u0000\u0255\u0256\u0003P(\u0000\u0256\u0257\u0005U\u0000\u0000\u0257"+
		"?\u0001\u0000\u0000\u0000\u0258\u025a\u0003\u0012\t\u0000\u0259\u0258"+
		"\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259"+
		"\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025e"+
		"\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u0261"+
		"\u0003B!\u0000\u025f\u0261\u0005U\u0000\u0000\u0260\u025b\u0001\u0000"+
		"\u0000\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0261A\u0001\u0000\u0000"+
		"\u0000\u0262\u026b\u0003D\"\u0000\u0263\u026b\u0003H$\u0000\u0264\u026b"+
		"\u0003L&\u0000\u0265\u026b\u0003(\u0014\u0000\u0266\u026b\u0003\u0082"+
		"A\u0000\u0267\u026b\u0003\u0018\f\u0000\u0268\u026b\u0003 \u0010\u0000"+
		"\u0269\u026b\u0003\u009aM\u0000\u026a\u0262\u0001\u0000\u0000\u0000\u026a"+
		"\u0263\u0001\u0000\u0000\u0000\u026a\u0264\u0001\u0000\u0000\u0000\u026a"+
		"\u0265\u0001\u0000\u0000\u0000\u026a\u0266\u0001\u0000\u0000\u0000\u026a"+
		"\u0267\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a"+
		"\u0269\u0001\u0000\u0000\u0000\u026bC\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0003\u011a\u008d\u0000\u026d\u0272\u0003F#\u0000\u026e\u026f\u0005V"+
		"\u0000\u0000\u026f\u0271\u0003F#\u0000\u0270\u026e\u0001\u0000\u0000\u0000"+
		"\u0271\u0274\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000"+
		"\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0276\u0005U\u0000\u0000\u0276"+
		"E\u0001\u0000\u0000\u0000\u0277\u027c\u0003\u00aaU\u0000\u0278\u0279\u0005"+
		"S\u0000\u0000\u0279\u027b\u0005T\u0000\u0000\u027a\u0278\u0001\u0000\u0000"+
		"\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027f\u0001\u0000\u0000"+
		"\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0280\u0005X\u0000\u0000"+
		"\u0280\u0281\u0003V+\u0000\u0281G\u0001\u0000\u0000\u0000\u0282\u0284"+
		"\u0003J%\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000"+
		"\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000"+
		"\u0000\u0000\u0286\u0288\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0003N\'\u0000\u0289I\u0001\u0000\u0000\u0000"+
		"\u028a\u0291\u0003x<\u0000\u028b\u0291\u0005$\u0000\u0000\u028c\u0291"+
		"\u0005\u0002\u0000\u0000\u028d\u0291\u0005\r\u0000\u0000\u028e\u0291\u0005"+
		"\'\u0000\u0000\u028f\u0291\u0005(\u0000\u0000\u0290\u028a\u0001\u0000"+
		"\u0000\u0000\u0290\u028b\u0001\u0000\u0000\u0000\u0290\u028c\u0001\u0000"+
		"\u0000\u0000\u0290\u028d\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000"+
		"\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291K\u0001\u0000\u0000"+
		"\u0000\u0292\u0294\u0003J%\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294"+
		"\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0001\u0000\u0000\u0000\u0296\u0298\u0001\u0000\u0000\u0000\u0297"+
		"\u0295\u0001\u0000\u0000\u0000\u0298\u0299\u0003\u001a\r\u0000\u0299\u029a"+
		"\u0003N\'\u0000\u029aM\u0001\u0000\u0000\u0000\u029b\u029d\u0003x<\u0000"+
		"\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000\u0000"+
		"\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000"+
		"\u029f\u02a1\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u00036\u001b\u0000\u02a2\u02a3\u0003\u00aaU\u0000\u02a3\u02a8"+
		"\u0003`0\u0000\u02a4\u02a5\u0005S\u0000\u0000\u02a5\u02a7\u0005T\u0000"+
		"\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000"+
		"\u0000\u02a9\u02ad\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ac\u0005.\u0000\u0000\u02ac\u02ae\u0003^/\u0000\u02ad"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae"+
		"\u02af\u0001\u0000\u0000\u0000\u02af\u02b0\u00034\u001a\u0000\u02b0O\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b6\u0003R)\u0000\u02b2\u02b3\u0005V\u0000"+
		"\u0000\u02b3\u02b5\u0003R)\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b7Q\u0001\u0000\u0000\u0000\u02b8\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b9\u02bc\u0003T*\u0000\u02ba\u02bb\u0005X"+
		"\u0000\u0000\u02bb\u02bd\u0003V+\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000"+
		"\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bdS\u0001\u0000\u0000\u0000\u02be"+
		"\u02c3\u0003\u00aaU\u0000\u02bf\u02c0\u0005S\u0000\u0000\u02c0\u02c2\u0005"+
		"T\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c4U\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c9\u0003X,\u0000\u02c7\u02c9\u0003\u00f0x\u0000\u02c8"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9"+
		"W\u0001\u0000\u0000\u0000\u02ca\u02d6\u0005Q\u0000\u0000\u02cb\u02d0\u0003"+
		"V+\u0000\u02cc\u02cd\u0005V\u0000\u0000\u02cd\u02cf\u0003V+\u0000\u02ce"+
		"\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0"+
		"\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d5\u0005V\u0000\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02cb"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005R\u0000\u0000\u02d9Y\u0001\u0000"+
		"\u0000\u0000\u02da\u02dc\u0003\u00aaU\u0000\u02db\u02dd\u0003\u011e\u008f"+
		"\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000"+
		"\u0000\u02dd\u02e5\u0001\u0000\u0000\u0000\u02de\u02df\u0005W\u0000\u0000"+
		"\u02df\u02e1\u0003\u00aaU\u0000\u02e0\u02e2\u0003\u011e\u008f\u0000\u02e1"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e3\u02de\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e6[\u0001\u0000\u0000\u0000\u02e7\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e8\u02f5\u0003\u011a\u008d\u0000\u02e9\u02eb"+
		"\u0003x<\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ed\u02ef\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f2\u0005]\u0000\u0000\u02f0\u02f1\u0007\u0000\u0000"+
		"\u0000\u02f1\u02f3\u0003\u011a\u008d\u0000\u02f2\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f4\u02e8\u0001\u0000\u0000\u0000\u02f4\u02ec\u0001\u0000\u0000"+
		"\u0000\u02f5]\u0001\u0000\u0000\u0000\u02f6\u02fb\u0003n7\u0000\u02f7"+
		"\u02f8\u0005V\u0000\u0000\u02f8\u02fa\u0003n7\u0000\u02f9\u02f7\u0001"+
		"\u0000\u0000\u0000\u02fa\u02fd\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc_\u0001\u0000"+
		"\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe\u030a\u0005O\u0000"+
		"\u0000\u02ff\u0301\u0003b1\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0300"+
		"\u0301\u0001\u0000\u0000\u0000\u0301\u030b\u0001\u0000\u0000\u0000\u0302"+
		"\u0305\u0003b1\u0000\u0303\u0304\u0005V\u0000\u0000\u0304\u0306\u0003"+
		"d2\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000"+
		"\u0000\u0306\u030b\u0001\u0000\u0000\u0000\u0307\u0309\u0003d2\u0000\u0308"+
		"\u0307\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309"+
		"\u030b\u0001\u0000\u0000\u0000\u030a\u0300\u0001\u0000\u0000\u0000\u030a"+
		"\u0302\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b"+
		"\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0005P\u0000\u0000\u030da\u0001"+
		"\u0000\u0000\u0000\u030e\u0314\u0003\u011a\u008d\u0000\u030f\u0310\u0003"+
		"\u00aaU\u0000\u0310\u0311\u0005W\u0000\u0000\u0311\u0313\u0001\u0000\u0000"+
		"\u0000\u0312\u030f\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000"+
		"\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000"+
		"\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\u0005,\u0000\u0000\u0318c\u0001\u0000\u0000\u0000\u0319"+
		"\u031e\u0003f3\u0000\u031a\u031b\u0005V\u0000\u0000\u031b\u031d\u0003"+
		"f3\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u0320\u0001\u0000\u0000"+
		"\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000"+
		"\u0000\u031f\u0323\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000"+
		"\u0000\u0321\u0322\u0005V\u0000\u0000\u0322\u0324\u0003h4\u0000\u0323"+
		"\u0321\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324"+
		"\u0327\u0001\u0000\u0000\u0000\u0325\u0327\u0003h4\u0000\u0326\u0319\u0001"+
		"\u0000\u0000\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0327e\u0001\u0000"+
		"\u0000\u0000\u0328\u032a\u0003\u0016\u000b\u0000\u0329\u0328\u0001\u0000"+
		"\u0000\u0000\u032a\u032d\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000"+
		"\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032e\u0001\u0000"+
		"\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032e\u032f\u0003\u011a"+
		"\u008d\u0000\u032f\u0330\u0003T*\u0000\u0330g\u0001\u0000\u0000\u0000"+
		"\u0331\u0333\u0003\u0016\u000b\u0000\u0332\u0331\u0001\u0000\u0000\u0000"+
		"\u0333\u0336\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000"+
		"\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0001\u0000\u0000\u0000"+
		"\u0336\u0334\u0001\u0000\u0000\u0000\u0337\u033b\u0003\u011a\u008d\u0000"+
		"\u0338\u033a\u0003x<\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u033a\u033d"+
		"\u0001\u0000\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c"+
		"\u0001\u0000\u0000\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u033b"+
		"\u0001\u0000\u0000\u0000\u033e\u033f\u0005}\u0000\u0000\u033f\u0340\u0003"+
		"T*\u0000\u0340i\u0001\u0000\u0000\u0000\u0341\u0346\u0003l6\u0000\u0342"+
		"\u0343\u0005V\u0000\u0000\u0343\u0345\u0003l6\u0000\u0344\u0342\u0001"+
		"\u0000\u0000\u0000\u0345\u0348\u0001\u0000\u0000\u0000\u0346\u0344\u0001"+
		"\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347k\u0001\u0000"+
		"\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034b\u0003\u0016"+
		"\u000b\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034b\u034e\u0001\u0000"+
		"\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000"+
		"\u0000\u0000\u034d\u034f\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000"+
		"\u0000\u0000\u034f\u0350\u0005>\u0000\u0000\u0350\u0351\u0003\u00aaU\u0000"+
		"\u0351m\u0001\u0000\u0000\u0000\u0352\u0357\u0003\u00aaU\u0000\u0353\u0354"+
		"\u0005W\u0000\u0000\u0354\u0356\u0003\u00aaU\u0000\u0355\u0353\u0001\u0000"+
		"\u0000\u0000\u0356\u0359\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000"+
		"\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358o\u0001\u0000\u0000"+
		"\u0000\u0359\u0357\u0001\u0000\u0000\u0000\u035a\u0362\u0003r9\u0000\u035b"+
		"\u0362\u0003t:\u0000\u035c\u0362\u0005K\u0000\u0000\u035d\u0362\u0005"+
		"L\u0000\u0000\u035e\u0362\u0005J\u0000\u0000\u035f\u0362\u0005N\u0000"+
		"\u0000\u0360\u0362\u0005M\u0000\u0000\u0361\u035a\u0001\u0000\u0000\u0000"+
		"\u0361\u035b\u0001\u0000\u0000\u0000\u0361\u035c\u0001\u0000\u0000\u0000"+
		"\u0361\u035d\u0001\u0000\u0000\u0000\u0361\u035e\u0001\u0000\u0000\u0000"+
		"\u0361\u035f\u0001\u0000\u0000\u0000\u0361\u0360\u0001\u0000\u0000\u0000"+
		"\u0362q\u0001\u0000\u0000\u0000\u0363\u0364\u0007\u0001\u0000\u0000\u0364"+
		"s\u0001\u0000\u0000\u0000\u0365\u0366\u0007\u0002\u0000\u0000\u0366u\u0001"+
		"\u0000\u0000\u0000\u0367\u0368\u0003\u00aaU\u0000\u0368\u0369\u0005W\u0000"+
		"\u0000\u0369\u036b\u0001\u0000\u0000\u0000\u036a\u0367\u0001\u0000\u0000"+
		"\u0000\u036b\u036e\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000"+
		"\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036f\u0001\u0000\u0000"+
		"\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036f\u0370\u0005|\u0000\u0000"+
		"\u0370\u0371\u0003\u00aaU\u0000\u0371w\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0005|\u0000\u0000\u0373\u0376\u0003n7\u0000\u0374\u0376\u0003v;\u0000"+
		"\u0375\u0372\u0001\u0000\u0000\u0000\u0375\u0374\u0001\u0000\u0000\u0000"+
		"\u0376\u037d\u0001\u0000\u0000\u0000\u0377\u037a\u0005O\u0000\u0000\u0378"+
		"\u037b\u0003z=\u0000\u0379\u037b\u0003~?\u0000\u037a\u0378\u0001\u0000"+
		"\u0000\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000"+
		"\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037e\u0005P\u0000"+
		"\u0000\u037d\u0377\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000"+
		"\u0000\u037ey\u0001\u0000\u0000\u0000\u037f\u0384\u0003|>\u0000\u0380"+
		"\u0381\u0005V\u0000\u0000\u0381\u0383\u0003|>\u0000\u0382\u0380\u0001"+
		"\u0000\u0000\u0000\u0383\u0386\u0001\u0000\u0000\u0000\u0384\u0382\u0001"+
		"\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385{\u0001\u0000"+
		"\u0000\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u0388\u0003\u00aa"+
		"U\u0000\u0388\u0389\u0005X\u0000\u0000\u0389\u038a\u0003~?\u0000\u038a"+
		"}\u0001\u0000\u0000\u0000\u038b\u038f\u0003\u00f0x\u0000\u038c\u038f\u0003"+
		"x<\u0000\u038d\u038f\u0003\u0080@\u0000\u038e\u038b\u0001\u0000\u0000"+
		"\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038d\u0001\u0000\u0000"+
		"\u0000\u038f\u007f\u0001\u0000\u0000\u0000\u0390\u0399\u0005Q\u0000\u0000"+
		"\u0391\u0396\u0003~?\u0000\u0392\u0393\u0005V\u0000\u0000\u0393\u0395"+
		"\u0003~?\u0000\u0394\u0392\u0001\u0000\u0000\u0000\u0395\u0398\u0001\u0000"+
		"\u0000\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000"+
		"\u0000\u0000\u0397\u039a\u0001\u0000\u0000\u0000\u0398\u0396\u0001\u0000"+
		"\u0000\u0000\u0399\u0391\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000"+
		"\u0000\u0000\u039a\u039c\u0001\u0000\u0000\u0000\u039b\u039d\u0005V\u0000"+
		"\u0000\u039c\u039b\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000"+
		"\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039f\u0005R\u0000\u0000"+
		"\u039f\u0081\u0001\u0000\u0000\u0000\u03a0\u03a1\u0005|\u0000\u0000\u03a1"+
		"\u03a2\u0005\u001d\u0000\u0000\u03a2\u03a3\u0003\u00aaU\u0000\u03a3\u03a4"+
		"\u0003\u0084B\u0000\u03a4\u0083\u0001\u0000\u0000\u0000\u03a5\u03a9\u0005"+
		"Q\u0000\u0000\u03a6\u03a8\u0003\u0086C\u0000\u03a7\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a8\u03ab\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000"+
		"\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005R\u0000\u0000"+
		"\u03ad\u0085\u0001\u0000\u0000\u0000\u03ae\u03b0\u0003\u0012\t\u0000\u03af"+
		"\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b3\u0001\u0000\u0000\u0000\u03b1"+
		"\u03af\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b4"+
		"\u03b7\u0003\u0088D\u0000\u03b5\u03b7\u0005U\u0000\u0000\u03b6\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7\u0087\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b9\u0003\u011a\u008d\u0000\u03b9\u03ba\u0003"+
		"\u008aE\u0000\u03ba\u03bb\u0005U\u0000\u0000\u03bb\u03d1\u0001\u0000\u0000"+
		"\u0000\u03bc\u03be\u0003\u0018\f\u0000\u03bd\u03bf\u0005U\u0000\u0000"+
		"\u03be\u03bd\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000"+
		"\u03bf\u03d1\u0001\u0000\u0000\u0000\u03c0\u03c2\u0003(\u0014\u0000\u03c1"+
		"\u03c3\u0005U\u0000\u0000\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c2\u03c3"+
		"\u0001\u0000\u0000\u0000\u03c3\u03d1\u0001\u0000\u0000\u0000\u03c4\u03c6"+
		"\u0003 \u0010\u0000\u03c5\u03c7\u0005U\u0000\u0000\u03c6\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03d1\u0001\u0000"+
		"\u0000\u0000\u03c8\u03ca\u0003\u0082A\u0000\u03c9\u03cb\u0005U\u0000\u0000"+
		"\u03ca\u03c9\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000"+
		"\u03cb\u03d1\u0001\u0000\u0000\u0000\u03cc\u03ce\u0003\u009aM\u0000\u03cd"+
		"\u03cf\u0005U\u0000\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d1\u0001\u0000\u0000\u0000\u03d0\u03b8"+
		"\u0001\u0000\u0000\u0000\u03d0\u03bc\u0001\u0000\u0000\u0000\u03d0\u03c0"+
		"\u0001\u0000\u0000\u0000\u03d0\u03c4\u0001\u0000\u0000\u0000\u03d0\u03c8"+
		"\u0001\u0000\u0000\u0000\u03d0\u03cc\u0001\u0000\u0000\u0000\u03d1\u0089"+
		"\u0001\u0000\u0000\u0000\u03d2\u03d5\u0003\u008cF\u0000\u03d3\u03d5\u0003"+
		"\u008eG\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d5\u008b\u0001\u0000\u0000\u0000\u03d6\u03d7\u0003\u00aa"+
		"U\u0000\u03d7\u03d8\u0005O\u0000\u0000\u03d8\u03da\u0005P\u0000\u0000"+
		"\u03d9\u03db\u0003\u0090H\u0000\u03da\u03d9\u0001\u0000\u0000\u0000\u03da"+
		"\u03db\u0001\u0000\u0000\u0000\u03db\u008d\u0001\u0000\u0000\u0000\u03dc"+
		"\u03dd\u0003P(\u0000\u03dd\u008f\u0001\u0000\u0000\u0000\u03de\u03df\u0005"+
		"\r\u0000\u0000\u03df\u03e0\u0003~?\u0000\u03e0\u0091\u0001\u0000\u0000"+
		"\u0000\u03e1\u03e3\u00055\u0000\u0000\u03e2\u03e1\u0001\u0000\u0000\u0000"+
		"\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e4\u03e5\u00054\u0000\u0000\u03e5\u03e6\u0003n7\u0000\u03e6\u03e7"+
		"\u0003\u0094J\u0000\u03e7\u0093\u0001\u0000\u0000\u0000\u03e8\u03ec\u0005"+
		"Q\u0000\u0000\u03e9\u03eb\u0003\u0096K\u0000\u03ea\u03e9\u0001\u0000\u0000"+
		"\u0000\u03eb\u03ee\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001\u0000\u0000"+
		"\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ef\u0001\u0000\u0000"+
		"\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ef\u03f0\u0005R\u0000\u0000"+
		"\u03f0\u0095\u0001\u0000\u0000\u0000\u03f1\u03f5\u00056\u0000\u0000\u03f2"+
		"\u03f4\u0003\u0098L\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f7"+
		"\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f6"+
		"\u0001\u0000\u0000\u0000\u03f6\u03f8\u0001\u0000\u0000\u0000\u03f7\u03f5"+
		"\u0001\u0000\u0000\u0000\u03f8\u03f9\u0003n7\u0000\u03f9\u03fa\u0005U"+
		"\u0000\u0000\u03fa\u0416\u0001\u0000\u0000\u0000\u03fb\u03fc\u00057\u0000"+
		"\u0000\u03fc\u03ff\u0003n7\u0000\u03fd\u03fe\u00059\u0000\u0000\u03fe"+
		"\u0400\u0003n7\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u0400\u0001"+
		"\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000\u0000\u0401\u0402\u0005"+
		"U\u0000\u0000\u0402\u0416\u0001\u0000\u0000\u0000\u0403\u0404\u00058\u0000"+
		"\u0000\u0404\u0407\u0003n7\u0000\u0405\u0406\u00059\u0000\u0000\u0406"+
		"\u0408\u0003n7\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0408\u0001"+
		"\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u040a\u0005"+
		"U\u0000\u0000\u040a\u0416\u0001\u0000\u0000\u0000\u040b\u040c\u0005:\u0000"+
		"\u0000\u040c\u040d\u0003n7\u0000\u040d\u040e\u0005U\u0000\u0000\u040e"+
		"\u0416\u0001\u0000\u0000\u0000\u040f\u0410\u0005;\u0000\u0000\u0410\u0411"+
		"\u0003n7\u0000\u0411\u0412\u0005<\u0000\u0000\u0412\u0413\u0003n7\u0000"+
		"\u0413\u0414\u0005U\u0000\u0000\u0414\u0416\u0001\u0000\u0000\u0000\u0415"+
		"\u03f1\u0001\u0000\u0000\u0000\u0415\u03fb\u0001\u0000\u0000\u0000\u0415"+
		"\u0403\u0001\u0000\u0000\u0000\u0415\u040b\u0001\u0000\u0000\u0000\u0415"+
		"\u040f\u0001\u0000\u0000\u0000\u0416\u0097\u0001\u0000\u0000\u0000\u0417"+
		"\u0418\u0007\u0003\u0000\u0000\u0418\u0099\u0001\u0000\u0000\u0000\u0419"+
		"\u041a\u0005@\u0000\u0000\u041a\u041c\u0003\u00aaU\u0000\u041b\u041d\u0003"+
		"\u001a\r\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000"+
		"\u0000\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u0421\u0003\u009c"+
		"N\u0000\u041f\u0420\u0005\u0019\u0000\u0000\u0420\u0422\u0003\u0118\u008c"+
		"\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000"+
		"\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0424\u0003\u00a2Q\u0000"+
		"\u0424\u009b\u0001\u0000\u0000\u0000\u0425\u0427\u0005O\u0000\u0000\u0426"+
		"\u0428\u0003\u009eO\u0000\u0427\u0426\u0001\u0000\u0000\u0000\u0427\u0428"+
		"\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042a"+
		"\u0005P\u0000\u0000\u042a\u009d\u0001\u0000\u0000\u0000\u042b\u0430\u0003"+
		"\u00a0P\u0000\u042c\u042d\u0005V\u0000\u0000\u042d\u042f\u0003\u00a0P"+
		"\u0000\u042e\u042c\u0001\u0000\u0000\u0000\u042f\u0432\u0001\u0000\u0000"+
		"\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000"+
		"\u0000\u0431\u009f\u0001\u0000\u0000\u0000\u0432\u0430\u0001\u0000\u0000"+
		"\u0000\u0433\u0434\u0003\u011a\u008d\u0000\u0434\u0435\u0003\u00aaU\u0000"+
		"\u0435\u00a1\u0001\u0000\u0000\u0000\u0436\u043a\u0005Q\u0000\u0000\u0437"+
		"\u0439\u0003.\u0017\u0000\u0438\u0437\u0001\u0000\u0000\u0000\u0439\u043c"+
		"\u0001\u0000\u0000\u0000\u043a\u0438\u0001\u0000\u0000\u0000\u043a\u043b"+
		"\u0001\u0000\u0000\u0000\u043b\u043d\u0001\u0000\u0000\u0000\u043c\u043a"+
		"\u0001\u0000\u0000\u0000\u043d\u043e\u0005R\u0000\u0000\u043e\u00a3\u0001"+
		"\u0000\u0000\u0000\u043f\u0443\u0005Q\u0000\u0000\u0440\u0442\u0003\u0002"+
		"\u0001\u0000\u0441\u0440\u0001\u0000\u0000\u0000\u0442\u0445\u0001\u0000"+
		"\u0000\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0443\u0444\u0001\u0000"+
		"\u0000\u0000\u0444\u0446\u0001\u0000\u0000\u0000\u0445\u0443\u0001\u0000"+
		"\u0000\u0000\u0446\u0447\u0005R\u0000\u0000\u0447\u00a5\u0001\u0000\u0000"+
		"\u0000\u0448\u0449\u0003\u00a8T\u0000\u0449\u044a\u0005U\u0000\u0000\u044a"+
		"\u044e\u0001\u0000\u0000\u0000\u044b\u044e\u0003\u00aeW\u0000\u044c\u044e"+
		"\u0003\u00acV\u0000\u044d\u0448\u0001\u0000\u0000\u0000\u044d\u044b\u0001"+
		"\u0000\u0000\u0000\u044d\u044c\u0001\u0000\u0000\u0000\u044e\u00a7\u0001"+
		"\u0000\u0000\u0000\u044f\u0451\u0003\u0016\u000b\u0000\u0450\u044f\u0001"+
		"\u0000\u0000\u0000\u0451\u0454\u0001\u0000\u0000\u0000\u0452\u0450\u0001"+
		"\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000\u0453\u045d\u0001"+
		"\u0000\u0000\u0000\u0454\u0452\u0001\u0000\u0000\u0000\u0455\u0456\u0003"+
		"\u011a\u008d\u0000\u0456\u0457\u0003P(\u0000\u0457\u045e\u0001\u0000\u0000"+
		"\u0000\u0458\u0459\u0005>\u0000\u0000\u0459\u045a\u0003\u00aaU\u0000\u045a"+
		"\u045b\u0005X\u0000\u0000\u045b\u045c\u0003\u00f0x\u0000\u045c\u045e\u0001"+
		"\u0000\u0000\u0000\u045d\u0455\u0001\u0000\u0000\u0000\u045d\u0458\u0001"+
		"\u0000\u0000\u0000\u045e\u00a9\u0001\u0000\u0000\u0000\u045f\u0460\u0007"+
		"\u0004\u0000\u0000\u0460\u00ab\u0001\u0000\u0000\u0000\u0461\u0463\u0003"+
		"\u0014\n\u0000\u0462\u0461\u0001\u0000\u0000\u0000\u0463\u0466\u0001\u0000"+
		"\u0000\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000"+
		"\u0000\u0000\u0465\u046a\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000"+
		"\u0000\u0000\u0467\u046b\u0003\u0018\f\u0000\u0468\u046b\u0003(\u0014"+
		"\u0000\u0469\u046b\u0003\u009aM\u0000\u046a\u0467\u0001\u0000\u0000\u0000"+
		"\u046a\u0468\u0001\u0000\u0000\u0000\u046a\u0469\u0001\u0000\u0000\u0000"+
		"\u046b\u046e\u0001\u0000\u0000\u0000\u046c\u046e\u0005U\u0000\u0000\u046d"+
		"\u0464\u0001\u0000\u0000\u0000\u046d\u046c\u0001\u0000\u0000\u0000\u046e"+
		"\u00ad\u0001\u0000\u0000\u0000\u046f\u0486\u0003\u00a4R\u0000\u0470\u0486"+
		"\u0003\u00b0X\u0000\u0471\u0486\u0003\u00b2Y\u0000\u0472\u0486\u0003\u00b4"+
		"Z\u0000\u0473\u0486\u0003\u00b6[\u0000\u0474\u0486\u0003\u00b8\\\u0000"+
		"\u0475\u0486\u0003\u00ba]\u0000\u0476\u0486\u0003\u00bc^\u0000\u0477\u0486"+
		"\u0003\u00be_\u0000\u0478\u0486\u0003\u00c0`\u0000\u0479\u0486\u0003\u00c2"+
		"a\u0000\u047a\u0486\u0003\u00c4b\u0000\u047b\u0486\u0003\u00c6c\u0000"+
		"\u047c\u0486\u0003\u00c8d\u0000\u047d\u0486\u0003\u00cae\u0000\u047e\u0486"+
		"\u0003\u00ccf\u0000\u047f\u0480\u0003\u00f0x\u0000\u0480\u0481\u0005U"+
		"\u0000\u0000\u0481\u0486\u0001\u0000\u0000\u0000\u0482\u0486\u0003\u00ce"+
		"g\u0000\u0483\u0486\u0003\u00d0h\u0000\u0484\u0486\u0003\u00d2i\u0000"+
		"\u0485\u046f\u0001\u0000\u0000\u0000\u0485\u0470\u0001\u0000\u0000\u0000"+
		"\u0485\u0471\u0001\u0000\u0000\u0000\u0485\u0472\u0001\u0000\u0000\u0000"+
		"\u0485\u0473\u0001\u0000\u0000\u0000\u0485\u0474\u0001\u0000\u0000\u0000"+
		"\u0485\u0475\u0001\u0000\u0000\u0000\u0485\u0476\u0001\u0000\u0000\u0000"+
		"\u0485\u0477\u0001\u0000\u0000\u0000\u0485\u0478\u0001\u0000\u0000\u0000"+
		"\u0485\u0479\u0001\u0000\u0000\u0000\u0485\u047a\u0001\u0000\u0000\u0000"+
		"\u0485\u047b\u0001\u0000\u0000\u0000\u0485\u047c\u0001\u0000\u0000\u0000"+
		"\u0485\u047d\u0001\u0000\u0000\u0000\u0485\u047e\u0001\u0000\u0000\u0000"+
		"\u0485\u047f\u0001\u0000\u0000\u0000\u0485\u0482\u0001\u0000\u0000\u0000"+
		"\u0485\u0483\u0001\u0000\u0000\u0000\u0485\u0484\u0001\u0000\u0000\u0000"+
		"\u0486\u00af\u0001\u0000\u0000\u0000\u0487\u0488\u0005\u0003\u0000\u0000"+
		"\u0488\u048b\u0003\u00f0x\u0000\u0489\u048a\u0005^\u0000\u0000\u048a\u048c"+
		"\u0003\u00f0x\u0000\u048b\u0489\u0001\u0000\u0000\u0000\u048b\u048c\u0001"+
		"\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000\u0000\u048d\u048e\u0005"+
		"U\u0000\u0000\u048e\u00b1\u0001\u0000\u0000\u0000\u048f\u0490\u0005\u0017"+
		"\u0000\u0000\u0490\u0491\u0003\u00eau\u0000\u0491\u0494\u0003\u00a4R\u0000"+
		"\u0492\u0493\u0005\u0010\u0000\u0000\u0493\u0495\u0003\u00a4R\u0000\u0494"+
		"\u0492\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495"+
		"\u00b3\u0001\u0000\u0000\u0000\u0496\u0497\u0005\u0016\u0000\u0000\u0497"+
		"\u0498\u0005O\u0000\u0000\u0498\u0499\u0003\u00e4r\u0000\u0499\u049a\u0005"+
		"P\u0000\u0000\u049a\u049b\u0003\u00a4R\u0000\u049b\u00b5\u0001\u0000\u0000"+
		"\u0000\u049c\u049d\u00053\u0000\u0000\u049d\u049e\u0003\u00eau\u0000\u049e"+
		"\u049f\u0003\u00a4R\u0000\u049f\u00b7\u0001\u0000\u0000\u0000\u04a0\u04a1"+
		"\u0005\u000e\u0000\u0000\u04a1\u04a2\u0003\u00a4R\u0000\u04a2\u04a3\u0005"+
		"3\u0000\u0000\u04a3\u04a4\u0003\u00eau\u0000\u04a4\u04a5\u0005U\u0000"+
		"\u0000\u04a5\u00b9\u0001\u0000\u0000\u0000\u04a6\u04a7\u00050\u0000\u0000"+
		"\u04a7\u04b1\u0003\u00a4R\u0000\u04a8\u04aa\u0003\u00d4j\u0000\u04a9\u04a8"+
		"\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04a9"+
		"\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u04ae"+
		"\u0001\u0000\u0000\u0000\u04ad\u04af\u0003\u00d8l\u0000\u04ae\u04ad\u0001"+
		"\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b2\u0001"+
		"\u0000\u0000\u0000\u04b0\u04b2\u0003\u00d8l\u0000\u04b1\u04a9\u0001\u0000"+
		"\u0000\u0000\u04b1\u04b0\u0001\u0000\u0000\u0000\u04b2\u00bb\u0001\u0000"+
		"\u0000\u0000\u04b3\u04b4\u00050\u0000\u0000\u04b4\u04b5\u0003\u00dam\u0000"+
		"\u04b5\u04b9\u0003\u00a4R\u0000\u04b6\u04b8\u0003\u00d4j\u0000\u04b7\u04b6"+
		"\u0001\u0000\u0000\u0000\u04b8\u04bb\u0001\u0000\u0000\u0000\u04b9\u04b7"+
		"\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000\u04ba\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bc\u04be"+
		"\u0003\u00d8l\u0000\u04bd\u04bc\u0001\u0000\u0000\u0000\u04bd\u04be\u0001"+
		"\u0000\u0000\u0000\u04be\u00bd\u0001\u0000\u0000\u0000\u04bf\u04c0\u0005"+
		"*\u0000\u0000\u04c0\u04c1\u0003\u00eau\u0000\u04c1\u04c2\u0003\u00a4R"+
		"\u0000\u04c2\u00bf\u0001\u0000\u0000\u0000\u04c3\u04c4\u0005+\u0000\u0000"+
		"\u04c4\u04c5\u0003\u00eau\u0000\u04c5\u04c6\u0003\u00a4R\u0000\u04c6\u00c1"+
		"\u0001\u0000\u0000\u0000\u04c7\u04c9\u0005%\u0000\u0000\u04c8\u04ca\u0003"+
		"\u00f0x\u0000\u04c9\u04c8\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000"+
		"\u0000\u0000\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cc\u0005U\u0000"+
		"\u0000\u04cc\u00c3\u0001\u0000\u0000\u0000\u04cd\u04ce\u0005-\u0000\u0000"+
		"\u04ce\u04cf\u0003\u00f0x\u0000\u04cf\u04d0\u0005U\u0000\u0000\u04d0\u00c5"+
		"\u0001\u0000\u0000\u0000\u04d1\u04d3\u0005\u0005\u0000\u0000\u04d2\u04d4"+
		"\u0003\u00aaU\u0000\u04d3\u04d2\u0001\u0000\u0000\u0000\u04d3\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000\u0000\u0000\u04d5\u04d6\u0005"+
		"U\u0000\u0000\u04d6\u00c7\u0001\u0000\u0000\u0000\u04d7\u04d9\u0005\f"+
		"\u0000\u0000\u04d8\u04da\u0003\u00aaU\u0000\u04d9\u04d8\u0001\u0000\u0000"+
		"\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000\u0000"+
		"\u0000\u04db\u04dc\u0005U\u0000\u0000\u04dc\u00c9\u0001\u0000\u0000\u0000"+
		"\u04dd\u04de\u0005?\u0000\u0000\u04de\u04df\u0003\u00f0x\u0000\u04df\u04e0"+
		"\u0005U\u0000\u0000\u04e0\u00cb\u0001\u0000\u0000\u0000\u04e1\u04e2\u0005"+
		"U\u0000\u0000\u04e2\u00cd\u0001\u0000\u0000\u0000\u04e3\u04e5\u0003\u00fc"+
		"~\u0000\u04e4\u04e6\u0005U\u0000\u0000\u04e5\u04e4\u0001\u0000\u0000\u0000"+
		"\u04e5\u04e6\u0001\u0000\u0000\u0000\u04e6\u00cf\u0001\u0000\u0000\u0000"+
		"\u04e7\u04e8\u0003\u00aaU\u0000\u04e8\u04e9\u0005^\u0000\u0000\u04e9\u04ea"+
		"\u0003\u00aeW\u0000\u04ea\u00d1\u0001\u0000\u0000\u0000\u04eb\u04ec\u0005"+
		"\u0007\u0000\u0000\u04ec\u04ed\u0003\u00f0x\u0000\u04ed\u04ee\u0005^\u0000"+
		"\u0000\u04ee\u04ef\u0003\u00a4R\u0000\u04ef\u00d3\u0001\u0000\u0000\u0000"+
		"\u04f0\u04f1\u0005\b\u0000\u0000\u04f1\u04f5\u0005O\u0000\u0000\u04f2"+
		"\u04f4\u0003\u0016\u000b\u0000\u04f3\u04f2\u0001\u0000\u0000\u0000\u04f4"+
		"\u04f7\u0001\u0000\u0000\u0000\u04f5\u04f3\u0001\u0000\u0000\u0000\u04f5"+
		"\u04f6\u0001\u0000\u0000\u0000\u04f6\u04f8\u0001\u0000\u0000\u0000\u04f7"+
		"\u04f5\u0001\u0000\u0000\u0000\u04f8\u04f9\u0003\u00d6k\u0000\u04f9\u04fa"+
		"\u0003\u00aaU\u0000\u04fa\u04fb\u0005P\u0000\u0000\u04fb\u04fc\u0003\u00a4"+
		"R\u0000\u04fc\u00d5\u0001\u0000\u0000\u0000\u04fd\u0502\u0003n7\u0000"+
		"\u04fe\u04ff\u0005l\u0000\u0000\u04ff\u0501\u0003n7\u0000\u0500\u04fe"+
		"\u0001\u0000\u0000\u0000\u0501\u0504\u0001\u0000\u0000\u0000\u0502\u0500"+
		"\u0001\u0000\u0000\u0000\u0502\u0503\u0001\u0000\u0000\u0000\u0503\u00d7"+
		"\u0001\u0000\u0000\u0000\u0504\u0502\u0001\u0000\u0000\u0000\u0505\u0506"+
		"\u0005\u0014\u0000\u0000\u0506\u0507\u0003\u00a4R\u0000\u0507\u00d9\u0001"+
		"\u0000\u0000\u0000\u0508\u0509\u0005O\u0000\u0000\u0509\u050b\u0003\u00dc"+
		"n\u0000\u050a\u050c\u0005U\u0000\u0000\u050b\u050a\u0001\u0000\u0000\u0000"+
		"\u050b\u050c\u0001\u0000\u0000\u0000\u050c\u050d\u0001\u0000\u0000\u0000"+
		"\u050d\u050e\u0005P\u0000\u0000\u050e\u00db\u0001\u0000\u0000\u0000\u050f"+
		"\u0514\u0003\u00deo\u0000\u0510\u0511\u0005U\u0000\u0000\u0511\u0513\u0003"+
		"\u00deo\u0000\u0512\u0510\u0001\u0000\u0000\u0000\u0513\u0516\u0001\u0000"+
		"\u0000\u0000\u0514\u0512\u0001\u0000\u0000\u0000\u0514\u0515\u0001\u0000"+
		"\u0000\u0000\u0515\u00dd\u0001\u0000\u0000\u0000\u0516\u0514\u0001\u0000"+
		"\u0000\u0000\u0517\u0519\u0003\u0016\u000b\u0000\u0518\u0517\u0001\u0000"+
		"\u0000\u0000\u0519\u051c\u0001\u0000\u0000\u0000\u051a\u0518\u0001\u0000"+
		"\u0000\u0000\u051a\u051b\u0001\u0000\u0000\u0000\u051b\u0522\u0001\u0000"+
		"\u0000\u0000\u051c\u051a\u0001\u0000\u0000\u0000\u051d\u051e\u0003Z-\u0000"+
		"\u051e\u051f\u0003T*\u0000\u051f\u0523\u0001\u0000\u0000\u0000\u0520\u0521"+
		"\u0005>\u0000\u0000\u0521\u0523\u0003\u00aaU\u0000\u0522\u051d\u0001\u0000"+
		"\u0000\u0000\u0522\u0520\u0001\u0000\u0000\u0000\u0523\u0524\u0001\u0000"+
		"\u0000\u0000\u0524\u0525\u0005X\u0000\u0000\u0525\u0526\u0003\u00f0x\u0000"+
		"\u0526\u0529\u0001\u0000\u0000\u0000\u0527\u0529\u0003\u00aaU\u0000\u0528"+
		"\u051a\u0001\u0000\u0000\u0000\u0528\u0527\u0001\u0000\u0000\u0000\u0529"+
		"\u00df\u0001\u0000\u0000\u0000\u052a\u052c\u0003\u00e2q\u0000\u052b\u052a"+
		"\u0001\u0000\u0000\u0000\u052c\u052d\u0001\u0000\u0000\u0000\u052d\u052b"+
		"\u0001\u0000\u0000\u0000\u052d\u052e\u0001\u0000\u0000\u0000\u052e\u0530"+
		"\u0001\u0000\u0000\u0000\u052f\u0531\u0003\u00a6S\u0000\u0530\u052f\u0001"+
		"\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000\u0000\u0532\u0530\u0001"+
		"\u0000\u0000\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u00e1\u0001"+
		"\u0000\u0000\u0000\u0534\u053a\u0005\u0007\u0000\u0000\u0535\u053b\u0003"+
		"\u00f0x\u0000\u0536\u053b\u0005\u0081\u0000\u0000\u0537\u0538\u0003\u011a"+
		"\u008d\u0000\u0538\u0539\u0003\u00aaU\u0000\u0539\u053b\u0001\u0000\u0000"+
		"\u0000\u053a\u0535\u0001\u0000\u0000\u0000\u053a\u0536\u0001\u0000\u0000"+
		"\u0000\u053a\u0537\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000"+
		"\u0000\u053c\u0540\u0005^\u0000\u0000\u053d\u053e\u0005\r\u0000\u0000"+
		"\u053e\u0540\u0005^\u0000\u0000\u053f\u0534\u0001\u0000\u0000\u0000\u053f"+
		"\u053d\u0001\u0000\u0000\u0000\u0540\u00e3\u0001\u0000\u0000\u0000\u0541"+
		"\u054e\u0003\u00e8t\u0000\u0542\u0544\u0003\u00e6s\u0000\u0543\u0542\u0001"+
		"\u0000\u0000\u0000\u0543\u0544\u0001\u0000\u0000\u0000\u0544\u0545\u0001"+
		"\u0000\u0000\u0000\u0545\u0547\u0005U\u0000\u0000\u0546\u0548\u0003\u00f0"+
		"x\u0000\u0547\u0546\u0001\u0000\u0000\u0000\u0547\u0548\u0001\u0000\u0000"+
		"\u0000\u0548\u0549\u0001\u0000\u0000\u0000\u0549\u054b\u0005U\u0000\u0000"+
		"\u054a\u054c\u0003\u00ecv\u0000\u054b\u054a\u0001\u0000\u0000\u0000\u054b"+
		"\u054c\u0001\u0000\u0000\u0000\u054c\u054e\u0001\u0000\u0000\u0000\u054d"+
		"\u0541\u0001\u0000\u0000\u0000\u054d\u0543\u0001\u0000\u0000\u0000\u054e"+
		"\u00e5\u0001\u0000\u0000\u0000\u054f\u0552\u0003\u00a8T\u0000\u0550\u0552"+
		"\u0003\u00ecv\u0000\u0551\u054f\u0001\u0000\u0000\u0000\u0551\u0550\u0001"+
		"\u0000\u0000\u0000\u0552\u00e7\u0001\u0000\u0000\u0000\u0553\u0555\u0003"+
		"\u0016\u000b\u0000\u0554\u0553\u0001\u0000\u0000\u0000\u0555\u0558\u0001"+
		"\u0000\u0000\u0000\u0556\u0554\u0001\u0000\u0000\u0000\u0556\u0557\u0001"+
		"\u0000\u0000\u0000\u0557\u055b\u0001\u0000\u0000\u0000\u0558\u0556\u0001"+
		"\u0000\u0000\u0000\u0559\u055c\u0003\u011a\u008d\u0000\u055a\u055c\u0005"+
		">\u0000\u0000\u055b\u0559\u0001\u0000\u0000\u0000\u055b\u055a\u0001\u0000"+
		"\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u055e\u0003T*\u0000"+
		"\u055e\u055f\u0005^\u0000\u0000\u055f\u0560\u0003\u00f0x\u0000\u0560\u00e9"+
		"\u0001\u0000\u0000\u0000\u0561\u0563\u0005O\u0000\u0000\u0562\u0564\u0003"+
		"\u00f0x\u0000\u0563\u0562\u0001\u0000\u0000\u0000\u0563\u0564\u0001\u0000"+
		"\u0000\u0000\u0564\u0565\u0001\u0000\u0000\u0000\u0565\u0566\u0005P\u0000"+
		"\u0000\u0566\u00eb\u0001\u0000\u0000\u0000\u0567\u056c\u0003\u00f0x\u0000"+
		"\u0568\u0569\u0005V\u0000\u0000\u0569\u056b\u0003\u00f0x\u0000\u056a\u0568"+
		"\u0001\u0000\u0000\u0000\u056b\u056e\u0001\u0000\u0000\u0000\u056c\u056a"+
		"\u0001\u0000\u0000\u0000\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u00ed"+
		"\u0001\u0000\u0000\u0000\u056e\u056c\u0001\u0000\u0000\u0000\u056f\u0570"+
		"\u0003\u00aaU\u0000\u0570\u0572\u0005O\u0000\u0000\u0571\u0573\u0003\u00ec"+
		"v\u0000\u0572\u0571\u0001\u0000\u0000\u0000\u0572\u0573\u0001\u0000\u0000"+
		"\u0000\u0573\u0574\u0001\u0000\u0000\u0000\u0574\u0575\u0005P\u0000\u0000"+
		"\u0575\u0583\u0001\u0000\u0000\u0000\u0576\u0577\u0005,\u0000\u0000\u0577"+
		"\u0579\u0005O\u0000\u0000\u0578\u057a\u0003\u00ecv\u0000\u0579\u0578\u0001"+
		"\u0000\u0000\u0000\u0579\u057a\u0001\u0000\u0000\u0000\u057a\u057b\u0001"+
		"\u0000\u0000\u0000\u057b\u0583\u0005P\u0000\u0000\u057c\u057d\u0005)\u0000"+
		"\u0000\u057d\u057f\u0005O\u0000\u0000\u057e\u0580\u0003\u00ecv\u0000\u057f"+
		"\u057e\u0001\u0000\u0000\u0000\u057f\u0580\u0001\u0000\u0000\u0000\u0580"+
		"\u0581\u0001\u0000\u0000\u0000\u0581\u0583\u0005P\u0000\u0000\u0582\u056f"+
		"\u0001\u0000\u0000\u0000\u0582\u0576\u0001\u0000\u0000\u0000\u0582\u057c"+
		"\u0001\u0000\u0000\u0000\u0583\u00ef\u0001\u0000\u0000\u0000\u0584\u0585"+
		"\u0006x\uffff\uffff\u0000\u0585\u05b2\u0003\u00fa}\u0000\u0586\u05b2\u0003"+
		"\u00eew\u0000\u0587\u0588\u0005 \u0000\u0000\u0588\u05b2\u0003\u0106\u0083"+
		"\u0000\u0589\u058d\u0005O\u0000\u0000\u058a\u058c\u0003x<\u0000\u058b"+
		"\u058a\u0001\u0000\u0000\u0000\u058c\u058f\u0001\u0000\u0000\u0000\u058d"+
		"\u058b\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000\u058e"+
		"\u0590\u0001\u0000\u0000\u0000\u058f\u058d\u0001\u0000\u0000\u0000\u0590"+
		"\u0595\u0003\u011a\u008d\u0000\u0591\u0592\u0005k\u0000\u0000\u0592\u0594"+
		"\u0003\u011a\u008d\u0000\u0593\u0591\u0001\u0000\u0000\u0000\u0594\u0597"+
		"\u0001\u0000\u0000\u0000\u0595\u0593\u0001\u0000\u0000\u0000\u0595\u0596"+
		"\u0001\u0000\u0000\u0000\u0596\u0598\u0001\u0000\u0000\u0000\u0597\u0595"+
		"\u0001\u0000\u0000\u0000\u0598\u0599\u0005P\u0000\u0000\u0599\u059a\u0003"+
		"\u00f0x\u0016\u059a\u05b2\u0001\u0000\u0000\u0000\u059b\u059c\u0007\u0005"+
		"\u0000\u0000\u059c\u05b2\u0003\u00f0x\u0014\u059d\u059e\u0007\u0006\u0000"+
		"\u0000\u059e\u05b2\u0003\u00f0x\u0013\u059f\u05b2\u0003\u00f4z\u0000\u05a0"+
		"\u05b2\u0003\u00fc~\u0000\u05a1\u05a2\u0003\u011a\u008d\u0000\u05a2\u05a8"+
		"\u0005{\u0000\u0000\u05a3\u05a5\u0003\u011e\u008f\u0000\u05a4\u05a3\u0001"+
		"\u0000\u0000\u0000\u05a4\u05a5\u0001\u0000\u0000\u0000\u05a5\u05a6\u0001"+
		"\u0000\u0000\u0000\u05a6\u05a9\u0003\u00aaU\u0000\u05a7\u05a9\u0005 \u0000"+
		"\u0000\u05a8\u05a4\u0001\u0000\u0000\u0000\u05a8\u05a7\u0001\u0000\u0000"+
		"\u0000\u05a9\u05b2\u0001\u0000\u0000\u0000\u05aa\u05ab\u0003\u0104\u0082"+
		"\u0000\u05ab\u05ad\u0005{\u0000\u0000\u05ac\u05ae\u0003\u011e\u008f\u0000"+
		"\u05ad\u05ac\u0001\u0000\u0000\u0000\u05ad\u05ae\u0001\u0000\u0000\u0000"+
		"\u05ae\u05af\u0001\u0000\u0000\u0000\u05af\u05b0\u0005 \u0000\u0000\u05b0"+
		"\u05b2\u0001\u0000\u0000\u0000\u05b1\u0584\u0001\u0000\u0000\u0000\u05b1"+
		"\u0586\u0001\u0000\u0000\u0000\u05b1\u0587\u0001\u0000\u0000\u0000\u05b1"+
		"\u0589\u0001\u0000\u0000\u0000\u05b1\u059b\u0001\u0000\u0000\u0000\u05b1"+
		"\u059d\u0001\u0000\u0000\u0000\u05b1\u059f\u0001\u0000\u0000\u0000\u05b1"+
		"\u05a0\u0001\u0000\u0000\u0000\u05b1\u05a1\u0001\u0000\u0000\u0000\u05b1"+
		"\u05aa\u0001\u0000\u0000\u0000\u05b2\u0606\u0001\u0000\u0000\u0000\u05b3"+
		"\u05b4\n\u0012\u0000\u0000\u05b4\u05b5\u0007\u0007\u0000\u0000\u05b5\u0605"+
		"\u0003\u00f0x\u0013\u05b6\u05b7\n\u0011\u0000\u0000\u05b7\u05b8\u0007"+
		"\b\u0000\u0000\u05b8\u0605\u0003\u00f0x\u0012\u05b9\u05c1\n\u0010\u0000"+
		"\u0000\u05ba\u05bb\u0005Z\u0000\u0000\u05bb\u05c2\u0005Z\u0000\u0000\u05bc"+
		"\u05bd\u0005Y\u0000\u0000\u05bd\u05be\u0005Y\u0000\u0000\u05be\u05c2\u0005"+
		"Y\u0000\u0000\u05bf\u05c0\u0005Y\u0000\u0000\u05c0\u05c2\u0005Y\u0000"+
		"\u0000\u05c1\u05ba\u0001\u0000\u0000\u0000\u05c1\u05bc\u0001\u0000\u0000"+
		"\u0000\u05c1\u05bf\u0001\u0000\u0000\u0000\u05c2\u05c3\u0001\u0000\u0000"+
		"\u0000\u05c3\u0605\u0003\u00f0x\u0011\u05c4\u05c5\n\u000f\u0000\u0000"+
		"\u05c5\u05c6\u0007\t\u0000\u0000\u05c6\u0605\u0003\u00f0x\u0010\u05c7"+
		"\u05c8\n\r\u0000\u0000\u05c8\u05c9\u0007\n\u0000\u0000\u05c9\u0605\u0003"+
		"\u00f0x\u000e\u05ca\u05cb\n\f\u0000\u0000\u05cb\u05cc\u0005k\u0000\u0000"+
		"\u05cc\u0605\u0003\u00f0x\r\u05cd\u05ce\n\u000b\u0000\u0000\u05ce\u05cf"+
		"\u0005m\u0000\u0000\u05cf\u0605\u0003\u00f0x\f\u05d0\u05d1\n\n\u0000\u0000"+
		"\u05d1\u05d2\u0005l\u0000\u0000\u05d2\u0605\u0003\u00f0x\u000b\u05d3\u05d4"+
		"\n\t\u0000\u0000\u05d4\u05d5\u0005c\u0000\u0000\u05d5\u0605\u0003\u00f0"+
		"x\n\u05d6\u05d7\n\b\u0000\u0000\u05d7\u05d8\u0005d\u0000\u0000\u05d8\u0605"+
		"\u0003\u00f0x\t\u05d9\u05da\n\u0007\u0000\u0000\u05da\u05db\u0005]\u0000"+
		"\u0000\u05db\u05dc\u0003\u00f0x\u0000\u05dc\u05dd\u0005^\u0000\u0000\u05dd"+
		"\u05de\u0003\u00f0x\u0007\u05de\u0605\u0001\u0000\u0000\u0000\u05df\u05e0"+
		"\n\u0006\u0000\u0000\u05e0\u05e1\u0007\u000b\u0000\u0000\u05e1\u0605\u0003"+
		"\u00f0x\u0006\u05e2\u05e3\n\u001a\u0000\u0000\u05e3\u05ef\u0005W\u0000"+
		"\u0000\u05e4\u05f0\u0003\u00aaU\u0000\u05e5\u05f0\u0003\u00eew\u0000\u05e6"+
		"\u05f0\u0005,\u0000\u0000\u05e7\u05e9\u0005 \u0000\u0000\u05e8\u05ea\u0003"+
		"\u0116\u008b\u0000\u05e9\u05e8\u0001\u0000\u0000\u0000\u05e9\u05ea\u0001"+
		"\u0000\u0000\u0000\u05ea\u05eb\u0001\u0000\u0000\u0000\u05eb\u05f0\u0003"+
		"\u010a\u0085\u0000\u05ec\u05ed\u0005)\u0000\u0000\u05ed\u05f0\u0003\u0120"+
		"\u0090\u0000\u05ee\u05f0\u0003\u0110\u0088\u0000\u05ef\u05e4\u0001\u0000"+
		"\u0000\u0000\u05ef\u05e5\u0001\u0000\u0000\u0000\u05ef\u05e6\u0001\u0000"+
		"\u0000\u0000\u05ef\u05e7\u0001\u0000\u0000\u0000\u05ef\u05ec\u0001\u0000"+
		"\u0000\u0000\u05ef\u05ee\u0001\u0000\u0000\u0000\u05f0\u0605\u0001\u0000"+
		"\u0000\u0000\u05f1\u05f2\n\u0019\u0000\u0000\u05f2\u05f3\u0005S\u0000"+
		"\u0000\u05f3\u05f4\u0003\u00f0x\u0000\u05f4\u05f5\u0005T\u0000\u0000\u05f5"+
		"\u0605\u0001\u0000\u0000\u0000\u05f6\u05f7\n\u0015\u0000\u0000\u05f7\u0605"+
		"\u0007\f\u0000\u0000\u05f8\u05f9\n\u000e\u0000\u0000\u05f9\u05fc\u0005"+
		"\u001b\u0000\u0000\u05fa\u05fd\u0003\u011a\u008d\u0000\u05fb\u05fd\u0003"+
		"\u00f2y\u0000\u05fc\u05fa\u0001\u0000\u0000\u0000\u05fc\u05fb\u0001\u0000"+
		"\u0000\u0000\u05fd\u0605\u0001\u0000\u0000\u0000\u05fe\u05ff\n\u0003\u0000"+
		"\u0000\u05ff\u0601\u0005{\u0000\u0000\u0600\u0602\u0003\u011e\u008f\u0000"+
		"\u0601\u0600\u0001\u0000\u0000\u0000\u0601\u0602\u0001\u0000\u0000\u0000"+
		"\u0602\u0603\u0001\u0000\u0000\u0000\u0603\u0605\u0003\u00aaU\u0000\u0604"+
		"\u05b3\u0001\u0000\u0000\u0000\u0604\u05b6\u0001\u0000\u0000\u0000\u0604"+
		"\u05b9\u0001\u0000\u0000\u0000\u0604\u05c4\u0001\u0000\u0000\u0000\u0604"+
		"\u05c7\u0001\u0000\u0000\u0000\u0604\u05ca\u0001\u0000\u0000\u0000\u0604"+
		"\u05cd\u0001\u0000\u0000\u0000\u0604\u05d0\u0001\u0000\u0000\u0000\u0604"+
		"\u05d3\u0001\u0000\u0000\u0000\u0604\u05d6\u0001\u0000\u0000\u0000\u0604"+
		"\u05d9\u0001\u0000\u0000\u0000\u0604\u05df\u0001\u0000\u0000\u0000\u0604"+
		"\u05e2\u0001\u0000\u0000\u0000\u0604\u05f1\u0001\u0000\u0000\u0000\u0604"+
		"\u05f6\u0001\u0000\u0000\u0000\u0604\u05f8\u0001\u0000\u0000\u0000\u0604"+
		"\u05fe\u0001\u0000\u0000\u0000\u0605\u0608\u0001\u0000\u0000\u0000\u0606"+
		"\u0604\u0001\u0000\u0000\u0000\u0606\u0607\u0001\u0000\u0000\u0000\u0607"+
		"\u00f1\u0001\u0000\u0000\u0000\u0608\u0606\u0001\u0000\u0000\u0000\u0609"+
		"\u060b\u0003\u0016\u000b\u0000\u060a\u0609\u0001\u0000\u0000\u0000\u060b"+
		"\u060e\u0001\u0000\u0000\u0000\u060c\u060a\u0001\u0000\u0000\u0000\u060c"+
		"\u060d\u0001\u0000\u0000\u0000\u060d\u060f\u0001\u0000\u0000\u0000\u060e"+
		"\u060c\u0001\u0000\u0000\u0000\u060f\u0613\u0003\u011a\u008d\u0000\u0610"+
		"\u0612\u0003x<\u0000\u0611\u0610\u0001\u0000\u0000\u0000\u0612\u0615\u0001"+
		"\u0000\u0000\u0000\u0613\u0611\u0001\u0000\u0000\u0000\u0613\u0614\u0001"+
		"\u0000\u0000\u0000\u0614\u0616\u0001\u0000\u0000\u0000\u0615\u0613\u0001"+
		"\u0000\u0000\u0000\u0616\u0617\u0003\u00aaU\u0000\u0617\u00f3\u0001\u0000"+
		"\u0000\u0000\u0618\u0619\u0003\u00f6{\u0000\u0619\u061a\u0005z\u0000\u0000"+
		"\u061a\u061b\u0003\u00f8|\u0000\u061b\u00f5\u0001\u0000\u0000\u0000\u061c"+
		"\u0633\u0003\u00aaU\u0000\u061d\u061f\u0005O\u0000\u0000\u061e\u0620\u0003"+
		"d2\u0000\u061f\u061e\u0001\u0000\u0000\u0000\u061f\u0620\u0001\u0000\u0000"+
		"\u0000\u0620\u0621\u0001\u0000\u0000\u0000\u0621\u0633\u0005P\u0000\u0000"+
		"\u0622\u0623\u0005O\u0000\u0000\u0623\u0628\u0003\u00aaU\u0000\u0624\u0625"+
		"\u0005V\u0000\u0000\u0625\u0627\u0003\u00aaU\u0000\u0626\u0624\u0001\u0000"+
		"\u0000\u0000\u0627\u062a\u0001\u0000\u0000\u0000\u0628\u0626\u0001\u0000"+
		"\u0000\u0000\u0628\u0629\u0001\u0000\u0000\u0000\u0629\u062b\u0001\u0000"+
		"\u0000\u0000\u062a\u0628\u0001\u0000\u0000\u0000\u062b\u062c\u0005P\u0000"+
		"\u0000\u062c\u0633\u0001\u0000\u0000\u0000\u062d\u062f\u0005O\u0000\u0000"+
		"\u062e\u0630\u0003j5\u0000\u062f\u062e\u0001\u0000\u0000\u0000\u062f\u0630"+
		"\u0001\u0000\u0000\u0000\u0630\u0631\u0001\u0000\u0000\u0000\u0631\u0633"+
		"\u0005P\u0000\u0000\u0632\u061c\u0001\u0000\u0000\u0000\u0632\u061d\u0001"+
		"\u0000\u0000\u0000\u0632\u0622\u0001\u0000\u0000\u0000\u0632\u062d\u0001"+
		"\u0000\u0000\u0000\u0633\u00f7\u0001\u0000\u0000\u0000\u0634\u0637\u0003"+
		"\u00f0x\u0000\u0635\u0637\u0003\u00a4R\u0000\u0636\u0634\u0001\u0000\u0000"+
		"\u0000\u0636\u0635\u0001\u0000\u0000\u0000\u0637\u00f9\u0001\u0000\u0000"+
		"\u0000\u0638\u0639\u0005O\u0000\u0000\u0639\u063a\u0003\u00f0x\u0000\u063a"+
		"\u063b\u0005P\u0000\u0000\u063b\u064b\u0001\u0000\u0000\u0000\u063c\u064b"+
		"\u0005,\u0000\u0000\u063d\u064b\u0005)\u0000\u0000\u063e\u064b\u0003p"+
		"8\u0000\u063f\u064b\u0003\u00aaU\u0000\u0640\u0641\u00036\u001b\u0000"+
		"\u0641\u0642\u0005W\u0000\u0000\u0642\u0643\u0005\n\u0000\u0000\u0643"+
		"\u064b\u0001\u0000\u0000\u0000\u0644\u0648\u0003\u0116\u008b\u0000\u0645"+
		"\u0649\u0003\u0122\u0091\u0000\u0646\u0647\u0005,\u0000\u0000\u0647\u0649"+
		"\u0003\u0124\u0092\u0000\u0648\u0645\u0001\u0000\u0000\u0000\u0648\u0646"+
		"\u0001\u0000\u0000\u0000\u0649\u064b\u0001\u0000\u0000\u0000\u064a\u0638"+
		"\u0001\u0000\u0000\u0000\u064a\u063c\u0001\u0000\u0000\u0000\u064a\u063d"+
		"\u0001\u0000\u0000\u0000\u064a\u063e\u0001\u0000\u0000\u0000\u064a\u063f"+
		"\u0001\u0000\u0000\u0000\u064a\u0640\u0001\u0000\u0000\u0000\u064a\u0644"+
		"\u0001\u0000\u0000\u0000\u064b\u00fb\u0001\u0000\u0000\u0000\u064c\u064d"+
		"\u0005*\u0000\u0000\u064d\u064e\u0003\u00eau\u0000\u064e\u0652\u0005Q"+
		"\u0000\u0000\u064f\u0651\u0003\u00fe\u007f\u0000\u0650\u064f\u0001\u0000"+
		"\u0000\u0000\u0651\u0654\u0001\u0000\u0000\u0000\u0652\u0650\u0001\u0000"+
		"\u0000\u0000\u0652\u0653\u0001\u0000\u0000\u0000\u0653\u0655\u0001\u0000"+
		"\u0000\u0000\u0654\u0652\u0001\u0000\u0000\u0000\u0655\u0656\u0005R\u0000"+
		"\u0000\u0656\u00fd\u0001\u0000\u0000\u0000\u0657\u065b\u0005\u0007\u0000"+
		"\u0000\u0658\u065c\u0003\u00ecv\u0000\u0659\u065c\u0005N\u0000\u0000\u065a"+
		"\u065c\u0003\u0100\u0080\u0000\u065b\u0658\u0001\u0000\u0000\u0000\u065b"+
		"\u0659\u0001\u0000\u0000\u0000\u065b\u065a\u0001\u0000\u0000\u0000\u065c"+
		"\u065d\u0001\u0000\u0000\u0000\u065d\u065e\u0007\r\u0000\u0000\u065e\u0663"+
		"\u0003\u0102\u0081\u0000\u065f\u0660\u0005\r\u0000\u0000\u0660\u0661\u0007"+
		"\r\u0000\u0000\u0661\u0663\u0003\u0102\u0081\u0000\u0662\u0657\u0001\u0000"+
		"\u0000\u0000\u0662\u065f\u0001\u0000\u0000\u0000\u0663\u00ff\u0001\u0000"+
		"\u0000\u0000\u0664\u0665\u0006\u0080\uffff\uffff\u0000\u0665\u0666\u0005"+
		"O\u0000\u0000\u0666\u0667\u0003\u0100\u0080\u0000\u0667\u0668\u0005P\u0000"+
		"\u0000\u0668\u067f\u0001\u0000\u0000\u0000\u0669\u066b\u0003\u0016\u000b"+
		"\u0000\u066a\u0669\u0001\u0000\u0000\u0000\u066b\u066e\u0001\u0000\u0000"+
		"\u0000\u066c\u066a\u0001\u0000\u0000\u0000\u066c\u066d\u0001\u0000\u0000"+
		"\u0000\u066d\u066f\u0001\u0000\u0000\u0000\u066e\u066c\u0001\u0000\u0000"+
		"\u0000\u066f\u0673\u0003\u011a\u008d\u0000\u0670\u0672\u0003x<\u0000\u0671"+
		"\u0670\u0001\u0000\u0000\u0000\u0672\u0675\u0001\u0000\u0000\u0000\u0673"+
		"\u0671\u0001\u0000\u0000\u0000\u0673\u0674\u0001\u0000\u0000\u0000\u0674"+
		"\u0676\u0001\u0000\u0000\u0000\u0675\u0673\u0001\u0000\u0000\u0000\u0676"+
		"\u067b\u0003\u00aaU\u0000\u0677\u0678\u0005c\u0000\u0000\u0678\u067a\u0003"+
		"\u00f0x\u0000\u0679\u0677\u0001\u0000\u0000\u0000\u067a\u067d\u0001\u0000"+
		"\u0000\u0000\u067b\u0679\u0001\u0000\u0000\u0000\u067b\u067c\u0001\u0000"+
		"\u0000\u0000\u067c\u067f\u0001\u0000\u0000\u0000\u067d\u067b\u0001\u0000"+
		"\u0000\u0000\u067e\u0664\u0001\u0000\u0000\u0000\u067e\u066c\u0001\u0000"+
		"\u0000\u0000\u067f\u0685\u0001\u0000\u0000\u0000\u0680\u0681\n\u0001\u0000"+
		"\u0000\u0681\u0682\u0005c\u0000\u0000\u0682\u0684\u0003\u00f0x\u0000\u0683"+
		"\u0680\u0001\u0000\u0000\u0000\u0684\u0687\u0001\u0000\u0000\u0000\u0685"+
		"\u0683\u0001\u0000\u0000\u0000\u0685\u0686\u0001\u0000\u0000\u0000\u0686"+
		"\u0101\u0001\u0000\u0000\u0000\u0687\u0685\u0001\u0000\u0000\u0000\u0688"+
		"\u0690\u0003\u00a4R\u0000\u0689\u068b\u0003\u00a6S\u0000\u068a\u0689\u0001"+
		"\u0000\u0000\u0000\u068b\u068e\u0001\u0000\u0000\u0000\u068c\u068a\u0001"+
		"\u0000\u0000\u0000\u068c\u068d\u0001\u0000\u0000\u0000\u068d\u0690\u0001"+
		"\u0000\u0000\u0000\u068e\u068c\u0001\u0000\u0000\u0000\u068f\u0688\u0001"+
		"\u0000\u0000\u0000\u068f\u068c\u0001\u0000\u0000\u0000\u0690\u0103\u0001"+
		"\u0000\u0000\u0000\u0691\u0692\u0003Z-\u0000\u0692\u0693\u0005W\u0000"+
		"\u0000\u0693\u0695\u0001\u0000\u0000\u0000\u0694\u0691\u0001\u0000\u0000"+
		"\u0000\u0694\u0695\u0001\u0000\u0000\u0000\u0695\u0699\u0001\u0000\u0000"+
		"\u0000\u0696\u0698\u0003x<\u0000\u0697\u0696\u0001\u0000\u0000\u0000\u0698"+
		"\u069b\u0001\u0000\u0000\u0000\u0699\u0697\u0001\u0000\u0000\u0000\u0699"+
		"\u069a\u0001\u0000\u0000\u0000\u069a\u069c\u0001\u0000\u0000\u0000\u069b"+
		"\u0699\u0001\u0000\u0000\u0000\u069c\u069e\u0003\u00aaU\u0000\u069d\u069f"+
		"\u0003\u011e\u008f\u0000\u069e\u069d\u0001\u0000\u0000\u0000\u069e\u069f"+
		"\u0001\u0000\u0000\u0000\u069f\u0105\u0001\u0000\u0000\u0000\u06a0\u06a1"+
		"\u0003\u0116\u008b\u0000\u06a1\u06a2\u0003\u0108\u0084\u0000\u06a2\u06a3"+
		"\u0003\u010e\u0087\u0000\u06a3\u06aa\u0001\u0000\u0000\u0000\u06a4\u06a7"+
		"\u0003\u0108\u0084\u0000\u06a5\u06a8\u0003\u010c\u0086\u0000\u06a6\u06a8"+
		"\u0003\u010e\u0087\u0000\u06a7\u06a5\u0001\u0000\u0000\u0000\u06a7\u06a6"+
		"\u0001\u0000\u0000\u0000\u06a8\u06aa\u0001\u0000\u0000\u0000\u06a9\u06a0"+
		"\u0001\u0000\u0000\u0000\u06a9\u06a4\u0001\u0000\u0000\u0000\u06aa\u0107"+
		"\u0001\u0000\u0000\u0000\u06ab\u06ad\u0003\u00aaU\u0000\u06ac\u06ae\u0003"+
		"\u0112\u0089\u0000\u06ad\u06ac\u0001\u0000\u0000\u0000\u06ad\u06ae\u0001"+
		"\u0000\u0000\u0000\u06ae\u06b6\u0001\u0000\u0000\u0000\u06af\u06b0\u0005"+
		"W\u0000\u0000\u06b0\u06b2\u0003\u00aaU\u0000\u06b1\u06b3\u0003\u0112\u0089"+
		"\u0000\u06b2\u06b1\u0001\u0000\u0000\u0000\u06b2\u06b3\u0001\u0000\u0000"+
		"\u0000\u06b3\u06b5\u0001\u0000\u0000\u0000\u06b4\u06af\u0001\u0000\u0000"+
		"\u0000\u06b5\u06b8\u0001\u0000\u0000\u0000\u06b6\u06b4\u0001\u0000\u0000"+
		"\u0000\u06b6\u06b7\u0001\u0000\u0000\u0000\u06b7\u06bb\u0001\u0000\u0000"+
		"\u0000\u06b8\u06b6\u0001\u0000\u0000\u0000\u06b9\u06bb\u0003\u011c\u008e"+
		"\u0000\u06ba\u06ab\u0001\u0000\u0000\u0000\u06ba\u06b9\u0001\u0000\u0000"+
		"\u0000\u06bb\u0109\u0001\u0000\u0000\u0000\u06bc\u06be\u0003\u00aaU\u0000"+
		"\u06bd\u06bf\u0003\u0114\u008a\u0000\u06be\u06bd\u0001\u0000\u0000\u0000"+
		"\u06be\u06bf\u0001\u0000\u0000\u0000\u06bf\u06c0\u0001\u0000\u0000\u0000"+
		"\u06c0\u06c1\u0003\u010e\u0087\u0000\u06c1\u010b\u0001\u0000\u0000\u0000"+
		"\u06c2\u06de\u0005S\u0000\u0000\u06c3\u06c8\u0005T\u0000\u0000\u06c4\u06c5"+
		"\u0005S\u0000\u0000\u06c5\u06c7\u0005T\u0000\u0000\u06c6\u06c4\u0001\u0000"+
		"\u0000\u0000\u06c7\u06ca\u0001\u0000\u0000\u0000\u06c8\u06c6\u0001\u0000"+
		"\u0000\u0000\u06c8\u06c9\u0001\u0000\u0000\u0000\u06c9\u06cb\u0001\u0000"+
		"\u0000\u0000\u06ca\u06c8\u0001\u0000\u0000\u0000\u06cb\u06df\u0003X,\u0000"+
		"\u06cc\u06cd\u0003\u00f0x\u0000\u06cd\u06d4\u0005T\u0000\u0000\u06ce\u06cf"+
		"\u0005S\u0000\u0000\u06cf\u06d0\u0003\u00f0x\u0000\u06d0\u06d1\u0005T"+
		"\u0000\u0000\u06d1\u06d3\u0001\u0000\u0000\u0000\u06d2\u06ce\u0001\u0000"+
		"\u0000\u0000\u06d3\u06d6\u0001\u0000\u0000\u0000\u06d4\u06d2\u0001\u0000"+
		"\u0000\u0000\u06d4\u06d5\u0001\u0000\u0000\u0000\u06d5\u06db\u0001\u0000"+
		"\u0000\u0000\u06d6\u06d4\u0001\u0000\u0000\u0000\u06d7\u06d8\u0005S\u0000"+
		"\u0000\u06d8\u06da\u0005T\u0000\u0000\u06d9\u06d7\u0001\u0000\u0000\u0000"+
		"\u06da\u06dd\u0001\u0000\u0000\u0000\u06db\u06d9\u0001\u0000\u0000\u0000"+
		"\u06db\u06dc\u0001\u0000\u0000\u0000\u06dc\u06df\u0001\u0000\u0000\u0000"+
		"\u06dd\u06db\u0001\u0000\u0000\u0000\u06de\u06c3\u0001\u0000\u0000\u0000"+
		"\u06de\u06cc\u0001\u0000\u0000\u0000\u06df\u010d\u0001\u0000\u0000\u0000"+
		"\u06e0\u06e2\u0003\u0124\u0092\u0000\u06e1\u06e3\u0003*\u0015\u0000\u06e2"+
		"\u06e1\u0001\u0000\u0000\u0000\u06e2\u06e3\u0001\u0000\u0000\u0000\u06e3"+
		"\u010f\u0001\u0000\u0000\u0000\u06e4\u06e5\u0003\u0116\u008b\u0000\u06e5"+
		"\u06e6\u0003\u0122\u0091\u0000\u06e6\u0111\u0001\u0000\u0000\u0000\u06e7"+
		"\u06e8\u0005Z\u0000\u0000\u06e8\u06eb\u0005Y\u0000\u0000\u06e9\u06eb\u0003"+
		"\u011e\u008f\u0000\u06ea\u06e7\u0001\u0000\u0000\u0000\u06ea\u06e9\u0001"+
		"\u0000\u0000\u0000\u06eb\u0113\u0001\u0000\u0000\u0000\u06ec\u06ed\u0005"+
		"Z\u0000\u0000\u06ed\u06f0\u0005Y\u0000\u0000\u06ee\u06f0\u0003\u0116\u008b"+
		"\u0000\u06ef\u06ec\u0001\u0000\u0000\u0000\u06ef\u06ee\u0001\u0000\u0000"+
		"\u0000\u06f0\u0115\u0001\u0000\u0000\u0000\u06f1\u06f2\u0005Z\u0000\u0000"+
		"\u06f2\u06f3\u0003\u0118\u008c\u0000\u06f3\u06f4\u0005Y\u0000\u0000\u06f4"+
		"\u0117\u0001\u0000\u0000\u0000\u06f5\u06fa\u0003\u011a\u008d\u0000\u06f6"+
		"\u06f7\u0005V\u0000\u0000\u06f7\u06f9\u0003\u011a\u008d\u0000\u06f8\u06f6"+
		"\u0001\u0000\u0000\u0000\u06f9\u06fc\u0001\u0000\u0000\u0000\u06fa\u06f8"+
		"\u0001\u0000\u0000\u0000\u06fa\u06fb\u0001\u0000\u0000\u0000\u06fb\u0119"+
		"\u0001\u0000\u0000\u0000\u06fc\u06fa\u0001\u0000\u0000\u0000\u06fd\u06ff"+
		"\u0003x<\u0000\u06fe\u06fd\u0001\u0000\u0000\u0000\u06ff\u0702\u0001\u0000"+
		"\u0000\u0000\u0700\u06fe\u0001\u0000\u0000\u0000\u0700\u0701\u0001\u0000"+
		"\u0000\u0000\u0701\u0705\u0001\u0000\u0000\u0000\u0702\u0700\u0001\u0000"+
		"\u0000\u0000\u0703\u0706\u0003Z-\u0000\u0704\u0706\u0003\u011c\u008e\u0000"+
		"\u0705\u0703\u0001\u0000\u0000\u0000\u0705\u0704\u0001\u0000\u0000\u0000"+
		"\u0706\u0711\u0001\u0000\u0000\u0000\u0707\u0709\u0003x<\u0000\u0708\u0707"+
		"\u0001\u0000\u0000\u0000\u0709\u070c\u0001\u0000\u0000\u0000\u070a\u0708"+
		"\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000\u0000\u0000\u070b\u070d"+
		"\u0001\u0000\u0000\u0000\u070c\u070a\u0001\u0000\u0000\u0000\u070d\u070e"+
		"\u0005S\u0000\u0000\u070e\u0710\u0005T\u0000\u0000\u070f\u070a\u0001\u0000"+
		"\u0000\u0000\u0710\u0713\u0001\u0000\u0000\u0000\u0711\u070f\u0001\u0000"+
		"\u0000\u0000\u0711\u0712\u0001\u0000\u0000\u0000\u0712\u011b\u0001\u0000"+
		"\u0000\u0000\u0713\u0711\u0001\u0000\u0000\u0000\u0714\u0715\u0007\u000e"+
		"\u0000\u0000\u0715\u011d\u0001\u0000\u0000\u0000\u0716\u0717\u0005Z\u0000"+
		"\u0000\u0717\u071c\u0003\\.\u0000\u0718\u0719\u0005V\u0000\u0000\u0719"+
		"\u071b\u0003\\.\u0000\u071a\u0718\u0001\u0000\u0000\u0000\u071b\u071e"+
		"\u0001\u0000\u0000\u0000\u071c\u071a\u0001\u0000\u0000\u0000\u071c\u071d"+
		"\u0001\u0000\u0000\u0000\u071d\u071f\u0001\u0000\u0000\u0000\u071e\u071c"+
		"\u0001\u0000\u0000\u0000\u071f\u0720\u0005Y\u0000\u0000\u0720\u011f\u0001"+
		"\u0000\u0000\u0000\u0721\u072b\u0003\u0124\u0092\u0000\u0722\u0724\u0005"+
		"W\u0000\u0000\u0723\u0725\u0003\u011e\u008f\u0000\u0724\u0723\u0001\u0000"+
		"\u0000\u0000\u0724\u0725\u0001\u0000\u0000\u0000\u0725\u0726\u0001\u0000"+
		"\u0000\u0000\u0726\u0728\u0003\u00aaU\u0000\u0727\u0729\u0003\u0124\u0092"+
		"\u0000\u0728\u0727\u0001\u0000\u0000\u0000\u0728\u0729\u0001\u0000\u0000"+
		"\u0000\u0729\u072b\u0001\u0000\u0000\u0000\u072a\u0721\u0001\u0000\u0000"+
		"\u0000\u072a\u0722\u0001\u0000\u0000\u0000\u072b\u0121\u0001\u0000\u0000"+
		"\u0000\u072c\u072d\u0005)\u0000\u0000\u072d\u0732\u0003\u0120\u0090\u0000"+
		"\u072e\u072f\u0003\u00aaU\u0000\u072f\u0730\u0003\u0124\u0092\u0000\u0730"+
		"\u0732\u0001\u0000\u0000\u0000\u0731\u072c\u0001\u0000\u0000\u0000\u0731"+
		"\u072e\u0001\u0000\u0000\u0000\u0732\u0123\u0001\u0000\u0000\u0000\u0733"+
		"\u0735\u0005O\u0000\u0000\u0734\u0736\u0003\u00ecv\u0000\u0735\u0734\u0001"+
		"\u0000\u0000\u0000\u0735\u0736\u0001\u0000\u0000\u0000\u0736\u0737\u0001"+
		"\u0000\u0000\u0000\u0737\u0738\u0005P\u0000\u0000\u0738\u0125\u0001\u0000"+
		"\u0000\u0000\u00e0\u012a\u012d\u0134\u0139\u013d\u0141\u0148\u0150\u0157"+
		"\u015b\u015e\u0163\u0168\u016e\u0173\u017c\u0188\u018c\u0191\u0195\u0199"+
		"\u019d\u01a7\u01af\u01b7\u01bb\u01c2\u01c9\u01cd\u01d0\u01d3\u01dc\u01e2"+
		"\u01e7\u01ea\u01f0\u01f6\u01fa\u01fe\u0206\u020f\u0216\u021c\u0220\u022c"+
		"\u0235\u023a\u0240\u0244\u0250\u025b\u0260\u026a\u0272\u027c\u0285\u0290"+
		"\u0295\u029e\u02a8\u02ad\u02b6\u02bc\u02c3\u02c8\u02d0\u02d4\u02d6\u02dc"+
		"\u02e1\u02e5\u02ec\u02f2\u02f4\u02fb\u0300\u0305\u0308\u030a\u0314\u031e"+
		"\u0323\u0326\u032b\u0334\u033b\u0346\u034c\u0357\u0361\u036c\u0375\u037a"+
		"\u037d\u0384\u038e\u0396\u0399\u039c\u03a9\u03b1\u03b6\u03be\u03c2\u03c6"+
		"\u03ca\u03ce\u03d0\u03d4\u03da\u03e2\u03ec\u03f5\u03ff\u0407\u0415\u041c"+
		"\u0421\u0427\u0430\u043a\u0443\u044d\u0452\u045d\u0464\u046a\u046d\u0485"+
		"\u048b\u0494\u04ab\u04ae\u04b1\u04b9\u04bd\u04c9\u04d3\u04d9\u04e5\u04f5"+
		"\u0502\u050b\u0514\u051a\u0522\u0528\u052d\u0532\u053a\u053f\u0543\u0547"+
		"\u054b\u054d\u0551\u0556\u055b\u0563\u056c\u0572\u0579\u057f\u0582\u058d"+
		"\u0595\u05a4\u05a8\u05ad\u05b1\u05c1\u05e9\u05ef\u05fc\u0601\u0604\u0606"+
		"\u060c\u0613\u061f\u0628\u062f\u0632\u0636\u0648\u064a\u0652\u065b\u0662"+
		"\u066c\u0673\u067b\u067e\u0685\u068c\u068f\u0694\u0699\u069e\u06a7\u06a9"+
		"\u06ad\u06b2\u06b6\u06ba\u06be\u06c8\u06d4\u06db\u06de\u06e2\u06ea\u06ef"+
		"\u06fa\u0700\u0705\u070a\u0711\u071c\u0724\u0728\u072a\u0731\u0735";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}