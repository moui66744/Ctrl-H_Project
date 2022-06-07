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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		public TerminalNode IMPLEMENTS() { return getToken(JavaQueryParser.IMPLEMENTS, 0); }
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
			setState(312);
			identifier();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(313);
				typeParameters();
				}
			}

			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(316);
				match(EXTENDS);
				setState(317);
				typeList();
				}
			}

			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(320);
				match(IMPLEMENTS);
				setState(321);
				typeList();
				}
			}

			setState(324);
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
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					modifier();
					}
					} 
				}
				setState(331);
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
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(CLASS);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(INTERFACE);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(ENUM);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				match(AT);
				setState(336);
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
			setState(339);
			modifiers();
			setState(340);
			typeTypeOrVoid();
			setState(341);
			identifier();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(342);
				match(ASSIGN);
				setState(343);
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
			setState(346);
			modifiers();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(347);
				typeParameters();
				}
			}

			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(350);
				typeTypeOrVoid();
				}
				break;
			}
			setState(353);
			identifier();
			setState(354);
			match(LPAREN);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(355);
				formalParameterList();
				}
			}

			setState(358);
			match(RPAREN);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(359);
				match(THROWS);
				setState(360);
				qualifiedNameList();
				}
			}

			setState(363);
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
			setState(365);
			match(IMPORT);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(366);
				match(STATIC);
				}
			}

			setState(369);
			qualifiedName();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(370);
				match(DOT);
				setState(371);
				match(MUL);
				}
			}

			setState(374);
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
		public TerminalNode NATIVE() { return getToken(JavaQueryParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaQueryParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaQueryParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaQueryParser.VOLATILE, 0); }
		public TerminalNode PUBLIC() { return getToken(JavaQueryParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaQueryParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaQueryParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaQueryParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaQueryParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaQueryParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaQueryParser.STRICTFP, 0); }
		public TerminalNode SEALED() { return getToken(JavaQueryParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(JavaQueryParser.NON_SEALED, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==SEALED || _la==NON_SEALED) ) {
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			annotation();
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
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
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
				setState(381);
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
			setState(384);
			match(CLASS);
			setState(385);
			identifier();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(386);
				typeParameters();
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(389);
				match(EXTENDS);
				setState(390);
				typeType();
				}
			}

			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(393);
				match(IMPLEMENTS);
				setState(394);
				typeList();
				}
			}

			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(397);
				match(PERMITS);
				setState(398);
				typeList();
				}
			}

			setState(401);
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
			setState(403);
			match(LT);
			setState(404);
			typeParameter();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(405);
				match(COMMA);
				setState(406);
				typeParameter();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
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
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(414);
					annotation();
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(420);
			identifier();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(421);
				match(EXTENDS);
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(422);
						annotation();
						}
						} 
					}
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(428);
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
			setState(431);
			typeType();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(432);
				match(BITAND);
				setState(433);
				typeType();
				}
				}
				setState(438);
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
			setState(439);
			match(ENUM);
			setState(440);
			identifier();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(441);
				match(IMPLEMENTS);
				setState(442);
				typeList();
				}
			}

			setState(445);
			match(LBRACE);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(446);
				enumConstants();
				}
			}

			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(449);
				match(COMMA);
				}
			}

			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(452);
				enumBodyDeclarations();
				}
			}

			setState(455);
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
			setState(457);
			enumConstant();
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					match(COMMA);
					setState(459);
					enumConstant();
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(465);
					annotation();
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(471);
			identifier();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(472);
				arguments();
				}
			}

			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(475);
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
			setState(478);
			match(SEMI);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOID - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(479);
				classBodyDeclaration();
				}
				}
				setState(484);
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
			setState(485);
			match(INTERFACE);
			setState(486);
			identifier();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(487);
				typeParameters();
				}
			}

			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(490);
				match(EXTENDS);
				setState(491);
				typeList();
				}
			}

			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(494);
				match(PERMITS);
				setState(495);
				typeList();
				}
			}

			setState(498);
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
			setState(500);
			match(LBRACE);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOID - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(501);
				classBodyDeclaration();
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
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
			setState(509);
			match(LBRACE);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DEFAULT - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOID - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(510);
				interfaceBodyDeclaration();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
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
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(519);
					match(STATIC);
					}
				}

				setState(522);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(523);
						modifier();
						}
						} 
					}
					setState(528);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(529);
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
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(537);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(538);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(539);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(540);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(541);
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
			setState(544);
			typeTypeOrVoid();
			setState(545);
			identifier();
			setState(546);
			formalParameters();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(547);
				match(LBRACK);
				setState(548);
				match(RBRACK);
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(554);
				match(THROWS);
				setState(555);
				qualifiedNameList();
				}
			}

			setState(558);
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
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
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
			setState(566);
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
				setState(564);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
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
			setState(568);
			typeParameters();
			setState(569);
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
			setState(571);
			typeParameters();
			setState(572);
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
			setState(574);
			identifier();
			setState(575);
			formalParameters();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(576);
				match(THROWS);
				setState(577);
				qualifiedNameList();
				}
			}

			setState(580);
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
			setState(582);
			typeType();
			setState(583);
			variableDeclarators();
			setState(584);
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
			setState(594);
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
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(586);
						modifier();
						}
						} 
					}
					setState(591);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(592);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
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
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(599);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(601);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(602);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(603);
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
			setState(606);
			typeType();
			setState(607);
			constantDeclarator();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(608);
				match(COMMA);
				setState(609);
				constantDeclarator();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
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
			setState(617);
			identifier();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(618);
				match(LBRACK);
				setState(619);
				match(RBRACK);
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			match(ASSIGN);
			setState(626);
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
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(628);
					interfaceMethodModifier();
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(634);
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
			setState(642);
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
				setState(636);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(640);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(641);
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
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (DEFAULT - 2)) | (1L << (PUBLIC - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(644);
				interfaceMethodModifier();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			typeParameters();
			setState(651);
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
			setState(656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(653);
					annotation();
					}
					} 
				}
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(659);
			typeTypeOrVoid();
			setState(660);
			identifier();
			setState(661);
			formalParameters();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(662);
				match(LBRACK);
				setState(663);
				match(RBRACK);
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(669);
				match(THROWS);
				setState(670);
				qualifiedNameList();
				}
			}

			setState(673);
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
			setState(675);
			variableDeclarator();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(676);
				match(COMMA);
				setState(677);
				variableDeclarator();
				}
				}
				setState(682);
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
			setState(683);
			variableDeclaratorId();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(684);
				match(ASSIGN);
				setState(685);
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
			setState(688);
			identifier();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(689);
				match(LBRACK);
				setState(690);
				match(RBRACK);
				}
				}
				setState(695);
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
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
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
				setState(697);
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
			setState(700);
			match(LBRACE);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LBRACE - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(701);
				variableInitializer();
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(702);
						match(COMMA);
						setState(703);
						variableInitializer();
						}
						} 
					}
					setState(708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(709);
					match(COMMA);
					}
				}

				}
			}

			setState(714);
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
			setState(716);
			identifier();
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(717);
				typeArguments();
				}
				break;
			}
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(720);
					match(DOT);
					setState(721);
					identifier();
					setState(723);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(722);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(731);
					annotation();
					}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(737);
				match(QUESTION);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(738);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(739);
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
			setState(744);
			qualifiedName();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				qualifiedName();
				}
				}
				setState(751);
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
			setState(752);
			match(LPAREN);
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(753);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(756);
				receiverParameter();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(757);
					match(COMMA);
					setState(758);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(761);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(766);
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
			setState(768);
			typeType();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(769);
				identifier();
				setState(770);
				match(DOT);
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
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
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				formalParameter();
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(780);
						match(COMMA);
						setState(781);
						formalParameter();
						}
						} 
					}
					setState(786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(787);
					match(COMMA);
					setState(788);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
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
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(794);
					variableModifier();
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(800);
			typeType();
			setState(801);
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
			setState(806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(803);
					variableModifier();
					}
					} 
				}
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(809);
			typeType();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(810);
				annotation();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816);
			match(ELLIPSIS);
			setState(817);
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
			setState(819);
			lambdaLVTIParameter();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(820);
				match(COMMA);
				setState(821);
				lambdaLVTIParameter();
				}
				}
				setState(826);
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
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(827);
					variableModifier();
					}
					} 
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(833);
			match(VAR);
			setState(834);
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
			setState(836);
			identifier();
			setState(841);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(837);
					match(DOT);
					setState(838);
					identifier();
					}
					} 
				}
				setState(843);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(846);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(847);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(848);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(849);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(850);
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
			setState(853);
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
			setState(855);
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
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(857);
				identifier();
				setState(858);
				match(DOT);
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
			match(AT);
			setState(866);
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
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(868);
				match(AT);
				setState(869);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(870);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(873);
				match(LPAREN);
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(874);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(875);
					elementValue();
					}
					break;
				}
				setState(878);
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
			setState(881);
			elementValuePair();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(882);
				match(COMMA);
				setState(883);
				elementValuePair();
				}
				}
				setState(888);
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
			setState(889);
			identifier();
			setState(890);
			match(ASSIGN);
			setState(891);
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
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(895);
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
			setState(898);
			match(LBRACE);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LBRACE - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(899);
				elementValue();
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(900);
						match(COMMA);
						setState(901);
						elementValue();
						}
						} 
					}
					setState(906);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
			}

			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(909);
				match(COMMA);
				}
			}

			setState(912);
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
			setState(914);
			match(AT);
			setState(915);
			match(INTERFACE);
			setState(916);
			identifier();
			setState(917);
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
			setState(919);
			match(LBRACE);
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (SEMI - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(920);
				annotationTypeElementDeclaration();
				}
				}
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(936);
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
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(928);
						modifier();
						}
						} 
					}
					setState(933);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				setState(934);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
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
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				typeType();
				setState(939);
				annotationMethodOrConstantRest();
				setState(940);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				classDeclaration();
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(943);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				interfaceDeclaration();
				setState(948);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(947);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(950);
				enumDeclaration();
				setState(952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(951);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(954);
				annotationTypeDeclaration();
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(955);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(958);
				recordDeclaration();
				setState(960);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(959);
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
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
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
			setState(968);
			identifier();
			setState(969);
			match(LPAREN);
			setState(970);
			match(RPAREN);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(971);
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
			setState(974);
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
			setState(976);
			match(DEFAULT);
			setState(977);
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
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(979);
				match(OPEN);
				}
			}

			setState(982);
			match(MODULE);
			setState(983);
			qualifiedName();
			setState(984);
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
			setState(986);
			match(LBRACE);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << USES) | (1L << PROVIDES))) != 0)) {
				{
				{
				setState(987);
				moduleDirective();
				}
				}
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(993);
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
			setState(1031);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				match(REQUIRES);
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(996);
						requiresModifier();
						}
						} 
					}
					setState(1001);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				setState(1002);
				qualifiedName();
				setState(1003);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(EXPORTS);
				setState(1006);
				qualifiedName();
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1007);
					match(TO);
					setState(1008);
					qualifiedName();
					}
				}

				setState(1011);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				match(OPENS);
				setState(1014);
				qualifiedName();
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1015);
					match(TO);
					setState(1016);
					qualifiedName();
					}
				}

				setState(1019);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1021);
				match(USES);
				setState(1022);
				qualifiedName();
				setState(1023);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1025);
				match(PROVIDES);
				setState(1026);
				qualifiedName();
				setState(1027);
				match(WITH);
				setState(1028);
				qualifiedName();
				setState(1029);
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
			setState(1033);
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
			setState(1035);
			match(RECORD);
			setState(1036);
			identifier();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1037);
				typeParameters();
				}
			}

			setState(1040);
			recordHeader();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1041);
				match(IMPLEMENTS);
				setState(1042);
				typeList();
				}
			}

			setState(1045);
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
			setState(1047);
			match(LPAREN);
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(1048);
				recordComponentList();
				}
			}

			setState(1051);
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
			setState(1053);
			recordComponent();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1054);
				match(COMMA);
				setState(1055);
				recordComponent();
				}
				}
				setState(1060);
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
			setState(1061);
			typeType();
			setState(1062);
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
			setState(1064);
			match(LBRACE);
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (ABSTRACT - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BYTE - 2)) | (1L << (CHAR - 2)) | (1L << (CLASS - 2)) | (1L << (DOUBLE - 2)) | (1L << (ENUM - 2)) | (1L << (FINAL - 2)) | (1L << (FLOAT - 2)) | (1L << (INT - 2)) | (1L << (INTERFACE - 2)) | (1L << (LONG - 2)) | (1L << (NATIVE - 2)) | (1L << (PRIVATE - 2)) | (1L << (PROTECTED - 2)) | (1L << (PUBLIC - 2)) | (1L << (SHORT - 2)) | (1L << (STATIC - 2)) | (1L << (STRICTFP - 2)) | (1L << (SYNCHRONIZED - 2)) | (1L << (TRANSIENT - 2)) | (1L << (VOID - 2)) | (1L << (VOLATILE - 2)) | (1L << (MODULE - 2)) | (1L << (OPEN - 2)) | (1L << (REQUIRES - 2)) | (1L << (EXPORTS - 2)) | (1L << (OPENS - 2)) | (1L << (TO - 2)) | (1L << (USES - 2)) | (1L << (PROVIDES - 2)) | (1L << (WITH - 2)) | (1L << (TRANSITIVE - 2)) | (1L << (VAR - 2)) | (1L << (YIELD - 2)) | (1L << (RECORD - 2)) | (1L << (SEALED - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PERMITS - 66)) | (1L << (NON_SEALED - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(1065);
				classBodyDeclaration();
				}
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
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
			setState(1073);
			match(LBRACE);
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CASE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << IMPORT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << MODULE) | (1L << OPEN) | (1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << TO) | (1L << USES) | (1L << PROVIDES) | (1L << WITH) | (1L << TRANSITIVE) | (1L << VAR) | (1L << YIELD))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RECORD - 64)) | (1L << (SEALED - 64)) | (1L << (PERMITS - 64)) | (1L << (NON_SEALED - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (OCT_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOAT_LITERAL - 64)) | (1L << (HEX_FLOAT_LITERAL - 64)) | (1L << (BOOL_LITERAL - 64)) | (1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1074);
				subQuery();
				}
				}
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1080);
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
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				localVariableDeclaration();
				setState(1083);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1086);
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
			setState(1092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1089);
					variableModifier();
					}
					} 
				}
				setState(1094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1095);
				typeType();
				setState(1096);
				variableDeclarators();
				}
				break;
			case 2:
				{
				setState(1098);
				match(VAR);
				setState(1099);
				identifier();
				setState(1100);
				match(ASSIGN);
				setState(1101);
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
			setState(1105);
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
			setState(1119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case INTERFACE:
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
				setState(1110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1107);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(1116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1113);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1114);
					interfaceDeclaration();
					}
					break;
				case RECORD:
					{
					setState(1115);
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
				setState(1118);
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
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1121);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				assertStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1123);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1125);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1126);
				doWhileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1127);
				tryStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1128);
				tryWithRescource();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1129);
				switchStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1130);
				synchronizedStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1131);
				returnStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1132);
				throwStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1133);
				breakStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1134);
				continueStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1135);
				yieldStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1136);
				emptyStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1137);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1138);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1140);
				switchExpStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1141);
				labelStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1142);
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
			setState(1145);
			match(ASSERT);
			setState(1146);
			expression(0);
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1147);
				match(COLON);
				setState(1148);
				expression(0);
				}
			}

			setState(1151);
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
			setState(1153);
			match(IF);
			setState(1154);
			parExpression();
			setState(1155);
			block();
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1156);
				match(ELSE);
				setState(1157);
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
			setState(1160);
			match(FOR);
			setState(1161);
			match(LPAREN);
			setState(1162);
			forControl();
			setState(1163);
			match(RPAREN);
			setState(1164);
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
			setState(1166);
			match(WHILE);
			setState(1167);
			parExpression();
			setState(1168);
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
			setState(1170);
			match(DO);
			setState(1171);
			block();
			setState(1172);
			match(WHILE);
			setState(1173);
			parExpression();
			setState(1174);
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
			setState(1176);
			match(TRY);
			setState(1177);
			block();
			setState(1187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATCH:
				{
				setState(1179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1178);
					catchClause();
					}
					}
					setState(1181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1183);
					finallyBlock();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(1186);
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
			setState(1189);
			match(TRY);
			setState(1190);
			resourceSpecification();
			setState(1191);
			block();
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1192);
				catchClause();
				}
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1198);
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
			setState(1201);
			match(SWITCH);
			setState(1202);
			parExpression();
			setState(1203);
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
			setState(1205);
			match(SYNCHRONIZED);
			setState(1206);
			parExpression();
			setState(1207);
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
			setState(1209);
			match(RETURN);
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1210);
				expression(0);
				}
			}

			setState(1213);
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
			setState(1215);
			match(THROW);
			setState(1216);
			expression(0);
			setState(1217);
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
			setState(1219);
			match(BREAK);
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1220);
				identifier();
				}
			}

			setState(1223);
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
			setState(1225);
			match(CONTINUE);
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1226);
				identifier();
				}
			}

			setState(1229);
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
			setState(1231);
			match(YIELD);
			setState(1232);
			expression(0);
			setState(1233);
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
			setState(1235);
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
			setState(1237);
			switchExpression();
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1238);
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
			setState(1241);
			((LabelStmtContext)_localctx).identifierLabel = identifier();
			setState(1242);
			match(COLON);
			setState(1243);
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
			setState(1245);
			match(CASE);
			setState(1246);
			expression(0);
			setState(1247);
			match(COLON);
			setState(1248);
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
			setState(1250);
			match(CATCH);
			setState(1251);
			match(LPAREN);
			setState(1255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1252);
					variableModifier();
					}
					} 
				}
				setState(1257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1258);
			catchType();
			setState(1259);
			identifier();
			setState(1260);
			match(RPAREN);
			setState(1261);
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
			setState(1263);
			qualifiedName();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1264);
				match(BITOR);
				setState(1265);
				qualifiedName();
				}
				}
				setState(1270);
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
			setState(1271);
			match(FINALLY);
			setState(1272);
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
			setState(1274);
			match(LPAREN);
			setState(1275);
			resources();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1276);
				match(SEMI);
				}
			}

			setState(1279);
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
			setState(1281);
			resource();
			setState(1286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1282);
					match(SEMI);
					setState(1283);
					resource();
					}
					} 
				}
				setState(1288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1289);
						variableModifier();
						}
						} 
					}
					setState(1294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1295);
					classOrInterfaceType();
					setState(1296);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1298);
					match(VAR);
					setState(1299);
					identifier();
					}
					break;
				}
				setState(1302);
				match(ASSIGN);
				setState(1303);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
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
			setState(1309); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1308);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1311); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1313);
				blockStatement();
				}
				}
				setState(1316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ASSERT - 3)) | (1L << (BOOLEAN - 3)) | (1L << (BREAK - 3)) | (1L << (BYTE - 3)) | (1L << (CASE - 3)) | (1L << (CHAR - 3)) | (1L << (CLASS - 3)) | (1L << (CONTINUE - 3)) | (1L << (DO - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (FOR - 3)) | (1L << (IF - 3)) | (1L << (INT - 3)) | (1L << (INTERFACE - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (RETURN - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (SYNCHRONIZED - 3)) | (1L << (THIS - 3)) | (1L << (THROW - 3)) | (1L << (TRY - 3)) | (1L << (VOID - 3)) | (1L << (WHILE - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0) );
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
			setState(1329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				match(CASE);
				setState(1324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1319);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1320);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1321);
					typeType();
					setState(1322);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1326);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				match(DEFAULT);
				setState(1328);
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
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1332);
					forInit();
					}
				}

				setState(1335);
				match(SEMI);
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1336);
					expression(0);
					}
				}

				setState(1339);
				match(SEMI);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1340);
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
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
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
			setState(1352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1349);
					variableModifier();
					}
					} 
				}
				setState(1354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1355);
				typeType();
				}
				break;
			case 2:
				{
				setState(1356);
				match(VAR);
				}
				break;
			}
			setState(1359);
			variableDeclaratorId();
			setState(1360);
			match(COLON);
			setState(1361);
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
			setState(1363);
			match(LPAREN);
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1364);
				expression(0);
				}
			}

			setState(1367);
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
			setState(1369);
			expression(0);
			setState(1374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1370);
				match(COMMA);
				setState(1371);
				expression(0);
				}
				}
				setState(1376);
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
			setState(1396);
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
				setState(1377);
				identifier();
				setState(1378);
				match(LPAREN);
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1379);
					expressionList();
					}
				}

				setState(1382);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				match(THIS);
				setState(1385);
				match(LPAREN);
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1386);
					expressionList();
					}
				}

				setState(1389);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1390);
				match(SUPER);
				setState(1391);
				match(LPAREN);
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(1392);
					expressionList();
					}
				}

				setState(1395);
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
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1399);
				primary();
				}
				break;
			case 2:
				{
				setState(1400);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1401);
				match(NEW);
				setState(1402);
				creator();
				}
				break;
			case 4:
				{
				setState(1403);
				match(LPAREN);
				setState(1407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1404);
						annotation();
						}
						} 
					}
					setState(1409);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1410);
				typeType();
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1411);
					match(BITAND);
					setState(1412);
					typeType();
					}
					}
					setState(1417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1418);
				match(RPAREN);
				setState(1419);
				expression(22);
				}
				break;
			case 5:
				{
				setState(1421);
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
				setState(1422);
				expression(20);
				}
				break;
			case 6:
				{
				setState(1423);
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
				setState(1424);
				expression(19);
				}
				break;
			case 7:
				{
				setState(1425);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1426);
				switchExpression();
				}
				break;
			case 9:
				{
				setState(1427);
				typeType();
				setState(1428);
				match(COLONCOLON);
				setState(1434);
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
					setState(1430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1429);
						typeArguments();
						}
					}

					setState(1432);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1433);
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
				setState(1436);
				classType();
				setState(1437);
				match(COLONCOLON);
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1438);
					typeArguments();
					}
				}

				setState(1441);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1526);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1445);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1446);
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
						setState(1447);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1448);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1449);
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
						setState(1450);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1451);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1459);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1452);
							match(LT);
							setState(1453);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1454);
							match(GT);
							setState(1455);
							match(GT);
							setState(1456);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1457);
							match(GT);
							setState(1458);
							match(GT);
							}
							break;
						}
						setState(1461);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1462);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1463);
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
						setState(1464);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1465);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1466);
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
						setState(1467);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1468);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1469);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1470);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1471);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1472);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1473);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1474);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1475);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1476);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1477);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1478);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1479);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1480);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1481);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1482);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1483);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1484);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1485);
						expression(0);
						setState(1486);
						match(COLON);
						setState(1487);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1489);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1490);
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
						setState(1491);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1492);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1493);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1505);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1494);
							identifier();
							}
							break;
						case 2:
							{
							setState(1495);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1496);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1497);
							match(NEW);
							setState(1499);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1498);
								nonWildcardTypeArguments();
								}
							}

							setState(1501);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1502);
							match(SUPER);
							setState(1503);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1504);
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
						setState(1507);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1508);
						match(LBRACK);
						setState(1509);
						expression(0);
						setState(1510);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1512);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1513);
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
						setState(1514);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1515);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1518);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
						case 1:
							{
							setState(1516);
							typeType();
							}
							break;
						case 2:
							{
							setState(1517);
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
						setState(1520);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1521);
						match(COLONCOLON);
						setState(1523);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1522);
							typeArguments();
							}
						}

						setState(1525);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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
			setState(1534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1531);
					variableModifier();
					}
					} 
				}
				setState(1536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1537);
			typeType();
			setState(1541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1538);
					annotation();
					}
					} 
				}
				setState(1543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			setState(1544);
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
			setState(1546);
			lambdaParameters();
			setState(1547);
			match(ARROW);
			setState(1548);
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
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1551);
				match(LPAREN);
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (SHORT - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1552);
					formalParameterList();
					}
				}

				setState(1555);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1556);
				match(LPAREN);
				setState(1557);
				identifier();
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1558);
					match(COMMA);
					setState(1559);
					identifier();
					}
					}
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1565);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1567);
				match(LPAREN);
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (FINAL - 19)) | (1L << (MODULE - 19)) | (1L << (OPEN - 19)) | (1L << (REQUIRES - 19)) | (1L << (EXPORTS - 19)) | (1L << (OPENS - 19)) | (1L << (TO - 19)) | (1L << (USES - 19)) | (1L << (PROVIDES - 19)) | (1L << (WITH - 19)) | (1L << (TRANSITIVE - 19)) | (1L << (VAR - 19)) | (1L << (YIELD - 19)) | (1L << (RECORD - 19)) | (1L << (SEALED - 19)) | (1L << (PERMITS - 19)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1568);
					lambdaLVTIList();
					}
				}

				setState(1571);
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
			setState(1576);
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
				setState(1574);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1575);
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
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578);
				match(LPAREN);
				setState(1579);
				expression(0);
				setState(1580);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1583);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1584);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1585);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1586);
				typeTypeOrVoid();
				setState(1587);
				match(DOT);
				setState(1588);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1590);
				nonWildcardTypeArguments();
				setState(1594);
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
					setState(1591);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1592);
					match(THIS);
					setState(1593);
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
			setState(1598);
			match(SWITCH);
			setState(1599);
			parExpression();
			setState(1600);
			match(LBRACE);
			setState(1604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1601);
				switchLabeledRule();
				}
				}
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1607);
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
			setState(1620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				match(CASE);
				setState(1613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1610);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1611);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1612);
					guardedPattern(0);
					}
					break;
				}
				setState(1615);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1616);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617);
				match(DEFAULT);
				setState(1618);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1619);
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
			setState(1648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1623);
				match(LPAREN);
				setState(1624);
				guardedPattern(0);
				setState(1625);
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
				setState(1630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1627);
						variableModifier();
						}
						} 
					}
					setState(1632);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				setState(1633);
				typeType();
				setState(1637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1634);
						annotation();
						}
						} 
					}
					setState(1639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				setState(1640);
				identifier();
				setState(1645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1641);
						match(AND);
						setState(1642);
						expression(0);
						}
						} 
					}
					setState(1647);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1650);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1651);
					match(AND);
					setState(1652);
					expression(0);
					}
					} 
				}
				setState(1657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
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
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1659);
						blockStatement();
						}
						} 
					}
					setState(1664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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
			setState(1670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1667);
				classOrInterfaceType();
				setState(1668);
				match(DOT);
				}
				break;
			}
			setState(1675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1672);
					annotation();
					}
					} 
				}
				setState(1677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1678);
			identifier();
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1679);
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
			setState(1691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				nonWildcardTypeArguments();
				setState(1683);
				createdName();
				setState(1684);
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
				setState(1686);
				createdName();
				setState(1689);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1687);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1688);
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
			setState(1708);
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
				setState(1693);
				identifier();
				setState(1695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1694);
					typeArgumentsOrDiamond();
					}
				}

				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1697);
					match(DOT);
					setState(1698);
					identifier();
					setState(1700);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1699);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1706);
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
				setState(1707);
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
			setState(1710);
			identifier();
			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1711);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1714);
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
			setState(1716);
			match(LBRACK);
			setState(1744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1717);
				match(RBRACK);
				setState(1722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1718);
					match(LBRACK);
					setState(1719);
					match(RBRACK);
					}
					}
					setState(1724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1725);
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
				setState(1726);
				expression(0);
				setState(1727);
				match(RBRACK);
				setState(1734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1728);
						match(LBRACK);
						setState(1729);
						expression(0);
						setState(1730);
						match(RBRACK);
						}
						} 
					}
					setState(1736);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				setState(1741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1737);
						match(LBRACK);
						setState(1738);
						match(RBRACK);
						}
						} 
					}
					setState(1743);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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
			setState(1746);
			arguments();
			setState(1748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1747);
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
			setState(1750);
			nonWildcardTypeArguments();
			setState(1751);
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
			setState(1756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1753);
				match(LT);
				setState(1754);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1755);
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
			setState(1761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1758);
				match(LT);
				setState(1759);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1760);
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
			setState(1763);
			match(LT);
			setState(1764);
			typeList();
			setState(1765);
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
			setState(1767);
			typeType();
			setState(1772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1768);
				match(COMMA);
				setState(1769);
				typeType();
				}
				}
				setState(1774);
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
			setState(1778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1775);
					annotation();
					}
					} 
				}
				setState(1780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			setState(1783);
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
				setState(1781);
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
				setState(1782);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1788);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (MODULE - 52)) | (1L << (OPEN - 52)) | (1L << (REQUIRES - 52)) | (1L << (EXPORTS - 52)) | (1L << (OPENS - 52)) | (1L << (TO - 52)) | (1L << (USES - 52)) | (1L << (PROVIDES - 52)) | (1L << (WITH - 52)) | (1L << (TRANSITIVE - 52)) | (1L << (VAR - 52)) | (1L << (YIELD - 52)) | (1L << (RECORD - 52)) | (1L << (SEALED - 52)) | (1L << (PERMITS - 52)))) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1785);
						annotation();
						}
						}
						setState(1790);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1791);
					match(LBRACK);
					setState(1792);
					match(RBRACK);
					}
					} 
				}
				setState(1797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
			setState(1798);
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
			setState(1800);
			match(LT);
			setState(1801);
			typeArgument();
			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1802);
				match(COMMA);
				setState(1803);
				typeArgument();
				}
				}
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1809);
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
			setState(1820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1811);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				match(DOT);
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1813);
					typeArguments();
					}
				}

				setState(1816);
				identifier();
				setState(1818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1817);
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
			setState(1827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1822);
				match(SUPER);
				setState(1823);
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
				setState(1824);
				identifier();
				setState(1825);
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
			setState(1829);
			match(LPAREN);
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOLEAN - 4)) | (1L << (BYTE - 4)) | (1L << (CHAR - 4)) | (1L << (DOUBLE - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (VOID - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (TEXT_BLOCK - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (LPAREN - 68)) | (1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1830);
				expressionList();
				}
			}

			setState(1833);
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
		"\u0004\u0001\u0081\u072c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u013b\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u013f\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0143\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004\u0148\b"+
		"\u0004\n\u0004\f\u0004\u014b\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0152\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0159\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u015d\b\u0007\u0001\u0007\u0003\u0007\u0160\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0165\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u016a\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0003\b\u0170\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0175\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u017f\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u0184\b\f\u0001\f\u0001\f\u0003\f\u0188\b\f\u0001\f\u0001\f\u0003\f\u018c"+
		"\b\f\u0001\f\u0001\f\u0003\f\u0190\b\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u0198\b\r\n\r\f\r\u019b\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0005\u000e\u01a0\b\u000e\n\u000e\f\u000e\u01a3\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u01a8\b\u000e\n\u000e\f\u000e\u01ab"+
		"\t\u000e\u0001\u000e\u0003\u000e\u01ae\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u01b3\b\u000f\n\u000f\f\u000f\u01b6\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01bc\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u01c0\b\u0010\u0001\u0010\u0003\u0010\u01c3"+
		"\b\u0010\u0001\u0010\u0003\u0010\u01c6\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01cd\b\u0011\n\u0011"+
		"\f\u0011\u01d0\t\u0011\u0001\u0012\u0005\u0012\u01d3\b\u0012\n\u0012\f"+
		"\u0012\u01d6\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01da\b\u0012"+
		"\u0001\u0012\u0003\u0012\u01dd\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u01e1\b\u0013\n\u0013\f\u0013\u01e4\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01e9\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01ed"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01f1\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u01f7\b\u0015\n\u0015"+
		"\f\u0015\u01fa\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0200\b\u0016\n\u0016\f\u0016\u0203\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0209\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u020d\b\u0017\n\u0017\f\u0017\u0210\t\u0017\u0001\u0017"+
		"\u0003\u0017\u0213\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u021f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0226\b\u0019\n\u0019\f\u0019\u0229\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u022d\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0233\b\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0237\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0243\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0005 \u024c\b \n \f \u024f\t \u0001 \u0001"+
		" \u0003 \u0253\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u025d\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0263\b\"\n"+
		"\"\f\"\u0266\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u026d\b#"+
		"\n#\f#\u0270\t#\u0001#\u0001#\u0001#\u0001$\u0005$\u0276\b$\n$\f$\u0279"+
		"\t$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0283"+
		"\b%\u0001&\u0005&\u0286\b&\n&\f&\u0289\t&\u0001&\u0001&\u0001&\u0001\'"+
		"\u0005\'\u028f\b\'\n\'\f\'\u0292\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u0299\b\'\n\'\f\'\u029c\t\'\u0001\'\u0001\'\u0003\'\u02a0\b"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0005(\u02a7\b(\n(\f(\u02aa\t"+
		"(\u0001)\u0001)\u0001)\u0003)\u02af\b)\u0001*\u0001*\u0001*\u0005*\u02b4"+
		"\b*\n*\f*\u02b7\t*\u0001+\u0001+\u0003+\u02bb\b+\u0001,\u0001,\u0001,"+
		"\u0001,\u0005,\u02c1\b,\n,\f,\u02c4\t,\u0001,\u0003,\u02c7\b,\u0003,\u02c9"+
		"\b,\u0001,\u0001,\u0001-\u0001-\u0003-\u02cf\b-\u0001-\u0001-\u0001-\u0003"+
		"-\u02d4\b-\u0005-\u02d6\b-\n-\f-\u02d9\t-\u0001.\u0001.\u0005.\u02dd\b"+
		".\n.\f.\u02e0\t.\u0001.\u0001.\u0001.\u0003.\u02e5\b.\u0003.\u02e7\b."+
		"\u0001/\u0001/\u0001/\u0005/\u02ec\b/\n/\f/\u02ef\t/\u00010\u00010\u0003"+
		"0\u02f3\b0\u00010\u00010\u00010\u00030\u02f8\b0\u00010\u00030\u02fb\b"+
		"0\u00030\u02fd\b0\u00010\u00010\u00011\u00011\u00011\u00011\u00051\u0305"+
		"\b1\n1\f1\u0308\t1\u00011\u00011\u00012\u00012\u00012\u00052\u030f\b2"+
		"\n2\f2\u0312\t2\u00012\u00012\u00032\u0316\b2\u00012\u00032\u0319\b2\u0001"+
		"3\u00053\u031c\b3\n3\f3\u031f\t3\u00013\u00013\u00013\u00014\u00054\u0325"+
		"\b4\n4\f4\u0328\t4\u00014\u00014\u00054\u032c\b4\n4\f4\u032f\t4\u0001"+
		"4\u00014\u00014\u00015\u00015\u00015\u00055\u0337\b5\n5\f5\u033a\t5\u0001"+
		"6\u00056\u033d\b6\n6\f6\u0340\t6\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00057\u0348\b7\n7\f7\u034b\t7\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u0354\b8\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0005;\u035d\b;\n;\f;\u0360\t;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0003<\u0368\b<\u0001<\u0001<\u0001<\u0003<\u036d\b<\u0001<\u0003<\u0370"+
		"\b<\u0001=\u0001=\u0001=\u0005=\u0375\b=\n=\f=\u0378\t=\u0001>\u0001>"+
		"\u0001>\u0001>\u0001?\u0001?\u0001?\u0003?\u0381\b?\u0001@\u0001@\u0001"+
		"@\u0001@\u0005@\u0387\b@\n@\f@\u038a\t@\u0003@\u038c\b@\u0001@\u0003@"+
		"\u038f\b@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001"+
		"B\u0005B\u039a\bB\nB\fB\u039d\tB\u0001B\u0001B\u0001C\u0005C\u03a2\bC"+
		"\nC\fC\u03a5\tC\u0001C\u0001C\u0003C\u03a9\bC\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0003D\u03b1\bD\u0001D\u0001D\u0003D\u03b5\bD\u0001D\u0001"+
		"D\u0003D\u03b9\bD\u0001D\u0001D\u0003D\u03bd\bD\u0001D\u0001D\u0003D\u03c1"+
		"\bD\u0003D\u03c3\bD\u0001E\u0001E\u0003E\u03c7\bE\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u03cd\bF\u0001G\u0001G\u0001H\u0001H\u0001H\u0001I\u0003"+
		"I\u03d5\bI\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0005J\u03dd\bJ\n"+
		"J\fJ\u03e0\tJ\u0001J\u0001J\u0001K\u0001K\u0005K\u03e6\bK\nK\fK\u03e9"+
		"\tK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u03f2\bK\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u03fa\bK\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003"+
		"K\u0408\bK\u0001L\u0001L\u0001M\u0001M\u0001M\u0003M\u040f\bM\u0001M\u0001"+
		"M\u0001M\u0003M\u0414\bM\u0001M\u0001M\u0001N\u0001N\u0003N\u041a\bN\u0001"+
		"N\u0001N\u0001O\u0001O\u0001O\u0005O\u0421\bO\nO\fO\u0424\tO\u0001P\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0005Q\u042b\bQ\nQ\fQ\u042e\tQ\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0005R\u0434\bR\nR\fR\u0437\tR\u0001R\u0001R\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u0440\bS\u0001T\u0005T\u0443\bT\nT\fT\u0446\tT"+
		"\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0003T\u0450"+
		"\bT\u0001U\u0001U\u0001V\u0005V\u0455\bV\nV\fV\u0458\tV\u0001V\u0001V"+
		"\u0001V\u0003V\u045d\bV\u0001V\u0003V\u0460\bV\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0003W\u0478"+
		"\bW\u0001X\u0001X\u0001X\u0001X\u0003X\u047e\bX\u0001X\u0001X\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0003Y\u0487\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001]\u0001]\u0001]\u0004]\u049c\b]\u000b]\f]\u049d\u0001"+
		"]\u0003]\u04a1\b]\u0001]\u0003]\u04a4\b]\u0001^\u0001^\u0001^\u0001^\u0005"+
		"^\u04aa\b^\n^\f^\u04ad\t^\u0001^\u0003^\u04b0\b^\u0001_\u0001_\u0001_"+
		"\u0001_\u0001`\u0001`\u0001`\u0001`\u0001a\u0001a\u0003a\u04bc\ba\u0001"+
		"a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001c\u0001c\u0003c\u04c6\bc\u0001"+
		"c\u0001c\u0001d\u0001d\u0003d\u04cc\bd\u0001d\u0001d\u0001e\u0001e\u0001"+
		"e\u0001e\u0001f\u0001f\u0001g\u0001g\u0003g\u04d8\bg\u0001h\u0001h\u0001"+
		"h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001i\u0001j\u0001j\u0001j\u0005"+
		"j\u04e6\bj\nj\fj\u04e9\tj\u0001j\u0001j\u0001j\u0001j\u0001j\u0001k\u0001"+
		"k\u0001k\u0005k\u04f3\bk\nk\fk\u04f6\tk\u0001l\u0001l\u0001l\u0001m\u0001"+
		"m\u0001m\u0003m\u04fe\bm\u0001m\u0001m\u0001n\u0001n\u0001n\u0005n\u0505"+
		"\bn\nn\fn\u0508\tn\u0001o\u0005o\u050b\bo\no\fo\u050e\to\u0001o\u0001"+
		"o\u0001o\u0001o\u0001o\u0003o\u0515\bo\u0001o\u0001o\u0001o\u0001o\u0003"+
		"o\u051b\bo\u0001p\u0004p\u051e\bp\u000bp\fp\u051f\u0001p\u0004p\u0523"+
		"\bp\u000bp\fp\u0524\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u052d"+
		"\bq\u0001q\u0001q\u0001q\u0003q\u0532\bq\u0001r\u0001r\u0003r\u0536\b"+
		"r\u0001r\u0001r\u0003r\u053a\br\u0001r\u0001r\u0003r\u053e\br\u0003r\u0540"+
		"\br\u0001s\u0001s\u0003s\u0544\bs\u0001t\u0005t\u0547\bt\nt\ft\u054a\t"+
		"t\u0001t\u0001t\u0003t\u054e\bt\u0001t\u0001t\u0001t\u0001t\u0001u\u0001"+
		"u\u0003u\u0556\bu\u0001u\u0001u\u0001v\u0001v\u0001v\u0005v\u055d\bv\n"+
		"v\fv\u0560\tv\u0001w\u0001w\u0001w\u0003w\u0565\bw\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0003w\u056c\bw\u0001w\u0001w\u0001w\u0001w\u0003w\u0572"+
		"\bw\u0001w\u0003w\u0575\bw\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0005x\u057e\bx\nx\fx\u0581\tx\u0001x\u0001x\u0001x\u0005x\u0586\bx"+
		"\nx\fx\u0589\tx\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0003x\u0597\bx\u0001x\u0001x\u0003x\u059b"+
		"\bx\u0001x\u0001x\u0001x\u0003x\u05a0\bx\u0001x\u0001x\u0003x\u05a4\b"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0003x\u05b4\bx\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0003x\u05dc\bx\u0001x\u0001x\u0001x\u0001"+
		"x\u0003x\u05e2\bx\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0003x\u05ef\bx\u0001x\u0001x\u0001x\u0003x\u05f4"+
		"\bx\u0001x\u0005x\u05f7\bx\nx\fx\u05fa\tx\u0001y\u0005y\u05fd\by\ny\f"+
		"y\u0600\ty\u0001y\u0001y\u0005y\u0604\by\ny\fy\u0607\ty\u0001y\u0001y"+
		"\u0001z\u0001z\u0001z\u0001z\u0001{\u0001{\u0001{\u0003{\u0612\b{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0005{\u0619\b{\n{\f{\u061c\t{\u0001{\u0001"+
		"{\u0001{\u0001{\u0003{\u0622\b{\u0001{\u0003{\u0625\b{\u0001|\u0001|\u0003"+
		"|\u0629\b|\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001"+
		"}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0003}\u063b\b}\u0003"+
		"}\u063d\b}\u0001~\u0001~\u0001~\u0001~\u0005~\u0643\b~\n~\f~\u0646\t~"+
		"\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f"+
		"\u064e\b\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0003\u007f\u0655\b\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0005\u0080\u065d\b\u0080\n\u0080\f\u0080\u0660"+
		"\t\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u0664\b\u0080\n\u0080\f\u0080"+
		"\u0667\t\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u066c\b"+
		"\u0080\n\u0080\f\u0080\u066f\t\u0080\u0003\u0080\u0671\b\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0005\u0080\u0676\b\u0080\n\u0080\f\u0080\u0679"+
		"\t\u0080\u0001\u0081\u0001\u0081\u0005\u0081\u067d\b\u0081\n\u0081\f\u0081"+
		"\u0680\t\u0081\u0003\u0081\u0682\b\u0081\u0001\u0082\u0001\u0082\u0001"+
		"\u0082\u0003\u0082\u0687\b\u0082\u0001\u0082\u0005\u0082\u068a\b\u0082"+
		"\n\u0082\f\u0082\u068d\t\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u0691"+
		"\b\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0003\u0083\u069a\b\u0083\u0003\u0083\u069c\b\u0083"+
		"\u0001\u0084\u0001\u0084\u0003\u0084\u06a0\b\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0003\u0084\u06a5\b\u0084\u0005\u0084\u06a7\b\u0084\n\u0084"+
		"\f\u0084\u06aa\t\u0084\u0001\u0084\u0003\u0084\u06ad\b\u0084\u0001\u0085"+
		"\u0001\u0085\u0003\u0085\u06b1\b\u0085\u0001\u0085\u0001\u0085\u0001\u0086"+
		"\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086\u06b9\b\u0086\n\u0086"+
		"\f\u0086\u06bc\t\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086\u06c5\b\u0086\n\u0086"+
		"\f\u0086\u06c8\t\u0086\u0001\u0086\u0001\u0086\u0005\u0086\u06cc\b\u0086"+
		"\n\u0086\f\u0086\u06cf\t\u0086\u0003\u0086\u06d1\b\u0086\u0001\u0087\u0001"+
		"\u0087\u0003\u0087\u06d5\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u06dd\b\u0089\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0003\u008a\u06e2\b\u008a\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0005\u008c\u06eb"+
		"\b\u008c\n\u008c\f\u008c\u06ee\t\u008c\u0001\u008d\u0005\u008d\u06f1\b"+
		"\u008d\n\u008d\f\u008d\u06f4\t\u008d\u0001\u008d\u0001\u008d\u0003\u008d"+
		"\u06f8\b\u008d\u0001\u008d\u0005\u008d\u06fb\b\u008d\n\u008d\f\u008d\u06fe"+
		"\t\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u0702\b\u008d\n\u008d\f\u008d"+
		"\u0705\t\u008d\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0005\u008f\u070d\b\u008f\n\u008f\f\u008f\u0710\t\u008f\u0001"+
		"\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u0717"+
		"\b\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u071b\b\u0090\u0003\u0090"+
		"\u071d\b\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091"+
		"\u0003\u0091\u0724\b\u0091\u0001\u0092\u0001\u0092\u0003\u0092\u0728\b"+
		"\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0000\u0002\u00f0\u0100\u0093"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0000\u0010\n\u0000"+
		"\u0002\u0002\u0013\u0013\u001f\u001f\"$\'(++//22AACC\u0002\u0000\u0012"+
		"\u0012))\u0001\u0000DG\u0001\u0000HI\u0002\u0000\'\'==\u0002\u00004B\u0081"+
		"\u0081\u0001\u0000eh\u0001\u0000[\\\u0002\u0000ijnn\u0001\u0000gh\u0002"+
		"\u0000YZ`a\u0002\u0000__bb\u0002\u0000XXoy\u0001\u0000ef\u0002\u0000^"+
		"^zz\b\u0000\u0004\u0004\u0006\u0006\t\t\u000f\u000f\u0015\u0015\u001c"+
		"\u001c\u001e\u001e&&\u07d7\u0000\u012a\u0001\u0000\u0000\u0000\u0002\u012d"+
		"\u0001\u0000\u0000\u0000\u0004\u0134\u0001\u0000\u0000\u0000\u0006\u0136"+
		"\u0001\u0000\u0000\u0000\b\u0149\u0001\u0000\u0000\u0000\n\u0151\u0001"+
		"\u0000\u0000\u0000\f\u0153\u0001\u0000\u0000\u0000\u000e\u015a\u0001\u0000"+
		"\u0000\u0000\u0010\u016d\u0001\u0000\u0000\u0000\u0012\u0178\u0001\u0000"+
		"\u0000\u0000\u0014\u017a\u0001\u0000\u0000\u0000\u0016\u017e\u0001\u0000"+
		"\u0000\u0000\u0018\u0180\u0001\u0000\u0000\u0000\u001a\u0193\u0001\u0000"+
		"\u0000\u0000\u001c\u01a1\u0001\u0000\u0000\u0000\u001e\u01af\u0001\u0000"+
		"\u0000\u0000 \u01b7\u0001\u0000\u0000\u0000\"\u01c9\u0001\u0000\u0000"+
		"\u0000$\u01d4\u0001\u0000\u0000\u0000&\u01de\u0001\u0000\u0000\u0000("+
		"\u01e5\u0001\u0000\u0000\u0000*\u01f4\u0001\u0000\u0000\u0000,\u01fd\u0001"+
		"\u0000\u0000\u0000.\u0212\u0001\u0000\u0000\u00000\u021e\u0001\u0000\u0000"+
		"\u00002\u0220\u0001\u0000\u0000\u00004\u0232\u0001\u0000\u0000\u00006"+
		"\u0236\u0001\u0000\u0000\u00008\u0238\u0001\u0000\u0000\u0000:\u023b\u0001"+
		"\u0000\u0000\u0000<\u023e\u0001\u0000\u0000\u0000>\u0246\u0001\u0000\u0000"+
		"\u0000@\u0252\u0001\u0000\u0000\u0000B\u025c\u0001\u0000\u0000\u0000D"+
		"\u025e\u0001\u0000\u0000\u0000F\u0269\u0001\u0000\u0000\u0000H\u0277\u0001"+
		"\u0000\u0000\u0000J\u0282\u0001\u0000\u0000\u0000L\u0287\u0001\u0000\u0000"+
		"\u0000N\u0290\u0001\u0000\u0000\u0000P\u02a3\u0001\u0000\u0000\u0000R"+
		"\u02ab\u0001\u0000\u0000\u0000T\u02b0\u0001\u0000\u0000\u0000V\u02ba\u0001"+
		"\u0000\u0000\u0000X\u02bc\u0001\u0000\u0000\u0000Z\u02cc\u0001\u0000\u0000"+
		"\u0000\\\u02e6\u0001\u0000\u0000\u0000^\u02e8\u0001\u0000\u0000\u0000"+
		"`\u02f0\u0001\u0000\u0000\u0000b\u0300\u0001\u0000\u0000\u0000d\u0318"+
		"\u0001\u0000\u0000\u0000f\u031d\u0001\u0000\u0000\u0000h\u0326\u0001\u0000"+
		"\u0000\u0000j\u0333\u0001\u0000\u0000\u0000l\u033e\u0001\u0000\u0000\u0000"+
		"n\u0344\u0001\u0000\u0000\u0000p\u0353\u0001\u0000\u0000\u0000r\u0355"+
		"\u0001\u0000\u0000\u0000t\u0357\u0001\u0000\u0000\u0000v\u035e\u0001\u0000"+
		"\u0000\u0000x\u0367\u0001\u0000\u0000\u0000z\u0371\u0001\u0000\u0000\u0000"+
		"|\u0379\u0001\u0000\u0000\u0000~\u0380\u0001\u0000\u0000\u0000\u0080\u0382"+
		"\u0001\u0000\u0000\u0000\u0082\u0392\u0001\u0000\u0000\u0000\u0084\u0397"+
		"\u0001\u0000\u0000\u0000\u0086\u03a8\u0001\u0000\u0000\u0000\u0088\u03c2"+
		"\u0001\u0000\u0000\u0000\u008a\u03c6\u0001\u0000\u0000\u0000\u008c\u03c8"+
		"\u0001\u0000\u0000\u0000\u008e\u03ce\u0001\u0000\u0000\u0000\u0090\u03d0"+
		"\u0001\u0000\u0000\u0000\u0092\u03d4\u0001\u0000\u0000\u0000\u0094\u03da"+
		"\u0001\u0000\u0000\u0000\u0096\u0407\u0001\u0000\u0000\u0000\u0098\u0409"+
		"\u0001\u0000\u0000\u0000\u009a\u040b\u0001\u0000\u0000\u0000\u009c\u0417"+
		"\u0001\u0000\u0000\u0000\u009e\u041d\u0001\u0000\u0000\u0000\u00a0\u0425"+
		"\u0001\u0000\u0000\u0000\u00a2\u0428\u0001\u0000\u0000\u0000\u00a4\u0431"+
		"\u0001\u0000\u0000\u0000\u00a6\u043f\u0001\u0000\u0000\u0000\u00a8\u0444"+
		"\u0001\u0000\u0000\u0000\u00aa\u0451\u0001\u0000\u0000\u0000\u00ac\u045f"+
		"\u0001\u0000\u0000\u0000\u00ae\u0477\u0001\u0000\u0000\u0000\u00b0\u0479"+
		"\u0001\u0000\u0000\u0000\u00b2\u0481\u0001\u0000\u0000\u0000\u00b4\u0488"+
		"\u0001\u0000\u0000\u0000\u00b6\u048e\u0001\u0000\u0000\u0000\u00b8\u0492"+
		"\u0001\u0000\u0000\u0000\u00ba\u0498\u0001\u0000\u0000\u0000\u00bc\u04a5"+
		"\u0001\u0000\u0000\u0000\u00be\u04b1\u0001\u0000\u0000\u0000\u00c0\u04b5"+
		"\u0001\u0000\u0000\u0000\u00c2\u04b9\u0001\u0000\u0000\u0000\u00c4\u04bf"+
		"\u0001\u0000\u0000\u0000\u00c6\u04c3\u0001\u0000\u0000\u0000\u00c8\u04c9"+
		"\u0001\u0000\u0000\u0000\u00ca\u04cf\u0001\u0000\u0000\u0000\u00cc\u04d3"+
		"\u0001\u0000\u0000\u0000\u00ce\u04d5\u0001\u0000\u0000\u0000\u00d0\u04d9"+
		"\u0001\u0000\u0000\u0000\u00d2\u04dd\u0001\u0000\u0000\u0000\u00d4\u04e2"+
		"\u0001\u0000\u0000\u0000\u00d6\u04ef\u0001\u0000\u0000\u0000\u00d8\u04f7"+
		"\u0001\u0000\u0000\u0000\u00da\u04fa\u0001\u0000\u0000\u0000\u00dc\u0501"+
		"\u0001\u0000\u0000\u0000\u00de\u051a\u0001\u0000\u0000\u0000\u00e0\u051d"+
		"\u0001\u0000\u0000\u0000\u00e2\u0531\u0001\u0000\u0000\u0000\u00e4\u053f"+
		"\u0001\u0000\u0000\u0000\u00e6\u0543\u0001\u0000\u0000\u0000\u00e8\u0548"+
		"\u0001\u0000\u0000\u0000\u00ea\u0553\u0001\u0000\u0000\u0000\u00ec\u0559"+
		"\u0001\u0000\u0000\u0000\u00ee\u0574\u0001\u0000\u0000\u0000\u00f0\u05a3"+
		"\u0001\u0000\u0000\u0000\u00f2\u05fe\u0001\u0000\u0000\u0000\u00f4\u060a"+
		"\u0001\u0000\u0000\u0000\u00f6\u0624\u0001\u0000\u0000\u0000\u00f8\u0628"+
		"\u0001\u0000\u0000\u0000\u00fa\u063c\u0001\u0000\u0000\u0000\u00fc\u063e"+
		"\u0001\u0000\u0000\u0000\u00fe\u0654\u0001\u0000\u0000\u0000\u0100\u0670"+
		"\u0001\u0000\u0000\u0000\u0102\u0681\u0001\u0000\u0000\u0000\u0104\u0686"+
		"\u0001\u0000\u0000\u0000\u0106\u069b\u0001\u0000\u0000\u0000\u0108\u06ac"+
		"\u0001\u0000\u0000\u0000\u010a\u06ae\u0001\u0000\u0000\u0000\u010c\u06b4"+
		"\u0001\u0000\u0000\u0000\u010e\u06d2\u0001\u0000\u0000\u0000\u0110\u06d6"+
		"\u0001\u0000\u0000\u0000\u0112\u06dc\u0001\u0000\u0000\u0000\u0114\u06e1"+
		"\u0001\u0000\u0000\u0000\u0116\u06e3\u0001\u0000\u0000\u0000\u0118\u06e7"+
		"\u0001\u0000\u0000\u0000\u011a\u06f2\u0001\u0000\u0000\u0000\u011c\u0706"+
		"\u0001\u0000\u0000\u0000\u011e\u0708\u0001\u0000\u0000\u0000\u0120\u071c"+
		"\u0001\u0000\u0000\u0000\u0122\u0723\u0001\u0000\u0000\u0000\u0124\u0725"+
		"\u0001\u0000\u0000\u0000\u0126\u012b\u0003\u00aeW\u0000\u0127\u012b\u0003"+
		"\u0004\u0002\u0000\u0128\u012b\u0003\u00f0x\u0000\u0129\u012b\u0003\u0010"+
		"\b\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000"+
		"\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u0001\u0001\u0000\u0000\u0000\u012c\u012e\u0005\u0001\u0000"+
		"\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0003\u0000\u0000"+
		"\u0000\u0130\u0003\u0001\u0000\u0000\u0000\u0131\u0135\u0003\u0006\u0003"+
		"\u0000\u0132\u0135\u0003\u000e\u0007\u0000\u0133\u0135\u0003\f\u0006\u0000"+
		"\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0005\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0003\b\u0004\u0000\u0137\u0138\u0003\n\u0005\u0000\u0138"+
		"\u013a\u0003\u00aaU\u0000\u0139\u013b\u0003\u001a\r\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013e"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0012\u0000\u0000\u013d\u013f"+
		"\u0003\u0118\u008c\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005\u0019\u0000\u0000\u0141\u0143\u0003\u0118\u008c\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0003\u00a4R\u0000\u0145\u0007\u0001"+
		"\u0000\u0000\u0000\u0146\u0148\u0003\u0012\t\u0000\u0147\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\t\u0001\u0000\u0000"+
		"\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0152\u0005\n\u0000\u0000"+
		"\u014d\u0152\u0005\u001d\u0000\u0000\u014e\u0152\u0005\u0011\u0000\u0000"+
		"\u014f\u0150\u0005|\u0000\u0000\u0150\u0152\u0005\u001d\u0000\u0000\u0151"+
		"\u014c\u0001\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0151"+
		"\u014e\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152"+
		"\u000b\u0001\u0000\u0000\u0000\u0153\u0154\u0003\b\u0004\u0000\u0154\u0155"+
		"\u00036\u001b\u0000\u0155\u0158\u0003\u00aaU\u0000\u0156\u0157\u0005X"+
		"\u0000\u0000\u0157\u0159\u0003\u00f0x\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\r\u0001\u0000\u0000\u0000"+
		"\u015a\u015c\u0003\b\u0004\u0000\u015b\u015d\u0003\u001a\r\u0000\u015c"+
		"\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d"+
		"\u015f\u0001\u0000\u0000\u0000\u015e\u0160\u00036\u001b\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0003\u00aaU\u0000\u0162\u0164\u0005"+
		"O\u0000\u0000\u0163\u0165\u0003d2\u0000\u0164\u0163\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166\u0169\u0005P\u0000\u0000\u0167\u0168\u0005.\u0000\u0000\u0168"+
		"\u016a\u0003^/\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0003"+
		"\u00a4R\u0000\u016c\u000f\u0001\u0000\u0000\u0000\u016d\u016f\u0005\u001a"+
		"\u0000\u0000\u016e\u0170\u0005\'\u0000\u0000\u016f\u016e\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0174\u0003n7\u0000\u0172\u0173\u0005W\u0000\u0000\u0173"+
		"\u0175\u0005i\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0005U\u0000\u0000\u0177\u0011\u0001\u0000\u0000\u0000\u0178\u0179\u0007"+
		"\u0000\u0000\u0000\u0179\u0013\u0001\u0000\u0000\u0000\u017a\u017b\u0003"+
		"x<\u0000\u017b\u0015\u0001\u0000\u0000\u0000\u017c\u017f\u0005\u0013\u0000"+
		"\u0000\u017d\u017f\u0003x<\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e"+
		"\u017d\u0001\u0000\u0000\u0000\u017f\u0017\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0005\n\u0000\u0000\u0181\u0183\u0003\u00aaU\u0000\u0182\u0184"+
		"\u0003\u001a\r\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001"+
		"\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"\u0012\u0000\u0000\u0186\u0188\u0003\u011a\u008d\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018b\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0005\u0019\u0000\u0000\u018a\u018c\u0003"+
		"\u0118\u008c\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001"+
		"\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"B\u0000\u0000\u018e\u0190\u0003\u0118\u008c\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0003*\u0015\u0000\u0192\u0019\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0005Z\u0000\u0000\u0194\u0199\u0003\u001c\u000e\u0000"+
		"\u0195\u0196\u0005V\u0000\u0000\u0196\u0198\u0003\u001c\u000e\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"\u019c\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0005Y\u0000\u0000\u019d\u001b\u0001\u0000\u0000\u0000\u019e\u01a0"+
		"\u0003x<\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a4\u01ad\u0003\u00aaU\u0000\u01a5\u01a9\u0005\u0012\u0000"+
		"\u0000\u01a6\u01a8\u0003x<\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ae\u0003\u001e\u000f\u0000\u01ad"+
		"\u01a5\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae"+
		"\u001d\u0001\u0000\u0000\u0000\u01af\u01b4\u0003\u011a\u008d\u0000\u01b0"+
		"\u01b1\u0005k\u0000\u0000\u01b1\u01b3\u0003\u011a\u008d\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u001f"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0005\u0011\u0000\u0000\u01b8\u01bb\u0003\u00aaU\u0000\u01b9\u01ba\u0005"+
		"\u0019\u0000\u0000\u01ba\u01bc\u0003\u0118\u008c\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bf\u0005Q\u0000\u0000\u01be\u01c0\u0003\""+
		"\u0011\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01c3\u0005V\u0000"+
		"\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c6\u0003&\u0013\u0000"+
		"\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005R\u0000\u0000\u01c8"+
		"!\u0001\u0000\u0000\u0000\u01c9\u01ce\u0003$\u0012\u0000\u01ca\u01cb\u0005"+
		"V\u0000\u0000\u01cb\u01cd\u0003$\u0012\u0000\u01cc\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf#\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d3\u0003x<\u0000\u01d2\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d9"+
		"\u0003\u00aaU\u0000\u01d8\u01da\u0003\u0124\u0092\u0000\u01d9\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001"+
		"\u0000\u0000\u0000\u01db\u01dd\u0003*\u0015\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd%\u0001\u0000\u0000"+
		"\u0000\u01de\u01e2\u0005U\u0000\u0000\u01df\u01e1\u0003.\u0017\u0000\u01e0"+
		"\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3"+
		"\'\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0005\u001d\u0000\u0000\u01e6\u01e8\u0003\u00aaU\u0000\u01e7\u01e9\u0003"+
		"\u001a\r\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005\u0012"+
		"\u0000\u0000\u01eb\u01ed\u0003\u0118\u008c\u0000\u01ec\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0005B\u0000\u0000\u01ef\u01f1\u0003\u0118\u008c"+
		"\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003,\u0016\u0000"+
		"\u01f3)\u0001\u0000\u0000\u0000\u01f4\u01f8\u0005Q\u0000\u0000\u01f5\u01f7"+
		"\u0003.\u0017\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7\u01fa\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0005R\u0000\u0000\u01fc+\u0001\u0000\u0000"+
		"\u0000\u01fd\u0201\u0005Q\u0000\u0000\u01fe\u0200\u0003@ \u0000\u01ff"+
		"\u01fe\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201"+
		"\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0204\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0005R\u0000\u0000\u0205-\u0001\u0000\u0000\u0000\u0206\u0213\u0005"+
		"U\u0000\u0000\u0207\u0209\u0005\'\u0000\u0000\u0208\u0207\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u020a\u0213\u0003\u00a4R\u0000\u020b\u020d\u0003\u0012\t"+
		"\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000"+
		"\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0211\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0211\u0213\u00030\u0018\u0000\u0212\u0206\u0001\u0000\u0000\u0000"+
		"\u0212\u0208\u0001\u0000\u0000\u0000\u0212\u020e\u0001\u0000\u0000\u0000"+
		"\u0213/\u0001\u0000\u0000\u0000\u0214\u021f\u00032\u0019\u0000\u0215\u021f"+
		"\u00038\u001c\u0000\u0216\u021f\u0003>\u001f\u0000\u0217\u021f\u0003<"+
		"\u001e\u0000\u0218\u021f\u0003:\u001d\u0000\u0219\u021f\u0003(\u0014\u0000"+
		"\u021a\u021f\u0003\u0082A\u0000\u021b\u021f\u0003\u0018\f\u0000\u021c"+
		"\u021f\u0003 \u0010\u0000\u021d\u021f\u0003\u009aM\u0000\u021e\u0214\u0001"+
		"\u0000\u0000\u0000\u021e\u0215\u0001\u0000\u0000\u0000\u021e\u0216\u0001"+
		"\u0000\u0000\u0000\u021e\u0217\u0001\u0000\u0000\u0000\u021e\u0218\u0001"+
		"\u0000\u0000\u0000\u021e\u0219\u0001\u0000\u0000\u0000\u021e\u021a\u0001"+
		"\u0000\u0000\u0000\u021e\u021b\u0001\u0000\u0000\u0000\u021e\u021c\u0001"+
		"\u0000\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f1\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u00036\u001b\u0000\u0221\u0222\u0003\u00aaU\u0000"+
		"\u0222\u0227\u0003`0\u0000\u0223\u0224\u0005S\u0000\u0000\u0224\u0226"+
		"\u0005T\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0229\u0001"+
		"\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001"+
		"\u0000\u0000\u0000\u0228\u022c\u0001\u0000\u0000\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0005.\u0000\u0000\u022b\u022d\u0003^/"+
		"\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u00034\u001a\u0000"+
		"\u022f3\u0001\u0000\u0000\u0000\u0230\u0233\u0003\u00a4R\u0000\u0231\u0233"+
		"\u0005U\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0231\u0001"+
		"\u0000\u0000\u0000\u02335\u0001\u0000\u0000\u0000\u0234\u0237\u0003\u011a"+
		"\u008d\u0000\u0235\u0237\u00051\u0000\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u02377\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0003\u001a\r\u0000\u0239\u023a\u00032\u0019\u0000\u023a"+
		"9\u0001\u0000\u0000\u0000\u023b\u023c\u0003\u001a\r\u0000\u023c\u023d"+
		"\u0003<\u001e\u0000\u023d;\u0001\u0000\u0000\u0000\u023e\u023f\u0003\u00aa"+
		"U\u0000\u023f\u0242\u0003`0\u0000\u0240\u0241\u0005.\u0000\u0000\u0241"+
		"\u0243\u0003^/\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0003"+
		"\u00a4R\u0000\u0245=\u0001\u0000\u0000\u0000\u0246\u0247\u0003\u011a\u008d"+
		"\u0000\u0247\u0248\u0003P(\u0000\u0248\u0249\u0005U\u0000\u0000\u0249"+
		"?\u0001\u0000\u0000\u0000\u024a\u024c\u0003\u0012\t\u0000\u024b\u024a"+
		"\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b"+
		"\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250"+
		"\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0253"+
		"\u0003B!\u0000\u0251\u0253\u0005U\u0000\u0000\u0252\u024d\u0001\u0000"+
		"\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253A\u0001\u0000\u0000"+
		"\u0000\u0254\u025d\u0003D\"\u0000\u0255\u025d\u0003H$\u0000\u0256\u025d"+
		"\u0003L&\u0000\u0257\u025d\u0003(\u0014\u0000\u0258\u025d\u0003\u0082"+
		"A\u0000\u0259\u025d\u0003\u0018\f\u0000\u025a\u025d\u0003 \u0010\u0000"+
		"\u025b\u025d\u0003\u009aM\u0000\u025c\u0254\u0001\u0000\u0000\u0000\u025c"+
		"\u0255\u0001\u0000\u0000\u0000\u025c\u0256\u0001\u0000\u0000\u0000\u025c"+
		"\u0257\u0001\u0000\u0000\u0000\u025c\u0258\u0001\u0000\u0000\u0000\u025c"+
		"\u0259\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c"+
		"\u025b\u0001\u0000\u0000\u0000\u025dC\u0001\u0000\u0000\u0000\u025e\u025f"+
		"\u0003\u011a\u008d\u0000\u025f\u0264\u0003F#\u0000\u0260\u0261\u0005V"+
		"\u0000\u0000\u0261\u0263\u0003F#\u0000\u0262\u0260\u0001\u0000\u0000\u0000"+
		"\u0263\u0266\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000"+
		"\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0267\u0001\u0000\u0000\u0000"+
		"\u0266\u0264\u0001\u0000\u0000\u0000\u0267\u0268\u0005U\u0000\u0000\u0268"+
		"E\u0001\u0000\u0000\u0000\u0269\u026e\u0003\u00aaU\u0000\u026a\u026b\u0005"+
		"S\u0000\u0000\u026b\u026d\u0005T\u0000\u0000\u026c\u026a\u0001\u0000\u0000"+
		"\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0271\u0001\u0000\u0000"+
		"\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0272\u0005X\u0000\u0000"+
		"\u0272\u0273\u0003V+\u0000\u0273G\u0001\u0000\u0000\u0000\u0274\u0276"+
		"\u0003J%\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000"+
		"\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0003N\'\u0000\u027bI\u0001\u0000\u0000\u0000"+
		"\u027c\u0283\u0003x<\u0000\u027d\u0283\u0005$\u0000\u0000\u027e\u0283"+
		"\u0005\u0002\u0000\u0000\u027f\u0283\u0005\r\u0000\u0000\u0280\u0283\u0005"+
		"\'\u0000\u0000\u0281\u0283\u0005(\u0000\u0000\u0282\u027c\u0001\u0000"+
		"\u0000\u0000\u0282\u027d\u0001\u0000\u0000\u0000\u0282\u027e\u0001\u0000"+
		"\u0000\u0000\u0282\u027f\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000"+
		"\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283K\u0001\u0000\u0000"+
		"\u0000\u0284\u0286\u0003J%\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286"+
		"\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288\u028a\u0001\u0000\u0000\u0000\u0289"+
		"\u0287\u0001\u0000\u0000\u0000\u028a\u028b\u0003\u001a\r\u0000\u028b\u028c"+
		"\u0003N\'\u0000\u028cM\u0001\u0000\u0000\u0000\u028d\u028f\u0003x<\u0000"+
		"\u028e\u028d\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000"+
		"\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000"+
		"\u0291\u0293\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u00036\u001b\u0000\u0294\u0295\u0003\u00aaU\u0000\u0295\u029a"+
		"\u0003`0\u0000\u0296\u0297\u0005S\u0000\u0000\u0297\u0299\u0005T\u0000"+
		"\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0299\u029c\u0001\u0000\u0000"+
		"\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000"+
		"\u0000\u029b\u029f\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0005.\u0000\u0000\u029e\u02a0\u0003^/\u0000\u029f"+
		"\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u00034\u001a\u0000\u02a2O\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a8\u0003R)\u0000\u02a4\u02a5\u0005V\u0000"+
		"\u0000\u02a5\u02a7\u0003R)\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a7"+
		"\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0001\u0000\u0000\u0000\u02a9Q\u0001\u0000\u0000\u0000\u02aa\u02a8"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ae\u0003T*\u0000\u02ac\u02ad\u0005X"+
		"\u0000\u0000\u02ad\u02af\u0003V+\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000"+
		"\u02ae\u02af\u0001\u0000\u0000\u0000\u02afS\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b5\u0003\u00aaU\u0000\u02b1\u02b2\u0005S\u0000\u0000\u02b2\u02b4\u0005"+
		"T\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b4\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b6U\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b8\u02bb\u0003X,\u0000\u02b9\u02bb\u0003\u00f0x\u0000\u02ba"+
		"\u02b8\u0001\u0000\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb"+
		"W\u0001\u0000\u0000\u0000\u02bc\u02c8\u0005Q\u0000\u0000\u02bd\u02c2\u0003"+
		"V+\u0000\u02be\u02bf\u0005V\u0000\u0000\u02bf\u02c1\u0003V+\u0000\u02c0"+
		"\u02be\u0001\u0000\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c7\u0005V\u0000\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c9\u0001\u0000\u0000\u0000\u02c8\u02bd"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005R\u0000\u0000\u02cbY\u0001\u0000"+
		"\u0000\u0000\u02cc\u02ce\u0003\u00aaU\u0000\u02cd\u02cf\u0003\u011e\u008f"+
		"\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d7\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005W\u0000\u0000"+
		"\u02d1\u02d3\u0003\u00aaU\u0000\u02d2\u02d4\u0003\u011e\u008f\u0000\u02d3"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d5\u02d0\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d8\u0001\u0000\u0000\u0000\u02d8[\u0001\u0000\u0000\u0000\u02d9\u02d7"+
		"\u0001\u0000\u0000\u0000\u02da\u02e7\u0003\u011a\u008d\u0000\u02db\u02dd"+
		"\u0003x<\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000"+
		"\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000"+
		"\u0000\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e4\u0005]\u0000\u0000\u02e2\u02e3\u0007\u0001\u0000"+
		"\u0000\u02e3\u02e5\u0003\u011a\u008d\u0000\u02e4\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e6\u02da\u0001\u0000\u0000\u0000\u02e6\u02de\u0001\u0000\u0000"+
		"\u0000\u02e7]\u0001\u0000\u0000\u0000\u02e8\u02ed\u0003n7\u0000\u02e9"+
		"\u02ea\u0005V\u0000\u0000\u02ea\u02ec\u0003n7\u0000\u02eb\u02e9\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee_\u0001\u0000"+
		"\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0\u02fc\u0005O\u0000"+
		"\u0000\u02f1\u02f3\u0003b1\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f3\u02fd\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f7\u0003b1\u0000\u02f5\u02f6\u0005V\u0000\u0000\u02f6\u02f8\u0003"+
		"d2\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f8\u02fd\u0001\u0000\u0000\u0000\u02f9\u02fb\u0003d2\u0000\u02fa"+
		"\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fc\u02f2\u0001\u0000\u0000\u0000\u02fc"+
		"\u02f4\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fe\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005P\u0000\u0000\u02ffa\u0001"+
		"\u0000\u0000\u0000\u0300\u0306\u0003\u011a\u008d\u0000\u0301\u0302\u0003"+
		"\u00aaU\u0000\u0302\u0303\u0005W\u0000\u0000\u0303\u0305\u0001\u0000\u0000"+
		"\u0000\u0304\u0301\u0001\u0000\u0000\u0000\u0305\u0308\u0001\u0000\u0000"+
		"\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000"+
		"\u0000\u0307\u0309\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000"+
		"\u0000\u0309\u030a\u0005,\u0000\u0000\u030ac\u0001\u0000\u0000\u0000\u030b"+
		"\u0310\u0003f3\u0000\u030c\u030d\u0005V\u0000\u0000\u030d\u030f\u0003"+
		"f3\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000"+
		"\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000"+
		"\u0000\u0311\u0315\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0005V\u0000\u0000\u0314\u0316\u0003h4\u0000\u0315"+
		"\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"+
		"\u0319\u0001\u0000\u0000\u0000\u0317\u0319\u0003h4\u0000\u0318\u030b\u0001"+
		"\u0000\u0000\u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0319e\u0001\u0000"+
		"\u0000\u0000\u031a\u031c\u0003\u0016\u000b\u0000\u031b\u031a\u0001\u0000"+
		"\u0000\u0000\u031c\u031f\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000"+
		"\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000"+
		"\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u0320\u0321\u0003\u011a"+
		"\u008d\u0000\u0321\u0322\u0003T*\u0000\u0322g\u0001\u0000\u0000\u0000"+
		"\u0323\u0325\u0003\u0016\u000b\u0000\u0324\u0323\u0001\u0000\u0000\u0000"+
		"\u0325\u0328\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000"+
		"\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0329\u0001\u0000\u0000\u0000"+
		"\u0328\u0326\u0001\u0000\u0000\u0000\u0329\u032d\u0003\u011a\u008d\u0000"+
		"\u032a\u032c\u0003x<\u0000\u032b\u032a\u0001\u0000\u0000\u0000\u032c\u032f"+
		"\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032d\u032e"+
		"\u0001\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000\u0000\u032f\u032d"+
		"\u0001\u0000\u0000\u0000\u0330\u0331\u0005}\u0000\u0000\u0331\u0332\u0003"+
		"T*\u0000\u0332i\u0001\u0000\u0000\u0000\u0333\u0338\u0003l6\u0000\u0334"+
		"\u0335\u0005V\u0000\u0000\u0335\u0337\u0003l6\u0000\u0336\u0334\u0001"+
		"\u0000\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001"+
		"\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339k\u0001\u0000"+
		"\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u033d\u0003\u0016"+
		"\u000b\u0000\u033c\u033b\u0001\u0000\u0000\u0000\u033d\u0340\u0001\u0000"+
		"\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000"+
		"\u0000\u0000\u033f\u0341\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000"+
		"\u0000\u0000\u0341\u0342\u0005>\u0000\u0000\u0342\u0343\u0003\u00aaU\u0000"+
		"\u0343m\u0001\u0000\u0000\u0000\u0344\u0349\u0003\u00aaU\u0000\u0345\u0346"+
		"\u0005W\u0000\u0000\u0346\u0348\u0003\u00aaU\u0000\u0347\u0345\u0001\u0000"+
		"\u0000\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000"+
		"\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034ao\u0001\u0000\u0000"+
		"\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u0354\u0003r9\u0000\u034d"+
		"\u0354\u0003t:\u0000\u034e\u0354\u0005K\u0000\u0000\u034f\u0354\u0005"+
		"L\u0000\u0000\u0350\u0354\u0005J\u0000\u0000\u0351\u0354\u0005N\u0000"+
		"\u0000\u0352\u0354\u0005M\u0000\u0000\u0353\u034c\u0001\u0000\u0000\u0000"+
		"\u0353\u034d\u0001\u0000\u0000\u0000\u0353\u034e\u0001\u0000\u0000\u0000"+
		"\u0353\u034f\u0001\u0000\u0000\u0000\u0353\u0350\u0001\u0000\u0000\u0000"+
		"\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000"+
		"\u0354q\u0001\u0000\u0000\u0000\u0355\u0356\u0007\u0002\u0000\u0000\u0356"+
		"s\u0001\u0000\u0000\u0000\u0357\u0358\u0007\u0003\u0000\u0000\u0358u\u0001"+
		"\u0000\u0000\u0000\u0359\u035a\u0003\u00aaU\u0000\u035a\u035b\u0005W\u0000"+
		"\u0000\u035b\u035d\u0001\u0000\u0000\u0000\u035c\u0359\u0001\u0000\u0000"+
		"\u0000\u035d\u0360\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0361\u0001\u0000\u0000"+
		"\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0361\u0362\u0005|\u0000\u0000"+
		"\u0362\u0363\u0003\u00aaU\u0000\u0363w\u0001\u0000\u0000\u0000\u0364\u0365"+
		"\u0005|\u0000\u0000\u0365\u0368\u0003n7\u0000\u0366\u0368\u0003v;\u0000"+
		"\u0367\u0364\u0001\u0000\u0000\u0000\u0367\u0366\u0001\u0000\u0000\u0000"+
		"\u0368\u036f\u0001\u0000\u0000\u0000\u0369\u036c\u0005O\u0000\u0000\u036a"+
		"\u036d\u0003z=\u0000\u036b\u036d\u0003~?\u0000\u036c\u036a\u0001\u0000"+
		"\u0000\u0000\u036c\u036b\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000"+
		"\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u0370\u0005P\u0000"+
		"\u0000\u036f\u0369\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000"+
		"\u0000\u0370y\u0001\u0000\u0000\u0000\u0371\u0376\u0003|>\u0000\u0372"+
		"\u0373\u0005V\u0000\u0000\u0373\u0375\u0003|>\u0000\u0374\u0372\u0001"+
		"\u0000\u0000\u0000\u0375\u0378\u0001\u0000\u0000\u0000\u0376\u0374\u0001"+
		"\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377{\u0001\u0000"+
		"\u0000\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0379\u037a\u0003\u00aa"+
		"U\u0000\u037a\u037b\u0005X\u0000\u0000\u037b\u037c\u0003~?\u0000\u037c"+
		"}\u0001\u0000\u0000\u0000\u037d\u0381\u0003\u00f0x\u0000\u037e\u0381\u0003"+
		"x<\u0000\u037f\u0381\u0003\u0080@\u0000\u0380\u037d\u0001\u0000\u0000"+
		"\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0380\u037f\u0001\u0000\u0000"+
		"\u0000\u0381\u007f\u0001\u0000\u0000\u0000\u0382\u038b\u0005Q\u0000\u0000"+
		"\u0383\u0388\u0003~?\u0000\u0384\u0385\u0005V\u0000\u0000\u0385\u0387"+
		"\u0003~?\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u038a\u0001\u0000"+
		"\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000"+
		"\u0000\u0000\u0389\u038c\u0001\u0000\u0000\u0000\u038a\u0388\u0001\u0000"+
		"\u0000\u0000\u038b\u0383\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000"+
		"\u0000\u0000\u038c\u038e\u0001\u0000\u0000\u0000\u038d\u038f\u0005V\u0000"+
		"\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000"+
		"\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0391\u0005R\u0000\u0000"+
		"\u0391\u0081\u0001\u0000\u0000\u0000\u0392\u0393\u0005|\u0000\u0000\u0393"+
		"\u0394\u0005\u001d\u0000\u0000\u0394\u0395\u0003\u00aaU\u0000\u0395\u0396"+
		"\u0003\u0084B\u0000\u0396\u0083\u0001\u0000\u0000\u0000\u0397\u039b\u0005"+
		"Q\u0000\u0000\u0398\u039a\u0003\u0086C\u0000\u0399\u0398\u0001\u0000\u0000"+
		"\u0000\u039a\u039d\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000\u0000"+
		"\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039e\u0001\u0000\u0000"+
		"\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039e\u039f\u0005R\u0000\u0000"+
		"\u039f\u0085\u0001\u0000\u0000\u0000\u03a0\u03a2\u0003\u0012\t\u0000\u03a1"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a5\u0001\u0000\u0000\u0000\u03a3"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a6\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a9\u0003\u0088D\u0000\u03a7\u03a9\u0005U\u0000\u0000\u03a8\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a9\u0087\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ab\u0003\u011a\u008d\u0000\u03ab\u03ac\u0003"+
		"\u008aE\u0000\u03ac\u03ad\u0005U\u0000\u0000\u03ad\u03c3\u0001\u0000\u0000"+
		"\u0000\u03ae\u03b0\u0003\u0018\f\u0000\u03af\u03b1\u0005U\u0000\u0000"+
		"\u03b0\u03af\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000"+
		"\u03b1\u03c3\u0001\u0000\u0000\u0000\u03b2\u03b4\u0003(\u0014\u0000\u03b3"+
		"\u03b5\u0005U\u0000\u0000\u03b4\u03b3\u0001\u0000\u0000\u0000\u03b4\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b5\u03c3\u0001\u0000\u0000\u0000\u03b6\u03b8"+
		"\u0003 \u0010\u0000\u03b7\u03b9\u0005U\u0000\u0000\u03b8\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03c3\u0001\u0000"+
		"\u0000\u0000\u03ba\u03bc\u0003\u0082A\u0000\u03bb\u03bd\u0005U\u0000\u0000"+
		"\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bd\u03c3\u0001\u0000\u0000\u0000\u03be\u03c0\u0003\u009aM\u0000\u03bf"+
		"\u03c1\u0005U\u0000\u0000\u03c0\u03bf\u0001\u0000\u0000\u0000\u03c0\u03c1"+
		"\u0001\u0000\u0000\u0000\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2\u03aa"+
		"\u0001\u0000\u0000\u0000\u03c2\u03ae\u0001\u0000\u0000\u0000\u03c2\u03b2"+
		"\u0001\u0000\u0000\u0000\u03c2\u03b6\u0001\u0000\u0000\u0000\u03c2\u03ba"+
		"\u0001\u0000\u0000\u0000\u03c2\u03be\u0001\u0000\u0000\u0000\u03c3\u0089"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c7\u0003\u008cF\u0000\u03c5\u03c7\u0003"+
		"\u008eG\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c7\u008b\u0001\u0000\u0000\u0000\u03c8\u03c9\u0003\u00aa"+
		"U\u0000\u03c9\u03ca\u0005O\u0000\u0000\u03ca\u03cc\u0005P\u0000\u0000"+
		"\u03cb\u03cd\u0003\u0090H\u0000\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cc"+
		"\u03cd\u0001\u0000\u0000\u0000\u03cd\u008d\u0001\u0000\u0000\u0000\u03ce"+
		"\u03cf\u0003P(\u0000\u03cf\u008f\u0001\u0000\u0000\u0000\u03d0\u03d1\u0005"+
		"\r\u0000\u0000\u03d1\u03d2\u0003~?\u0000\u03d2\u0091\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d5\u00055\u0000\u0000\u03d4\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d7\u00054\u0000\u0000\u03d7\u03d8\u0003n7\u0000\u03d8\u03d9"+
		"\u0003\u0094J\u0000\u03d9\u0093\u0001\u0000\u0000\u0000\u03da\u03de\u0005"+
		"Q\u0000\u0000\u03db\u03dd\u0003\u0096K\u0000\u03dc\u03db\u0001\u0000\u0000"+
		"\u0000\u03dd\u03e0\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000"+
		"\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e1\u0001\u0000\u0000"+
		"\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1\u03e2\u0005R\u0000\u0000"+
		"\u03e2\u0095\u0001\u0000\u0000\u0000\u03e3\u03e7\u00056\u0000\u0000\u03e4"+
		"\u03e6\u0003\u0098L\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e9"+
		"\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e8"+
		"\u0001\u0000\u0000\u0000\u03e8\u03ea\u0001\u0000\u0000\u0000\u03e9\u03e7"+
		"\u0001\u0000\u0000\u0000\u03ea\u03eb\u0003n7\u0000\u03eb\u03ec\u0005U"+
		"\u0000\u0000\u03ec\u0408\u0001\u0000\u0000\u0000\u03ed\u03ee\u00057\u0000"+
		"\u0000\u03ee\u03f1\u0003n7\u0000\u03ef\u03f0\u00059\u0000\u0000\u03f0"+
		"\u03f2\u0003n7\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f4\u0005"+
		"U\u0000\u0000\u03f4\u0408\u0001\u0000\u0000\u0000\u03f5\u03f6\u00058\u0000"+
		"\u0000\u03f6\u03f9\u0003n7\u0000\u03f7\u03f8\u00059\u0000\u0000\u03f8"+
		"\u03fa\u0003n7\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fc\u0005"+
		"U\u0000\u0000\u03fc\u0408\u0001\u0000\u0000\u0000\u03fd\u03fe\u0005:\u0000"+
		"\u0000\u03fe\u03ff\u0003n7\u0000\u03ff\u0400\u0005U\u0000\u0000\u0400"+
		"\u0408\u0001\u0000\u0000\u0000\u0401\u0402\u0005;\u0000\u0000\u0402\u0403"+
		"\u0003n7\u0000\u0403\u0404\u0005<\u0000\u0000\u0404\u0405\u0003n7\u0000"+
		"\u0405\u0406\u0005U\u0000\u0000\u0406\u0408\u0001\u0000\u0000\u0000\u0407"+
		"\u03e3\u0001\u0000\u0000\u0000\u0407\u03ed\u0001\u0000\u0000\u0000\u0407"+
		"\u03f5\u0001\u0000\u0000\u0000\u0407\u03fd\u0001\u0000\u0000\u0000\u0407"+
		"\u0401\u0001\u0000\u0000\u0000\u0408\u0097\u0001\u0000\u0000\u0000\u0409"+
		"\u040a\u0007\u0004\u0000\u0000\u040a\u0099\u0001\u0000\u0000\u0000\u040b"+
		"\u040c\u0005@\u0000\u0000\u040c\u040e\u0003\u00aaU\u0000\u040d\u040f\u0003"+
		"\u001a\r\u0000\u040e\u040d\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000"+
		"\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u0413\u0003\u009c"+
		"N\u0000\u0411\u0412\u0005\u0019\u0000\u0000\u0412\u0414\u0003\u0118\u008c"+
		"\u0000\u0413\u0411\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000"+
		"\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0416\u0003\u00a2Q\u0000"+
		"\u0416\u009b\u0001\u0000\u0000\u0000\u0417\u0419\u0005O\u0000\u0000\u0418"+
		"\u041a\u0003\u009eO\u0000\u0419\u0418\u0001\u0000\u0000\u0000\u0419\u041a"+
		"\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041c"+
		"\u0005P\u0000\u0000\u041c\u009d\u0001\u0000\u0000\u0000\u041d\u0422\u0003"+
		"\u00a0P\u0000\u041e\u041f\u0005V\u0000\u0000\u041f\u0421\u0003\u00a0P"+
		"\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0421\u0424\u0001\u0000\u0000"+
		"\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000\u0000"+
		"\u0000\u0423\u009f\u0001\u0000\u0000\u0000\u0424\u0422\u0001\u0000\u0000"+
		"\u0000\u0425\u0426\u0003\u011a\u008d\u0000\u0426\u0427\u0003\u00aaU\u0000"+
		"\u0427\u00a1\u0001\u0000\u0000\u0000\u0428\u042c\u0005Q\u0000\u0000\u0429"+
		"\u042b\u0003.\u0017\u0000\u042a\u0429\u0001\u0000\u0000\u0000\u042b\u042e"+
		"\u0001\u0000\u0000\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c\u042d"+
		"\u0001\u0000\u0000\u0000\u042d\u042f\u0001\u0000\u0000\u0000\u042e\u042c"+
		"\u0001\u0000\u0000\u0000\u042f\u0430\u0005R\u0000\u0000\u0430\u00a3\u0001"+
		"\u0000\u0000\u0000\u0431\u0435\u0005Q\u0000\u0000\u0432\u0434\u0003\u0002"+
		"\u0001\u0000\u0433\u0432\u0001\u0000\u0000\u0000\u0434\u0437\u0001\u0000"+
		"\u0000\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0435\u0436\u0001\u0000"+
		"\u0000\u0000\u0436\u0438\u0001\u0000\u0000\u0000\u0437\u0435\u0001\u0000"+
		"\u0000\u0000\u0438\u0439\u0005R\u0000\u0000\u0439\u00a5\u0001\u0000\u0000"+
		"\u0000\u043a\u043b\u0003\u00a8T\u0000\u043b\u043c\u0005U\u0000\u0000\u043c"+
		"\u0440\u0001\u0000\u0000\u0000\u043d\u0440\u0003\u00aeW\u0000\u043e\u0440"+
		"\u0003\u00acV\u0000\u043f\u043a\u0001\u0000\u0000\u0000\u043f\u043d\u0001"+
		"\u0000\u0000\u0000\u043f\u043e\u0001\u0000\u0000\u0000\u0440\u00a7\u0001"+
		"\u0000\u0000\u0000\u0441\u0443\u0003\u0016\u000b\u0000\u0442\u0441\u0001"+
		"\u0000\u0000\u0000\u0443\u0446\u0001\u0000\u0000\u0000\u0444\u0442\u0001"+
		"\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u044f\u0001"+
		"\u0000\u0000\u0000\u0446\u0444\u0001\u0000\u0000\u0000\u0447\u0448\u0003"+
		"\u011a\u008d\u0000\u0448\u0449\u0003P(\u0000\u0449\u0450\u0001\u0000\u0000"+
		"\u0000\u044a\u044b\u0005>\u0000\u0000\u044b\u044c\u0003\u00aaU\u0000\u044c"+
		"\u044d\u0005X\u0000\u0000\u044d\u044e\u0003\u00f0x\u0000\u044e\u0450\u0001"+
		"\u0000\u0000\u0000\u044f\u0447\u0001\u0000\u0000\u0000\u044f\u044a\u0001"+
		"\u0000\u0000\u0000\u0450\u00a9\u0001\u0000\u0000\u0000\u0451\u0452\u0007"+
		"\u0005\u0000\u0000\u0452\u00ab\u0001\u0000\u0000\u0000\u0453\u0455\u0003"+
		"\u0014\n\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0455\u0458\u0001\u0000"+
		"\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456\u0457\u0001\u0000"+
		"\u0000\u0000\u0457\u045c\u0001\u0000\u0000\u0000\u0458\u0456\u0001\u0000"+
		"\u0000\u0000\u0459\u045d\u0003\u0018\f\u0000\u045a\u045d\u0003(\u0014"+
		"\u0000\u045b\u045d\u0003\u009aM\u0000\u045c\u0459\u0001\u0000\u0000\u0000"+
		"\u045c\u045a\u0001\u0000\u0000\u0000\u045c\u045b\u0001\u0000\u0000\u0000"+
		"\u045d\u0460\u0001\u0000\u0000\u0000\u045e\u0460\u0005U\u0000\u0000\u045f"+
		"\u0456\u0001\u0000\u0000\u0000\u045f\u045e\u0001\u0000\u0000\u0000\u0460"+
		"\u00ad\u0001\u0000\u0000\u0000\u0461\u0478\u0003\u00a4R\u0000\u0462\u0478"+
		"\u0003\u00b0X\u0000\u0463\u0478\u0003\u00b2Y\u0000\u0464\u0478\u0003\u00b4"+
		"Z\u0000\u0465\u0478\u0003\u00b6[\u0000\u0466\u0478\u0003\u00b8\\\u0000"+
		"\u0467\u0478\u0003\u00ba]\u0000\u0468\u0478\u0003\u00bc^\u0000\u0469\u0478"+
		"\u0003\u00be_\u0000\u046a\u0478\u0003\u00c0`\u0000\u046b\u0478\u0003\u00c2"+
		"a\u0000\u046c\u0478\u0003\u00c4b\u0000\u046d\u0478\u0003\u00c6c\u0000"+
		"\u046e\u0478\u0003\u00c8d\u0000\u046f\u0478\u0003\u00cae\u0000\u0470\u0478"+
		"\u0003\u00ccf\u0000\u0471\u0472\u0003\u00f0x\u0000\u0472\u0473\u0005U"+
		"\u0000\u0000\u0473\u0478\u0001\u0000\u0000\u0000\u0474\u0478\u0003\u00ce"+
		"g\u0000\u0475\u0478\u0003\u00d0h\u0000\u0476\u0478\u0003\u00d2i\u0000"+
		"\u0477\u0461\u0001\u0000\u0000\u0000\u0477\u0462\u0001\u0000\u0000\u0000"+
		"\u0477\u0463\u0001\u0000\u0000\u0000\u0477\u0464\u0001\u0000\u0000\u0000"+
		"\u0477\u0465\u0001\u0000\u0000\u0000\u0477\u0466\u0001\u0000\u0000\u0000"+
		"\u0477\u0467\u0001\u0000\u0000\u0000\u0477\u0468\u0001\u0000\u0000\u0000"+
		"\u0477\u0469\u0001\u0000\u0000\u0000\u0477\u046a\u0001\u0000\u0000\u0000"+
		"\u0477\u046b\u0001\u0000\u0000\u0000\u0477\u046c\u0001\u0000\u0000\u0000"+
		"\u0477\u046d\u0001\u0000\u0000\u0000\u0477\u046e\u0001\u0000\u0000\u0000"+
		"\u0477\u046f\u0001\u0000\u0000\u0000\u0477\u0470\u0001\u0000\u0000\u0000"+
		"\u0477\u0471\u0001\u0000\u0000\u0000\u0477\u0474\u0001\u0000\u0000\u0000"+
		"\u0477\u0475\u0001\u0000\u0000\u0000\u0477\u0476\u0001\u0000\u0000\u0000"+
		"\u0478\u00af\u0001\u0000\u0000\u0000\u0479\u047a\u0005\u0003\u0000\u0000"+
		"\u047a\u047d\u0003\u00f0x\u0000\u047b\u047c\u0005^\u0000\u0000\u047c\u047e"+
		"\u0003\u00f0x\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d\u047e\u0001"+
		"\u0000\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\u0480\u0005"+
		"U\u0000\u0000\u0480\u00b1\u0001\u0000\u0000\u0000\u0481\u0482\u0005\u0017"+
		"\u0000\u0000\u0482\u0483\u0003\u00eau\u0000\u0483\u0486\u0003\u00a4R\u0000"+
		"\u0484\u0485\u0005\u0010\u0000\u0000\u0485\u0487\u0003\u00a4R\u0000\u0486"+
		"\u0484\u0001\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487"+
		"\u00b3\u0001\u0000\u0000\u0000\u0488\u0489\u0005\u0016\u0000\u0000\u0489"+
		"\u048a\u0005O\u0000\u0000\u048a\u048b\u0003\u00e4r\u0000\u048b\u048c\u0005"+
		"P\u0000\u0000\u048c\u048d\u0003\u00a4R\u0000\u048d\u00b5\u0001\u0000\u0000"+
		"\u0000\u048e\u048f\u00053\u0000\u0000\u048f\u0490\u0003\u00eau\u0000\u0490"+
		"\u0491\u0003\u00a4R\u0000\u0491\u00b7\u0001\u0000\u0000\u0000\u0492\u0493"+
		"\u0005\u000e\u0000\u0000\u0493\u0494\u0003\u00a4R\u0000\u0494\u0495\u0005"+
		"3\u0000\u0000\u0495\u0496\u0003\u00eau\u0000\u0496\u0497\u0005U\u0000"+
		"\u0000\u0497\u00b9\u0001\u0000\u0000\u0000\u0498\u0499\u00050\u0000\u0000"+
		"\u0499\u04a3\u0003\u00a4R\u0000\u049a\u049c\u0003\u00d4j\u0000\u049b\u049a"+
		"\u0001\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d\u049b"+
		"\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000\u0000\u0000\u049e\u04a0"+
		"\u0001\u0000\u0000\u0000\u049f\u04a1\u0003\u00d8l\u0000\u04a0\u049f\u0001"+
		"\u0000\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000\u0000\u04a1\u04a4\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a4\u0003\u00d8l\u0000\u04a3\u049b\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a2\u0001\u0000\u0000\u0000\u04a4\u00bb\u0001\u0000"+
		"\u0000\u0000\u04a5\u04a6\u00050\u0000\u0000\u04a6\u04a7\u0003\u00dam\u0000"+
		"\u04a7\u04ab\u0003\u00a4R\u0000\u04a8\u04aa\u0003\u00d4j\u0000\u04a9\u04a8"+
		"\u0001\u0000\u0000\u0000\u04aa\u04ad\u0001\u0000\u0000\u0000\u04ab\u04a9"+
		"\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u04af"+
		"\u0001\u0000\u0000\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ae\u04b0"+
		"\u0003\u00d8l\u0000\u04af\u04ae\u0001\u0000\u0000\u0000\u04af\u04b0\u0001"+
		"\u0000\u0000\u0000\u04b0\u00bd\u0001\u0000\u0000\u0000\u04b1\u04b2\u0005"+
		"*\u0000\u0000\u04b2\u04b3\u0003\u00eau\u0000\u04b3\u04b4\u0003\u00a4R"+
		"\u0000\u04b4\u00bf\u0001\u0000\u0000\u0000\u04b5\u04b6\u0005+\u0000\u0000"+
		"\u04b6\u04b7\u0003\u00eau\u0000\u04b7\u04b8\u0003\u00a4R\u0000\u04b8\u00c1"+
		"\u0001\u0000\u0000\u0000\u04b9\u04bb\u0005%\u0000\u0000\u04ba\u04bc\u0003"+
		"\u00f0x\u0000\u04bb\u04ba\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000"+
		"\u0000\u0000\u04bc\u04bd\u0001\u0000\u0000\u0000\u04bd\u04be\u0005U\u0000"+
		"\u0000\u04be\u00c3\u0001\u0000\u0000\u0000\u04bf\u04c0\u0005-\u0000\u0000"+
		"\u04c0\u04c1\u0003\u00f0x\u0000\u04c1\u04c2\u0005U\u0000\u0000\u04c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u04c3\u04c5\u0005\u0005\u0000\u0000\u04c4\u04c6"+
		"\u0003\u00aaU\u0000\u04c5\u04c4\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001"+
		"\u0000\u0000\u0000\u04c6\u04c7\u0001\u0000\u0000\u0000\u04c7\u04c8\u0005"+
		"U\u0000\u0000\u04c8\u00c7\u0001\u0000\u0000\u0000\u04c9\u04cb\u0005\f"+
		"\u0000\u0000\u04ca\u04cc\u0003\u00aaU\u0000\u04cb\u04ca\u0001\u0000\u0000"+
		"\u0000\u04cb\u04cc\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000"+
		"\u0000\u04cd\u04ce\u0005U\u0000\u0000\u04ce\u00c9\u0001\u0000\u0000\u0000"+
		"\u04cf\u04d0\u0005?\u0000\u0000\u04d0\u04d1\u0003\u00f0x\u0000\u04d1\u04d2"+
		"\u0005U\u0000\u0000\u04d2\u00cb\u0001\u0000\u0000\u0000\u04d3\u04d4\u0005"+
		"U\u0000\u0000\u04d4\u00cd\u0001\u0000\u0000\u0000\u04d5\u04d7\u0003\u00fc"+
		"~\u0000\u04d6\u04d8\u0005U\u0000\u0000\u04d7\u04d6\u0001\u0000\u0000\u0000"+
		"\u04d7\u04d8\u0001\u0000\u0000\u0000\u04d8\u00cf\u0001\u0000\u0000\u0000"+
		"\u04d9\u04da\u0003\u00aaU\u0000\u04da\u04db\u0005^\u0000\u0000\u04db\u04dc"+
		"\u0003\u00aeW\u0000\u04dc\u00d1\u0001\u0000\u0000\u0000\u04dd\u04de\u0005"+
		"\u0007\u0000\u0000\u04de\u04df\u0003\u00f0x\u0000\u04df\u04e0\u0005^\u0000"+
		"\u0000\u04e0\u04e1\u0003\u00a4R\u0000\u04e1\u00d3\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e3\u0005\b\u0000\u0000\u04e3\u04e7\u0005O\u0000\u0000\u04e4"+
		"\u04e6\u0003\u0016\u000b\u0000\u04e5\u04e4\u0001\u0000\u0000\u0000\u04e6"+
		"\u04e9\u0001\u0000\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e8\u0001\u0000\u0000\u0000\u04e8\u04ea\u0001\u0000\u0000\u0000\u04e9"+
		"\u04e7\u0001\u0000\u0000\u0000\u04ea\u04eb\u0003\u00d6k\u0000\u04eb\u04ec"+
		"\u0003\u00aaU\u0000\u04ec\u04ed\u0005P\u0000\u0000\u04ed\u04ee\u0003\u00a4"+
		"R\u0000\u04ee\u00d5\u0001\u0000\u0000\u0000\u04ef\u04f4\u0003n7\u0000"+
		"\u04f0\u04f1\u0005l\u0000\u0000\u04f1\u04f3\u0003n7\u0000\u04f2\u04f0"+
		"\u0001\u0000\u0000\u0000\u04f3\u04f6\u0001\u0000\u0000\u0000\u04f4\u04f2"+
		"\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000\u0000\u0000\u04f5\u00d7"+
		"\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001\u0000\u0000\u0000\u04f7\u04f8"+
		"\u0005\u0014\u0000\u0000\u04f8\u04f9\u0003\u00a4R\u0000\u04f9\u00d9\u0001"+
		"\u0000\u0000\u0000\u04fa\u04fb\u0005O\u0000\u0000\u04fb\u04fd\u0003\u00dc"+
		"n\u0000\u04fc\u04fe\u0005U\u0000\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000"+
		"\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000"+
		"\u04ff\u0500\u0005P\u0000\u0000\u0500\u00db\u0001\u0000\u0000\u0000\u0501"+
		"\u0506\u0003\u00deo\u0000\u0502\u0503\u0005U\u0000\u0000\u0503\u0505\u0003"+
		"\u00deo\u0000\u0504\u0502\u0001\u0000\u0000\u0000\u0505\u0508\u0001\u0000"+
		"\u0000\u0000\u0506\u0504\u0001\u0000\u0000\u0000\u0506\u0507\u0001\u0000"+
		"\u0000\u0000\u0507\u00dd\u0001\u0000\u0000\u0000\u0508\u0506\u0001\u0000"+
		"\u0000\u0000\u0509\u050b\u0003\u0016\u000b\u0000\u050a\u0509\u0001\u0000"+
		"\u0000\u0000\u050b\u050e\u0001\u0000\u0000\u0000\u050c\u050a\u0001\u0000"+
		"\u0000\u0000\u050c\u050d\u0001\u0000\u0000\u0000\u050d\u0514\u0001\u0000"+
		"\u0000\u0000\u050e\u050c\u0001\u0000\u0000\u0000\u050f\u0510\u0003Z-\u0000"+
		"\u0510\u0511\u0003T*\u0000\u0511\u0515\u0001\u0000\u0000\u0000\u0512\u0513"+
		"\u0005>\u0000\u0000\u0513\u0515\u0003\u00aaU\u0000\u0514\u050f\u0001\u0000"+
		"\u0000\u0000\u0514\u0512\u0001\u0000\u0000\u0000\u0515\u0516\u0001\u0000"+
		"\u0000\u0000\u0516\u0517\u0005X\u0000\u0000\u0517\u0518\u0003\u00f0x\u0000"+
		"\u0518\u051b\u0001\u0000\u0000\u0000\u0519\u051b\u0003\u00aaU\u0000\u051a"+
		"\u050c\u0001\u0000\u0000\u0000\u051a\u0519\u0001\u0000\u0000\u0000\u051b"+
		"\u00df\u0001\u0000\u0000\u0000\u051c\u051e\u0003\u00e2q\u0000\u051d\u051c"+
		"\u0001\u0000\u0000\u0000\u051e\u051f\u0001\u0000\u0000\u0000\u051f\u051d"+
		"\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000\u0000\u0000\u0520\u0522"+
		"\u0001\u0000\u0000\u0000\u0521\u0523\u0003\u00a6S\u0000\u0522\u0521\u0001"+
		"\u0000\u0000\u0000\u0523\u0524\u0001\u0000\u0000\u0000\u0524\u0522\u0001"+
		"\u0000\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525\u00e1\u0001"+
		"\u0000\u0000\u0000\u0526\u052c\u0005\u0007\u0000\u0000\u0527\u052d\u0003"+
		"\u00f0x\u0000\u0528\u052d\u0005\u0081\u0000\u0000\u0529\u052a\u0003\u011a"+
		"\u008d\u0000\u052a\u052b\u0003\u00aaU\u0000\u052b\u052d\u0001\u0000\u0000"+
		"\u0000\u052c\u0527\u0001\u0000\u0000\u0000\u052c\u0528\u0001\u0000\u0000"+
		"\u0000\u052c\u0529\u0001\u0000\u0000\u0000\u052d\u052e\u0001\u0000\u0000"+
		"\u0000\u052e\u0532\u0005^\u0000\u0000\u052f\u0530\u0005\r\u0000\u0000"+
		"\u0530\u0532\u0005^\u0000\u0000\u0531\u0526\u0001\u0000\u0000\u0000\u0531"+
		"\u052f\u0001\u0000\u0000\u0000\u0532\u00e3\u0001\u0000\u0000\u0000\u0533"+
		"\u0540\u0003\u00e8t\u0000\u0534\u0536\u0003\u00e6s\u0000\u0535\u0534\u0001"+
		"\u0000\u0000\u0000\u0535\u0536\u0001\u0000\u0000\u0000\u0536\u0537\u0001"+
		"\u0000\u0000\u0000\u0537\u0539\u0005U\u0000\u0000\u0538\u053a\u0003\u00f0"+
		"x\u0000\u0539\u0538\u0001\u0000\u0000\u0000\u0539\u053a\u0001\u0000\u0000"+
		"\u0000\u053a\u053b\u0001\u0000\u0000\u0000\u053b\u053d\u0005U\u0000\u0000"+
		"\u053c\u053e\u0003\u00ecv\u0000\u053d\u053c\u0001\u0000\u0000\u0000\u053d"+
		"\u053e\u0001\u0000\u0000\u0000\u053e\u0540\u0001\u0000\u0000\u0000\u053f"+
		"\u0533\u0001\u0000\u0000\u0000\u053f\u0535\u0001\u0000\u0000\u0000\u0540"+
		"\u00e5\u0001\u0000\u0000\u0000\u0541\u0544\u0003\u00a8T\u0000\u0542\u0544"+
		"\u0003\u00ecv\u0000\u0543\u0541\u0001\u0000\u0000\u0000\u0543\u0542\u0001"+
		"\u0000\u0000\u0000\u0544\u00e7\u0001\u0000\u0000\u0000\u0545\u0547\u0003"+
		"\u0016\u000b\u0000\u0546\u0545\u0001\u0000\u0000\u0000\u0547\u054a\u0001"+
		"\u0000\u0000\u0000\u0548\u0546\u0001\u0000\u0000\u0000\u0548\u0549\u0001"+
		"\u0000\u0000\u0000\u0549\u054d\u0001\u0000\u0000\u0000\u054a\u0548\u0001"+
		"\u0000\u0000\u0000\u054b\u054e\u0003\u011a\u008d\u0000\u054c\u054e\u0005"+
		">\u0000\u0000\u054d\u054b\u0001\u0000\u0000\u0000\u054d\u054c\u0001\u0000"+
		"\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000\u054f\u0550\u0003T*\u0000"+
		"\u0550\u0551\u0005^\u0000\u0000\u0551\u0552\u0003\u00f0x\u0000\u0552\u00e9"+
		"\u0001\u0000\u0000\u0000\u0553\u0555\u0005O\u0000\u0000\u0554\u0556\u0003"+
		"\u00f0x\u0000\u0555\u0554\u0001\u0000\u0000\u0000\u0555\u0556\u0001\u0000"+
		"\u0000\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557\u0558\u0005P\u0000"+
		"\u0000\u0558\u00eb\u0001\u0000\u0000\u0000\u0559\u055e\u0003\u00f0x\u0000"+
		"\u055a\u055b\u0005V\u0000\u0000\u055b\u055d\u0003\u00f0x\u0000\u055c\u055a"+
		"\u0001\u0000\u0000\u0000\u055d\u0560\u0001\u0000\u0000\u0000\u055e\u055c"+
		"\u0001\u0000\u0000\u0000\u055e\u055f\u0001\u0000\u0000\u0000\u055f\u00ed"+
		"\u0001\u0000\u0000\u0000\u0560\u055e\u0001\u0000\u0000\u0000\u0561\u0562"+
		"\u0003\u00aaU\u0000\u0562\u0564\u0005O\u0000\u0000\u0563\u0565\u0003\u00ec"+
		"v\u0000\u0564\u0563\u0001\u0000\u0000\u0000\u0564\u0565\u0001\u0000\u0000"+
		"\u0000\u0565\u0566\u0001\u0000\u0000\u0000\u0566\u0567\u0005P\u0000\u0000"+
		"\u0567\u0575\u0001\u0000\u0000\u0000\u0568\u0569\u0005,\u0000\u0000\u0569"+
		"\u056b\u0005O\u0000\u0000\u056a\u056c\u0003\u00ecv\u0000\u056b\u056a\u0001"+
		"\u0000\u0000\u0000\u056b\u056c\u0001\u0000\u0000\u0000\u056c\u056d\u0001"+
		"\u0000\u0000\u0000\u056d\u0575\u0005P\u0000\u0000\u056e\u056f\u0005)\u0000"+
		"\u0000\u056f\u0571\u0005O\u0000\u0000\u0570\u0572\u0003\u00ecv\u0000\u0571"+
		"\u0570\u0001\u0000\u0000\u0000\u0571\u0572\u0001\u0000\u0000\u0000\u0572"+
		"\u0573\u0001\u0000\u0000\u0000\u0573\u0575\u0005P\u0000\u0000\u0574\u0561"+
		"\u0001\u0000\u0000\u0000\u0574\u0568\u0001\u0000\u0000\u0000\u0574\u056e"+
		"\u0001\u0000\u0000\u0000\u0575\u00ef\u0001\u0000\u0000\u0000\u0576\u0577"+
		"\u0006x\uffff\uffff\u0000\u0577\u05a4\u0003\u00fa}\u0000\u0578\u05a4\u0003"+
		"\u00eew\u0000\u0579\u057a\u0005 \u0000\u0000\u057a\u05a4\u0003\u0106\u0083"+
		"\u0000\u057b\u057f\u0005O\u0000\u0000\u057c\u057e\u0003x<\u0000\u057d"+
		"\u057c\u0001\u0000\u0000\u0000\u057e\u0581\u0001\u0000\u0000\u0000\u057f"+
		"\u057d\u0001\u0000\u0000\u0000\u057f\u0580\u0001\u0000\u0000\u0000\u0580"+
		"\u0582\u0001\u0000\u0000\u0000\u0581\u057f\u0001\u0000\u0000\u0000\u0582"+
		"\u0587\u0003\u011a\u008d\u0000\u0583\u0584\u0005k\u0000\u0000\u0584\u0586"+
		"\u0003\u011a\u008d\u0000\u0585\u0583\u0001\u0000\u0000\u0000\u0586\u0589"+
		"\u0001\u0000\u0000\u0000\u0587\u0585\u0001\u0000\u0000\u0000\u0587\u0588"+
		"\u0001\u0000\u0000\u0000\u0588\u058a\u0001\u0000\u0000\u0000\u0589\u0587"+
		"\u0001\u0000\u0000\u0000\u058a\u058b\u0005P\u0000\u0000\u058b\u058c\u0003"+
		"\u00f0x\u0016\u058c\u05a4\u0001\u0000\u0000\u0000\u058d\u058e\u0007\u0006"+
		"\u0000\u0000\u058e\u05a4\u0003\u00f0x\u0014\u058f\u0590\u0007\u0007\u0000"+
		"\u0000\u0590\u05a4\u0003\u00f0x\u0013\u0591\u05a4\u0003\u00f4z\u0000\u0592"+
		"\u05a4\u0003\u00fc~\u0000\u0593\u0594\u0003\u011a\u008d\u0000\u0594\u059a"+
		"\u0005{\u0000\u0000\u0595\u0597\u0003\u011e\u008f\u0000\u0596\u0595\u0001"+
		"\u0000\u0000\u0000\u0596\u0597\u0001\u0000\u0000\u0000\u0597\u0598\u0001"+
		"\u0000\u0000\u0000\u0598\u059b\u0003\u00aaU\u0000\u0599\u059b\u0005 \u0000"+
		"\u0000\u059a\u0596\u0001\u0000\u0000\u0000\u059a\u0599\u0001\u0000\u0000"+
		"\u0000\u059b\u05a4\u0001\u0000\u0000\u0000\u059c\u059d\u0003\u0104\u0082"+
		"\u0000\u059d\u059f\u0005{\u0000\u0000\u059e\u05a0\u0003\u011e\u008f\u0000"+
		"\u059f\u059e\u0001\u0000\u0000\u0000\u059f\u05a0\u0001\u0000\u0000\u0000"+
		"\u05a0\u05a1\u0001\u0000\u0000\u0000\u05a1\u05a2\u0005 \u0000\u0000\u05a2"+
		"\u05a4\u0001\u0000\u0000\u0000\u05a3\u0576\u0001\u0000\u0000\u0000\u05a3"+
		"\u0578\u0001\u0000\u0000\u0000\u05a3\u0579\u0001\u0000\u0000\u0000\u05a3"+
		"\u057b\u0001\u0000\u0000\u0000\u05a3\u058d\u0001\u0000\u0000\u0000\u05a3"+
		"\u058f\u0001\u0000\u0000\u0000\u05a3\u0591\u0001\u0000\u0000\u0000\u05a3"+
		"\u0592\u0001\u0000\u0000\u0000\u05a3\u0593\u0001\u0000\u0000\u0000\u05a3"+
		"\u059c\u0001\u0000\u0000\u0000\u05a4\u05f8\u0001\u0000\u0000\u0000\u05a5"+
		"\u05a6\n\u0012\u0000\u0000\u05a6\u05a7\u0007\b\u0000\u0000\u05a7\u05f7"+
		"\u0003\u00f0x\u0013\u05a8\u05a9\n\u0011\u0000\u0000\u05a9\u05aa\u0007"+
		"\t\u0000\u0000\u05aa\u05f7\u0003\u00f0x\u0012\u05ab\u05b3\n\u0010\u0000"+
		"\u0000\u05ac\u05ad\u0005Z\u0000\u0000\u05ad\u05b4\u0005Z\u0000\u0000\u05ae"+
		"\u05af\u0005Y\u0000\u0000\u05af\u05b0\u0005Y\u0000\u0000\u05b0\u05b4\u0005"+
		"Y\u0000\u0000\u05b1\u05b2\u0005Y\u0000\u0000\u05b2\u05b4\u0005Y\u0000"+
		"\u0000\u05b3\u05ac\u0001\u0000\u0000\u0000\u05b3\u05ae\u0001\u0000\u0000"+
		"\u0000\u05b3\u05b1\u0001\u0000\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000"+
		"\u0000\u05b5\u05f7\u0003\u00f0x\u0011\u05b6\u05b7\n\u000f\u0000\u0000"+
		"\u05b7\u05b8\u0007\n\u0000\u0000\u05b8\u05f7\u0003\u00f0x\u0010\u05b9"+
		"\u05ba\n\r\u0000\u0000\u05ba\u05bb\u0007\u000b\u0000\u0000\u05bb\u05f7"+
		"\u0003\u00f0x\u000e\u05bc\u05bd\n\f\u0000\u0000\u05bd\u05be\u0005k\u0000"+
		"\u0000\u05be\u05f7\u0003\u00f0x\r\u05bf\u05c0\n\u000b\u0000\u0000\u05c0"+
		"\u05c1\u0005m\u0000\u0000\u05c1\u05f7\u0003\u00f0x\f\u05c2\u05c3\n\n\u0000"+
		"\u0000\u05c3\u05c4\u0005l\u0000\u0000\u05c4\u05f7\u0003\u00f0x\u000b\u05c5"+
		"\u05c6\n\t\u0000\u0000\u05c6\u05c7\u0005c\u0000\u0000\u05c7\u05f7\u0003"+
		"\u00f0x\n\u05c8\u05c9\n\b\u0000\u0000\u05c9\u05ca\u0005d\u0000\u0000\u05ca"+
		"\u05f7\u0003\u00f0x\t\u05cb\u05cc\n\u0007\u0000\u0000\u05cc\u05cd\u0005"+
		"]\u0000\u0000\u05cd\u05ce\u0003\u00f0x\u0000\u05ce\u05cf\u0005^\u0000"+
		"\u0000\u05cf\u05d0\u0003\u00f0x\u0007\u05d0\u05f7\u0001\u0000\u0000\u0000"+
		"\u05d1\u05d2\n\u0006\u0000\u0000\u05d2\u05d3\u0007\f\u0000\u0000\u05d3"+
		"\u05f7\u0003\u00f0x\u0006\u05d4\u05d5\n\u001a\u0000\u0000\u05d5\u05e1"+
		"\u0005W\u0000\u0000\u05d6\u05e2\u0003\u00aaU\u0000\u05d7\u05e2\u0003\u00ee"+
		"w\u0000\u05d8\u05e2\u0005,\u0000\u0000\u05d9\u05db\u0005 \u0000\u0000"+
		"\u05da\u05dc\u0003\u0116\u008b\u0000\u05db\u05da\u0001\u0000\u0000\u0000"+
		"\u05db\u05dc\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000\u0000"+
		"\u05dd\u05e2\u0003\u010a\u0085\u0000\u05de\u05df\u0005)\u0000\u0000\u05df"+
		"\u05e2\u0003\u0120\u0090\u0000\u05e0\u05e2\u0003\u0110\u0088\u0000\u05e1"+
		"\u05d6\u0001\u0000\u0000\u0000\u05e1\u05d7\u0001\u0000\u0000\u0000\u05e1"+
		"\u05d8\u0001\u0000\u0000\u0000\u05e1\u05d9\u0001\u0000\u0000\u0000\u05e1"+
		"\u05de\u0001\u0000\u0000\u0000\u05e1\u05e0\u0001\u0000\u0000\u0000\u05e2"+
		"\u05f7\u0001\u0000\u0000\u0000\u05e3\u05e4\n\u0019\u0000\u0000\u05e4\u05e5"+
		"\u0005S\u0000\u0000\u05e5\u05e6\u0003\u00f0x\u0000\u05e6\u05e7\u0005T"+
		"\u0000\u0000\u05e7\u05f7\u0001\u0000\u0000\u0000\u05e8\u05e9\n\u0015\u0000"+
		"\u0000\u05e9\u05f7\u0007\r\u0000\u0000\u05ea\u05eb\n\u000e\u0000\u0000"+
		"\u05eb\u05ee\u0005\u001b\u0000\u0000\u05ec\u05ef\u0003\u011a\u008d\u0000"+
		"\u05ed\u05ef\u0003\u00f2y\u0000\u05ee\u05ec\u0001\u0000\u0000\u0000\u05ee"+
		"\u05ed\u0001\u0000\u0000\u0000\u05ef\u05f7\u0001\u0000\u0000\u0000\u05f0"+
		"\u05f1\n\u0003\u0000\u0000\u05f1\u05f3\u0005{\u0000\u0000\u05f2\u05f4"+
		"\u0003\u011e\u008f\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000\u05f3\u05f4"+
		"\u0001\u0000\u0000\u0000\u05f4\u05f5\u0001\u0000\u0000\u0000\u05f5\u05f7"+
		"\u0003\u00aaU\u0000\u05f6\u05a5\u0001\u0000\u0000\u0000\u05f6\u05a8\u0001"+
		"\u0000\u0000\u0000\u05f6\u05ab\u0001\u0000\u0000\u0000\u05f6\u05b6\u0001"+
		"\u0000\u0000\u0000\u05f6\u05b9\u0001\u0000\u0000\u0000\u05f6\u05bc\u0001"+
		"\u0000\u0000\u0000\u05f6\u05bf\u0001\u0000\u0000\u0000\u05f6\u05c2\u0001"+
		"\u0000\u0000\u0000\u05f6\u05c5\u0001\u0000\u0000\u0000\u05f6\u05c8\u0001"+
		"\u0000\u0000\u0000\u05f6\u05cb\u0001\u0000\u0000\u0000\u05f6\u05d1\u0001"+
		"\u0000\u0000\u0000\u05f6\u05d4\u0001\u0000\u0000\u0000\u05f6\u05e3\u0001"+
		"\u0000\u0000\u0000\u05f6\u05e8\u0001\u0000\u0000\u0000\u05f6\u05ea\u0001"+
		"\u0000\u0000\u0000\u05f6\u05f0\u0001\u0000\u0000\u0000\u05f7\u05fa\u0001"+
		"\u0000\u0000\u0000\u05f8\u05f6\u0001\u0000\u0000\u0000\u05f8\u05f9\u0001"+
		"\u0000\u0000\u0000\u05f9\u00f1\u0001\u0000\u0000\u0000\u05fa\u05f8\u0001"+
		"\u0000\u0000\u0000\u05fb\u05fd\u0003\u0016\u000b\u0000\u05fc\u05fb\u0001"+
		"\u0000\u0000\u0000\u05fd\u0600\u0001\u0000\u0000\u0000\u05fe\u05fc\u0001"+
		"\u0000\u0000\u0000\u05fe\u05ff\u0001\u0000\u0000\u0000\u05ff\u0601\u0001"+
		"\u0000\u0000\u0000\u0600\u05fe\u0001\u0000\u0000\u0000\u0601\u0605\u0003"+
		"\u011a\u008d\u0000\u0602\u0604\u0003x<\u0000\u0603\u0602\u0001\u0000\u0000"+
		"\u0000\u0604\u0607\u0001\u0000\u0000\u0000\u0605\u0603\u0001\u0000\u0000"+
		"\u0000\u0605\u0606\u0001\u0000\u0000\u0000\u0606\u0608\u0001\u0000\u0000"+
		"\u0000\u0607\u0605\u0001\u0000\u0000\u0000\u0608\u0609\u0003\u00aaU\u0000"+
		"\u0609\u00f3\u0001\u0000\u0000\u0000\u060a\u060b\u0003\u00f6{\u0000\u060b"+
		"\u060c\u0005z\u0000\u0000\u060c\u060d\u0003\u00f8|\u0000\u060d\u00f5\u0001"+
		"\u0000\u0000\u0000\u060e\u0625\u0003\u00aaU\u0000\u060f\u0611\u0005O\u0000"+
		"\u0000\u0610\u0612\u0003d2\u0000\u0611\u0610\u0001\u0000\u0000\u0000\u0611"+
		"\u0612\u0001\u0000\u0000\u0000\u0612\u0613\u0001\u0000\u0000\u0000\u0613"+
		"\u0625\u0005P\u0000\u0000\u0614\u0615\u0005O\u0000\u0000\u0615\u061a\u0003"+
		"\u00aaU\u0000\u0616\u0617\u0005V\u0000\u0000\u0617\u0619\u0003\u00aaU"+
		"\u0000\u0618\u0616\u0001\u0000\u0000\u0000\u0619\u061c\u0001\u0000\u0000"+
		"\u0000\u061a\u0618\u0001\u0000\u0000\u0000\u061a\u061b\u0001\u0000\u0000"+
		"\u0000\u061b\u061d\u0001\u0000\u0000\u0000\u061c\u061a\u0001\u0000\u0000"+
		"\u0000\u061d\u061e\u0005P\u0000\u0000\u061e\u0625\u0001\u0000\u0000\u0000"+
		"\u061f\u0621\u0005O\u0000\u0000\u0620\u0622\u0003j5\u0000\u0621\u0620"+
		"\u0001\u0000\u0000\u0000\u0621\u0622\u0001\u0000\u0000\u0000\u0622\u0623"+
		"\u0001\u0000\u0000\u0000\u0623\u0625\u0005P\u0000\u0000\u0624\u060e\u0001"+
		"\u0000\u0000\u0000\u0624\u060f\u0001\u0000\u0000\u0000\u0624\u0614\u0001"+
		"\u0000\u0000\u0000\u0624\u061f\u0001\u0000\u0000\u0000\u0625\u00f7\u0001"+
		"\u0000\u0000\u0000\u0626\u0629\u0003\u00f0x\u0000\u0627\u0629\u0003\u00a4"+
		"R\u0000\u0628\u0626\u0001\u0000\u0000\u0000\u0628\u0627\u0001\u0000\u0000"+
		"\u0000\u0629\u00f9\u0001\u0000\u0000\u0000\u062a\u062b\u0005O\u0000\u0000"+
		"\u062b\u062c\u0003\u00f0x\u0000\u062c\u062d\u0005P\u0000\u0000\u062d\u063d"+
		"\u0001\u0000\u0000\u0000\u062e\u063d\u0005,\u0000\u0000\u062f\u063d\u0005"+
		")\u0000\u0000\u0630\u063d\u0003p8\u0000\u0631\u063d\u0003\u00aaU\u0000"+
		"\u0632\u0633\u00036\u001b\u0000\u0633\u0634\u0005W\u0000\u0000\u0634\u0635"+
		"\u0005\n\u0000\u0000\u0635\u063d\u0001\u0000\u0000\u0000\u0636\u063a\u0003"+
		"\u0116\u008b\u0000\u0637\u063b\u0003\u0122\u0091\u0000\u0638\u0639\u0005"+
		",\u0000\u0000\u0639\u063b\u0003\u0124\u0092\u0000\u063a\u0637\u0001\u0000"+
		"\u0000\u0000\u063a\u0638\u0001\u0000\u0000\u0000\u063b\u063d\u0001\u0000"+
		"\u0000\u0000\u063c\u062a\u0001\u0000\u0000\u0000\u063c\u062e\u0001\u0000"+
		"\u0000\u0000\u063c\u062f\u0001\u0000\u0000\u0000\u063c\u0630\u0001\u0000"+
		"\u0000\u0000\u063c\u0631\u0001\u0000\u0000\u0000\u063c\u0632\u0001\u0000"+
		"\u0000\u0000\u063c\u0636\u0001\u0000\u0000\u0000\u063d\u00fb\u0001\u0000"+
		"\u0000\u0000\u063e\u063f\u0005*\u0000\u0000\u063f\u0640\u0003\u00eau\u0000"+
		"\u0640\u0644\u0005Q\u0000\u0000\u0641\u0643\u0003\u00fe\u007f\u0000\u0642"+
		"\u0641\u0001\u0000\u0000\u0000\u0643\u0646\u0001\u0000\u0000\u0000\u0644"+
		"\u0642\u0001\u0000\u0000\u0000\u0644\u0645\u0001\u0000\u0000\u0000\u0645"+
		"\u0647\u0001\u0000\u0000\u0000\u0646\u0644\u0001\u0000\u0000\u0000\u0647"+
		"\u0648\u0005R\u0000\u0000\u0648\u00fd\u0001\u0000\u0000\u0000\u0649\u064d"+
		"\u0005\u0007\u0000\u0000\u064a\u064e\u0003\u00ecv\u0000\u064b\u064e\u0005"+
		"N\u0000\u0000\u064c\u064e\u0003\u0100\u0080\u0000\u064d\u064a\u0001\u0000"+
		"\u0000\u0000\u064d\u064b\u0001\u0000\u0000\u0000\u064d\u064c\u0001\u0000"+
		"\u0000\u0000\u064e\u064f\u0001\u0000\u0000\u0000\u064f\u0650\u0007\u000e"+
		"\u0000\u0000\u0650\u0655\u0003\u0102\u0081\u0000\u0651\u0652\u0005\r\u0000"+
		"\u0000\u0652\u0653\u0007\u000e\u0000\u0000\u0653\u0655\u0003\u0102\u0081"+
		"\u0000\u0654\u0649\u0001\u0000\u0000\u0000\u0654\u0651\u0001\u0000\u0000"+
		"\u0000\u0655\u00ff\u0001\u0000\u0000\u0000\u0656\u0657\u0006\u0080\uffff"+
		"\uffff\u0000\u0657\u0658\u0005O\u0000\u0000\u0658\u0659\u0003\u0100\u0080"+
		"\u0000\u0659\u065a\u0005P\u0000\u0000\u065a\u0671\u0001\u0000\u0000\u0000"+
		"\u065b\u065d\u0003\u0016\u000b\u0000\u065c\u065b\u0001\u0000\u0000\u0000"+
		"\u065d\u0660\u0001\u0000\u0000\u0000\u065e\u065c\u0001\u0000\u0000\u0000"+
		"\u065e\u065f\u0001\u0000\u0000\u0000\u065f\u0661\u0001\u0000\u0000\u0000"+
		"\u0660\u065e\u0001\u0000\u0000\u0000\u0661\u0665\u0003\u011a\u008d\u0000"+
		"\u0662\u0664\u0003x<\u0000\u0663\u0662\u0001\u0000\u0000\u0000\u0664\u0667"+
		"\u0001\u0000\u0000\u0000\u0665\u0663\u0001\u0000\u0000\u0000\u0665\u0666"+
		"\u0001\u0000\u0000\u0000\u0666\u0668\u0001\u0000\u0000\u0000\u0667\u0665"+
		"\u0001\u0000\u0000\u0000\u0668\u066d\u0003\u00aaU\u0000\u0669\u066a\u0005"+
		"c\u0000\u0000\u066a\u066c\u0003\u00f0x\u0000\u066b\u0669\u0001\u0000\u0000"+
		"\u0000\u066c\u066f\u0001\u0000\u0000\u0000\u066d\u066b\u0001\u0000\u0000"+
		"\u0000\u066d\u066e\u0001\u0000\u0000\u0000\u066e\u0671\u0001\u0000\u0000"+
		"\u0000\u066f\u066d\u0001\u0000\u0000\u0000\u0670\u0656\u0001\u0000\u0000"+
		"\u0000\u0670\u065e\u0001\u0000\u0000\u0000\u0671\u0677\u0001\u0000\u0000"+
		"\u0000\u0672\u0673\n\u0001\u0000\u0000\u0673\u0674\u0005c\u0000\u0000"+
		"\u0674\u0676\u0003\u00f0x\u0000\u0675\u0672\u0001\u0000\u0000\u0000\u0676"+
		"\u0679\u0001\u0000\u0000\u0000\u0677\u0675\u0001\u0000\u0000\u0000\u0677"+
		"\u0678\u0001\u0000\u0000\u0000\u0678\u0101\u0001\u0000\u0000\u0000\u0679"+
		"\u0677\u0001\u0000\u0000\u0000\u067a\u0682\u0003\u00a4R\u0000\u067b\u067d"+
		"\u0003\u00a6S\u0000\u067c\u067b\u0001\u0000\u0000\u0000\u067d\u0680\u0001"+
		"\u0000\u0000\u0000\u067e\u067c\u0001\u0000\u0000\u0000\u067e\u067f\u0001"+
		"\u0000\u0000\u0000\u067f\u0682\u0001\u0000\u0000\u0000\u0680\u067e\u0001"+
		"\u0000\u0000\u0000\u0681\u067a\u0001\u0000\u0000\u0000\u0681\u067e\u0001"+
		"\u0000\u0000\u0000\u0682\u0103\u0001\u0000\u0000\u0000\u0683\u0684\u0003"+
		"Z-\u0000\u0684\u0685\u0005W\u0000\u0000\u0685\u0687\u0001\u0000\u0000"+
		"\u0000\u0686\u0683\u0001\u0000\u0000\u0000\u0686\u0687\u0001\u0000\u0000"+
		"\u0000\u0687\u068b\u0001\u0000\u0000\u0000\u0688\u068a\u0003x<\u0000\u0689"+
		"\u0688\u0001\u0000\u0000\u0000\u068a\u068d\u0001\u0000\u0000\u0000\u068b"+
		"\u0689\u0001\u0000\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c"+
		"\u068e\u0001\u0000\u0000\u0000\u068d\u068b\u0001\u0000\u0000\u0000\u068e"+
		"\u0690\u0003\u00aaU\u0000\u068f\u0691\u0003\u011e\u008f\u0000\u0690\u068f"+
		"\u0001\u0000\u0000\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u0105"+
		"\u0001\u0000\u0000\u0000\u0692\u0693\u0003\u0116\u008b\u0000\u0693\u0694"+
		"\u0003\u0108\u0084\u0000\u0694\u0695\u0003\u010e\u0087\u0000\u0695\u069c"+
		"\u0001\u0000\u0000\u0000\u0696\u0699\u0003\u0108\u0084\u0000\u0697\u069a"+
		"\u0003\u010c\u0086\u0000\u0698\u069a\u0003\u010e\u0087\u0000\u0699\u0697"+
		"\u0001\u0000\u0000\u0000\u0699\u0698\u0001\u0000\u0000\u0000\u069a\u069c"+
		"\u0001\u0000\u0000\u0000\u069b\u0692\u0001\u0000\u0000\u0000\u069b\u0696"+
		"\u0001\u0000\u0000\u0000\u069c\u0107\u0001\u0000\u0000\u0000\u069d\u069f"+
		"\u0003\u00aaU\u0000\u069e\u06a0\u0003\u0112\u0089\u0000\u069f\u069e\u0001"+
		"\u0000\u0000\u0000\u069f\u06a0\u0001\u0000\u0000\u0000\u06a0\u06a8\u0001"+
		"\u0000\u0000\u0000\u06a1\u06a2\u0005W\u0000\u0000\u06a2\u06a4\u0003\u00aa"+
		"U\u0000\u06a3\u06a5\u0003\u0112\u0089\u0000\u06a4\u06a3\u0001\u0000\u0000"+
		"\u0000\u06a4\u06a5\u0001\u0000\u0000\u0000\u06a5\u06a7\u0001\u0000\u0000"+
		"\u0000\u06a6\u06a1\u0001\u0000\u0000\u0000\u06a7\u06aa\u0001\u0000\u0000"+
		"\u0000\u06a8\u06a6\u0001\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000\u0000"+
		"\u0000\u06a9\u06ad\u0001\u0000\u0000\u0000\u06aa\u06a8\u0001\u0000\u0000"+
		"\u0000\u06ab\u06ad\u0003\u011c\u008e\u0000\u06ac\u069d\u0001\u0000\u0000"+
		"\u0000\u06ac\u06ab\u0001\u0000\u0000\u0000\u06ad\u0109\u0001\u0000\u0000"+
		"\u0000\u06ae\u06b0\u0003\u00aaU\u0000\u06af\u06b1\u0003\u0114\u008a\u0000"+
		"\u06b0\u06af\u0001\u0000\u0000\u0000\u06b0\u06b1\u0001\u0000\u0000\u0000"+
		"\u06b1\u06b2\u0001\u0000\u0000\u0000\u06b2\u06b3\u0003\u010e\u0087\u0000"+
		"\u06b3\u010b\u0001\u0000\u0000\u0000\u06b4\u06d0\u0005S\u0000\u0000\u06b5"+
		"\u06ba\u0005T\u0000\u0000\u06b6\u06b7\u0005S\u0000\u0000\u06b7\u06b9\u0005"+
		"T\u0000\u0000\u06b8\u06b6\u0001\u0000\u0000\u0000\u06b9\u06bc\u0001\u0000"+
		"\u0000\u0000\u06ba\u06b8\u0001\u0000\u0000\u0000\u06ba\u06bb\u0001\u0000"+
		"\u0000\u0000\u06bb\u06bd\u0001\u0000\u0000\u0000\u06bc\u06ba\u0001\u0000"+
		"\u0000\u0000\u06bd\u06d1\u0003X,\u0000\u06be\u06bf\u0003\u00f0x\u0000"+
		"\u06bf\u06c6\u0005T\u0000\u0000\u06c0\u06c1\u0005S\u0000\u0000\u06c1\u06c2"+
		"\u0003\u00f0x\u0000\u06c2\u06c3\u0005T\u0000\u0000\u06c3\u06c5\u0001\u0000"+
		"\u0000\u0000\u06c4\u06c0\u0001\u0000\u0000\u0000\u06c5\u06c8\u0001\u0000"+
		"\u0000\u0000\u06c6\u06c4\u0001\u0000\u0000\u0000\u06c6\u06c7\u0001\u0000"+
		"\u0000\u0000\u06c7\u06cd\u0001\u0000\u0000\u0000\u06c8\u06c6\u0001\u0000"+
		"\u0000\u0000\u06c9\u06ca\u0005S\u0000\u0000\u06ca\u06cc\u0005T\u0000\u0000"+
		"\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cc\u06cf\u0001\u0000\u0000\u0000"+
		"\u06cd\u06cb\u0001\u0000\u0000\u0000\u06cd\u06ce\u0001\u0000\u0000\u0000"+
		"\u06ce\u06d1\u0001\u0000\u0000\u0000\u06cf\u06cd\u0001\u0000\u0000\u0000"+
		"\u06d0\u06b5\u0001\u0000\u0000\u0000\u06d0\u06be\u0001\u0000\u0000\u0000"+
		"\u06d1\u010d\u0001\u0000\u0000\u0000\u06d2\u06d4\u0003\u0124\u0092\u0000"+
		"\u06d3\u06d5\u0003*\u0015\u0000\u06d4\u06d3\u0001\u0000\u0000\u0000\u06d4"+
		"\u06d5\u0001\u0000\u0000\u0000\u06d5\u010f\u0001\u0000\u0000\u0000\u06d6"+
		"\u06d7\u0003\u0116\u008b\u0000\u06d7\u06d8\u0003\u0122\u0091\u0000\u06d8"+
		"\u0111\u0001\u0000\u0000\u0000\u06d9\u06da\u0005Z\u0000\u0000\u06da\u06dd"+
		"\u0005Y\u0000\u0000\u06db\u06dd\u0003\u011e\u008f\u0000\u06dc\u06d9\u0001"+
		"\u0000\u0000\u0000\u06dc\u06db\u0001\u0000\u0000\u0000\u06dd\u0113\u0001"+
		"\u0000\u0000\u0000\u06de\u06df\u0005Z\u0000\u0000\u06df\u06e2\u0005Y\u0000"+
		"\u0000\u06e0\u06e2\u0003\u0116\u008b\u0000\u06e1\u06de\u0001\u0000\u0000"+
		"\u0000\u06e1\u06e0\u0001\u0000\u0000\u0000\u06e2\u0115\u0001\u0000\u0000"+
		"\u0000\u06e3\u06e4\u0005Z\u0000\u0000\u06e4\u06e5\u0003\u0118\u008c\u0000"+
		"\u06e5\u06e6\u0005Y\u0000\u0000\u06e6\u0117\u0001\u0000\u0000\u0000\u06e7"+
		"\u06ec\u0003\u011a\u008d\u0000\u06e8\u06e9\u0005V\u0000\u0000\u06e9\u06eb"+
		"\u0003\u011a\u008d\u0000\u06ea\u06e8\u0001\u0000\u0000\u0000\u06eb\u06ee"+
		"\u0001\u0000\u0000\u0000\u06ec\u06ea\u0001\u0000\u0000\u0000\u06ec\u06ed"+
		"\u0001\u0000\u0000\u0000\u06ed\u0119\u0001\u0000\u0000\u0000\u06ee\u06ec"+
		"\u0001\u0000\u0000\u0000\u06ef\u06f1\u0003x<\u0000\u06f0\u06ef\u0001\u0000"+
		"\u0000\u0000\u06f1\u06f4\u0001\u0000\u0000\u0000\u06f2\u06f0\u0001\u0000"+
		"\u0000\u0000\u06f2\u06f3\u0001\u0000\u0000\u0000\u06f3\u06f7\u0001\u0000"+
		"\u0000\u0000\u06f4\u06f2\u0001\u0000\u0000\u0000\u06f5\u06f8\u0003Z-\u0000"+
		"\u06f6\u06f8\u0003\u011c\u008e\u0000\u06f7\u06f5\u0001\u0000\u0000\u0000"+
		"\u06f7\u06f6\u0001\u0000\u0000\u0000\u06f8\u0703\u0001\u0000\u0000\u0000"+
		"\u06f9\u06fb\u0003x<\u0000\u06fa\u06f9\u0001\u0000\u0000\u0000\u06fb\u06fe"+
		"\u0001\u0000\u0000\u0000\u06fc\u06fa\u0001\u0000\u0000\u0000\u06fc\u06fd"+
		"\u0001\u0000\u0000\u0000\u06fd\u06ff\u0001\u0000\u0000\u0000\u06fe\u06fc"+
		"\u0001\u0000\u0000\u0000\u06ff\u0700\u0005S\u0000\u0000\u0700\u0702\u0005"+
		"T\u0000\u0000\u0701\u06fc\u0001\u0000\u0000\u0000\u0702\u0705\u0001\u0000"+
		"\u0000\u0000\u0703\u0701\u0001\u0000\u0000\u0000\u0703\u0704\u0001\u0000"+
		"\u0000\u0000\u0704\u011b\u0001\u0000\u0000\u0000\u0705\u0703\u0001\u0000"+
		"\u0000\u0000\u0706\u0707\u0007\u000f\u0000\u0000\u0707\u011d\u0001\u0000"+
		"\u0000\u0000\u0708\u0709\u0005Z\u0000\u0000\u0709\u070e\u0003\\.\u0000"+
		"\u070a\u070b\u0005V\u0000\u0000\u070b\u070d\u0003\\.\u0000\u070c\u070a"+
		"\u0001\u0000\u0000\u0000\u070d\u0710\u0001\u0000\u0000\u0000\u070e\u070c"+
		"\u0001\u0000\u0000\u0000\u070e\u070f\u0001\u0000\u0000\u0000\u070f\u0711"+
		"\u0001\u0000\u0000\u0000\u0710\u070e\u0001\u0000\u0000\u0000\u0711\u0712"+
		"\u0005Y\u0000\u0000\u0712\u011f\u0001\u0000\u0000\u0000\u0713\u071d\u0003"+
		"\u0124\u0092\u0000\u0714\u0716\u0005W\u0000\u0000\u0715\u0717\u0003\u011e"+
		"\u008f\u0000\u0716\u0715\u0001\u0000\u0000\u0000\u0716\u0717\u0001\u0000"+
		"\u0000\u0000\u0717\u0718\u0001\u0000\u0000\u0000\u0718\u071a\u0003\u00aa"+
		"U\u0000\u0719\u071b\u0003\u0124\u0092\u0000\u071a\u0719\u0001\u0000\u0000"+
		"\u0000\u071a\u071b\u0001\u0000\u0000\u0000\u071b\u071d\u0001\u0000\u0000"+
		"\u0000\u071c\u0713\u0001\u0000\u0000\u0000\u071c\u0714\u0001\u0000\u0000"+
		"\u0000\u071d\u0121\u0001\u0000\u0000\u0000\u071e\u071f\u0005)\u0000\u0000"+
		"\u071f\u0724\u0003\u0120\u0090\u0000\u0720\u0721\u0003\u00aaU\u0000\u0721"+
		"\u0722\u0003\u0124\u0092\u0000\u0722\u0724\u0001\u0000\u0000\u0000\u0723"+
		"\u071e\u0001\u0000\u0000\u0000\u0723\u0720\u0001\u0000\u0000\u0000\u0724"+
		"\u0123\u0001\u0000\u0000\u0000\u0725\u0727\u0005O\u0000\u0000\u0726\u0728"+
		"\u0003\u00ecv\u0000\u0727\u0726\u0001\u0000\u0000\u0000\u0727\u0728\u0001"+
		"\u0000\u0000\u0000\u0728\u0729\u0001\u0000\u0000\u0000\u0729\u072a\u0005"+
		"P\u0000\u0000\u072a\u0125\u0001\u0000\u0000\u0000\u00de\u012a\u012d\u0134"+
		"\u013a\u013e\u0142\u0149\u0151\u0158\u015c\u015f\u0164\u0169\u016f\u0174"+
		"\u017e\u0183\u0187\u018b\u018f\u0199\u01a1\u01a9\u01ad\u01b4\u01bb\u01bf"+
		"\u01c2\u01c5\u01ce\u01d4\u01d9\u01dc\u01e2\u01e8\u01ec\u01f0\u01f8\u0201"+
		"\u0208\u020e\u0212\u021e\u0227\u022c\u0232\u0236\u0242\u024d\u0252\u025c"+
		"\u0264\u026e\u0277\u0282\u0287\u0290\u029a\u029f\u02a8\u02ae\u02b5\u02ba"+
		"\u02c2\u02c6\u02c8\u02ce\u02d3\u02d7\u02de\u02e4\u02e6\u02ed\u02f2\u02f7"+
		"\u02fa\u02fc\u0306\u0310\u0315\u0318\u031d\u0326\u032d\u0338\u033e\u0349"+
		"\u0353\u035e\u0367\u036c\u036f\u0376\u0380\u0388\u038b\u038e\u039b\u03a3"+
		"\u03a8\u03b0\u03b4\u03b8\u03bc\u03c0\u03c2\u03c6\u03cc\u03d4\u03de\u03e7"+
		"\u03f1\u03f9\u0407\u040e\u0413\u0419\u0422\u042c\u0435\u043f\u0444\u044f"+
		"\u0456\u045c\u045f\u0477\u047d\u0486\u049d\u04a0\u04a3\u04ab\u04af\u04bb"+
		"\u04c5\u04cb\u04d7\u04e7\u04f4\u04fd\u0506\u050c\u0514\u051a\u051f\u0524"+
		"\u052c\u0531\u0535\u0539\u053d\u053f\u0543\u0548\u054d\u0555\u055e\u0564"+
		"\u056b\u0571\u0574\u057f\u0587\u0596\u059a\u059f\u05a3\u05b3\u05db\u05e1"+
		"\u05ee\u05f3\u05f6\u05f8\u05fe\u0605\u0611\u061a\u0621\u0624\u0628\u063a"+
		"\u063c\u0644\u064d\u0654\u065e\u0665\u066d\u0670\u0677\u067e\u0681\u0686"+
		"\u068b\u0690\u0699\u069b\u069f\u06a4\u06a8\u06ac\u06b0\u06ba\u06c6\u06cd"+
		"\u06d0\u06d4\u06dc\u06e1\u06ec\u06f2\u06f7\u06fc\u0703\u070e\u0716\u071a"+
		"\u071c\u0723\u0727";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}