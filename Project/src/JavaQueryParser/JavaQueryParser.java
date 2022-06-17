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
		T__0=1, T__1=2, ABSTRACT=3, ASSERT=4, BOOLEAN=5, BREAK=6, BYTE=7, CASE=8, 
		CATCH=9, CHAR=10, CLASS=11, CONST=12, CONTINUE=13, DEFAULT=14, DO=15, 
		DOUBLE=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, FLOAT=22, 
		FOR=23, IF=24, GOTO=25, IMPLEMENTS=26, IMPORT=27, INSTANCEOF=28, INT=29, 
		INTERFACE=30, LONG=31, NATIVE=32, NEW=33, PACKAGE=34, PRIVATE=35, PROTECTED=36, 
		PUBLIC=37, RETURN=38, SHORT=39, STATIC=40, STRICTFP=41, SUPER=42, SWITCH=43, 
		SYNCHRONIZED=44, THIS=45, THROW=46, THROWS=47, TRANSIENT=48, TRY=49, VOID=50, 
		VOLATILE=51, WHILE=52, MODULE=53, OPEN=54, REQUIRES=55, EXPORTS=56, OPENS=57, 
		TO=58, USES=59, PROVIDES=60, WITH=61, TRANSITIVE=62, VAR=63, YIELD=64, 
		RECORD=65, SEALED=66, PERMITS=67, NON_SEALED=68, STRUCT=69, NULL_BLOCK=70, 
		EMPTY_BLOCK=71, WILDCARD=72, DECIMAL_LITERAL=73, HEX_LITERAL=74, OCT_LITERAL=75, 
		BINARY_LITERAL=76, FLOAT_LITERAL=77, HEX_FLOAT_LITERAL=78, BOOL_LITERAL=79, 
		CHAR_LITERAL=80, STRING_LITERAL=81, TEXT_BLOCK=82, NULL_LITERAL=83, LPAREN=84, 
		RPAREN=85, LBRACE=86, RBRACE=87, LBRACK=88, RBRACK=89, SEMI=90, COMMA=91, 
		DOT=92, ASSIGN=93, GT=94, LT=95, BANG=96, TILDE=97, QUESTION=98, COLON=99, 
		EQUAL=100, LE=101, GE=102, NOTEQUAL=103, AND=104, OR=105, INC=106, DEC=107, 
		ADD=108, SUB=109, MUL=110, DIV=111, BITAND=112, BITOR=113, CARET=114, 
		MOD=115, ADD_ASSIGN=116, SUB_ASSIGN=117, MUL_ASSIGN=118, DIV_ASSIGN=119, 
		AND_ASSIGN=120, OR_ASSIGN=121, XOR_ASSIGN=122, MOD_ASSIGN=123, LSHIFT_ASSIGN=124, 
		RSHIFT_ASSIGN=125, URSHIFT_ASSIGN=126, ARROW=127, COLONCOLON=128, AT=129, 
		ELLIPSIS=130, WS=131, COMMENT=132, LINE_COMMENT=133, IDENTIFIER=134;
	public static final int
		RULE_queryInput = 0, RULE_subQuery = 1, RULE_queryLabel = 2, RULE_decl = 3, 
		RULE_classLikeDecl = 4, RULE_modifiers = 5, RULE_classLikeKeyWord = 6, 
		RULE_varDecl = 7, RULE_methodDecl = 8, RULE_importDeclaration = 9, RULE_modifier = 10, 
		RULE_classOrInterfaceModifier = 11, RULE_variableModifier = 12, RULE_classDeclaration = 13, 
		RULE_typeParameters = 14, RULE_typeParameter = 15, RULE_typeBound = 16, 
		RULE_enumDeclaration = 17, RULE_enumConstants = 18, RULE_enumConstant = 19, 
		RULE_enumBodyDeclarations = 20, RULE_interfaceDeclaration = 21, RULE_classBody = 22, 
		RULE_interfaceBody = 23, RULE_classBodyDeclaration = 24, RULE_memberDeclaration = 25, 
		RULE_methodDeclaration = 26, RULE_methodBody = 27, RULE_typeTypeOrVoid = 28, 
		RULE_genericMethodDeclaration = 29, RULE_genericConstructorDeclaration = 30, 
		RULE_constructorDeclaration = 31, RULE_fieldDeclaration = 32, RULE_interfaceBodyDeclaration = 33, 
		RULE_interfaceMemberDeclaration = 34, RULE_constDeclaration = 35, RULE_constantDeclarator = 36, 
		RULE_interfaceMethodDeclaration = 37, RULE_interfaceMethodModifier = 38, 
		RULE_genericInterfaceMethodDeclaration = 39, RULE_interfaceCommonBodyDeclaration = 40, 
		RULE_variableDeclarators = 41, RULE_variableDeclarator = 42, RULE_variableDeclaratorId = 43, 
		RULE_variableInitializer = 44, RULE_arrayInitializer = 45, RULE_classOrInterfaceType = 46, 
		RULE_typeArgument = 47, RULE_qualifiedNameList = 48, RULE_formalParameters = 49, 
		RULE_receiverParameter = 50, RULE_formalParameterList = 51, RULE_formalParameter = 52, 
		RULE_lastFormalParameter = 53, RULE_lambdaLVTIList = 54, RULE_lambdaLVTIParameter = 55, 
		RULE_qualifiedName = 56, RULE_literal = 57, RULE_integerLiteral = 58, 
		RULE_floatLiteral = 59, RULE_altAnnotationQualifiedName = 60, RULE_annotation = 61, 
		RULE_elementValuePairs = 62, RULE_elementValuePair = 63, RULE_elementValue = 64, 
		RULE_elementValueArrayInitializer = 65, RULE_annotationTypeDeclaration = 66, 
		RULE_annotationTypeBody = 67, RULE_annotationTypeElementDeclaration = 68, 
		RULE_annotationTypeElementRest = 69, RULE_annotationMethodOrConstantRest = 70, 
		RULE_annotationMethodRest = 71, RULE_annotationConstantRest = 72, RULE_defaultValue = 73, 
		RULE_moduleDeclaration = 74, RULE_moduleBody = 75, RULE_moduleDirective = 76, 
		RULE_requiresModifier = 77, RULE_recordDeclaration = 78, RULE_recordHeader = 79, 
		RULE_recordComponentList = 80, RULE_recordComponent = 81, RULE_recordBody = 82, 
		RULE_block = 83, RULE_blockConstraint = 84, RULE_blockStatement = 85, 
		RULE_localVariableDeclaration = 86, RULE_identifier = 87, RULE_localTypeDeclaration = 88, 
		RULE_statement = 89, RULE_assertStmt = 90, RULE_ifStmt = 91, RULE_forStmt = 92, 
		RULE_whileStmt = 93, RULE_doWhileStmt = 94, RULE_tryStmt = 95, RULE_tryWithRescource = 96, 
		RULE_switchStmt = 97, RULE_synchronizedStmt = 98, RULE_returnStmt = 99, 
		RULE_throwStmt = 100, RULE_breakStmt = 101, RULE_continueStmt = 102, RULE_yieldStmt = 103, 
		RULE_emptyStmt = 104, RULE_switchExpStmt = 105, RULE_labelStmt = 106, 
		RULE_caseStmt = 107, RULE_catchClause = 108, RULE_catchType = 109, RULE_finallyBlock = 110, 
		RULE_resourceSpecification = 111, RULE_resources = 112, RULE_resource = 113, 
		RULE_switchBlockStatementGroup = 114, RULE_switchLabel = 115, RULE_forControl = 116, 
		RULE_forInit = 117, RULE_enhancedForControl = 118, RULE_parExpression = 119, 
		RULE_expressionList = 120, RULE_methodCall = 121, RULE_expression = 122, 
		RULE_pattern = 123, RULE_lambdaExpression = 124, RULE_lambdaParameters = 125, 
		RULE_lambdaBody = 126, RULE_primary = 127, RULE_switchExpression = 128, 
		RULE_switchLabeledRule = 129, RULE_guardedPattern = 130, RULE_switchRuleOutcome = 131, 
		RULE_classType = 132, RULE_creator = 133, RULE_createdName = 134, RULE_innerCreator = 135, 
		RULE_arrayCreatorRest = 136, RULE_classCreatorRest = 137, RULE_explicitGenericInvocation = 138, 
		RULE_typeArgumentsOrDiamond = 139, RULE_nonWildcardTypeArgumentsOrDiamond = 140, 
		RULE_nonWildcardTypeArguments = 141, RULE_typeList = 142, RULE_typeType = 143, 
		RULE_primitiveType = 144, RULE_typeArguments = 145, RULE_superSuffix = 146, 
		RULE_explicitGenericInvocationSuffix = 147, RULE_arguments = 148;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryInput", "subQuery", "queryLabel", "decl", "classLikeDecl", "modifiers", 
			"classLikeKeyWord", "varDecl", "methodDecl", "importDeclaration", "modifier", 
			"classOrInterfaceModifier", "variableModifier", "classDeclaration", "typeParameters", 
			"typeParameter", "typeBound", "enumDeclaration", "enumConstants", "enumConstant", 
			"enumBodyDeclarations", "interfaceDeclaration", "classBody", "interfaceBody", 
			"classBodyDeclaration", "memberDeclaration", "methodDeclaration", "methodBody", 
			"typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"interfaceCommonBodyDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "receiverParameter", 
			"formalParameterList", "formalParameter", "lastFormalParameter", "lambdaLVTIList", 
			"lambdaLVTIParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "altAnnotationQualifiedName", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "moduleDeclaration", "moduleBody", "moduleDirective", 
			"requiresModifier", "recordDeclaration", "recordHeader", "recordComponentList", 
			"recordComponent", "recordBody", "block", "blockConstraint", "blockStatement", 
			"localVariableDeclaration", "identifier", "localTypeDeclaration", "statement", 
			"assertStmt", "ifStmt", "forStmt", "whileStmt", "doWhileStmt", "tryStmt", 
			"tryWithRescource", "switchStmt", "synchronizedStmt", "returnStmt", "throwStmt", 
			"breakStmt", "continueStmt", "yieldStmt", "emptyStmt", "switchExpStmt", 
			"labelStmt", "caseStmt", "catchClause", "catchType", "finallyBlock", 
			"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "pattern", "lambdaExpression", 
			"lambdaParameters", "lambdaBody", "primary", "switchExpression", "switchLabeledRule", 
			"guardedPattern", "switchRuleOutcome", "classType", "creator", "createdName", 
			"innerCreator", "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\'", "'$'", "'abstract'", "'assert'", "'boolean'", "'break'", 
			"'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
			"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", 
			"'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
			"'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", 
			"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
			"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
			"'while'", "'module'", "'open'", "'requires'", "'exports'", "'opens'", 
			"'to'", "'uses'", "'provides'", "'with'", "'transitive'", "'var'", "'yield'", 
			"'record'", "'sealed'", "'permits'", "'non-sealed'", "'struct'", "'<<null>>'", 
			"'<<empty>>'", "'<<>>'", null, null, null, null, null, null, null, null, 
			null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
			"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
			"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", 
			"'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
			"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
			"THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "MODULE", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE", "VAR", "YIELD", "RECORD", "SEALED", "PERMITS", "NON_SEALED", 
			"STRUCT", "NULL_BLOCK", "EMPTY_BLOCK", "WILDCARD", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "TEXT_BLOCK", "NULL_LITERAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
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
		public QueryLabelContext queryLabel() {
			return getRuleContext(QueryLabelContext.class,0);
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
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case ASSERT:
			case BOOLEAN:
			case BREAK:
			case BYTE:
			case CASE:
			case CHAR:
			case CLASS:
			case CONTINUE:
			case DO:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case FOR:
			case IF:
			case IMPORT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case NEW:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case RETURN:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SUPER:
			case SWITCH:
			case SYNCHRONIZED:
			case THIS:
			case THROW:
			case TRANSIENT:
			case TRY:
			case VOID:
			case VOLATILE:
			case WHILE:
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
			case STRUCT:
			case WILDCARD:
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
			case LBRACE:
			case SEMI:
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
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(304);
					((SubQueryContext)_localctx).notOp = match(T__0);
					}
				}

				setState(307);
				queryInput();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				queryLabel();
				setState(309);
				queryInput();
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

	public static class QueryLabelContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JavaQueryParser.LBRACK, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JavaQueryParser.RBRACK, 0); }
		public QueryLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterQueryLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitQueryLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitQueryLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryLabelContext queryLabel() throws RecognitionException {
		QueryLabelContext _localctx = new QueryLabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_queryLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(LBRACK);
			setState(314);
			integerLiteral();
			setState(315);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				classLikeDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				methodDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
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
		enterRule(_localctx, 8, RULE_classLikeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			modifiers();
			setState(323);
			classLikeKeyWord();
			setState(324);
			identifier();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(325);
				typeParameters();
				}
			}

			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(328);
				match(EXTENDS);
				setState(329);
				typeList();
				}
			}

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(332);
				match(IMPLEMENTS);
				setState(333);
				typeList();
				}
			}

			setState(336);
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
		enterRule(_localctx, 10, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					modifier();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode STRUCT() { return getToken(JavaQueryParser.STRUCT, 0); }
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
		enterRule(_localctx, 12, RULE_classLikeKeyWord);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(CLASS);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(INTERFACE);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(ENUM);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(STRUCT);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				match(AT);
				setState(349);
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
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			modifiers();
			setState(353);
			typeTypeOrVoid();
			setState(354);
			identifier();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(355);
				match(ASSIGN);
				setState(356);
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
		enterRule(_localctx, 16, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			modifiers();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(360);
				typeParameters();
				}
			}

			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(363);
				typeTypeOrVoid();
				}
				break;
			}
			setState(366);
			identifier();
			setState(367);
			match(LPAREN);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FINAL - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (SHORT - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(368);
				formalParameterList();
				}
			}

			setState(371);
			match(RPAREN);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(372);
				match(THROWS);
				setState(373);
				qualifiedNameList();
				}
			}

			setState(376);
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
		enterRule(_localctx, 18, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(IMPORT);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(379);
				match(STATIC);
				}
			}

			setState(382);
			qualifiedName();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(383);
				match(DOT);
				setState(384);
				match(MUL);
				}
			}

			setState(387);
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
		enterRule(_localctx, 20, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		enterRule(_localctx, 22, RULE_classOrInterfaceModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
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
		enterRule(_localctx, 24, RULE_variableModifier);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
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
			case WILDCARD:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
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
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(CLASS);
			setState(398);
			identifier();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(399);
				typeParameters();
				}
			}

			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(402);
				match(EXTENDS);
				setState(403);
				typeType();
				}
			}

			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(406);
				match(IMPLEMENTS);
				setState(407);
				typeList();
				}
			}

			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(410);
				match(PERMITS);
				setState(411);
				typeList();
				}
			}

			setState(414);
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
		enterRule(_localctx, 28, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(LT);
			setState(417);
			typeParameter();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418);
				match(COMMA);
				setState(419);
				typeParameter();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
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
		enterRule(_localctx, 30, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(427);
					annotation();
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(433);
			identifier();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(434);
				match(EXTENDS);
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						annotation();
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(441);
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
		enterRule(_localctx, 32, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			typeType();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(445);
				match(BITAND);
				setState(446);
				typeType();
				}
				}
				setState(451);
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
		enterRule(_localctx, 34, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(ENUM);
			setState(453);
			identifier();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(454);
				match(IMPLEMENTS);
				setState(455);
				typeList();
				}
			}

			setState(458);
			match(LBRACE);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(459);
				enumConstants();
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(462);
				match(COMMA);
				}
			}

			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(465);
				enumBodyDeclarations();
				}
			}

			setState(468);
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
		enterRule(_localctx, 36, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			enumConstant();
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(471);
					match(COMMA);
					setState(472);
					enumConstant();
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 38, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					annotation();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(484);
			identifier();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(485);
				arguments();
				}
			}

			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(488);
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
		enterRule(_localctx, 40, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(SEMI);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << MODULE) | (1L << OPEN) | (1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << TO) | (1L << USES) | (1L << PROVIDES) | (1L << WITH) | (1L << TRANSITIVE) | (1L << VAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (YIELD - 64)) | (1L << (RECORD - 64)) | (1L << (SEALED - 64)) | (1L << (PERMITS - 64)) | (1L << (NON_SEALED - 64)) | (1L << (WILDCARD - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(492);
				classBodyDeclaration();
				}
				}
				setState(497);
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
		enterRule(_localctx, 42, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(INTERFACE);
			setState(499);
			identifier();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(500);
				typeParameters();
				}
			}

			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(503);
				match(EXTENDS);
				setState(504);
				typeList();
				}
			}

			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(507);
				match(PERMITS);
				setState(508);
				typeList();
				}
			}

			setState(511);
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
		enterRule(_localctx, 44, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(LBRACE);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << MODULE) | (1L << OPEN) | (1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << TO) | (1L << USES) | (1L << PROVIDES) | (1L << WITH) | (1L << TRANSITIVE) | (1L << VAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (YIELD - 64)) | (1L << (RECORD - 64)) | (1L << (SEALED - 64)) | (1L << (PERMITS - 64)) | (1L << (NON_SEALED - 64)) | (1L << (WILDCARD - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(514);
				classBodyDeclaration();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
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
		enterRule(_localctx, 46, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LBRACE);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << MODULE) | (1L << OPEN) | (1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << TO) | (1L << USES) | (1L << PROVIDES) | (1L << WITH) | (1L << TRANSITIVE) | (1L << VAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (YIELD - 64)) | (1L << (RECORD - 64)) | (1L << (SEALED - 64)) | (1L << (PERMITS - 64)) | (1L << (NON_SEALED - 64)) | (1L << (WILDCARD - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(523);
				interfaceBodyDeclaration();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
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
		enterRule(_localctx, 48, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(532);
					match(STATIC);
					}
				}

				setState(535);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(536);
						modifier();
						}
						} 
					}
					setState(541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(542);
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
		enterRule(_localctx, 50, RULE_memberDeclaration);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(551);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(552);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(553);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(554);
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
		enterRule(_localctx, 52, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			typeTypeOrVoid();
			setState(558);
			identifier();
			setState(559);
			formalParameters();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(560);
				match(LBRACK);
				setState(561);
				match(RBRACK);
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(567);
				match(THROWS);
				setState(568);
				qualifiedNameList();
				}
			}

			setState(571);
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
		enterRule(_localctx, 54, RULE_methodBody);
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
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
		enterRule(_localctx, 56, RULE_typeTypeOrVoid);
		try {
			setState(579);
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
			case WILDCARD:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
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
		enterRule(_localctx, 58, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			typeParameters();
			setState(582);
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
		enterRule(_localctx, 60, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			typeParameters();
			setState(585);
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
		enterRule(_localctx, 62, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			identifier();
			setState(588);
			formalParameters();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(589);
				match(THROWS);
				setState(590);
				qualifiedNameList();
				}
			}

			setState(593);
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
		enterRule(_localctx, 64, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			typeType();
			setState(596);
			variableDeclarators();
			setState(597);
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
		enterRule(_localctx, 66, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(607);
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
			case WILDCARD:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(599);
						modifier();
						}
						} 
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(605);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
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
		enterRule(_localctx, 68, RULE_interfaceMemberDeclaration);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(613);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(614);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(615);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(616);
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
		enterRule(_localctx, 70, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			typeType();
			setState(620);
			constantDeclarator();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(621);
				match(COMMA);
				setState(622);
				constantDeclarator();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628);
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
		enterRule(_localctx, 72, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			identifier();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(631);
				match(LBRACK);
				setState(632);
				match(RBRACK);
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
			match(ASSIGN);
			setState(639);
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
		enterRule(_localctx, 74, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(641);
					interfaceMethodModifier();
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(647);
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
		enterRule(_localctx, 76, RULE_interfaceMethodModifier);
		try {
			setState(655);
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
			case WILDCARD:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(652);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(653);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(654);
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
		enterRule(_localctx, 78, RULE_genericInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << MODULE) | (1L << OPEN) | (1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << TO) | (1L << USES) | (1L << PROVIDES) | (1L << WITH) | (1L << TRANSITIVE) | (1L << VAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (YIELD - 64)) | (1L << (RECORD - 64)) | (1L << (SEALED - 64)) | (1L << (PERMITS - 64)) | (1L << (WILDCARD - 64)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(657);
				interfaceMethodModifier();
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			typeParameters();
			setState(664);
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
		enterRule(_localctx, 80, RULE_interfaceCommonBodyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(666);
					annotation();
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(672);
			typeTypeOrVoid();
			setState(673);
			identifier();
			setState(674);
			formalParameters();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(675);
				match(LBRACK);
				setState(676);
				match(RBRACK);
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(682);
				match(THROWS);
				setState(683);
				qualifiedNameList();
				}
			}

			setState(686);
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
		enterRule(_localctx, 82, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			variableDeclarator();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(689);
				match(COMMA);
				setState(690);
				variableDeclarator();
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
		enterRule(_localctx, 84, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			variableDeclaratorId();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(697);
				match(ASSIGN);
				setState(698);
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
		enterRule(_localctx, 86, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			identifier();
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(702);
				match(LBRACK);
				setState(703);
				match(RBRACK);
				}
				}
				setState(708);
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
		enterRule(_localctx, 88, RULE_variableInitializer);
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
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
			case WILDCARD:
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
				setState(710);
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
		enterRule(_localctx, 90, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(LBRACE);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LBRACE - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(714);
				variableInitializer();
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(715);
						match(COMMA);
						setState(716);
						variableInitializer();
						}
						} 
					}
					setState(721);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(722);
					match(COMMA);
					}
				}

				}
			}

			setState(727);
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
		enterRule(_localctx, 92, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			identifier();
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(730);
				typeArguments();
				}
				break;
			}
			setState(740);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(733);
					match(DOT);
					setState(734);
					identifier();
					setState(736);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(735);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(742);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 94, RULE_typeArgument);
		int _la;
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(744);
					annotation();
					}
					}
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(750);
				match(QUESTION);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(751);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(752);
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
		enterRule(_localctx, 96, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			qualifiedName();
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(758);
				match(COMMA);
				setState(759);
				qualifiedName();
				}
				}
				setState(764);
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
		enterRule(_localctx, 98, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(LPAREN);
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (SHORT - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(766);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(769);
				receiverParameter();
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(770);
					match(COMMA);
					setState(771);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FINAL - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (SHORT - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(774);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(779);
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
		enterRule(_localctx, 100, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			typeType();
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(782);
				identifier();
				setState(783);
				match(DOT);
				}
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(790);
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
		enterRule(_localctx, 102, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				formalParameter();
				setState(797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(793);
						match(COMMA);
						setState(794);
						formalParameter();
						}
						} 
					}
					setState(799);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(800);
					match(COMMA);
					setState(801);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
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
		enterRule(_localctx, 104, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(807);
					variableModifier();
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(813);
			typeType();
			setState(814);
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
		enterRule(_localctx, 106, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(816);
					variableModifier();
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(822);
			typeType();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(823);
				annotation();
				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829);
			match(ELLIPSIS);
			setState(830);
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
		enterRule(_localctx, 108, RULE_lambdaLVTIList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			lambdaLVTIParameter();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(833);
				match(COMMA);
				setState(834);
				lambdaLVTIParameter();
				}
				}
				setState(839);
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
		enterRule(_localctx, 110, RULE_lambdaLVTIParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(840);
					variableModifier();
					}
					} 
				}
				setState(845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(846);
			match(VAR);
			setState(847);
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
		enterRule(_localctx, 112, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			identifier();
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(850);
					match(DOT);
					setState(851);
					identifier();
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		enterRule(_localctx, 114, RULE_literal);
		try {
			setState(864);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(860);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(861);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(862);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(863);
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
		enterRule(_localctx, 116, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (DECIMAL_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (OCT_LITERAL - 73)) | (1L << (BINARY_LITERAL - 73)))) != 0)) ) {
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
		enterRule(_localctx, 118, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
		enterRule(_localctx, 120, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(870);
				identifier();
				setState(871);
				match(DOT);
				}
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(878);
			match(AT);
			setState(879);
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
		enterRule(_localctx, 122, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(881);
				match(AT);
				setState(882);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(883);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(886);
				match(LPAREN);
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(887);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(888);
					elementValue();
					}
					break;
				}
				setState(891);
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
		enterRule(_localctx, 124, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			elementValuePair();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(895);
				match(COMMA);
				setState(896);
				elementValuePair();
				}
				}
				setState(901);
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
		enterRule(_localctx, 126, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			identifier();
			setState(903);
			match(ASSIGN);
			setState(904);
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
		enterRule(_localctx, 128, RULE_elementValue);
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
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
		enterRule(_localctx, 130, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(LBRACE);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LBRACE - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(912);
				elementValue();
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(913);
						match(COMMA);
						setState(914);
						elementValue();
						}
						} 
					}
					setState(919);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
			}

			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(922);
				match(COMMA);
				}
			}

			setState(925);
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
		enterRule(_localctx, 132, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(AT);
			setState(928);
			match(INTERFACE);
			setState(929);
			identifier();
			setState(930);
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
		enterRule(_localctx, 134, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(LBRACE);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << MODULE) | (1L << OPEN) | (1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << TO) | (1L << USES) | (1L << PROVIDES) | (1L << WITH) | (1L << TRANSITIVE) | (1L << VAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (YIELD - 64)) | (1L << (RECORD - 64)) | (1L << (SEALED - 64)) | (1L << (PERMITS - 64)) | (1L << (NON_SEALED - 64)) | (1L << (WILDCARD - 64)) | (1L << (SEMI - 64)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(933);
				annotationTypeElementDeclaration();
				}
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(939);
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
		enterRule(_localctx, 136, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(949);
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
			case WILDCARD:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(941);
						modifier();
						}
						} 
					}
					setState(946);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(947);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
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
		enterRule(_localctx, 138, RULE_annotationTypeElementRest);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				typeType();
				setState(952);
				annotationMethodOrConstantRest();
				setState(953);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				classDeclaration();
				setState(957);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(956);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				interfaceDeclaration();
				setState(961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(960);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(963);
				enumDeclaration();
				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(964);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(967);
				annotationTypeDeclaration();
				setState(969);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(968);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(971);
				recordDeclaration();
				setState(973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(972);
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
		enterRule(_localctx, 140, RULE_annotationMethodOrConstantRest);
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
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
		enterRule(_localctx, 142, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			identifier();
			setState(982);
			match(LPAREN);
			setState(983);
			match(RPAREN);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(984);
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
		enterRule(_localctx, 144, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
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
		enterRule(_localctx, 146, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(DEFAULT);
			setState(990);
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
		enterRule(_localctx, 148, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(992);
				match(OPEN);
				}
			}

			setState(995);
			match(MODULE);
			setState(996);
			qualifiedName();
			setState(997);
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
		enterRule(_localctx, 150, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(LBRACE);
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << USES) | (1L << PROVIDES))) != 0)) {
				{
				{
				setState(1000);
				moduleDirective();
				}
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1006);
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
		enterRule(_localctx, 152, RULE_moduleDirective);
		int _la;
		try {
			int _alt;
			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				match(REQUIRES);
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1009);
						requiresModifier();
						}
						} 
					}
					setState(1014);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				setState(1015);
				qualifiedName();
				setState(1016);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				match(EXPORTS);
				setState(1019);
				qualifiedName();
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1020);
					match(TO);
					setState(1021);
					qualifiedName();
					}
				}

				setState(1024);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				match(OPENS);
				setState(1027);
				qualifiedName();
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1028);
					match(TO);
					setState(1029);
					qualifiedName();
					}
				}

				setState(1032);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1034);
				match(USES);
				setState(1035);
				qualifiedName();
				setState(1036);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1038);
				match(PROVIDES);
				setState(1039);
				qualifiedName();
				setState(1040);
				match(WITH);
				setState(1041);
				qualifiedName();
				setState(1042);
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
		enterRule(_localctx, 154, RULE_requiresModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		enterRule(_localctx, 156, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(RECORD);
			setState(1049);
			identifier();
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1050);
				typeParameters();
				}
			}

			setState(1053);
			recordHeader();
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1054);
				match(IMPLEMENTS);
				setState(1055);
				typeList();
				}
			}

			setState(1058);
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
		enterRule(_localctx, 158, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(LPAREN);
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (SHORT - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1061);
				recordComponentList();
				}
			}

			setState(1064);
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
		enterRule(_localctx, 160, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			recordComponent();
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1067);
				match(COMMA);
				setState(1068);
				recordComponent();
				}
				}
				setState(1073);
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
		enterRule(_localctx, 162, RULE_recordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			typeType();
			setState(1075);
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
		enterRule(_localctx, 164, RULE_recordBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(LBRACE);
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << MODULE) | (1L << OPEN) | (1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << TO) | (1L << USES) | (1L << PROVIDES) | (1L << WITH) | (1L << TRANSITIVE) | (1L << VAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (YIELD - 64)) | (1L << (RECORD - 64)) | (1L << (SEALED - 64)) | (1L << (PERMITS - 64)) | (1L << (NON_SEALED - 64)) | (1L << (WILDCARD - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(1078);
				classBodyDeclaration();
				}
				}
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1084);
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
		public BlockConstraintContext blockConstraint() {
			return getRuleContext(BlockConstraintContext.class,0);
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
		enterRule(_localctx, 166, RULE_block);
		int _la;
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				match(LBRACE);
				setState(1096);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE:
					{
					}
					break;
				case T__0:
				case ABSTRACT:
				case ASSERT:
				case BOOLEAN:
				case BREAK:
				case BYTE:
				case CASE:
				case CHAR:
				case CLASS:
				case CONTINUE:
				case DO:
				case DOUBLE:
				case ENUM:
				case FINAL:
				case FLOAT:
				case FOR:
				case IF:
				case IMPORT:
				case INT:
				case INTERFACE:
				case LONG:
				case NATIVE:
				case NEW:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case RETURN:
				case SHORT:
				case STATIC:
				case STRICTFP:
				case SUPER:
				case SWITCH:
				case SYNCHRONIZED:
				case THIS:
				case THROW:
				case TRANSIENT:
				case TRY:
				case VOID:
				case VOLATILE:
				case WHILE:
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
				case STRUCT:
				case WILDCARD:
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
				case LBRACE:
				case LBRACK:
				case SEMI:
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
					setState(1088);
					subQuery();
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1089);
						match(T__1);
						setState(1090);
						subQuery();
						}
						}
						setState(1095);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1098);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				match(LBRACE);
				setState(1100);
				blockConstraint();
				setState(1101);
				match(RBRACE);
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

	public static class BlockConstraintContext extends ParserRuleContext {
		public TerminalNode NULL_BLOCK() { return getToken(JavaQueryParser.NULL_BLOCK, 0); }
		public TerminalNode EMPTY_BLOCK() { return getToken(JavaQueryParser.EMPTY_BLOCK, 0); }
		public BlockConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).enterBlockConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaQueryListener ) ((JavaQueryListener)listener).exitBlockConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaQueryVisitor ) return ((JavaQueryVisitor<? extends T>)visitor).visitBlockConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockConstraintContext blockConstraint() throws RecognitionException {
		BlockConstraintContext _localctx = new BlockConstraintContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_blockConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_la = _input.LA(1);
			if ( !(_la==NULL_BLOCK || _la==EMPTY_BLOCK) ) {
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
		enterRule(_localctx, 170, RULE_blockStatement);
		try {
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				localVariableDeclaration();
				setState(1108);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
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
		enterRule(_localctx, 172, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1114);
					variableModifier();
					}
					} 
				}
				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1120);
				typeType();
				setState(1121);
				variableDeclarators();
				}
				break;
			case 2:
				{
				setState(1123);
				match(VAR);
				setState(1124);
				identifier();
				setState(1125);
				match(ASSIGN);
				setState(1126);
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
		public TerminalNode WILDCARD() { return getToken(JavaQueryParser.WILDCARD, 0); }
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
		enterRule(_localctx, 174, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==IDENTIFIER) ) {
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
		enterRule(_localctx, 176, RULE_localTypeDeclaration);
		try {
			int _alt;
			setState(1144);
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
			case WILDCARD:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1132);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(1141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1138);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1139);
					interfaceDeclaration();
					}
					break;
				case RECORD:
					{
					setState(1140);
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
				setState(1143);
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
		enterRule(_localctx, 178, RULE_statement);
		try {
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				assertStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1148);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1149);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1150);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1151);
				doWhileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1152);
				tryStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1153);
				tryWithRescource();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1154);
				switchStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1155);
				synchronizedStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1156);
				returnStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1157);
				throwStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1158);
				breakStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1159);
				continueStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1160);
				yieldStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1161);
				emptyStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1162);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1163);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1165);
				switchExpStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1166);
				labelStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1167);
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
		enterRule(_localctx, 180, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(ASSERT);
			setState(1171);
			expression(0);
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1172);
				match(COLON);
				setState(1173);
				expression(0);
				}
			}

			setState(1176);
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
		enterRule(_localctx, 182, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			match(IF);
			setState(1179);
			parExpression();
			setState(1180);
			block();
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1181);
				match(ELSE);
				setState(1182);
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
		enterRule(_localctx, 184, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			match(FOR);
			setState(1186);
			match(LPAREN);
			setState(1187);
			forControl();
			setState(1188);
			match(RPAREN);
			setState(1189);
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
		enterRule(_localctx, 186, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(WHILE);
			setState(1192);
			parExpression();
			setState(1193);
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
		enterRule(_localctx, 188, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(DO);
			setState(1196);
			block();
			setState(1197);
			match(WHILE);
			setState(1198);
			parExpression();
			setState(1199);
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
		enterRule(_localctx, 190, RULE_tryStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(TRY);
			setState(1202);
			block();
			setState(1212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATCH:
				{
				setState(1204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1203);
					catchClause();
					}
					}
					setState(1206); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1208);
					finallyBlock();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(1211);
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
		enterRule(_localctx, 192, RULE_tryWithRescource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(TRY);
			setState(1215);
			resourceSpecification();
			setState(1216);
			block();
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1217);
				catchClause();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1223);
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
		enterRule(_localctx, 194, RULE_switchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(SWITCH);
			setState(1227);
			parExpression();
			setState(1228);
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
		enterRule(_localctx, 196, RULE_synchronizedStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(SYNCHRONIZED);
			setState(1231);
			parExpression();
			setState(1232);
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
		enterRule(_localctx, 198, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(RETURN);
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1235);
				expression(0);
				}
			}

			setState(1238);
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
		enterRule(_localctx, 200, RULE_throwStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(THROW);
			setState(1241);
			expression(0);
			setState(1242);
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
		enterRule(_localctx, 202, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(BREAK);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1245);
				identifier();
				}
			}

			setState(1248);
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
		enterRule(_localctx, 204, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(CONTINUE);
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1251);
				identifier();
				}
			}

			setState(1254);
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
		enterRule(_localctx, 206, RULE_yieldStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(YIELD);
			setState(1257);
			expression(0);
			setState(1258);
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
		enterRule(_localctx, 208, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
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
		enterRule(_localctx, 210, RULE_switchExpStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			switchExpression();
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1263);
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
		enterRule(_localctx, 212, RULE_labelStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			((LabelStmtContext)_localctx).identifierLabel = identifier();
			setState(1267);
			match(COLON);
			setState(1268);
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
		enterRule(_localctx, 214, RULE_caseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(CASE);
			setState(1271);
			expression(0);
			setState(1272);
			match(COLON);
			setState(1273);
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
		enterRule(_localctx, 216, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(CATCH);
			setState(1276);
			match(LPAREN);
			setState(1280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1277);
					variableModifier();
					}
					} 
				}
				setState(1282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1283);
			catchType();
			setState(1284);
			identifier();
			setState(1285);
			match(RPAREN);
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
		enterRule(_localctx, 218, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			qualifiedName();
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1289);
				match(BITOR);
				setState(1290);
				qualifiedName();
				}
				}
				setState(1295);
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
		enterRule(_localctx, 220, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(FINALLY);
			setState(1297);
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
		enterRule(_localctx, 222, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(LPAREN);
			setState(1300);
			resources();
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1301);
				match(SEMI);
				}
			}

			setState(1304);
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
		enterRule(_localctx, 224, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			resource();
			setState(1311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1307);
					match(SEMI);
					setState(1308);
					resource();
					}
					} 
				}
				setState(1313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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
		enterRule(_localctx, 226, RULE_resource);
		try {
			int _alt;
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1314);
						variableModifier();
						}
						} 
					}
					setState(1319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1320);
					classOrInterfaceType();
					setState(1321);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1323);
					match(VAR);
					setState(1324);
					identifier();
					}
					break;
				}
				setState(1327);
				match(ASSIGN);
				setState(1328);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
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
		enterRule(_localctx, 228, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1334); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1333);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1336); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1338);
				blockStatement();
				}
				}
				setState(1341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (ASSERT - 4)) | (1L << (BOOLEAN - 4)) | (1L << (BREAK - 4)) | (1L << (BYTE - 4)) | (1L << (CASE - 4)) | (1L << (CHAR - 4)) | (1L << (CLASS - 4)) | (1L << (CONTINUE - 4)) | (1L << (DO - 4)) | (1L << (DOUBLE - 4)) | (1L << (FINAL - 4)) | (1L << (FLOAT - 4)) | (1L << (FOR - 4)) | (1L << (IF - 4)) | (1L << (INT - 4)) | (1L << (INTERFACE - 4)) | (1L << (LONG - 4)) | (1L << (NEW - 4)) | (1L << (RETURN - 4)) | (1L << (SHORT - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (SYNCHRONIZED - 4)) | (1L << (THIS - 4)) | (1L << (THROW - 4)) | (1L << (TRY - 4)) | (1L << (VOID - 4)) | (1L << (WHILE - 4)) | (1L << (MODULE - 4)) | (1L << (OPEN - 4)) | (1L << (REQUIRES - 4)) | (1L << (EXPORTS - 4)) | (1L << (OPENS - 4)) | (1L << (TO - 4)) | (1L << (USES - 4)) | (1L << (PROVIDES - 4)) | (1L << (WITH - 4)) | (1L << (TRANSITIVE - 4)) | (1L << (VAR - 4)) | (1L << (YIELD - 4)) | (1L << (RECORD - 4)) | (1L << (SEALED - 4)) | (1L << (PERMITS - 4)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 230, RULE_switchLabel);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				match(CASE);
				setState(1349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1344);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1345);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1346);
					typeType();
					setState(1347);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1351);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				match(DEFAULT);
				setState(1353);
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
		enterRule(_localctx, 232, RULE_forControl);
		int _la;
		try {
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FINAL - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1357);
					forInit();
					}
				}

				setState(1360);
				match(SEMI);
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1361);
					expression(0);
					}
				}

				setState(1364);
				match(SEMI);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1365);
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
		enterRule(_localctx, 234, RULE_forInit);
		try {
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
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
		enterRule(_localctx, 236, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1374);
					variableModifier();
					}
					} 
				}
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1380);
				typeType();
				}
				break;
			case 2:
				{
				setState(1381);
				match(VAR);
				}
				break;
			}
			setState(1384);
			variableDeclaratorId();
			setState(1385);
			match(COLON);
			setState(1386);
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
		enterRule(_localctx, 238, RULE_parExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(LPAREN);
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1389);
				expression(0);
				}
			}

			setState(1392);
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
		enterRule(_localctx, 240, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			expression(0);
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1395);
				match(COMMA);
				setState(1396);
				expression(0);
				}
				}
				setState(1401);
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
		enterRule(_localctx, 242, RULE_methodCall);
		int _la;
		try {
			setState(1421);
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
			case WILDCARD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				identifier();
				setState(1403);
				match(LPAREN);
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1404);
					expressionList();
					}
				}

				setState(1407);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1409);
				match(THIS);
				setState(1410);
				match(LPAREN);
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1411);
					expressionList();
					}
				}

				setState(1414);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1415);
				match(SUPER);
				setState(1416);
				match(LPAREN);
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1417);
					expressionList();
					}
				}

				setState(1420);
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
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1424);
				primary();
				}
				break;
			case 2:
				{
				setState(1425);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1426);
				match(NEW);
				setState(1427);
				creator();
				}
				break;
			case 4:
				{
				setState(1428);
				match(LPAREN);
				setState(1432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1429);
						annotation();
						}
						} 
					}
					setState(1434);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1435);
				typeType();
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1436);
					match(BITAND);
					setState(1437);
					typeType();
					}
					}
					setState(1442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1443);
				match(RPAREN);
				setState(1444);
				expression(22);
				}
				break;
			case 5:
				{
				setState(1446);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (INC - 106)) | (1L << (DEC - 106)) | (1L << (ADD - 106)) | (1L << (SUB - 106)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1447);
				expression(20);
				}
				break;
			case 6:
				{
				setState(1448);
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
				setState(1449);
				expression(19);
				}
				break;
			case 7:
				{
				setState(1450);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1451);
				switchExpression();
				}
				break;
			case 9:
				{
				setState(1452);
				typeType();
				setState(1453);
				match(COLONCOLON);
				setState(1459);
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
				case WILDCARD:
				case LT:
				case IDENTIFIER:
					{
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1454);
						typeArguments();
						}
					}

					setState(1457);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1458);
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
				setState(1461);
				classType();
				setState(1462);
				match(COLONCOLON);
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1463);
					typeArguments();
					}
				}

				setState(1466);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1551);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1470);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1471);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (MUL - 110)) | (1L << (DIV - 110)) | (1L << (MOD - 110)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1472);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1473);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1474);
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
						setState(1475);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1476);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1484);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
						case 1:
							{
							setState(1477);
							match(LT);
							setState(1478);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1479);
							match(GT);
							setState(1480);
							match(GT);
							setState(1481);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1482);
							match(GT);
							setState(1483);
							match(GT);
							}
							break;
						}
						setState(1486);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1487);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1488);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (GT - 94)) | (1L << (LT - 94)) | (1L << (LE - 94)) | (1L << (GE - 94)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1489);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1490);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1491);
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
						setState(1492);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1493);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1494);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1495);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1496);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1497);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1498);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1499);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1500);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1501);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1502);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1503);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1504);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1505);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1506);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1507);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1508);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1509);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1510);
						expression(0);
						setState(1511);
						match(COLON);
						setState(1512);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1514);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1515);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (ASSIGN - 93)) | (1L << (ADD_ASSIGN - 93)) | (1L << (SUB_ASSIGN - 93)) | (1L << (MUL_ASSIGN - 93)) | (1L << (DIV_ASSIGN - 93)) | (1L << (AND_ASSIGN - 93)) | (1L << (OR_ASSIGN - 93)) | (1L << (XOR_ASSIGN - 93)) | (1L << (MOD_ASSIGN - 93)) | (1L << (LSHIFT_ASSIGN - 93)) | (1L << (RSHIFT_ASSIGN - 93)) | (1L << (URSHIFT_ASSIGN - 93)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1516);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1517);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1518);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1530);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(1519);
							identifier();
							}
							break;
						case 2:
							{
							setState(1520);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1521);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1522);
							match(NEW);
							setState(1524);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1523);
								nonWildcardTypeArguments();
								}
							}

							setState(1526);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1527);
							match(SUPER);
							setState(1528);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1529);
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
						setState(1532);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1533);
						match(LBRACK);
						setState(1534);
						expression(0);
						setState(1535);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1537);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1538);
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
						setState(1539);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1540);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1543);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(1541);
							typeType();
							}
							break;
						case 2:
							{
							setState(1542);
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
						setState(1545);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1546);
						match(COLONCOLON);
						setState(1548);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1547);
							typeArguments();
							}
						}

						setState(1550);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
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
		enterRule(_localctx, 246, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1556);
					variableModifier();
					}
					} 
				}
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			setState(1562);
			typeType();
			setState(1566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1563);
					annotation();
					}
					} 
				}
				setState(1568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			setState(1569);
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
		enterRule(_localctx, 248, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			lambdaParameters();
			setState(1572);
			match(ARROW);
			setState(1573);
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
		enterRule(_localctx, 250, RULE_lambdaParameters);
		int _la;
		try {
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1575);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				match(LPAREN);
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FINAL - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (SHORT - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(1577);
					formalParameterList();
					}
				}

				setState(1580);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1581);
				match(LPAREN);
				setState(1582);
				identifier();
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1583);
					match(COMMA);
					setState(1584);
					identifier();
					}
					}
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1590);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1592);
				match(LPAREN);
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (FINAL - 20)) | (1L << (MODULE - 20)) | (1L << (OPEN - 20)) | (1L << (REQUIRES - 20)) | (1L << (EXPORTS - 20)) | (1L << (OPENS - 20)) | (1L << (TO - 20)) | (1L << (USES - 20)) | (1L << (PROVIDES - 20)) | (1L << (WITH - 20)) | (1L << (TRANSITIVE - 20)) | (1L << (VAR - 20)) | (1L << (YIELD - 20)) | (1L << (RECORD - 20)) | (1L << (SEALED - 20)) | (1L << (PERMITS - 20)) | (1L << (WILDCARD - 20)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1593);
					lambdaLVTIList();
					}
				}

				setState(1596);
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
		enterRule(_localctx, 252, RULE_lambdaBody);
		try {
			setState(1601);
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
			case WILDCARD:
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
				setState(1599);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
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
		enterRule(_localctx, 254, RULE_primary);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				match(LPAREN);
				setState(1604);
				expression(0);
				setState(1605);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1608);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1609);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1610);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1611);
				typeTypeOrVoid();
				setState(1612);
				match(DOT);
				setState(1613);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1615);
				nonWildcardTypeArguments();
				setState(1619);
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
				case WILDCARD:
				case IDENTIFIER:
					{
					setState(1616);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1617);
					match(THIS);
					setState(1618);
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
		enterRule(_localctx, 256, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			match(SWITCH);
			setState(1624);
			parExpression();
			setState(1625);
			match(LBRACE);
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1626);
				switchLabeledRule();
				}
				}
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1632);
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
		enterRule(_localctx, 258, RULE_switchLabeledRule);
		int _la;
		try {
			setState(1645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				match(CASE);
				setState(1638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1635);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1636);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1637);
					guardedPattern(0);
					}
					break;
				}
				setState(1640);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1641);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1642);
				match(DEFAULT);
				setState(1643);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1644);
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
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_guardedPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1648);
				match(LPAREN);
				setState(1649);
				guardedPattern(0);
				setState(1650);
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
			case WILDCARD:
			case AT:
			case IDENTIFIER:
				{
				setState(1655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1652);
						variableModifier();
						}
						} 
					}
					setState(1657);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1658);
				typeType();
				setState(1662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1659);
						annotation();
						}
						} 
					}
					setState(1664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				setState(1665);
				identifier();
				setState(1670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1666);
						match(AND);
						setState(1667);
						expression(0);
						}
						} 
					}
					setState(1672);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1675);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1676);
					match(AND);
					setState(1677);
					expression(0);
					}
					} 
				}
				setState(1682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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
		enterRule(_localctx, 262, RULE_switchRuleOutcome);
		try {
			int _alt;
			setState(1690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1683);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1684);
						blockStatement();
						}
						} 
					}
					setState(1689);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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
		enterRule(_localctx, 264, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1692);
				classOrInterfaceType();
				setState(1693);
				match(DOT);
				}
				break;
			}
			setState(1700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1697);
					annotation();
					}
					} 
				}
				setState(1702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			setState(1703);
			identifier();
			setState(1705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1704);
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
		enterRule(_localctx, 266, RULE_creator);
		try {
			setState(1716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				nonWildcardTypeArguments();
				setState(1708);
				createdName();
				setState(1709);
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
			case WILDCARD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				createdName();
				setState(1714);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1712);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1713);
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
		enterRule(_localctx, 268, RULE_createdName);
		int _la;
		try {
			setState(1733);
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
			case WILDCARD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				identifier();
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1719);
					typeArgumentsOrDiamond();
					}
				}

				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1722);
					match(DOT);
					setState(1723);
					identifier();
					setState(1725);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1724);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1731);
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
				setState(1732);
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
		enterRule(_localctx, 270, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			identifier();
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1736);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1739);
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
		enterRule(_localctx, 272, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			match(LBRACK);
			setState(1769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1742);
				match(RBRACK);
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1743);
					match(LBRACK);
					setState(1744);
					match(RBRACK);
					}
					}
					setState(1749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1750);
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
			case WILDCARD:
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
				setState(1751);
				expression(0);
				setState(1752);
				match(RBRACK);
				setState(1759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1753);
						match(LBRACK);
						setState(1754);
						expression(0);
						setState(1755);
						match(RBRACK);
						}
						} 
					}
					setState(1761);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				}
				setState(1766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1762);
						match(LBRACK);
						setState(1763);
						match(RBRACK);
						}
						} 
					}
					setState(1768);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
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
		enterRule(_localctx, 274, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			arguments();
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1772);
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
		enterRule(_localctx, 276, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			nonWildcardTypeArguments();
			setState(1776);
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
		enterRule(_localctx, 278, RULE_typeArgumentsOrDiamond);
		try {
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1778);
				match(LT);
				setState(1779);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1780);
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
		enterRule(_localctx, 280, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				match(LT);
				setState(1784);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1785);
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
		enterRule(_localctx, 282, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			match(LT);
			setState(1789);
			typeList();
			setState(1790);
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
		enterRule(_localctx, 284, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			typeType();
			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1793);
				match(COMMA);
				setState(1794);
				typeType();
				}
				}
				setState(1799);
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
		enterRule(_localctx, 286, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1800);
					annotation();
					}
					} 
				}
				setState(1805);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			}
			setState(1808);
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
			case WILDCARD:
			case IDENTIFIER:
				{
				setState(1806);
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
				setState(1807);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1813);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (MODULE - 53)) | (1L << (OPEN - 53)) | (1L << (REQUIRES - 53)) | (1L << (EXPORTS - 53)) | (1L << (OPENS - 53)) | (1L << (TO - 53)) | (1L << (USES - 53)) | (1L << (PROVIDES - 53)) | (1L << (WITH - 53)) | (1L << (TRANSITIVE - 53)) | (1L << (VAR - 53)) | (1L << (YIELD - 53)) | (1L << (RECORD - 53)) | (1L << (SEALED - 53)) | (1L << (PERMITS - 53)) | (1L << (WILDCARD - 53)))) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1810);
						annotation();
						}
						}
						setState(1815);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1816);
					match(LBRACK);
					setState(1817);
					match(RBRACK);
					}
					} 
				}
				setState(1822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
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
		enterRule(_localctx, 288, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
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
		enterRule(_localctx, 290, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(LT);
			setState(1826);
			typeArgument();
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1827);
				match(COMMA);
				setState(1828);
				typeArgument();
				}
				}
				setState(1833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1834);
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
		enterRule(_localctx, 292, RULE_superSuffix);
		int _la;
		try {
			setState(1845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1837);
				match(DOT);
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1838);
					typeArguments();
					}
				}

				setState(1841);
				identifier();
				setState(1843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1842);
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
		enterRule(_localctx, 294, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1847);
				match(SUPER);
				setState(1848);
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
			case WILDCARD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				identifier();
				setState(1850);
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
		enterRule(_localctx, 296, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(LPAREN);
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (BOOLEAN - 5)) | (1L << (BYTE - 5)) | (1L << (CHAR - 5)) | (1L << (DOUBLE - 5)) | (1L << (FLOAT - 5)) | (1L << (INT - 5)) | (1L << (LONG - 5)) | (1L << (NEW - 5)) | (1L << (SHORT - 5)) | (1L << (SUPER - 5)) | (1L << (SWITCH - 5)) | (1L << (THIS - 5)) | (1L << (VOID - 5)) | (1L << (MODULE - 5)) | (1L << (OPEN - 5)) | (1L << (REQUIRES - 5)) | (1L << (EXPORTS - 5)) | (1L << (OPENS - 5)) | (1L << (TO - 5)) | (1L << (USES - 5)) | (1L << (PROVIDES - 5)) | (1L << (WITH - 5)) | (1L << (TRANSITIVE - 5)) | (1L << (VAR - 5)) | (1L << (YIELD - 5)) | (1L << (RECORD - 5)) | (1L << (SEALED - 5)) | (1L << (PERMITS - 5)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WILDCARD - 72)) | (1L << (DECIMAL_LITERAL - 72)) | (1L << (HEX_LITERAL - 72)) | (1L << (OCT_LITERAL - 72)) | (1L << (BINARY_LITERAL - 72)) | (1L << (FLOAT_LITERAL - 72)) | (1L << (HEX_FLOAT_LITERAL - 72)) | (1L << (BOOL_LITERAL - 72)) | (1L << (CHAR_LITERAL - 72)) | (1L << (STRING_LITERAL - 72)) | (1L << (TEXT_BLOCK - 72)) | (1L << (NULL_LITERAL - 72)) | (1L << (LPAREN - 72)) | (1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(1855);
				expressionList();
				}
			}

			setState(1858);
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
		case 122:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 130:
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
		"\u0004\u0001\u0086\u0745\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u012f\b\u0000\u0001\u0001\u0003"+
		"\u0001\u0132\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0138\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0141\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0147\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u014b\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u014f"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005\u0154\b\u0005"+
		"\n\u0005\f\u0005\u0157\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u015f\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0166\b\u0007\u0001"+
		"\b\u0001\b\u0003\b\u016a\b\b\u0001\b\u0003\b\u016d\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0172\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0177\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0003\t\u017d\b\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0182\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0003\f\u018c\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u0191\b\r"+
		"\u0001\r\u0001\r\u0003\r\u0195\b\r\u0001\r\u0001\r\u0003\r\u0199\b\r\u0001"+
		"\r\u0001\r\u0003\r\u019d\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u01a5\b\u000e\n\u000e\f\u000e\u01a8\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0005\u000f\u01ad\b\u000f\n\u000f"+
		"\f\u000f\u01b0\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u01b5\b\u000f\n\u000f\f\u000f\u01b8\t\u000f\u0001\u000f\u0003\u000f\u01bb"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u01c0\b\u0010"+
		"\n\u0010\f\u0010\u01c3\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u01c9\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01cd"+
		"\b\u0011\u0001\u0011\u0003\u0011\u01d0\b\u0011\u0001\u0011\u0003\u0011"+
		"\u01d3\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u01da\b\u0012\n\u0012\f\u0012\u01dd\t\u0012\u0001\u0013\u0005"+
		"\u0013\u01e0\b\u0013\n\u0013\f\u0013\u01e3\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01e7\b\u0013\u0001\u0013\u0003\u0013\u01ea\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u01ee\b\u0014\n\u0014\f\u0014\u01f1\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01f6\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01fa\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01fe\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0204\b\u0016\n\u0016\f\u0016\u0207\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u020d\b\u0017\n\u0017\f\u0017\u0210\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0216\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u021a\b\u0018\n\u0018\f\u0018\u021d"+
		"\t\u0018\u0001\u0018\u0003\u0018\u0220\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u022c\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0233\b\u001a\n\u001a"+
		"\f\u001a\u0236\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u023a\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0240\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0244\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0250\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0005!\u0259\b!\n!\f!\u025c\t!\u0001"+
		"!\u0001!\u0003!\u0260\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u026a\b\"\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u0270\b#\n#\f#\u0273\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u027a"+
		"\b$\n$\f$\u027d\t$\u0001$\u0001$\u0001$\u0001%\u0005%\u0283\b%\n%\f%\u0286"+
		"\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0290"+
		"\b&\u0001\'\u0005\'\u0293\b\'\n\'\f\'\u0296\t\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0005(\u029c\b(\n(\f(\u029f\t(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u02a6\b(\n(\f(\u02a9\t(\u0001(\u0001(\u0003(\u02ad\b(\u0001("+
		"\u0001(\u0001)\u0001)\u0001)\u0005)\u02b4\b)\n)\f)\u02b7\t)\u0001*\u0001"+
		"*\u0001*\u0003*\u02bc\b*\u0001+\u0001+\u0001+\u0005+\u02c1\b+\n+\f+\u02c4"+
		"\t+\u0001,\u0001,\u0003,\u02c8\b,\u0001-\u0001-\u0001-\u0001-\u0005-\u02ce"+
		"\b-\n-\f-\u02d1\t-\u0001-\u0003-\u02d4\b-\u0003-\u02d6\b-\u0001-\u0001"+
		"-\u0001.\u0001.\u0003.\u02dc\b.\u0001.\u0001.\u0001.\u0003.\u02e1\b.\u0005"+
		".\u02e3\b.\n.\f.\u02e6\t.\u0001/\u0001/\u0005/\u02ea\b/\n/\f/\u02ed\t"+
		"/\u0001/\u0001/\u0001/\u0003/\u02f2\b/\u0003/\u02f4\b/\u00010\u00010\u0001"+
		"0\u00050\u02f9\b0\n0\f0\u02fc\t0\u00011\u00011\u00031\u0300\b1\u00011"+
		"\u00011\u00011\u00031\u0305\b1\u00011\u00031\u0308\b1\u00031\u030a\b1"+
		"\u00011\u00011\u00012\u00012\u00012\u00012\u00052\u0312\b2\n2\f2\u0315"+
		"\t2\u00012\u00012\u00013\u00013\u00013\u00053\u031c\b3\n3\f3\u031f\t3"+
		"\u00013\u00013\u00033\u0323\b3\u00013\u00033\u0326\b3\u00014\u00054\u0329"+
		"\b4\n4\f4\u032c\t4\u00014\u00014\u00014\u00015\u00055\u0332\b5\n5\f5\u0335"+
		"\t5\u00015\u00015\u00055\u0339\b5\n5\f5\u033c\t5\u00015\u00015\u00015"+
		"\u00016\u00016\u00016\u00056\u0344\b6\n6\f6\u0347\t6\u00017\u00057\u034a"+
		"\b7\n7\f7\u034d\t7\u00017\u00017\u00017\u00018\u00018\u00018\u00058\u0355"+
		"\b8\n8\f8\u0358\t8\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u0361\b9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001<\u0005<\u036a"+
		"\b<\n<\f<\u036d\t<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0003=\u0375"+
		"\b=\u0001=\u0001=\u0001=\u0003=\u037a\b=\u0001=\u0003=\u037d\b=\u0001"+
		">\u0001>\u0001>\u0005>\u0382\b>\n>\f>\u0385\t>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0003@\u038e\b@\u0001A\u0001A\u0001A\u0001A\u0005"+
		"A\u0394\bA\nA\fA\u0397\tA\u0003A\u0399\bA\u0001A\u0003A\u039c\bA\u0001"+
		"A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0005C\u03a7"+
		"\bC\nC\fC\u03aa\tC\u0001C\u0001C\u0001D\u0005D\u03af\bD\nD\fD\u03b2\t"+
		"D\u0001D\u0001D\u0003D\u03b6\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0003E\u03be\bE\u0001E\u0001E\u0003E\u03c2\bE\u0001E\u0001E\u0003E\u03c6"+
		"\bE\u0001E\u0001E\u0003E\u03ca\bE\u0001E\u0001E\u0003E\u03ce\bE\u0003"+
		"E\u03d0\bE\u0001F\u0001F\u0003F\u03d4\bF\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u03da\bG\u0001H\u0001H\u0001I\u0001I\u0001I\u0001J\u0003J\u03e2\bJ\u0001"+
		"J\u0001J\u0001J\u0001J\u0001K\u0001K\u0005K\u03ea\bK\nK\fK\u03ed\tK\u0001"+
		"K\u0001K\u0001L\u0001L\u0005L\u03f3\bL\nL\fL\u03f6\tL\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0003L\u03ff\bL\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0003L\u0407\bL\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u0415\bL\u0001M\u0001"+
		"M\u0001N\u0001N\u0001N\u0003N\u041c\bN\u0001N\u0001N\u0001N\u0003N\u0421"+
		"\bN\u0001N\u0001N\u0001O\u0001O\u0003O\u0427\bO\u0001O\u0001O\u0001P\u0001"+
		"P\u0001P\u0005P\u042e\bP\nP\fP\u0431\tP\u0001Q\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0005R\u0438\bR\nR\fR\u043b\tR\u0001R\u0001R\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0005S\u0444\bS\nS\fS\u0447\tS\u0003S\u0449\bS\u0001S\u0001S"+
		"\u0001S\u0001S\u0001S\u0003S\u0450\bS\u0001T\u0001T\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0003U\u0459\bU\u0001V\u0005V\u045c\bV\nV\fV\u045f\tV"+
		"\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u0469"+
		"\bV\u0001W\u0001W\u0001X\u0005X\u046e\bX\nX\fX\u0471\tX\u0001X\u0001X"+
		"\u0001X\u0003X\u0476\bX\u0001X\u0003X\u0479\bX\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u0491"+
		"\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u0497\bZ\u0001Z\u0001Z\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0003[\u04a0\b[\u0001\\\u0001\\\u0001\\\u0001\\"+
		"\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001_\u0001_\u0001_\u0004_\u04b5\b_\u000b_\f_\u04b6\u0001"+
		"_\u0003_\u04ba\b_\u0001_\u0003_\u04bd\b_\u0001`\u0001`\u0001`\u0001`\u0005"+
		"`\u04c3\b`\n`\f`\u04c6\t`\u0001`\u0003`\u04c9\b`\u0001a\u0001a\u0001a"+
		"\u0001a\u0001b\u0001b\u0001b\u0001b\u0001c\u0001c\u0003c\u04d5\bc\u0001"+
		"c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0003e\u04df\be\u0001"+
		"e\u0001e\u0001f\u0001f\u0003f\u04e5\bf\u0001f\u0001f\u0001g\u0001g\u0001"+
		"g\u0001g\u0001h\u0001h\u0001i\u0001i\u0003i\u04f1\bi\u0001j\u0001j\u0001"+
		"j\u0001j\u0001k\u0001k\u0001k\u0001k\u0001k\u0001l\u0001l\u0001l\u0005"+
		"l\u04ff\bl\nl\fl\u0502\tl\u0001l\u0001l\u0001l\u0001l\u0001l\u0001m\u0001"+
		"m\u0001m\u0005m\u050c\bm\nm\fm\u050f\tm\u0001n\u0001n\u0001n\u0001o\u0001"+
		"o\u0001o\u0003o\u0517\bo\u0001o\u0001o\u0001p\u0001p\u0001p\u0005p\u051e"+
		"\bp\np\fp\u0521\tp\u0001q\u0005q\u0524\bq\nq\fq\u0527\tq\u0001q\u0001"+
		"q\u0001q\u0001q\u0001q\u0003q\u052e\bq\u0001q\u0001q\u0001q\u0001q\u0003"+
		"q\u0534\bq\u0001r\u0004r\u0537\br\u000br\fr\u0538\u0001r\u0004r\u053c"+
		"\br\u000br\fr\u053d\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0003s\u0546"+
		"\bs\u0001s\u0001s\u0001s\u0003s\u054b\bs\u0001t\u0001t\u0003t\u054f\b"+
		"t\u0001t\u0001t\u0003t\u0553\bt\u0001t\u0001t\u0003t\u0557\bt\u0003t\u0559"+
		"\bt\u0001u\u0001u\u0003u\u055d\bu\u0001v\u0005v\u0560\bv\nv\fv\u0563\t"+
		"v\u0001v\u0001v\u0003v\u0567\bv\u0001v\u0001v\u0001v\u0001v\u0001w\u0001"+
		"w\u0003w\u056f\bw\u0001w\u0001w\u0001x\u0001x\u0001x\u0005x\u0576\bx\n"+
		"x\fx\u0579\tx\u0001y\u0001y\u0001y\u0003y\u057e\by\u0001y\u0001y\u0001"+
		"y\u0001y\u0001y\u0003y\u0585\by\u0001y\u0001y\u0001y\u0001y\u0003y\u058b"+
		"\by\u0001y\u0003y\u058e\by\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0005z\u0597\bz\nz\fz\u059a\tz\u0001z\u0001z\u0001z\u0005z\u059f\bz"+
		"\nz\fz\u05a2\tz\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0003z\u05b0\bz\u0001z\u0001z\u0003z\u05b4"+
		"\bz\u0001z\u0001z\u0001z\u0003z\u05b9\bz\u0001z\u0001z\u0003z\u05bd\b"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0003z\u05cd\bz\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0003z\u05f5\bz\u0001z\u0001z\u0001z\u0001"+
		"z\u0003z\u05fb\bz\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0003z\u0608\bz\u0001z\u0001z\u0001z\u0003z\u060d"+
		"\bz\u0001z\u0005z\u0610\bz\nz\fz\u0613\tz\u0001{\u0005{\u0616\b{\n{\f"+
		"{\u0619\t{\u0001{\u0001{\u0005{\u061d\b{\n{\f{\u0620\t{\u0001{\u0001{"+
		"\u0001|\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0003}\u062b\b}\u0001"+
		"}\u0001}\u0001}\u0001}\u0001}\u0005}\u0632\b}\n}\f}\u0635\t}\u0001}\u0001"+
		"}\u0001}\u0001}\u0003}\u063b\b}\u0001}\u0003}\u063e\b}\u0001~\u0001~\u0003"+
		"~\u0642\b~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f"+
		"\u0654\b\u007f\u0003\u007f\u0656\b\u007f\u0001\u0080\u0001\u0080\u0001"+
		"\u0080\u0001\u0080\u0005\u0080\u065c\b\u0080\n\u0080\f\u0080\u065f\t\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0003\u0081\u0667\b\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0003\u0081\u066e\b\u0081\u0001\u0082\u0001\u0082\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u0676\b\u0082\n\u0082"+
		"\f\u0082\u0679\t\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u067d\b\u0082"+
		"\n\u0082\f\u0082\u0680\t\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0005"+
		"\u0082\u0685\b\u0082\n\u0082\f\u0082\u0688\t\u0082\u0003\u0082\u068a\b"+
		"\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u068f\b\u0082\n"+
		"\u0082\f\u0082\u0692\t\u0082\u0001\u0083\u0001\u0083\u0005\u0083\u0696"+
		"\b\u0083\n\u0083\f\u0083\u0699\t\u0083\u0003\u0083\u069b\b\u0083\u0001"+
		"\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u06a0\b\u0084\u0001\u0084\u0005"+
		"\u0084\u06a3\b\u0084\n\u0084\f\u0084\u06a6\t\u0084\u0001\u0084\u0001\u0084"+
		"\u0003\u0084\u06aa\b\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0003\u0085\u06b3\b\u0085\u0003\u0085"+
		"\u06b5\b\u0085\u0001\u0086\u0001\u0086\u0003\u0086\u06b9\b\u0086\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u06be\b\u0086\u0005\u0086\u06c0"+
		"\b\u0086\n\u0086\f\u0086\u06c3\t\u0086\u0001\u0086\u0003\u0086\u06c6\b"+
		"\u0086\u0001\u0087\u0001\u0087\u0003\u0087\u06ca\b\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0005\u0088\u06d2"+
		"\b\u0088\n\u0088\f\u0088\u06d5\t\u0088\u0001\u0088\u0001\u0088\u0001\u0088"+
		"\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0005\u0088\u06de\b\u0088"+
		"\n\u0088\f\u0088\u06e1\t\u0088\u0001\u0088\u0001\u0088\u0005\u0088\u06e5"+
		"\b\u0088\n\u0088\f\u0088\u06e8\t\u0088\u0003\u0088\u06ea\b\u0088\u0001"+
		"\u0089\u0001\u0089\u0003\u0089\u06ee\b\u0089\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u06f6\b\u008b\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u06fb\b\u008c\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0005"+
		"\u008e\u0704\b\u008e\n\u008e\f\u008e\u0707\t\u008e\u0001\u008f\u0005\u008f"+
		"\u070a\b\u008f\n\u008f\f\u008f\u070d\t\u008f\u0001\u008f\u0001\u008f\u0003"+
		"\u008f\u0711\b\u008f\u0001\u008f\u0005\u008f\u0714\b\u008f\n\u008f\f\u008f"+
		"\u0717\t\u008f\u0001\u008f\u0001\u008f\u0005\u008f\u071b\b\u008f\n\u008f"+
		"\f\u008f\u071e\t\u008f\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091"+
		"\u0001\u0091\u0001\u0091\u0005\u0091\u0726\b\u0091\n\u0091\f\u0091\u0729"+
		"\t\u0091\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0003"+
		"\u0092\u0730\b\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u0734\b\u0092"+
		"\u0003\u0092\u0736\b\u0092\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093"+
		"\u0001\u0093\u0003\u0093\u073d\b\u0093\u0001\u0094\u0001\u0094\u0003\u0094"+
		"\u0741\b\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0000\u0002\u00f4\u0104"+
		"\u0095\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u0000\u0011\n\u0000\u0003\u0003\u0014\u0014  #%(),,0033BBDD\u0002\u0000"+
		"\u0013\u0013**\u0001\u0000IL\u0001\u0000MN\u0002\u0000((>>\u0001\u0000"+
		"FG\u0003\u00005CHH\u0086\u0086\u0001\u0000jm\u0001\u0000`a\u0002\u0000"+
		"noss\u0001\u0000lm\u0002\u0000^_ef\u0002\u0000ddgg\u0002\u0000]]t~\u0001"+
		"\u0000jk\u0002\u0000cc\u007f\u007f\b\u0000\u0005\u0005\u0007\u0007\n\n"+
		"\u0010\u0010\u0016\u0016\u001d\u001d\u001f\u001f\'\'\u07f2\u0000\u012e"+
		"\u0001\u0000\u0000\u0000\u0002\u0137\u0001\u0000\u0000\u0000\u0004\u0139"+
		"\u0001\u0000\u0000\u0000\u0006\u0140\u0001\u0000\u0000\u0000\b\u0142\u0001"+
		"\u0000\u0000\u0000\n\u0155\u0001\u0000\u0000\u0000\f\u015e\u0001\u0000"+
		"\u0000\u0000\u000e\u0160\u0001\u0000\u0000\u0000\u0010\u0167\u0001\u0000"+
		"\u0000\u0000\u0012\u017a\u0001\u0000\u0000\u0000\u0014\u0185\u0001\u0000"+
		"\u0000\u0000\u0016\u0187\u0001\u0000\u0000\u0000\u0018\u018b\u0001\u0000"+
		"\u0000\u0000\u001a\u018d\u0001\u0000\u0000\u0000\u001c\u01a0\u0001\u0000"+
		"\u0000\u0000\u001e\u01ae\u0001\u0000\u0000\u0000 \u01bc\u0001\u0000\u0000"+
		"\u0000\"\u01c4\u0001\u0000\u0000\u0000$\u01d6\u0001\u0000\u0000\u0000"+
		"&\u01e1\u0001\u0000\u0000\u0000(\u01eb\u0001\u0000\u0000\u0000*\u01f2"+
		"\u0001\u0000\u0000\u0000,\u0201\u0001\u0000\u0000\u0000.\u020a\u0001\u0000"+
		"\u0000\u00000\u021f\u0001\u0000\u0000\u00002\u022b\u0001\u0000\u0000\u0000"+
		"4\u022d\u0001\u0000\u0000\u00006\u023f\u0001\u0000\u0000\u00008\u0243"+
		"\u0001\u0000\u0000\u0000:\u0245\u0001\u0000\u0000\u0000<\u0248\u0001\u0000"+
		"\u0000\u0000>\u024b\u0001\u0000\u0000\u0000@\u0253\u0001\u0000\u0000\u0000"+
		"B\u025f\u0001\u0000\u0000\u0000D\u0269\u0001\u0000\u0000\u0000F\u026b"+
		"\u0001\u0000\u0000\u0000H\u0276\u0001\u0000\u0000\u0000J\u0284\u0001\u0000"+
		"\u0000\u0000L\u028f\u0001\u0000\u0000\u0000N\u0294\u0001\u0000\u0000\u0000"+
		"P\u029d\u0001\u0000\u0000\u0000R\u02b0\u0001\u0000\u0000\u0000T\u02b8"+
		"\u0001\u0000\u0000\u0000V\u02bd\u0001\u0000\u0000\u0000X\u02c7\u0001\u0000"+
		"\u0000\u0000Z\u02c9\u0001\u0000\u0000\u0000\\\u02d9\u0001\u0000\u0000"+
		"\u0000^\u02f3\u0001\u0000\u0000\u0000`\u02f5\u0001\u0000\u0000\u0000b"+
		"\u02fd\u0001\u0000\u0000\u0000d\u030d\u0001\u0000\u0000\u0000f\u0325\u0001"+
		"\u0000\u0000\u0000h\u032a\u0001\u0000\u0000\u0000j\u0333\u0001\u0000\u0000"+
		"\u0000l\u0340\u0001\u0000\u0000\u0000n\u034b\u0001\u0000\u0000\u0000p"+
		"\u0351\u0001\u0000\u0000\u0000r\u0360\u0001\u0000\u0000\u0000t\u0362\u0001"+
		"\u0000\u0000\u0000v\u0364\u0001\u0000\u0000\u0000x\u036b\u0001\u0000\u0000"+
		"\u0000z\u0374\u0001\u0000\u0000\u0000|\u037e\u0001\u0000\u0000\u0000~"+
		"\u0386\u0001\u0000\u0000\u0000\u0080\u038d\u0001\u0000\u0000\u0000\u0082"+
		"\u038f\u0001\u0000\u0000\u0000\u0084\u039f\u0001\u0000\u0000\u0000\u0086"+
		"\u03a4\u0001\u0000\u0000\u0000\u0088\u03b5\u0001\u0000\u0000\u0000\u008a"+
		"\u03cf\u0001\u0000\u0000\u0000\u008c\u03d3\u0001\u0000\u0000\u0000\u008e"+
		"\u03d5\u0001\u0000\u0000\u0000\u0090\u03db\u0001\u0000\u0000\u0000\u0092"+
		"\u03dd\u0001\u0000\u0000\u0000\u0094\u03e1\u0001\u0000\u0000\u0000\u0096"+
		"\u03e7\u0001\u0000\u0000\u0000\u0098\u0414\u0001\u0000\u0000\u0000\u009a"+
		"\u0416\u0001\u0000\u0000\u0000\u009c\u0418\u0001\u0000\u0000\u0000\u009e"+
		"\u0424\u0001\u0000\u0000\u0000\u00a0\u042a\u0001\u0000\u0000\u0000\u00a2"+
		"\u0432\u0001\u0000\u0000\u0000\u00a4\u0435\u0001\u0000\u0000\u0000\u00a6"+
		"\u044f\u0001\u0000\u0000\u0000\u00a8\u0451\u0001\u0000\u0000\u0000\u00aa"+
		"\u0458\u0001\u0000\u0000\u0000\u00ac\u045d\u0001\u0000\u0000\u0000\u00ae"+
		"\u046a\u0001\u0000\u0000\u0000\u00b0\u0478\u0001\u0000\u0000\u0000\u00b2"+
		"\u0490\u0001\u0000\u0000\u0000\u00b4\u0492\u0001\u0000\u0000\u0000\u00b6"+
		"\u049a\u0001\u0000\u0000\u0000\u00b8\u04a1\u0001\u0000\u0000\u0000\u00ba"+
		"\u04a7\u0001\u0000\u0000\u0000\u00bc\u04ab\u0001\u0000\u0000\u0000\u00be"+
		"\u04b1\u0001\u0000\u0000\u0000\u00c0\u04be\u0001\u0000\u0000\u0000\u00c2"+
		"\u04ca\u0001\u0000\u0000\u0000\u00c4\u04ce\u0001\u0000\u0000\u0000\u00c6"+
		"\u04d2\u0001\u0000\u0000\u0000\u00c8\u04d8\u0001\u0000\u0000\u0000\u00ca"+
		"\u04dc\u0001\u0000\u0000\u0000\u00cc\u04e2\u0001\u0000\u0000\u0000\u00ce"+
		"\u04e8\u0001\u0000\u0000\u0000\u00d0\u04ec\u0001\u0000\u0000\u0000\u00d2"+
		"\u04ee\u0001\u0000\u0000\u0000\u00d4\u04f2\u0001\u0000\u0000\u0000\u00d6"+
		"\u04f6\u0001\u0000\u0000\u0000\u00d8\u04fb\u0001\u0000\u0000\u0000\u00da"+
		"\u0508\u0001\u0000\u0000\u0000\u00dc\u0510\u0001\u0000\u0000\u0000\u00de"+
		"\u0513\u0001\u0000\u0000\u0000\u00e0\u051a\u0001\u0000\u0000\u0000\u00e2"+
		"\u0533\u0001\u0000\u0000\u0000\u00e4\u0536\u0001\u0000\u0000\u0000\u00e6"+
		"\u054a\u0001\u0000\u0000\u0000\u00e8\u0558\u0001\u0000\u0000\u0000\u00ea"+
		"\u055c\u0001\u0000\u0000\u0000\u00ec\u0561\u0001\u0000\u0000\u0000\u00ee"+
		"\u056c\u0001\u0000\u0000\u0000\u00f0\u0572\u0001\u0000\u0000\u0000\u00f2"+
		"\u058d\u0001\u0000\u0000\u0000\u00f4\u05bc\u0001\u0000\u0000\u0000\u00f6"+
		"\u0617\u0001\u0000\u0000\u0000\u00f8\u0623\u0001\u0000\u0000\u0000\u00fa"+
		"\u063d\u0001\u0000\u0000\u0000\u00fc\u0641\u0001\u0000\u0000\u0000\u00fe"+
		"\u0655\u0001\u0000\u0000\u0000\u0100\u0657\u0001\u0000\u0000\u0000\u0102"+
		"\u066d\u0001\u0000\u0000\u0000\u0104\u0689\u0001\u0000\u0000\u0000\u0106"+
		"\u069a\u0001\u0000\u0000\u0000\u0108\u069f\u0001\u0000\u0000\u0000\u010a"+
		"\u06b4\u0001\u0000\u0000\u0000\u010c\u06c5\u0001\u0000\u0000\u0000\u010e"+
		"\u06c7\u0001\u0000\u0000\u0000\u0110\u06cd\u0001\u0000\u0000\u0000\u0112"+
		"\u06eb\u0001\u0000\u0000\u0000\u0114\u06ef\u0001\u0000\u0000\u0000\u0116"+
		"\u06f5\u0001\u0000\u0000\u0000\u0118\u06fa\u0001\u0000\u0000\u0000\u011a"+
		"\u06fc\u0001\u0000\u0000\u0000\u011c\u0700\u0001\u0000\u0000\u0000\u011e"+
		"\u070b\u0001\u0000\u0000\u0000\u0120\u071f\u0001\u0000\u0000\u0000\u0122"+
		"\u0721\u0001\u0000\u0000\u0000\u0124\u0735\u0001\u0000\u0000\u0000\u0126"+
		"\u073c\u0001\u0000\u0000\u0000\u0128\u073e\u0001\u0000\u0000\u0000\u012a"+
		"\u012f\u0003\u00b2Y\u0000\u012b\u012f\u0003\u0006\u0003\u0000\u012c\u012f"+
		"\u0003\u00f4z\u0000\u012d\u012f\u0003\u0012\t\u0000\u012e\u012a\u0001"+
		"\u0000\u0000\u0000\u012e\u012b\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0001\u0001"+
		"\u0000\u0000\u0000\u0130\u0132\u0005\u0001\u0000\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0138\u0003\u0000\u0000\u0000\u0134\u0135\u0003"+
		"\u0004\u0002\u0000\u0135\u0136\u0003\u0000\u0000\u0000\u0136\u0138\u0001"+
		"\u0000\u0000\u0000\u0137\u0131\u0001\u0000\u0000\u0000\u0137\u0134\u0001"+
		"\u0000\u0000\u0000\u0138\u0003\u0001\u0000\u0000\u0000\u0139\u013a\u0005"+
		"X\u0000\u0000\u013a\u013b\u0003t:\u0000\u013b\u013c\u0005Y\u0000\u0000"+
		"\u013c\u0005\u0001\u0000\u0000\u0000\u013d\u0141\u0003\b\u0004\u0000\u013e"+
		"\u0141\u0003\u0010\b\u0000\u013f\u0141\u0003\u000e\u0007\u0000\u0140\u013d"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f"+
		"\u0001\u0000\u0000\u0000\u0141\u0007\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0003\n\u0005\u0000\u0143\u0144\u0003\f\u0006\u0000\u0144\u0146\u0003"+
		"\u00aeW\u0000\u0145\u0147\u0003\u001c\u000e\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u0013\u0000\u0000\u0149\u014b\u0003\u011c"+
		"\u008e\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u001a"+
		"\u0000\u0000\u014d\u014f\u0003\u011c\u008e\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0003\u00a6S\u0000\u0151\t\u0001\u0000\u0000"+
		"\u0000\u0152\u0154\u0003\u0014\n\u0000\u0153\u0152\u0001\u0000\u0000\u0000"+
		"\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u000b\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015f\u0005\u000b\u0000\u0000"+
		"\u0159\u015f\u0005\u001e\u0000\u0000\u015a\u015f\u0005\u0012\u0000\u0000"+
		"\u015b\u015f\u0005E\u0000\u0000\u015c\u015d\u0005\u0081\u0000\u0000\u015d"+
		"\u015f\u0005\u001e\u0000\u0000\u015e\u0158\u0001\u0000\u0000\u0000\u015e"+
		"\u0159\u0001\u0000\u0000\u0000\u015e\u015a\u0001\u0000\u0000\u0000\u015e"+
		"\u015b\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f"+
		"\r\u0001\u0000\u0000\u0000\u0160\u0161\u0003\n\u0005\u0000\u0161\u0162"+
		"\u00038\u001c\u0000\u0162\u0165\u0003\u00aeW\u0000\u0163\u0164\u0005]"+
		"\u0000\u0000\u0164\u0166\u0003\u00f4z\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u000f\u0001\u0000\u0000"+
		"\u0000\u0167\u0169\u0003\n\u0005\u0000\u0168\u016a\u0003\u001c\u000e\u0000"+
		"\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u016d\u00038\u001c\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0003\u00aeW\u0000\u016f\u0171"+
		"\u0005T\u0000\u0000\u0170\u0172\u0003f3\u0000\u0171\u0170\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0176\u0005U\u0000\u0000\u0174\u0175\u0005/\u0000\u0000"+
		"\u0175\u0177\u0003`0\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0003\u00a6S\u0000\u0179\u0011\u0001\u0000\u0000\u0000\u017a\u017c\u0005"+
		"\u001b\u0000\u0000\u017b\u017d\u0005(\u0000\u0000\u017c\u017b\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000"+
		"\u0000\u0000\u017e\u0181\u0003p8\u0000\u017f\u0180\u0005\\\u0000\u0000"+
		"\u0180\u0182\u0005n\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0005Z\u0000\u0000\u0184\u0013\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0007\u0000\u0000\u0000\u0186\u0015\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0003z=\u0000\u0188\u0017\u0001\u0000\u0000\u0000\u0189\u018c\u0005\u0014"+
		"\u0000\u0000\u018a\u018c\u0003z=\u0000\u018b\u0189\u0001\u0000\u0000\u0000"+
		"\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u0019\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005\u000b\u0000\u0000\u018e\u0190\u0003\u00aeW\u0000\u018f"+
		"\u0191\u0003\u001c\u000e\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0005\u0013\u0000\u0000\u0193\u0195\u0003\u011e\u008f\u0000\u0194"+
		"\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"\u0198\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u001a\u0000\u0000\u0197"+
		"\u0199\u0003\u011c\u008e\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0005C\u0000\u0000\u019b\u019d\u0003\u011c\u008e\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0003,\u0016\u0000\u019f\u001b\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0005_\u0000\u0000\u01a1\u01a6\u0003\u001e"+
		"\u000f\u0000\u01a2\u01a3\u0005[\u0000\u0000\u01a3\u01a5\u0003\u001e\u000f"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0005^\u0000\u0000\u01aa\u001d\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ad\u0003z=\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b1\u01ba\u0003\u00aeW\u0000\u01b2\u01b6\u0005"+
		"\u0013\u0000\u0000\u01b3\u01b5\u0003z=\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003 \u0010\u0000"+
		"\u01ba\u01b2\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bb\u001f\u0001\u0000\u0000\u0000\u01bc\u01c1\u0003\u011e\u008f\u0000"+
		"\u01bd\u01be\u0005p\u0000\u0000\u01be\u01c0\u0003\u011e\u008f\u0000\u01bf"+
		"\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2"+
		"!\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0005\u0012\u0000\u0000\u01c5\u01c8\u0003\u00aeW\u0000\u01c6\u01c7\u0005"+
		"\u001a\u0000\u0000\u01c7\u01c9\u0003\u011c\u008e\u0000\u01c8\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cc\u0005V\u0000\u0000\u01cb\u01cd\u0003$\u0012"+
		"\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01d0\u0005[\u0000\u0000"+
		"\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01d3\u0003(\u0014\u0000\u01d2"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005W\u0000\u0000\u01d5#\u0001"+
		"\u0000\u0000\u0000\u01d6\u01db\u0003&\u0013\u0000\u01d7\u01d8\u0005[\u0000"+
		"\u0000\u01d8\u01da\u0003&\u0013\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000"+
		"\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc%\u0001\u0000\u0000\u0000\u01dd"+
		"\u01db\u0001\u0000\u0000\u0000\u01de\u01e0\u0003z=\u0000\u01df\u01de\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e6\u0003"+
		"\u00aeW\u0000\u01e5\u01e7\u0003\u0128\u0094\u0000\u01e6\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e8\u01ea\u0003,\u0016\u0000\u01e9\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\'\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ef\u0005Z\u0000\u0000\u01ec\u01ee\u00030\u0018\u0000\u01ed\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0)\u0001"+
		"\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005"+
		"\u001e\u0000\u0000\u01f3\u01f5\u0003\u00aeW\u0000\u01f4\u01f6\u0003\u001c"+
		"\u000e\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\u0013"+
		"\u0000\u0000\u01f8\u01fa\u0003\u011c\u008e\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0005C\u0000\u0000\u01fc\u01fe\u0003\u011c\u008e"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0003.\u0017\u0000"+
		"\u0200+\u0001\u0000\u0000\u0000\u0201\u0205\u0005V\u0000\u0000\u0202\u0204"+
		"\u00030\u0018\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204\u0207\u0001"+
		"\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0205\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0005W\u0000\u0000\u0209-\u0001\u0000\u0000"+
		"\u0000\u020a\u020e\u0005V\u0000\u0000\u020b\u020d\u0003B!\u0000\u020c"+
		"\u020b\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f"+
		"\u0211\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0005W\u0000\u0000\u0212/\u0001\u0000\u0000\u0000\u0213\u0220\u0005"+
		"Z\u0000\u0000\u0214\u0216\u0005(\u0000\u0000\u0215\u0214\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217\u0220\u0003\u00a6S\u0000\u0218\u021a\u0003\u0014\n\u0000"+
		"\u0219\u0218\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000"+
		"\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000"+
		"\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000"+
		"\u021e\u0220\u00032\u0019\u0000\u021f\u0213\u0001\u0000\u0000\u0000\u021f"+
		"\u0215\u0001\u0000\u0000\u0000\u021f\u021b\u0001\u0000\u0000\u0000\u0220"+
		"1\u0001\u0000\u0000\u0000\u0221\u022c\u00034\u001a\u0000\u0222\u022c\u0003"+
		":\u001d\u0000\u0223\u022c\u0003@ \u0000\u0224\u022c\u0003>\u001f\u0000"+
		"\u0225\u022c\u0003<\u001e\u0000\u0226\u022c\u0003*\u0015\u0000\u0227\u022c"+
		"\u0003\u0084B\u0000\u0228\u022c\u0003\u001a\r\u0000\u0229\u022c\u0003"+
		"\"\u0011\u0000\u022a\u022c\u0003\u009cN\u0000\u022b\u0221\u0001\u0000"+
		"\u0000\u0000\u022b\u0222\u0001\u0000\u0000\u0000\u022b\u0223\u0001\u0000"+
		"\u0000\u0000\u022b\u0224\u0001\u0000\u0000\u0000\u022b\u0225\u0001\u0000"+
		"\u0000\u0000\u022b\u0226\u0001\u0000\u0000\u0000\u022b\u0227\u0001\u0000"+
		"\u0000\u0000\u022b\u0228\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000"+
		"\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c3\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u00038\u001c\u0000\u022e\u022f\u0003\u00aeW\u0000\u022f"+
		"\u0234\u0003b1\u0000\u0230\u0231\u0005X\u0000\u0000\u0231\u0233\u0005"+
		"Y\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0236\u0001\u0000"+
		"\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000"+
		"\u0000\u0000\u0235\u0239\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0005/\u0000\u0000\u0238\u023a\u0003`0\u0000"+
		"\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u00036\u001b\u0000\u023c"+
		"5\u0001\u0000\u0000\u0000\u023d\u0240\u0003\u00a6S\u0000\u023e\u0240\u0005"+
		"Z\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000"+
		"\u0000\u0000\u02407\u0001\u0000\u0000\u0000\u0241\u0244\u0003\u011e\u008f"+
		"\u0000\u0242\u0244\u00052\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000"+
		"\u0243\u0242\u0001\u0000\u0000\u0000\u02449\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\u0003\u001c\u000e\u0000\u0246\u0247\u00034\u001a\u0000\u0247;\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0003\u001c\u000e\u0000\u0249\u024a\u0003"+
		">\u001f\u0000\u024a=\u0001\u0000\u0000\u0000\u024b\u024c\u0003\u00aeW"+
		"\u0000\u024c\u024f\u0003b1\u0000\u024d\u024e\u0005/\u0000\u0000\u024e"+
		"\u0250\u0003`0\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001"+
		"\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0003"+
		"\u00a6S\u0000\u0252?\u0001\u0000\u0000\u0000\u0253\u0254\u0003\u011e\u008f"+
		"\u0000\u0254\u0255\u0003R)\u0000\u0255\u0256\u0005Z\u0000\u0000\u0256"+
		"A\u0001\u0000\u0000\u0000\u0257\u0259\u0003\u0014\n\u0000\u0258\u0257"+
		"\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000\u0000\u025a\u0258"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025d"+
		"\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025d\u0260"+
		"\u0003D\"\u0000\u025e\u0260\u0005Z\u0000\u0000\u025f\u025a\u0001\u0000"+
		"\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260C\u0001\u0000\u0000"+
		"\u0000\u0261\u026a\u0003F#\u0000\u0262\u026a\u0003J%\u0000\u0263\u026a"+
		"\u0003N\'\u0000\u0264\u026a\u0003*\u0015\u0000\u0265\u026a\u0003\u0084"+
		"B\u0000\u0266\u026a\u0003\u001a\r\u0000\u0267\u026a\u0003\"\u0011\u0000"+
		"\u0268\u026a\u0003\u009cN\u0000\u0269\u0261\u0001\u0000\u0000\u0000\u0269"+
		"\u0262\u0001\u0000\u0000\u0000\u0269\u0263\u0001\u0000\u0000\u0000\u0269"+
		"\u0264\u0001\u0000\u0000\u0000\u0269\u0265\u0001\u0000\u0000\u0000\u0269"+
		"\u0266\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269"+
		"\u0268\u0001\u0000\u0000\u0000\u026aE\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0003\u011e\u008f\u0000\u026c\u0271\u0003H$\u0000\u026d\u026e\u0005["+
		"\u0000\u0000\u026e\u0270\u0003H$\u0000\u026f\u026d\u0001\u0000\u0000\u0000"+
		"\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0274\u0001\u0000\u0000\u0000"+
		"\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0275\u0005Z\u0000\u0000\u0275"+
		"G\u0001\u0000\u0000\u0000\u0276\u027b\u0003\u00aeW\u0000\u0277\u0278\u0005"+
		"X\u0000\u0000\u0278\u027a\u0005Y\u0000\u0000\u0279\u0277\u0001\u0000\u0000"+
		"\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000"+
		"\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000"+
		"\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u027f\u0005]\u0000\u0000"+
		"\u027f\u0280\u0003X,\u0000\u0280I\u0001\u0000\u0000\u0000\u0281\u0283"+
		"\u0003L&\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0286\u0001\u0000"+
		"\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0003P(\u0000\u0288K\u0001\u0000\u0000\u0000"+
		"\u0289\u0290\u0003z=\u0000\u028a\u0290\u0005%\u0000\u0000\u028b\u0290"+
		"\u0005\u0003\u0000\u0000\u028c\u0290\u0005\u000e\u0000\u0000\u028d\u0290"+
		"\u0005(\u0000\u0000\u028e\u0290\u0005)\u0000\u0000\u028f\u0289\u0001\u0000"+
		"\u0000\u0000\u028f\u028a\u0001\u0000\u0000\u0000\u028f\u028b\u0001\u0000"+
		"\u0000\u0000\u028f\u028c\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u028f\u028e\u0001\u0000\u0000\u0000\u0290M\u0001\u0000\u0000"+
		"\u0000\u0291\u0293\u0003L&\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0293"+
		"\u0296\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294"+
		"\u0295\u0001\u0000\u0000\u0000\u0295\u0297\u0001\u0000\u0000\u0000\u0296"+
		"\u0294\u0001\u0000\u0000\u0000\u0297\u0298\u0003\u001c\u000e\u0000\u0298"+
		"\u0299\u0003P(\u0000\u0299O\u0001\u0000\u0000\u0000\u029a\u029c\u0003"+
		"z=\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029e\u02a0\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u00038\u001c\u0000\u02a1\u02a2\u0003\u00aeW\u0000\u02a2"+
		"\u02a7\u0003b1\u0000\u02a3\u02a4\u0005X\u0000\u0000\u02a4\u02a6\u0005"+
		"Y\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000"+
		"\u0000\u0000\u02a8\u02ac\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000"+
		"\u0000\u0000\u02aa\u02ab\u0005/\u0000\u0000\u02ab\u02ad\u0003`0\u0000"+
		"\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u00036\u001b\u0000\u02af"+
		"Q\u0001\u0000\u0000\u0000\u02b0\u02b5\u0003T*\u0000\u02b1\u02b2\u0005"+
		"[\u0000\u0000\u02b2\u02b4\u0003T*\u0000\u02b3\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6S\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8\u02bb\u0003V+\u0000\u02b9\u02ba"+
		"\u0005]\u0000\u0000\u02ba\u02bc\u0003X,\u0000\u02bb\u02b9\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bcU\u0001\u0000\u0000"+
		"\u0000\u02bd\u02c2\u0003\u00aeW\u0000\u02be\u02bf\u0005X\u0000\u0000\u02bf"+
		"\u02c1\u0005Y\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c1\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c3W\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c8\u0003Z-\u0000\u02c6\u02c8\u0003\u00f4z"+
		"\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c8Y\u0001\u0000\u0000\u0000\u02c9\u02d5\u0005V\u0000\u0000\u02ca"+
		"\u02cf\u0003X,\u0000\u02cb\u02cc\u0005[\u0000\u0000\u02cc\u02ce\u0003"+
		"X,\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02d1\u0001\u0000\u0000"+
		"\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d4\u0005[\u0000\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d5\u02ca\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005W\u0000\u0000\u02d8"+
		"[\u0001\u0000\u0000\u0000\u02d9\u02db\u0003\u00aeW\u0000\u02da\u02dc\u0003"+
		"\u0122\u0091\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02db\u02dc\u0001"+
		"\u0000\u0000\u0000\u02dc\u02e4\u0001\u0000\u0000\u0000\u02dd\u02de\u0005"+
		"\\\u0000\u0000\u02de\u02e0\u0003\u00aeW\u0000\u02df\u02e1\u0003\u0122"+
		"\u0091\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e3\u0001\u0000\u0000\u0000\u02e2\u02dd\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5]\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7\u02f4\u0003\u011e\u008f"+
		"\u0000\u02e8\u02ea\u0003z=\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02ea"+
		"\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed"+
		"\u02eb\u0001\u0000\u0000\u0000\u02ee\u02f1\u0005b\u0000\u0000\u02ef\u02f0"+
		"\u0007\u0001\u0000\u0000\u02f0\u02f2\u0003\u011e\u008f\u0000\u02f1\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f3\u02e7\u0001\u0000\u0000\u0000\u02f3\u02eb"+
		"\u0001\u0000\u0000\u0000\u02f4_\u0001\u0000\u0000\u0000\u02f5\u02fa\u0003"+
		"p8\u0000\u02f6\u02f7\u0005[\u0000\u0000\u02f7\u02f9\u0003p8\u0000\u02f8"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000\u0000\u02fa"+
		"\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb"+
		"a\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fd\u0309"+
		"\u0005T\u0000\u0000\u02fe\u0300\u0003d2\u0000\u02ff\u02fe\u0001\u0000"+
		"\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u030a\u0001\u0000"+
		"\u0000\u0000\u0301\u0304\u0003d2\u0000\u0302\u0303\u0005[\u0000\u0000"+
		"\u0303\u0305\u0003f3\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305"+
		"\u0001\u0000\u0000\u0000\u0305\u030a\u0001\u0000\u0000\u0000\u0306\u0308"+
		"\u0003f3\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000"+
		"\u0000\u0000\u0308\u030a\u0001\u0000\u0000\u0000\u0309\u02ff\u0001\u0000"+
		"\u0000\u0000\u0309\u0301\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000"+
		"\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030c\u0005U\u0000"+
		"\u0000\u030cc\u0001\u0000\u0000\u0000\u030d\u0313\u0003\u011e\u008f\u0000"+
		"\u030e\u030f\u0003\u00aeW\u0000\u030f\u0310\u0005\\\u0000\u0000\u0310"+
		"\u0312\u0001\u0000\u0000\u0000\u0311\u030e\u0001\u0000\u0000\u0000\u0312"+
		"\u0315\u0001\u0000\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0313"+
		"\u0314\u0001\u0000\u0000\u0000\u0314\u0316\u0001\u0000\u0000\u0000\u0315"+
		"\u0313\u0001\u0000\u0000\u0000\u0316\u0317\u0005-\u0000\u0000\u0317e\u0001"+
		"\u0000\u0000\u0000\u0318\u031d\u0003h4\u0000\u0319\u031a\u0005[\u0000"+
		"\u0000\u031a\u031c\u0003h4\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031c"+
		"\u031f\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031d"+
		"\u031e\u0001\u0000\u0000\u0000\u031e\u0322\u0001\u0000\u0000\u0000\u031f"+
		"\u031d\u0001\u0000\u0000\u0000\u0320\u0321\u0005[\u0000\u0000\u0321\u0323"+
		"\u0003j5\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000"+
		"\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0326\u0003j5\u0000"+
		"\u0325\u0318\u0001\u0000\u0000\u0000\u0325\u0324\u0001\u0000\u0000\u0000"+
		"\u0326g\u0001\u0000\u0000\u0000\u0327\u0329\u0003\u0018\f\u0000\u0328"+
		"\u0327\u0001\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000\u0000\u032a"+
		"\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032d\u0001\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d"+
		"\u032e\u0003\u011e\u008f\u0000\u032e\u032f\u0003V+\u0000\u032fi\u0001"+
		"\u0000\u0000\u0000\u0330\u0332\u0003\u0018\f\u0000\u0331\u0330\u0001\u0000"+
		"\u0000\u0000\u0332\u0335\u0001\u0000\u0000\u0000\u0333\u0331\u0001\u0000"+
		"\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0336\u0001\u0000"+
		"\u0000\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0336\u033a\u0003\u011e"+
		"\u008f\u0000\u0337\u0339\u0003z=\u0000\u0338\u0337\u0001\u0000\u0000\u0000"+
		"\u0339\u033c\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000"+
		"\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033d\u0001\u0000\u0000\u0000"+
		"\u033c\u033a\u0001\u0000\u0000\u0000\u033d\u033e\u0005\u0082\u0000\u0000"+
		"\u033e\u033f\u0003V+\u0000\u033fk\u0001\u0000\u0000\u0000\u0340\u0345"+
		"\u0003n7\u0000\u0341\u0342\u0005[\u0000\u0000\u0342\u0344\u0003n7\u0000"+
		"\u0343\u0341\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000"+
		"\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000"+
		"\u0346m\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348"+
		"\u034a\u0003\u0018\f\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u034a\u034d"+
		"\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c"+
		"\u0001\u0000\u0000\u0000\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u034b"+
		"\u0001\u0000\u0000\u0000\u034e\u034f\u0005?\u0000\u0000\u034f\u0350\u0003"+
		"\u00aeW\u0000\u0350o\u0001\u0000\u0000\u0000\u0351\u0356\u0003\u00aeW"+
		"\u0000\u0352\u0353\u0005\\\u0000\u0000\u0353\u0355\u0003\u00aeW\u0000"+
		"\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0358\u0001\u0000\u0000\u0000"+
		"\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000"+
		"\u0357q\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000\u0359"+
		"\u0361\u0003t:\u0000\u035a\u0361\u0003v;\u0000\u035b\u0361\u0005P\u0000"+
		"\u0000\u035c\u0361\u0005Q\u0000\u0000\u035d\u0361\u0005O\u0000\u0000\u035e"+
		"\u0361\u0005S\u0000\u0000\u035f\u0361\u0005R\u0000\u0000\u0360\u0359\u0001"+
		"\u0000\u0000\u0000\u0360\u035a\u0001\u0000\u0000\u0000\u0360\u035b\u0001"+
		"\u0000\u0000\u0000\u0360\u035c\u0001\u0000\u0000\u0000\u0360\u035d\u0001"+
		"\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0360\u035f\u0001"+
		"\u0000\u0000\u0000\u0361s\u0001\u0000\u0000\u0000\u0362\u0363\u0007\u0002"+
		"\u0000\u0000\u0363u\u0001\u0000\u0000\u0000\u0364\u0365\u0007\u0003\u0000"+
		"\u0000\u0365w\u0001\u0000\u0000\u0000\u0366\u0367\u0003\u00aeW\u0000\u0367"+
		"\u0368\u0005\\\u0000\u0000\u0368\u036a\u0001\u0000\u0000\u0000\u0369\u0366"+
		"\u0001\u0000\u0000\u0000\u036a\u036d\u0001\u0000\u0000\u0000\u036b\u0369"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e"+
		"\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0005\u0081\u0000\u0000\u036f\u0370\u0003\u00aeW\u0000\u0370y\u0001\u0000"+
		"\u0000\u0000\u0371\u0372\u0005\u0081\u0000\u0000\u0372\u0375\u0003p8\u0000"+
		"\u0373\u0375\u0003x<\u0000\u0374\u0371\u0001\u0000\u0000\u0000\u0374\u0373"+
		"\u0001\u0000\u0000\u0000\u0375\u037c\u0001\u0000\u0000\u0000\u0376\u0379"+
		"\u0005T\u0000\u0000\u0377\u037a\u0003|>\u0000\u0378\u037a\u0003\u0080"+
		"@\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u0378\u0001\u0000\u0000"+
		"\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000"+
		"\u0000\u037b\u037d\u0005U\u0000\u0000\u037c\u0376\u0001\u0000\u0000\u0000"+
		"\u037c\u037d\u0001\u0000\u0000\u0000\u037d{\u0001\u0000\u0000\u0000\u037e"+
		"\u0383\u0003~?\u0000\u037f\u0380\u0005[\u0000\u0000\u0380\u0382\u0003"+
		"~?\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0382\u0385\u0001\u0000\u0000"+
		"\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000"+
		"\u0000\u0384}\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000"+
		"\u0386\u0387\u0003\u00aeW\u0000\u0387\u0388\u0005]\u0000\u0000\u0388\u0389"+
		"\u0003\u0080@\u0000\u0389\u007f\u0001\u0000\u0000\u0000\u038a\u038e\u0003"+
		"\u00f4z\u0000\u038b\u038e\u0003z=\u0000\u038c\u038e\u0003\u0082A\u0000"+
		"\u038d\u038a\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000"+
		"\u038d\u038c\u0001\u0000\u0000\u0000\u038e\u0081\u0001\u0000\u0000\u0000"+
		"\u038f\u0398\u0005V\u0000\u0000\u0390\u0395\u0003\u0080@\u0000\u0391\u0392"+
		"\u0005[\u0000\u0000\u0392\u0394\u0003\u0080@\u0000\u0393\u0391\u0001\u0000"+
		"\u0000\u0000\u0394\u0397\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000"+
		"\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0399\u0001\u0000"+
		"\u0000\u0000\u0397\u0395\u0001\u0000\u0000\u0000\u0398\u0390\u0001\u0000"+
		"\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u039b\u0001\u0000"+
		"\u0000\u0000\u039a\u039c\u0005[\u0000\u0000\u039b\u039a\u0001\u0000\u0000"+
		"\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000"+
		"\u0000\u039d\u039e\u0005W\u0000\u0000\u039e\u0083\u0001\u0000\u0000\u0000"+
		"\u039f\u03a0\u0005\u0081\u0000\u0000\u03a0\u03a1\u0005\u001e\u0000\u0000"+
		"\u03a1\u03a2\u0003\u00aeW\u0000\u03a2\u03a3\u0003\u0086C\u0000\u03a3\u0085"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a8\u0005V\u0000\u0000\u03a5\u03a7\u0003"+
		"\u0088D\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a7\u03aa\u0001\u0000"+
		"\u0000\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000"+
		"\u0000\u0000\u03a9\u03ab\u0001\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ac\u0005W\u0000\u0000\u03ac\u0087\u0001\u0000\u0000"+
		"\u0000\u03ad\u03af\u0003\u0014\n\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000"+
		"\u03af\u03b2\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b3\u03b6\u0003\u008aE\u0000\u03b4"+
		"\u03b6\u0005Z\u0000\u0000\u03b5\u03b0\u0001\u0000\u0000\u0000\u03b5\u03b4"+
		"\u0001\u0000\u0000\u0000\u03b6\u0089\u0001\u0000\u0000\u0000\u03b7\u03b8"+
		"\u0003\u011e\u008f\u0000\u03b8\u03b9\u0003\u008cF\u0000\u03b9\u03ba\u0005"+
		"Z\u0000\u0000\u03ba\u03d0\u0001\u0000\u0000\u0000\u03bb\u03bd\u0003\u001a"+
		"\r\u0000\u03bc\u03be\u0005Z\u0000\u0000\u03bd\u03bc\u0001\u0000\u0000"+
		"\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03d0\u0001\u0000\u0000"+
		"\u0000\u03bf\u03c1\u0003*\u0015\u0000\u03c0\u03c2\u0005Z\u0000\u0000\u03c1"+
		"\u03c0\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2"+
		"\u03d0\u0001\u0000\u0000\u0000\u03c3\u03c5\u0003\"\u0011\u0000\u03c4\u03c6"+
		"\u0005Z\u0000\u0000\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001"+
		"\u0000\u0000\u0000\u03c6\u03d0\u0001\u0000\u0000\u0000\u03c7\u03c9\u0003"+
		"\u0084B\u0000\u03c8\u03ca\u0005Z\u0000\u0000\u03c9\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03d0\u0001\u0000\u0000"+
		"\u0000\u03cb\u03cd\u0003\u009cN\u0000\u03cc\u03ce\u0005Z\u0000\u0000\u03cd"+
		"\u03cc\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce"+
		"\u03d0\u0001\u0000\u0000\u0000\u03cf\u03b7\u0001\u0000\u0000\u0000\u03cf"+
		"\u03bb\u0001\u0000\u0000\u0000\u03cf\u03bf\u0001\u0000\u0000\u0000\u03cf"+
		"\u03c3\u0001\u0000\u0000\u0000\u03cf\u03c7\u0001\u0000\u0000\u0000\u03cf"+
		"\u03cb\u0001\u0000\u0000\u0000\u03d0\u008b\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d4\u0003\u008eG\u0000\u03d2\u03d4\u0003\u0090H\u0000\u03d3\u03d1\u0001"+
		"\u0000\u0000\u0000\u03d3\u03d2\u0001\u0000\u0000\u0000\u03d4\u008d\u0001"+
		"\u0000\u0000\u0000\u03d5\u03d6\u0003\u00aeW\u0000\u03d6\u03d7\u0005T\u0000"+
		"\u0000\u03d7\u03d9\u0005U\u0000\u0000\u03d8\u03da\u0003\u0092I\u0000\u03d9"+
		"\u03d8\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da"+
		"\u008f\u0001\u0000\u0000\u0000\u03db\u03dc\u0003R)\u0000\u03dc\u0091\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0005\u000e\u0000\u0000\u03de\u03df\u0003"+
		"\u0080@\u0000\u03df\u0093\u0001\u0000\u0000\u0000\u03e0\u03e2\u00056\u0000"+
		"\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e4\u00055\u0000\u0000"+
		"\u03e4\u03e5\u0003p8\u0000\u03e5\u03e6\u0003\u0096K\u0000\u03e6\u0095"+
		"\u0001\u0000\u0000\u0000\u03e7\u03eb\u0005V\u0000\u0000\u03e8\u03ea\u0003"+
		"\u0098L\u0000\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u03ed\u0001\u0000"+
		"\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000"+
		"\u0000\u0000\u03ee\u03ef\u0005W\u0000\u0000\u03ef\u0097\u0001\u0000\u0000"+
		"\u0000\u03f0\u03f4\u00057\u0000\u0000\u03f1\u03f3\u0003\u009aM\u0000\u03f2"+
		"\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f7\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f7"+
		"\u03f8\u0003p8\u0000\u03f8\u03f9\u0005Z\u0000\u0000\u03f9\u0415\u0001"+
		"\u0000\u0000\u0000\u03fa\u03fb\u00058\u0000\u0000\u03fb\u03fe\u0003p8"+
		"\u0000\u03fc\u03fd\u0005:\u0000\u0000\u03fd\u03ff\u0003p8\u0000\u03fe"+
		"\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff"+
		"\u0400\u0001\u0000\u0000\u0000\u0400\u0401\u0005Z\u0000\u0000\u0401\u0415"+
		"\u0001\u0000\u0000\u0000\u0402\u0403\u00059\u0000\u0000\u0403\u0406\u0003"+
		"p8\u0000\u0404\u0405\u0005:\u0000\u0000\u0405\u0407\u0003p8\u0000\u0406"+
		"\u0404\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407"+
		"\u0408\u0001\u0000\u0000\u0000\u0408\u0409\u0005Z\u0000\u0000\u0409\u0415"+
		"\u0001\u0000\u0000\u0000\u040a\u040b\u0005;\u0000\u0000\u040b\u040c\u0003"+
		"p8\u0000\u040c\u040d\u0005Z\u0000\u0000\u040d\u0415\u0001\u0000\u0000"+
		"\u0000\u040e\u040f\u0005<\u0000\u0000\u040f\u0410\u0003p8\u0000\u0410"+
		"\u0411\u0005=\u0000\u0000\u0411\u0412\u0003p8\u0000\u0412\u0413\u0005"+
		"Z\u0000\u0000\u0413\u0415\u0001\u0000\u0000\u0000\u0414\u03f0\u0001\u0000"+
		"\u0000\u0000\u0414\u03fa\u0001\u0000\u0000\u0000\u0414\u0402\u0001\u0000"+
		"\u0000\u0000\u0414\u040a\u0001\u0000\u0000\u0000\u0414\u040e\u0001\u0000"+
		"\u0000\u0000\u0415\u0099\u0001\u0000\u0000\u0000\u0416\u0417\u0007\u0004"+
		"\u0000\u0000\u0417\u009b\u0001\u0000\u0000\u0000\u0418\u0419\u0005A\u0000"+
		"\u0000\u0419\u041b\u0003\u00aeW\u0000\u041a\u041c\u0003\u001c\u000e\u0000"+
		"\u041b\u041a\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000"+
		"\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u0420\u0003\u009eO\u0000\u041e"+
		"\u041f\u0005\u001a\u0000\u0000\u041f\u0421\u0003\u011c\u008e\u0000\u0420"+
		"\u041e\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421"+
		"\u0422\u0001\u0000\u0000\u0000\u0422\u0423\u0003\u00a4R\u0000\u0423\u009d"+
		"\u0001\u0000\u0000\u0000\u0424\u0426\u0005T\u0000\u0000\u0425\u0427\u0003"+
		"\u00a0P\u0000\u0426\u0425\u0001\u0000\u0000\u0000\u0426\u0427\u0001\u0000"+
		"\u0000\u0000\u0427\u0428\u0001\u0000\u0000\u0000\u0428\u0429\u0005U\u0000"+
		"\u0000\u0429\u009f\u0001\u0000\u0000\u0000\u042a\u042f\u0003\u00a2Q\u0000"+
		"\u042b\u042c\u0005[\u0000\u0000\u042c\u042e\u0003\u00a2Q\u0000\u042d\u042b"+
		"\u0001\u0000\u0000\u0000\u042e\u0431\u0001\u0000\u0000\u0000\u042f\u042d"+
		"\u0001\u0000\u0000\u0000\u042f\u0430\u0001\u0000\u0000\u0000\u0430\u00a1"+
		"\u0001\u0000\u0000\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0432\u0433"+
		"\u0003\u011e\u008f\u0000\u0433\u0434\u0003\u00aeW\u0000\u0434\u00a3\u0001"+
		"\u0000\u0000\u0000\u0435\u0439\u0005V\u0000\u0000\u0436\u0438\u00030\u0018"+
		"\u0000\u0437\u0436\u0001\u0000\u0000\u0000\u0438\u043b\u0001\u0000\u0000"+
		"\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000"+
		"\u0000\u043a\u043c\u0001\u0000\u0000\u0000\u043b\u0439\u0001\u0000\u0000"+
		"\u0000\u043c\u043d\u0005W\u0000\u0000\u043d\u00a5\u0001\u0000\u0000\u0000"+
		"\u043e\u0448\u0005V\u0000\u0000\u043f\u0449\u0001\u0000\u0000\u0000\u0440"+
		"\u0445\u0003\u0002\u0001\u0000\u0441\u0442\u0005\u0002\u0000\u0000\u0442"+
		"\u0444\u0003\u0002\u0001\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0444"+
		"\u0447\u0001\u0000\u0000\u0000\u0445\u0443\u0001\u0000\u0000\u0000\u0445"+
		"\u0446\u0001\u0000\u0000\u0000\u0446\u0449\u0001\u0000\u0000\u0000\u0447"+
		"\u0445\u0001\u0000\u0000\u0000\u0448\u043f\u0001\u0000\u0000\u0000\u0448"+
		"\u0440\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000\u0000\u044a"+
		"\u0450\u0005W\u0000\u0000\u044b\u044c\u0005V\u0000\u0000\u044c\u044d\u0003"+
		"\u00a8T\u0000\u044d\u044e\u0005W\u0000\u0000\u044e\u0450\u0001\u0000\u0000"+
		"\u0000\u044f\u043e\u0001\u0000\u0000\u0000\u044f\u044b\u0001\u0000\u0000"+
		"\u0000\u0450\u00a7\u0001\u0000\u0000\u0000\u0451\u0452\u0007\u0005\u0000"+
		"\u0000\u0452\u00a9\u0001\u0000\u0000\u0000\u0453\u0454\u0003\u00acV\u0000"+
		"\u0454\u0455\u0005Z\u0000\u0000\u0455\u0459\u0001\u0000\u0000\u0000\u0456"+
		"\u0459\u0003\u00b2Y\u0000\u0457\u0459\u0003\u00b0X\u0000\u0458\u0453\u0001"+
		"\u0000\u0000\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0458\u0457\u0001"+
		"\u0000\u0000\u0000\u0459\u00ab\u0001\u0000\u0000\u0000\u045a\u045c\u0003"+
		"\u0018\f\u0000\u045b\u045a\u0001\u0000\u0000\u0000\u045c\u045f\u0001\u0000"+
		"\u0000\u0000\u045d\u045b\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000"+
		"\u0000\u0000\u045e\u0468\u0001\u0000\u0000\u0000\u045f\u045d\u0001\u0000"+
		"\u0000\u0000\u0460\u0461\u0003\u011e\u008f\u0000\u0461\u0462\u0003R)\u0000"+
		"\u0462\u0469\u0001\u0000\u0000\u0000\u0463\u0464\u0005?\u0000\u0000\u0464"+
		"\u0465\u0003\u00aeW\u0000\u0465\u0466\u0005]\u0000\u0000\u0466\u0467\u0003"+
		"\u00f4z\u0000\u0467\u0469\u0001\u0000\u0000\u0000\u0468\u0460\u0001\u0000"+
		"\u0000\u0000\u0468\u0463\u0001\u0000\u0000\u0000\u0469\u00ad\u0001\u0000"+
		"\u0000\u0000\u046a\u046b\u0007\u0006\u0000\u0000\u046b\u00af\u0001\u0000"+
		"\u0000\u0000\u046c\u046e\u0003\u0016\u000b\u0000\u046d\u046c\u0001\u0000"+
		"\u0000\u0000\u046e\u0471\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000"+
		"\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0475\u0001\u0000"+
		"\u0000\u0000\u0471\u046f\u0001\u0000\u0000\u0000\u0472\u0476\u0003\u001a"+
		"\r\u0000\u0473\u0476\u0003*\u0015\u0000\u0474\u0476\u0003\u009cN\u0000"+
		"\u0475\u0472\u0001\u0000\u0000\u0000\u0475\u0473\u0001\u0000\u0000\u0000"+
		"\u0475\u0474\u0001\u0000\u0000\u0000\u0476\u0479\u0001\u0000\u0000\u0000"+
		"\u0477\u0479\u0005Z\u0000\u0000\u0478\u046f\u0001\u0000\u0000\u0000\u0478"+
		"\u0477\u0001\u0000\u0000\u0000\u0479\u00b1\u0001\u0000\u0000\u0000\u047a"+
		"\u0491\u0003\u00a6S\u0000\u047b\u0491\u0003\u00b4Z\u0000\u047c\u0491\u0003"+
		"\u00b6[\u0000\u047d\u0491\u0003\u00b8\\\u0000\u047e\u0491\u0003\u00ba"+
		"]\u0000\u047f\u0491\u0003\u00bc^\u0000\u0480\u0491\u0003\u00be_\u0000"+
		"\u0481\u0491\u0003\u00c0`\u0000\u0482\u0491\u0003\u00c2a\u0000\u0483\u0491"+
		"\u0003\u00c4b\u0000\u0484\u0491\u0003\u00c6c\u0000\u0485\u0491\u0003\u00c8"+
		"d\u0000\u0486\u0491\u0003\u00cae\u0000\u0487\u0491\u0003\u00ccf\u0000"+
		"\u0488\u0491\u0003\u00ceg\u0000\u0489\u0491\u0003\u00d0h\u0000\u048a\u048b"+
		"\u0003\u00f4z\u0000\u048b\u048c\u0005Z\u0000\u0000\u048c\u0491\u0001\u0000"+
		"\u0000\u0000\u048d\u0491\u0003\u00d2i\u0000\u048e\u0491\u0003\u00d4j\u0000"+
		"\u048f\u0491\u0003\u00d6k\u0000\u0490\u047a\u0001\u0000\u0000\u0000\u0490"+
		"\u047b\u0001\u0000\u0000\u0000\u0490\u047c\u0001\u0000\u0000\u0000\u0490"+
		"\u047d\u0001\u0000\u0000\u0000\u0490\u047e\u0001\u0000\u0000\u0000\u0490"+
		"\u047f\u0001\u0000\u0000\u0000\u0490\u0480\u0001\u0000\u0000\u0000\u0490"+
		"\u0481\u0001\u0000\u0000\u0000\u0490\u0482\u0001\u0000\u0000\u0000\u0490"+
		"\u0483\u0001\u0000\u0000\u0000\u0490\u0484\u0001\u0000\u0000\u0000\u0490"+
		"\u0485\u0001\u0000\u0000\u0000\u0490\u0486\u0001\u0000\u0000\u0000\u0490"+
		"\u0487\u0001\u0000\u0000\u0000\u0490\u0488\u0001\u0000\u0000\u0000\u0490"+
		"\u0489\u0001\u0000\u0000\u0000\u0490\u048a\u0001\u0000\u0000\u0000\u0490"+
		"\u048d\u0001\u0000\u0000\u0000\u0490\u048e\u0001\u0000\u0000\u0000\u0490"+
		"\u048f\u0001\u0000\u0000\u0000\u0491\u00b3\u0001\u0000\u0000\u0000\u0492"+
		"\u0493\u0005\u0004\u0000\u0000\u0493\u0496\u0003\u00f4z\u0000\u0494\u0495"+
		"\u0005c\u0000\u0000\u0495\u0497\u0003\u00f4z\u0000\u0496\u0494\u0001\u0000"+
		"\u0000\u0000\u0496\u0497\u0001\u0000\u0000\u0000\u0497\u0498\u0001\u0000"+
		"\u0000\u0000\u0498\u0499\u0005Z\u0000\u0000\u0499\u00b5\u0001\u0000\u0000"+
		"\u0000\u049a\u049b\u0005\u0018\u0000\u0000\u049b\u049c\u0003\u00eew\u0000"+
		"\u049c\u049f\u0003\u00a6S\u0000\u049d\u049e\u0005\u0011\u0000\u0000\u049e"+
		"\u04a0\u0003\u00a6S\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u049f\u04a0"+
		"\u0001\u0000\u0000\u0000\u04a0\u00b7\u0001\u0000\u0000\u0000\u04a1\u04a2"+
		"\u0005\u0017\u0000\u0000\u04a2\u04a3\u0005T\u0000\u0000\u04a3\u04a4\u0003"+
		"\u00e8t\u0000\u04a4\u04a5\u0005U\u0000\u0000\u04a5\u04a6\u0003\u00a6S"+
		"\u0000\u04a6\u00b9\u0001\u0000\u0000\u0000\u04a7\u04a8\u00054\u0000\u0000"+
		"\u04a8\u04a9\u0003\u00eew\u0000\u04a9\u04aa\u0003\u00a6S\u0000\u04aa\u00bb"+
		"\u0001\u0000\u0000\u0000\u04ab\u04ac\u0005\u000f\u0000\u0000\u04ac\u04ad"+
		"\u0003\u00a6S\u0000\u04ad\u04ae\u00054\u0000\u0000\u04ae\u04af\u0003\u00ee"+
		"w\u0000\u04af\u04b0\u0005Z\u0000\u0000\u04b0\u00bd\u0001\u0000\u0000\u0000"+
		"\u04b1\u04b2\u00051\u0000\u0000\u04b2\u04bc\u0003\u00a6S\u0000\u04b3\u04b5"+
		"\u0003\u00d8l\u0000\u04b4\u04b3\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001"+
		"\u0000\u0000\u0000\u04b6\u04b4\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b9\u0001\u0000\u0000\u0000\u04b8\u04ba\u0003"+
		"\u00dcn\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000"+
		"\u0000\u0000\u04ba\u04bd\u0001\u0000\u0000\u0000\u04bb\u04bd\u0003\u00dc"+
		"n\u0000\u04bc\u04b4\u0001\u0000\u0000\u0000\u04bc\u04bb\u0001\u0000\u0000"+
		"\u0000\u04bd\u00bf\u0001\u0000\u0000\u0000\u04be\u04bf\u00051\u0000\u0000"+
		"\u04bf\u04c0\u0003\u00deo\u0000\u04c0\u04c4\u0003\u00a6S\u0000\u04c1\u04c3"+
		"\u0003\u00d8l\u0000\u04c2\u04c1\u0001\u0000\u0000\u0000\u04c3\u04c6\u0001"+
		"\u0000\u0000\u0000\u04c4\u04c2\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001"+
		"\u0000\u0000\u0000\u04c5\u04c8\u0001\u0000\u0000\u0000\u04c6\u04c4\u0001"+
		"\u0000\u0000\u0000\u04c7\u04c9\u0003\u00dcn\u0000\u04c8\u04c7\u0001\u0000"+
		"\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9\u00c1\u0001\u0000"+
		"\u0000\u0000\u04ca\u04cb\u0005+\u0000\u0000\u04cb\u04cc\u0003\u00eew\u0000"+
		"\u04cc\u04cd\u0003\u00a6S\u0000\u04cd\u00c3\u0001\u0000\u0000\u0000\u04ce"+
		"\u04cf\u0005,\u0000\u0000\u04cf\u04d0\u0003\u00eew\u0000\u04d0\u04d1\u0003"+
		"\u00a6S\u0000\u04d1\u00c5\u0001\u0000\u0000\u0000\u04d2\u04d4\u0005&\u0000"+
		"\u0000\u04d3\u04d5\u0003\u00f4z\u0000\u04d4\u04d3\u0001\u0000\u0000\u0000"+
		"\u04d4\u04d5\u0001\u0000\u0000\u0000\u04d5\u04d6\u0001\u0000\u0000\u0000"+
		"\u04d6\u04d7\u0005Z\u0000\u0000\u04d7\u00c7\u0001\u0000\u0000\u0000\u04d8"+
		"\u04d9\u0005.\u0000\u0000\u04d9\u04da\u0003\u00f4z\u0000\u04da\u04db\u0005"+
		"Z\u0000\u0000\u04db\u00c9\u0001\u0000\u0000\u0000\u04dc\u04de\u0005\u0006"+
		"\u0000\u0000\u04dd\u04df\u0003\u00aeW\u0000\u04de\u04dd\u0001\u0000\u0000"+
		"\u0000\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000\u0000"+
		"\u0000\u04e0\u04e1\u0005Z\u0000\u0000\u04e1\u00cb\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e4\u0005\r\u0000\u0000\u04e3\u04e5\u0003\u00aeW\u0000\u04e4"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5"+
		"\u04e6\u0001\u0000\u0000\u0000\u04e6\u04e7\u0005Z\u0000\u0000\u04e7\u00cd"+
		"\u0001\u0000\u0000\u0000\u04e8\u04e9\u0005@\u0000\u0000\u04e9\u04ea\u0003"+
		"\u00f4z\u0000\u04ea\u04eb\u0005Z\u0000\u0000\u04eb\u00cf\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ed\u0005Z\u0000\u0000\u04ed\u00d1\u0001\u0000\u0000\u0000"+
		"\u04ee\u04f0\u0003\u0100\u0080\u0000\u04ef\u04f1\u0005Z\u0000\u0000\u04f0"+
		"\u04ef\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1"+
		"\u00d3\u0001\u0000\u0000\u0000\u04f2\u04f3\u0003\u00aeW\u0000\u04f3\u04f4"+
		"\u0005c\u0000\u0000\u04f4\u04f5\u0003\u00b2Y\u0000\u04f5\u00d5\u0001\u0000"+
		"\u0000\u0000\u04f6\u04f7\u0005\b\u0000\u0000\u04f7\u04f8\u0003\u00f4z"+
		"\u0000\u04f8\u04f9\u0005c\u0000\u0000\u04f9\u04fa\u0003\u00a6S\u0000\u04fa"+
		"\u00d7\u0001\u0000\u0000\u0000\u04fb\u04fc\u0005\t\u0000\u0000\u04fc\u0500"+
		"\u0005T\u0000\u0000\u04fd\u04ff\u0003\u0018\f\u0000\u04fe\u04fd\u0001"+
		"\u0000\u0000\u0000\u04ff\u0502\u0001\u0000\u0000\u0000\u0500\u04fe\u0001"+
		"\u0000\u0000\u0000\u0500\u0501\u0001\u0000\u0000\u0000\u0501\u0503\u0001"+
		"\u0000\u0000\u0000\u0502\u0500\u0001\u0000\u0000\u0000\u0503\u0504\u0003"+
		"\u00dam\u0000\u0504\u0505\u0003\u00aeW\u0000\u0505\u0506\u0005U\u0000"+
		"\u0000\u0506\u0507\u0003\u00a6S\u0000\u0507\u00d9\u0001\u0000\u0000\u0000"+
		"\u0508\u050d\u0003p8\u0000\u0509\u050a\u0005q\u0000\u0000\u050a\u050c"+
		"\u0003p8\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050c\u050f\u0001\u0000"+
		"\u0000\u0000\u050d\u050b\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000"+
		"\u0000\u0000\u050e\u00db\u0001\u0000\u0000\u0000\u050f\u050d\u0001\u0000"+
		"\u0000\u0000\u0510\u0511\u0005\u0015\u0000\u0000\u0511\u0512\u0003\u00a6"+
		"S\u0000\u0512\u00dd\u0001\u0000\u0000\u0000\u0513\u0514\u0005T\u0000\u0000"+
		"\u0514\u0516\u0003\u00e0p\u0000\u0515\u0517\u0005Z\u0000\u0000\u0516\u0515"+
		"\u0001\u0000\u0000\u0000\u0516\u0517\u0001\u0000\u0000\u0000\u0517\u0518"+
		"\u0001\u0000\u0000\u0000\u0518\u0519\u0005U\u0000\u0000\u0519\u00df\u0001"+
		"\u0000\u0000\u0000\u051a\u051f\u0003\u00e2q\u0000\u051b\u051c\u0005Z\u0000"+
		"\u0000\u051c\u051e\u0003\u00e2q\u0000\u051d\u051b\u0001\u0000\u0000\u0000"+
		"\u051e\u0521\u0001\u0000\u0000\u0000\u051f\u051d\u0001\u0000\u0000\u0000"+
		"\u051f\u0520\u0001\u0000\u0000\u0000\u0520\u00e1\u0001\u0000\u0000\u0000"+
		"\u0521\u051f\u0001\u0000\u0000\u0000\u0522\u0524\u0003\u0018\f\u0000\u0523"+
		"\u0522\u0001\u0000\u0000\u0000\u0524\u0527\u0001\u0000\u0000\u0000\u0525"+
		"\u0523\u0001\u0000\u0000\u0000\u0525\u0526\u0001\u0000\u0000\u0000\u0526"+
		"\u052d\u0001\u0000\u0000\u0000\u0527\u0525\u0001\u0000\u0000\u0000\u0528"+
		"\u0529\u0003\\.\u0000\u0529\u052a\u0003V+\u0000\u052a\u052e\u0001\u0000"+
		"\u0000\u0000\u052b\u052c\u0005?\u0000\u0000\u052c\u052e\u0003\u00aeW\u0000"+
		"\u052d\u0528\u0001\u0000\u0000\u0000\u052d\u052b\u0001\u0000\u0000\u0000"+
		"\u052e\u052f\u0001\u0000\u0000\u0000\u052f\u0530\u0005]\u0000\u0000\u0530"+
		"\u0531\u0003\u00f4z\u0000\u0531\u0534\u0001\u0000\u0000\u0000\u0532\u0534"+
		"\u0003\u00aeW\u0000\u0533\u0525\u0001\u0000\u0000\u0000\u0533\u0532\u0001"+
		"\u0000\u0000\u0000\u0534\u00e3\u0001\u0000\u0000\u0000\u0535\u0537\u0003"+
		"\u00e6s\u0000\u0536\u0535\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000"+
		"\u0000\u0000\u0538\u0536\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000"+
		"\u0000\u0000\u0539\u053b\u0001\u0000\u0000\u0000\u053a\u053c\u0003\u00aa"+
		"U\u0000\u053b\u053a\u0001\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000"+
		"\u0000\u053d\u053b\u0001\u0000\u0000\u0000\u053d\u053e\u0001\u0000\u0000"+
		"\u0000\u053e\u00e5\u0001\u0000\u0000\u0000\u053f\u0545\u0005\b\u0000\u0000"+
		"\u0540\u0546\u0003\u00f4z\u0000\u0541\u0546\u0005\u0086\u0000\u0000\u0542"+
		"\u0543\u0003\u011e\u008f\u0000\u0543\u0544\u0003\u00aeW\u0000\u0544\u0546"+
		"\u0001\u0000\u0000\u0000\u0545\u0540\u0001\u0000\u0000\u0000\u0545\u0541"+
		"\u0001\u0000\u0000\u0000\u0545\u0542\u0001\u0000\u0000\u0000\u0546\u0547"+
		"\u0001\u0000\u0000\u0000\u0547\u054b\u0005c\u0000\u0000\u0548\u0549\u0005"+
		"\u000e\u0000\u0000\u0549\u054b\u0005c\u0000\u0000\u054a\u053f\u0001\u0000"+
		"\u0000\u0000\u054a\u0548\u0001\u0000\u0000\u0000\u054b\u00e7\u0001\u0000"+
		"\u0000\u0000\u054c\u0559\u0003\u00ecv\u0000\u054d\u054f\u0003\u00eau\u0000"+
		"\u054e\u054d\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000"+
		"\u054f\u0550\u0001\u0000\u0000\u0000\u0550\u0552\u0005Z\u0000\u0000\u0551"+
		"\u0553\u0003\u00f4z\u0000\u0552\u0551\u0001\u0000\u0000\u0000\u0552\u0553"+
		"\u0001\u0000\u0000\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0556"+
		"\u0005Z\u0000\u0000\u0555\u0557\u0003\u00f0x\u0000\u0556\u0555\u0001\u0000"+
		"\u0000\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557\u0559\u0001\u0000"+
		"\u0000\u0000\u0558\u054c\u0001\u0000\u0000\u0000\u0558\u054e\u0001\u0000"+
		"\u0000\u0000\u0559\u00e9\u0001\u0000\u0000\u0000\u055a\u055d\u0003\u00ac"+
		"V\u0000\u055b\u055d\u0003\u00f0x\u0000\u055c\u055a\u0001\u0000\u0000\u0000"+
		"\u055c\u055b\u0001\u0000\u0000\u0000\u055d\u00eb\u0001\u0000\u0000\u0000"+
		"\u055e\u0560\u0003\u0018\f\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u0560"+
		"\u0563\u0001\u0000\u0000\u0000\u0561\u055f\u0001\u0000\u0000\u0000\u0561"+
		"\u0562\u0001\u0000\u0000\u0000\u0562\u0566\u0001\u0000\u0000\u0000\u0563"+
		"\u0561\u0001\u0000\u0000\u0000\u0564\u0567\u0003\u011e\u008f\u0000\u0565"+
		"\u0567\u0005?\u0000\u0000\u0566\u0564\u0001\u0000\u0000\u0000\u0566\u0565"+
		"\u0001\u0000\u0000\u0000\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u0569"+
		"\u0003V+\u0000\u0569\u056a\u0005c\u0000\u0000\u056a\u056b\u0003\u00f4"+
		"z\u0000\u056b\u00ed\u0001\u0000\u0000\u0000\u056c\u056e\u0005T\u0000\u0000"+
		"\u056d\u056f\u0003\u00f4z\u0000\u056e\u056d\u0001\u0000\u0000\u0000\u056e"+
		"\u056f\u0001\u0000\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570"+
		"\u0571\u0005U\u0000\u0000\u0571\u00ef\u0001\u0000\u0000\u0000\u0572\u0577"+
		"\u0003\u00f4z\u0000\u0573\u0574\u0005[\u0000\u0000\u0574\u0576\u0003\u00f4"+
		"z\u0000\u0575\u0573\u0001\u0000\u0000\u0000\u0576\u0579\u0001\u0000\u0000"+
		"\u0000\u0577\u0575\u0001\u0000\u0000\u0000\u0577\u0578\u0001\u0000\u0000"+
		"\u0000\u0578\u00f1\u0001\u0000\u0000\u0000\u0579\u0577\u0001\u0000\u0000"+
		"\u0000\u057a\u057b\u0003\u00aeW\u0000\u057b\u057d\u0005T\u0000\u0000\u057c"+
		"\u057e\u0003\u00f0x\u0000\u057d\u057c\u0001\u0000\u0000\u0000\u057d\u057e"+
		"\u0001\u0000\u0000\u0000\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0580"+
		"\u0005U\u0000\u0000\u0580\u058e\u0001\u0000\u0000\u0000\u0581\u0582\u0005"+
		"-\u0000\u0000\u0582\u0584\u0005T\u0000\u0000\u0583\u0585\u0003\u00f0x"+
		"\u0000\u0584\u0583\u0001\u0000\u0000\u0000\u0584\u0585\u0001\u0000\u0000"+
		"\u0000\u0585\u0586\u0001\u0000\u0000\u0000\u0586\u058e\u0005U\u0000\u0000"+
		"\u0587\u0588\u0005*\u0000\u0000\u0588\u058a\u0005T\u0000\u0000\u0589\u058b"+
		"\u0003\u00f0x\u0000\u058a\u0589\u0001\u0000\u0000\u0000\u058a\u058b\u0001"+
		"\u0000\u0000\u0000\u058b\u058c\u0001\u0000\u0000\u0000\u058c\u058e\u0005"+
		"U\u0000\u0000\u058d\u057a\u0001\u0000\u0000\u0000\u058d\u0581\u0001\u0000"+
		"\u0000\u0000\u058d\u0587\u0001\u0000\u0000\u0000\u058e\u00f3\u0001\u0000"+
		"\u0000\u0000\u058f\u0590\u0006z\uffff\uffff\u0000\u0590\u05bd\u0003\u00fe"+
		"\u007f\u0000\u0591\u05bd\u0003\u00f2y\u0000\u0592\u0593\u0005!\u0000\u0000"+
		"\u0593\u05bd\u0003\u010a\u0085\u0000\u0594\u0598\u0005T\u0000\u0000\u0595"+
		"\u0597\u0003z=\u0000\u0596\u0595\u0001\u0000\u0000\u0000\u0597\u059a\u0001"+
		"\u0000\u0000\u0000\u0598\u0596\u0001\u0000\u0000\u0000\u0598\u0599\u0001"+
		"\u0000\u0000\u0000\u0599\u059b\u0001\u0000\u0000\u0000\u059a\u0598\u0001"+
		"\u0000\u0000\u0000\u059b\u05a0\u0003\u011e\u008f\u0000\u059c\u059d\u0005"+
		"p\u0000\u0000\u059d\u059f\u0003\u011e\u008f\u0000\u059e\u059c\u0001\u0000"+
		"\u0000\u0000\u059f\u05a2\u0001\u0000\u0000\u0000\u05a0\u059e\u0001\u0000"+
		"\u0000\u0000\u05a0\u05a1\u0001\u0000\u0000\u0000\u05a1\u05a3\u0001\u0000"+
		"\u0000\u0000\u05a2\u05a0\u0001\u0000\u0000\u0000\u05a3\u05a4\u0005U\u0000"+
		"\u0000\u05a4\u05a5\u0003\u00f4z\u0016\u05a5\u05bd\u0001\u0000\u0000\u0000"+
		"\u05a6\u05a7\u0007\u0007\u0000\u0000\u05a7\u05bd\u0003\u00f4z\u0014\u05a8"+
		"\u05a9\u0007\b\u0000\u0000\u05a9\u05bd\u0003\u00f4z\u0013\u05aa\u05bd"+
		"\u0003\u00f8|\u0000\u05ab\u05bd\u0003\u0100\u0080\u0000\u05ac\u05ad\u0003"+
		"\u011e\u008f\u0000\u05ad\u05b3\u0005\u0080\u0000\u0000\u05ae\u05b0\u0003"+
		"\u0122\u0091\u0000\u05af\u05ae\u0001\u0000\u0000\u0000\u05af\u05b0\u0001"+
		"\u0000\u0000\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000\u05b1\u05b4\u0003"+
		"\u00aeW\u0000\u05b2\u05b4\u0005!\u0000\u0000\u05b3\u05af\u0001\u0000\u0000"+
		"\u0000\u05b3\u05b2\u0001\u0000\u0000\u0000\u05b4\u05bd\u0001\u0000\u0000"+
		"\u0000\u05b5\u05b6\u0003\u0108\u0084\u0000\u05b6\u05b8\u0005\u0080\u0000"+
		"\u0000\u05b7\u05b9\u0003\u0122\u0091\u0000\u05b8\u05b7\u0001\u0000\u0000"+
		"\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9\u05ba\u0001\u0000\u0000"+
		"\u0000\u05ba\u05bb\u0005!\u0000\u0000\u05bb\u05bd\u0001\u0000\u0000\u0000"+
		"\u05bc\u058f\u0001\u0000\u0000\u0000\u05bc\u0591\u0001\u0000\u0000\u0000"+
		"\u05bc\u0592\u0001\u0000\u0000\u0000\u05bc\u0594\u0001\u0000\u0000\u0000"+
		"\u05bc\u05a6\u0001\u0000\u0000\u0000\u05bc\u05a8\u0001\u0000\u0000\u0000"+
		"\u05bc\u05aa\u0001\u0000\u0000\u0000\u05bc\u05ab\u0001\u0000\u0000\u0000"+
		"\u05bc\u05ac\u0001\u0000\u0000\u0000\u05bc\u05b5\u0001\u0000\u0000\u0000"+
		"\u05bd\u0611\u0001\u0000\u0000\u0000\u05be\u05bf\n\u0012\u0000\u0000\u05bf"+
		"\u05c0\u0007\t\u0000\u0000\u05c0\u0610\u0003\u00f4z\u0013\u05c1\u05c2"+
		"\n\u0011\u0000\u0000\u05c2\u05c3\u0007\n\u0000\u0000\u05c3\u0610\u0003"+
		"\u00f4z\u0012\u05c4\u05cc\n\u0010\u0000\u0000\u05c5\u05c6\u0005_\u0000"+
		"\u0000\u05c6\u05cd\u0005_\u0000\u0000\u05c7\u05c8\u0005^\u0000\u0000\u05c8"+
		"\u05c9\u0005^\u0000\u0000\u05c9\u05cd\u0005^\u0000\u0000\u05ca\u05cb\u0005"+
		"^\u0000\u0000\u05cb\u05cd\u0005^\u0000\u0000\u05cc\u05c5\u0001\u0000\u0000"+
		"\u0000\u05cc\u05c7\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000\u0000"+
		"\u0000\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u0610\u0003\u00f4z\u0011"+
		"\u05cf\u05d0\n\u000f\u0000\u0000\u05d0\u05d1\u0007\u000b\u0000\u0000\u05d1"+
		"\u0610\u0003\u00f4z\u0010\u05d2\u05d3\n\r\u0000\u0000\u05d3\u05d4\u0007"+
		"\f\u0000\u0000\u05d4\u0610\u0003\u00f4z\u000e\u05d5\u05d6\n\f\u0000\u0000"+
		"\u05d6\u05d7\u0005p\u0000\u0000\u05d7\u0610\u0003\u00f4z\r\u05d8\u05d9"+
		"\n\u000b\u0000\u0000\u05d9\u05da\u0005r\u0000\u0000\u05da\u0610\u0003"+
		"\u00f4z\f\u05db\u05dc\n\n\u0000\u0000\u05dc\u05dd\u0005q\u0000\u0000\u05dd"+
		"\u0610\u0003\u00f4z\u000b\u05de\u05df\n\t\u0000\u0000\u05df\u05e0\u0005"+
		"h\u0000\u0000\u05e0\u0610\u0003\u00f4z\n\u05e1\u05e2\n\b\u0000\u0000\u05e2"+
		"\u05e3\u0005i\u0000\u0000\u05e3\u0610\u0003\u00f4z\t\u05e4\u05e5\n\u0007"+
		"\u0000\u0000\u05e5\u05e6\u0005b\u0000\u0000\u05e6\u05e7\u0003\u00f4z\u0000"+
		"\u05e7\u05e8\u0005c\u0000\u0000\u05e8\u05e9\u0003\u00f4z\u0007\u05e9\u0610"+
		"\u0001\u0000\u0000\u0000\u05ea\u05eb\n\u0006\u0000\u0000\u05eb\u05ec\u0007"+
		"\r\u0000\u0000\u05ec\u0610\u0003\u00f4z\u0006\u05ed\u05ee\n\u001a\u0000"+
		"\u0000\u05ee\u05fa\u0005\\\u0000\u0000\u05ef\u05fb\u0003\u00aeW\u0000"+
		"\u05f0\u05fb\u0003\u00f2y\u0000\u05f1\u05fb\u0005-\u0000\u0000\u05f2\u05f4"+
		"\u0005!\u0000\u0000\u05f3\u05f5\u0003\u011a\u008d\u0000\u05f4\u05f3\u0001"+
		"\u0000\u0000\u0000\u05f4\u05f5\u0001\u0000\u0000\u0000\u05f5\u05f6\u0001"+
		"\u0000\u0000\u0000\u05f6\u05fb\u0003\u010e\u0087\u0000\u05f7\u05f8\u0005"+
		"*\u0000\u0000\u05f8\u05fb\u0003\u0124\u0092\u0000\u05f9\u05fb\u0003\u0114"+
		"\u008a\u0000\u05fa\u05ef\u0001\u0000\u0000\u0000\u05fa\u05f0\u0001\u0000"+
		"\u0000\u0000\u05fa\u05f1\u0001\u0000\u0000\u0000\u05fa\u05f2\u0001\u0000"+
		"\u0000\u0000\u05fa\u05f7\u0001\u0000\u0000\u0000\u05fa\u05f9\u0001\u0000"+
		"\u0000\u0000\u05fb\u0610\u0001\u0000\u0000\u0000\u05fc\u05fd\n\u0019\u0000"+
		"\u0000\u05fd\u05fe\u0005X\u0000\u0000\u05fe\u05ff\u0003\u00f4z\u0000\u05ff"+
		"\u0600\u0005Y\u0000\u0000\u0600\u0610\u0001\u0000\u0000\u0000\u0601\u0602"+
		"\n\u0015\u0000\u0000\u0602\u0610\u0007\u000e\u0000\u0000\u0603\u0604\n"+
		"\u000e\u0000\u0000\u0604\u0607\u0005\u001c\u0000\u0000\u0605\u0608\u0003"+
		"\u011e\u008f\u0000\u0606\u0608\u0003\u00f6{\u0000\u0607\u0605\u0001\u0000"+
		"\u0000\u0000\u0607\u0606\u0001\u0000\u0000\u0000\u0608\u0610\u0001\u0000"+
		"\u0000\u0000\u0609\u060a\n\u0003\u0000\u0000\u060a\u060c\u0005\u0080\u0000"+
		"\u0000\u060b\u060d\u0003\u0122\u0091\u0000\u060c\u060b\u0001\u0000\u0000"+
		"\u0000\u060c\u060d\u0001\u0000\u0000\u0000\u060d\u060e\u0001\u0000\u0000"+
		"\u0000\u060e\u0610\u0003\u00aeW\u0000\u060f\u05be\u0001\u0000\u0000\u0000"+
		"\u060f\u05c1\u0001\u0000\u0000\u0000\u060f\u05c4\u0001\u0000\u0000\u0000"+
		"\u060f\u05cf\u0001\u0000\u0000\u0000\u060f\u05d2\u0001\u0000\u0000\u0000"+
		"\u060f\u05d5\u0001\u0000\u0000\u0000\u060f\u05d8\u0001\u0000\u0000\u0000"+
		"\u060f\u05db\u0001\u0000\u0000\u0000\u060f\u05de\u0001\u0000\u0000\u0000"+
		"\u060f\u05e1\u0001\u0000\u0000\u0000\u060f\u05e4\u0001\u0000\u0000\u0000"+
		"\u060f\u05ea\u0001\u0000\u0000\u0000\u060f\u05ed\u0001\u0000\u0000\u0000"+
		"\u060f\u05fc\u0001\u0000\u0000\u0000\u060f\u0601\u0001\u0000\u0000\u0000"+
		"\u060f\u0603\u0001\u0000\u0000\u0000\u060f\u0609\u0001\u0000\u0000\u0000"+
		"\u0610\u0613\u0001\u0000\u0000\u0000\u0611\u060f\u0001\u0000\u0000\u0000"+
		"\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u00f5\u0001\u0000\u0000\u0000"+
		"\u0613\u0611\u0001\u0000\u0000\u0000\u0614\u0616\u0003\u0018\f\u0000\u0615"+
		"\u0614\u0001\u0000\u0000\u0000\u0616\u0619\u0001\u0000\u0000\u0000\u0617"+
		"\u0615\u0001\u0000\u0000\u0000\u0617\u0618\u0001\u0000\u0000\u0000\u0618"+
		"\u061a\u0001\u0000\u0000\u0000\u0619\u0617\u0001\u0000\u0000\u0000\u061a"+
		"\u061e\u0003\u011e\u008f\u0000\u061b\u061d\u0003z=\u0000\u061c\u061b\u0001"+
		"\u0000\u0000\u0000\u061d\u0620\u0001\u0000\u0000\u0000\u061e\u061c\u0001"+
		"\u0000\u0000\u0000\u061e\u061f\u0001\u0000\u0000\u0000\u061f\u0621\u0001"+
		"\u0000\u0000\u0000\u0620\u061e\u0001\u0000\u0000\u0000\u0621\u0622\u0003"+
		"\u00aeW\u0000\u0622\u00f7\u0001\u0000\u0000\u0000\u0623\u0624\u0003\u00fa"+
		"}\u0000\u0624\u0625\u0005\u007f\u0000\u0000\u0625\u0626\u0003\u00fc~\u0000"+
		"\u0626\u00f9\u0001\u0000\u0000\u0000\u0627\u063e\u0003\u00aeW\u0000\u0628"+
		"\u062a\u0005T\u0000\u0000\u0629\u062b\u0003f3\u0000\u062a\u0629\u0001"+
		"\u0000\u0000\u0000\u062a\u062b\u0001\u0000\u0000\u0000\u062b\u062c\u0001"+
		"\u0000\u0000\u0000\u062c\u063e\u0005U\u0000\u0000\u062d\u062e\u0005T\u0000"+
		"\u0000\u062e\u0633\u0003\u00aeW\u0000\u062f\u0630\u0005[\u0000\u0000\u0630"+
		"\u0632\u0003\u00aeW\u0000\u0631\u062f\u0001\u0000\u0000\u0000\u0632\u0635"+
		"\u0001\u0000\u0000\u0000\u0633\u0631\u0001\u0000\u0000\u0000\u0633\u0634"+
		"\u0001\u0000\u0000\u0000\u0634\u0636\u0001\u0000\u0000\u0000\u0635\u0633"+
		"\u0001\u0000\u0000\u0000\u0636\u0637\u0005U\u0000\u0000\u0637\u063e\u0001"+
		"\u0000\u0000\u0000\u0638\u063a\u0005T\u0000\u0000\u0639\u063b\u0003l6"+
		"\u0000\u063a\u0639\u0001\u0000\u0000\u0000\u063a\u063b\u0001\u0000\u0000"+
		"\u0000\u063b\u063c\u0001\u0000\u0000\u0000\u063c\u063e\u0005U\u0000\u0000"+
		"\u063d\u0627\u0001\u0000\u0000\u0000\u063d\u0628\u0001\u0000\u0000\u0000"+
		"\u063d\u062d\u0001\u0000\u0000\u0000\u063d\u0638\u0001\u0000\u0000\u0000"+
		"\u063e\u00fb\u0001\u0000\u0000\u0000\u063f\u0642\u0003\u00f4z\u0000\u0640"+
		"\u0642\u0003\u00a6S\u0000\u0641\u063f\u0001\u0000\u0000\u0000\u0641\u0640"+
		"\u0001\u0000\u0000\u0000\u0642\u00fd\u0001\u0000\u0000\u0000\u0643\u0644"+
		"\u0005T\u0000\u0000\u0644\u0645\u0003\u00f4z\u0000\u0645\u0646\u0005U"+
		"\u0000\u0000\u0646\u0656\u0001\u0000\u0000\u0000\u0647\u0656\u0005-\u0000"+
		"\u0000\u0648\u0656\u0005*\u0000\u0000\u0649\u0656\u0003r9\u0000\u064a"+
		"\u0656\u0003\u00aeW\u0000\u064b\u064c\u00038\u001c\u0000\u064c\u064d\u0005"+
		"\\\u0000\u0000\u064d\u064e\u0005\u000b\u0000\u0000\u064e\u0656\u0001\u0000"+
		"\u0000\u0000\u064f\u0653\u0003\u011a\u008d\u0000\u0650\u0654\u0003\u0126"+
		"\u0093\u0000\u0651\u0652\u0005-\u0000\u0000\u0652\u0654\u0003\u0128\u0094"+
		"\u0000\u0653\u0650\u0001\u0000\u0000\u0000\u0653\u0651\u0001\u0000\u0000"+
		"\u0000\u0654\u0656\u0001\u0000\u0000\u0000\u0655\u0643\u0001\u0000\u0000"+
		"\u0000\u0655\u0647\u0001\u0000\u0000\u0000\u0655\u0648\u0001\u0000\u0000"+
		"\u0000\u0655\u0649\u0001\u0000\u0000\u0000\u0655\u064a\u0001\u0000\u0000"+
		"\u0000\u0655\u064b\u0001\u0000\u0000\u0000\u0655\u064f\u0001\u0000\u0000"+
		"\u0000\u0656\u00ff\u0001\u0000\u0000\u0000\u0657\u0658\u0005+\u0000\u0000"+
		"\u0658\u0659\u0003\u00eew\u0000\u0659\u065d\u0005V\u0000\u0000\u065a\u065c"+
		"\u0003\u0102\u0081\u0000\u065b\u065a\u0001\u0000\u0000\u0000\u065c\u065f"+
		"\u0001\u0000\u0000\u0000\u065d\u065b\u0001\u0000\u0000\u0000\u065d\u065e"+
		"\u0001\u0000\u0000\u0000\u065e\u0660\u0001\u0000\u0000\u0000\u065f\u065d"+
		"\u0001\u0000\u0000\u0000\u0660\u0661\u0005W\u0000\u0000\u0661\u0101\u0001"+
		"\u0000\u0000\u0000\u0662\u0666\u0005\b\u0000\u0000\u0663\u0667\u0003\u00f0"+
		"x\u0000\u0664\u0667\u0005S\u0000\u0000\u0665\u0667\u0003\u0104\u0082\u0000"+
		"\u0666\u0663\u0001\u0000\u0000\u0000\u0666\u0664\u0001\u0000\u0000\u0000"+
		"\u0666\u0665\u0001\u0000\u0000\u0000\u0667\u0668\u0001\u0000\u0000\u0000"+
		"\u0668\u0669\u0007\u000f\u0000\u0000\u0669\u066e\u0003\u0106\u0083\u0000"+
		"\u066a\u066b\u0005\u000e\u0000\u0000\u066b\u066c\u0007\u000f\u0000\u0000"+
		"\u066c\u066e\u0003\u0106\u0083\u0000\u066d\u0662\u0001\u0000\u0000\u0000"+
		"\u066d\u066a\u0001\u0000\u0000\u0000\u066e\u0103\u0001\u0000\u0000\u0000"+
		"\u066f\u0670\u0006\u0082\uffff\uffff\u0000\u0670\u0671\u0005T\u0000\u0000"+
		"\u0671\u0672\u0003\u0104\u0082\u0000\u0672\u0673\u0005U\u0000\u0000\u0673"+
		"\u068a\u0001\u0000\u0000\u0000\u0674\u0676\u0003\u0018\f\u0000\u0675\u0674"+
		"\u0001\u0000\u0000\u0000\u0676\u0679\u0001\u0000\u0000\u0000\u0677\u0675"+
		"\u0001\u0000\u0000\u0000\u0677\u0678\u0001\u0000\u0000\u0000\u0678\u067a"+
		"\u0001\u0000\u0000\u0000\u0679\u0677\u0001\u0000\u0000\u0000\u067a\u067e"+
		"\u0003\u011e\u008f\u0000\u067b\u067d\u0003z=\u0000\u067c\u067b\u0001\u0000"+
		"\u0000\u0000\u067d\u0680\u0001\u0000\u0000\u0000\u067e\u067c\u0001\u0000"+
		"\u0000\u0000\u067e\u067f\u0001\u0000\u0000\u0000\u067f\u0681\u0001\u0000"+
		"\u0000\u0000\u0680\u067e\u0001\u0000\u0000\u0000\u0681\u0686\u0003\u00ae"+
		"W\u0000\u0682\u0683\u0005h\u0000\u0000\u0683\u0685\u0003\u00f4z\u0000"+
		"\u0684\u0682\u0001\u0000\u0000\u0000\u0685\u0688\u0001\u0000\u0000\u0000"+
		"\u0686\u0684\u0001\u0000\u0000\u0000\u0686\u0687\u0001\u0000\u0000\u0000"+
		"\u0687\u068a\u0001\u0000\u0000\u0000\u0688\u0686\u0001\u0000\u0000\u0000"+
		"\u0689\u066f\u0001\u0000\u0000\u0000\u0689\u0677\u0001\u0000\u0000\u0000"+
		"\u068a\u0690\u0001\u0000\u0000\u0000\u068b\u068c\n\u0001\u0000\u0000\u068c"+
		"\u068d\u0005h\u0000\u0000\u068d\u068f\u0003\u00f4z\u0000\u068e\u068b\u0001"+
		"\u0000\u0000\u0000\u068f\u0692\u0001\u0000\u0000\u0000\u0690\u068e\u0001"+
		"\u0000\u0000\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u0105\u0001"+
		"\u0000\u0000\u0000\u0692\u0690\u0001\u0000\u0000\u0000\u0693\u069b\u0003"+
		"\u00a6S\u0000\u0694\u0696\u0003\u00aaU\u0000\u0695\u0694\u0001\u0000\u0000"+
		"\u0000\u0696\u0699\u0001\u0000\u0000\u0000\u0697\u0695\u0001\u0000\u0000"+
		"\u0000\u0697\u0698\u0001\u0000\u0000\u0000\u0698\u069b\u0001\u0000\u0000"+
		"\u0000\u0699\u0697\u0001\u0000\u0000\u0000\u069a\u0693\u0001\u0000\u0000"+
		"\u0000\u069a\u0697\u0001\u0000\u0000\u0000\u069b\u0107\u0001\u0000\u0000"+
		"\u0000\u069c\u069d\u0003\\.\u0000\u069d\u069e\u0005\\\u0000\u0000\u069e"+
		"\u06a0\u0001\u0000\u0000\u0000\u069f\u069c\u0001\u0000\u0000\u0000\u069f"+
		"\u06a0\u0001\u0000\u0000\u0000\u06a0\u06a4\u0001\u0000\u0000\u0000\u06a1"+
		"\u06a3\u0003z=\u0000\u06a2\u06a1\u0001\u0000\u0000\u0000\u06a3\u06a6\u0001"+
		"\u0000\u0000\u0000\u06a4\u06a2\u0001\u0000\u0000\u0000\u06a4\u06a5\u0001"+
		"\u0000\u0000\u0000\u06a5\u06a7\u0001\u0000\u0000\u0000\u06a6\u06a4\u0001"+
		"\u0000\u0000\u0000\u06a7\u06a9\u0003\u00aeW\u0000\u06a8\u06aa\u0003\u0122"+
		"\u0091\u0000\u06a9\u06a8\u0001\u0000\u0000\u0000\u06a9\u06aa\u0001\u0000"+
		"\u0000\u0000\u06aa\u0109\u0001\u0000\u0000\u0000\u06ab\u06ac\u0003\u011a"+
		"\u008d\u0000\u06ac\u06ad\u0003\u010c\u0086\u0000\u06ad\u06ae\u0003\u0112"+
		"\u0089\u0000\u06ae\u06b5\u0001\u0000\u0000\u0000\u06af\u06b2\u0003\u010c"+
		"\u0086\u0000\u06b0\u06b3\u0003\u0110\u0088\u0000\u06b1\u06b3\u0003\u0112"+
		"\u0089\u0000\u06b2\u06b0\u0001\u0000\u0000\u0000\u06b2\u06b1\u0001\u0000"+
		"\u0000\u0000\u06b3\u06b5\u0001\u0000\u0000\u0000\u06b4\u06ab\u0001\u0000"+
		"\u0000\u0000\u06b4\u06af\u0001\u0000\u0000\u0000\u06b5\u010b\u0001\u0000"+
		"\u0000\u0000\u06b6\u06b8\u0003\u00aeW\u0000\u06b7\u06b9\u0003\u0116\u008b"+
		"\u0000\u06b8\u06b7\u0001\u0000\u0000\u0000\u06b8\u06b9\u0001\u0000\u0000"+
		"\u0000\u06b9\u06c1\u0001\u0000\u0000\u0000\u06ba\u06bb\u0005\\\u0000\u0000"+
		"\u06bb\u06bd\u0003\u00aeW\u0000\u06bc\u06be\u0003\u0116\u008b\u0000\u06bd"+
		"\u06bc\u0001\u0000\u0000\u0000\u06bd\u06be\u0001\u0000\u0000\u0000\u06be"+
		"\u06c0\u0001\u0000\u0000\u0000\u06bf\u06ba\u0001\u0000\u0000\u0000\u06c0"+
		"\u06c3\u0001\u0000\u0000\u0000\u06c1\u06bf\u0001\u0000\u0000\u0000\u06c1"+
		"\u06c2\u0001\u0000\u0000\u0000\u06c2\u06c6\u0001\u0000\u0000\u0000\u06c3"+
		"\u06c1\u0001\u0000\u0000\u0000\u06c4\u06c6\u0003\u0120\u0090\u0000\u06c5"+
		"\u06b6\u0001\u0000\u0000\u0000\u06c5\u06c4\u0001\u0000\u0000\u0000\u06c6"+
		"\u010d\u0001\u0000\u0000\u0000\u06c7\u06c9\u0003\u00aeW\u0000\u06c8\u06ca"+
		"\u0003\u0118\u008c\u0000\u06c9\u06c8\u0001\u0000\u0000\u0000\u06c9\u06ca"+
		"\u0001\u0000\u0000\u0000\u06ca\u06cb\u0001\u0000\u0000\u0000\u06cb\u06cc"+
		"\u0003\u0112\u0089\u0000\u06cc\u010f\u0001\u0000\u0000\u0000\u06cd\u06e9"+
		"\u0005X\u0000\u0000\u06ce\u06d3\u0005Y\u0000\u0000\u06cf\u06d0\u0005X"+
		"\u0000\u0000\u06d0\u06d2\u0005Y\u0000\u0000\u06d1\u06cf\u0001\u0000\u0000"+
		"\u0000\u06d2\u06d5\u0001\u0000\u0000\u0000\u06d3\u06d1\u0001\u0000\u0000"+
		"\u0000\u06d3\u06d4\u0001\u0000\u0000\u0000\u06d4\u06d6\u0001\u0000\u0000"+
		"\u0000\u06d5\u06d3\u0001\u0000\u0000\u0000\u06d6\u06ea\u0003Z-\u0000\u06d7"+
		"\u06d8\u0003\u00f4z\u0000\u06d8\u06df\u0005Y\u0000\u0000\u06d9\u06da\u0005"+
		"X\u0000\u0000\u06da\u06db\u0003\u00f4z\u0000\u06db\u06dc\u0005Y\u0000"+
		"\u0000\u06dc\u06de\u0001\u0000\u0000\u0000\u06dd\u06d9\u0001\u0000\u0000"+
		"\u0000\u06de\u06e1\u0001\u0000\u0000\u0000\u06df\u06dd\u0001\u0000\u0000"+
		"\u0000\u06df\u06e0\u0001\u0000\u0000\u0000\u06e0\u06e6\u0001\u0000\u0000"+
		"\u0000\u06e1\u06df\u0001\u0000\u0000\u0000\u06e2\u06e3\u0005X\u0000\u0000"+
		"\u06e3\u06e5\u0005Y\u0000\u0000\u06e4\u06e2\u0001\u0000\u0000\u0000\u06e5"+
		"\u06e8\u0001\u0000\u0000\u0000\u06e6\u06e4\u0001\u0000\u0000\u0000\u06e6"+
		"\u06e7\u0001\u0000\u0000\u0000\u06e7\u06ea\u0001\u0000\u0000\u0000\u06e8"+
		"\u06e6\u0001\u0000\u0000\u0000\u06e9\u06ce\u0001\u0000\u0000\u0000\u06e9"+
		"\u06d7\u0001\u0000\u0000\u0000\u06ea\u0111\u0001\u0000\u0000\u0000\u06eb"+
		"\u06ed\u0003\u0128\u0094\u0000\u06ec\u06ee\u0003,\u0016\u0000\u06ed\u06ec"+
		"\u0001\u0000\u0000\u0000\u06ed\u06ee\u0001\u0000\u0000\u0000\u06ee\u0113"+
		"\u0001\u0000\u0000\u0000\u06ef\u06f0\u0003\u011a\u008d\u0000\u06f0\u06f1"+
		"\u0003\u0126\u0093\u0000\u06f1\u0115\u0001\u0000\u0000\u0000\u06f2\u06f3"+
		"\u0005_\u0000\u0000\u06f3\u06f6\u0005^\u0000\u0000\u06f4\u06f6\u0003\u0122"+
		"\u0091\u0000\u06f5\u06f2\u0001\u0000\u0000\u0000\u06f5\u06f4\u0001\u0000"+
		"\u0000\u0000\u06f6\u0117\u0001\u0000\u0000\u0000\u06f7\u06f8\u0005_\u0000"+
		"\u0000\u06f8\u06fb\u0005^\u0000\u0000\u06f9\u06fb\u0003\u011a\u008d\u0000"+
		"\u06fa\u06f7\u0001\u0000\u0000\u0000\u06fa\u06f9\u0001\u0000\u0000\u0000"+
		"\u06fb\u0119\u0001\u0000\u0000\u0000\u06fc\u06fd\u0005_\u0000\u0000\u06fd"+
		"\u06fe\u0003\u011c\u008e\u0000\u06fe\u06ff\u0005^\u0000\u0000\u06ff\u011b"+
		"\u0001\u0000\u0000\u0000\u0700\u0705\u0003\u011e\u008f\u0000\u0701\u0702"+
		"\u0005[\u0000\u0000\u0702\u0704\u0003\u011e\u008f\u0000\u0703\u0701\u0001"+
		"\u0000\u0000\u0000\u0704\u0707\u0001\u0000\u0000\u0000\u0705\u0703\u0001"+
		"\u0000\u0000\u0000\u0705\u0706\u0001\u0000\u0000\u0000\u0706\u011d\u0001"+
		"\u0000\u0000\u0000\u0707\u0705\u0001\u0000\u0000\u0000\u0708\u070a\u0003"+
		"z=\u0000\u0709\u0708\u0001\u0000\u0000\u0000\u070a\u070d\u0001\u0000\u0000"+
		"\u0000\u070b\u0709\u0001\u0000\u0000\u0000\u070b\u070c\u0001\u0000\u0000"+
		"\u0000\u070c\u0710\u0001\u0000\u0000\u0000\u070d\u070b\u0001\u0000\u0000"+
		"\u0000\u070e\u0711\u0003\\.\u0000\u070f\u0711\u0003\u0120\u0090\u0000"+
		"\u0710\u070e\u0001\u0000\u0000\u0000\u0710\u070f\u0001\u0000\u0000\u0000"+
		"\u0711\u071c\u0001\u0000\u0000\u0000\u0712\u0714\u0003z=\u0000\u0713\u0712"+
		"\u0001\u0000\u0000\u0000\u0714\u0717\u0001\u0000\u0000\u0000\u0715\u0713"+
		"\u0001\u0000\u0000\u0000\u0715\u0716\u0001\u0000\u0000\u0000\u0716\u0718"+
		"\u0001\u0000\u0000\u0000\u0717\u0715\u0001\u0000\u0000\u0000\u0718\u0719"+
		"\u0005X\u0000\u0000\u0719\u071b\u0005Y\u0000\u0000\u071a\u0715\u0001\u0000"+
		"\u0000\u0000\u071b\u071e\u0001\u0000\u0000\u0000\u071c\u071a\u0001\u0000"+
		"\u0000\u0000\u071c\u071d\u0001\u0000\u0000\u0000\u071d\u011f\u0001\u0000"+
		"\u0000\u0000\u071e\u071c\u0001\u0000\u0000\u0000\u071f\u0720\u0007\u0010"+
		"\u0000\u0000\u0720\u0121\u0001\u0000\u0000\u0000\u0721\u0722\u0005_\u0000"+
		"\u0000\u0722\u0727\u0003^/\u0000\u0723\u0724\u0005[\u0000\u0000\u0724"+
		"\u0726\u0003^/\u0000\u0725\u0723\u0001\u0000\u0000\u0000\u0726\u0729\u0001"+
		"\u0000\u0000\u0000\u0727\u0725\u0001\u0000\u0000\u0000\u0727\u0728\u0001"+
		"\u0000\u0000\u0000\u0728\u072a\u0001\u0000\u0000\u0000\u0729\u0727\u0001"+
		"\u0000\u0000\u0000\u072a\u072b\u0005^\u0000\u0000\u072b\u0123\u0001\u0000"+
		"\u0000\u0000\u072c\u0736\u0003\u0128\u0094\u0000\u072d\u072f\u0005\\\u0000"+
		"\u0000\u072e\u0730\u0003\u0122\u0091\u0000\u072f\u072e\u0001\u0000\u0000"+
		"\u0000\u072f\u0730\u0001\u0000\u0000\u0000\u0730\u0731\u0001\u0000\u0000"+
		"\u0000\u0731\u0733\u0003\u00aeW\u0000\u0732\u0734\u0003\u0128\u0094\u0000"+
		"\u0733\u0732\u0001\u0000\u0000\u0000\u0733\u0734\u0001\u0000\u0000\u0000"+
		"\u0734\u0736\u0001\u0000\u0000\u0000\u0735\u072c\u0001\u0000\u0000\u0000"+
		"\u0735\u072d\u0001\u0000\u0000\u0000\u0736\u0125\u0001\u0000\u0000\u0000"+
		"\u0737\u0738\u0005*\u0000\u0000\u0738\u073d\u0003\u0124\u0092\u0000\u0739"+
		"\u073a\u0003\u00aeW\u0000\u073a\u073b\u0003\u0128\u0094\u0000\u073b\u073d"+
		"\u0001\u0000\u0000\u0000\u073c\u0737\u0001\u0000\u0000\u0000\u073c\u0739"+
		"\u0001\u0000\u0000\u0000\u073d\u0127\u0001\u0000\u0000\u0000\u073e\u0740"+
		"\u0005T\u0000\u0000\u073f\u0741\u0003\u00f0x\u0000\u0740\u073f\u0001\u0000"+
		"\u0000\u0000\u0740\u0741\u0001\u0000\u0000\u0000\u0741\u0742\u0001\u0000"+
		"\u0000\u0000\u0742\u0743\u0005U\u0000\u0000\u0743\u0129\u0001\u0000\u0000"+
		"\u0000\u00e1\u012e\u0131\u0137\u0140\u0146\u014a\u014e\u0155\u015e\u0165"+
		"\u0169\u016c\u0171\u0176\u017c\u0181\u018b\u0190\u0194\u0198\u019c\u01a6"+
		"\u01ae\u01b6\u01ba\u01c1\u01c8\u01cc\u01cf\u01d2\u01db\u01e1\u01e6\u01e9"+
		"\u01ef\u01f5\u01f9\u01fd\u0205\u020e\u0215\u021b\u021f\u022b\u0234\u0239"+
		"\u023f\u0243\u024f\u025a\u025f\u0269\u0271\u027b\u0284\u028f\u0294\u029d"+
		"\u02a7\u02ac\u02b5\u02bb\u02c2\u02c7\u02cf\u02d3\u02d5\u02db\u02e0\u02e4"+
		"\u02eb\u02f1\u02f3\u02fa\u02ff\u0304\u0307\u0309\u0313\u031d\u0322\u0325"+
		"\u032a\u0333\u033a\u0345\u034b\u0356\u0360\u036b\u0374\u0379\u037c\u0383"+
		"\u038d\u0395\u0398\u039b\u03a8\u03b0\u03b5\u03bd\u03c1\u03c5\u03c9\u03cd"+
		"\u03cf\u03d3\u03d9\u03e1\u03eb\u03f4\u03fe\u0406\u0414\u041b\u0420\u0426"+
		"\u042f\u0439\u0445\u0448\u044f\u0458\u045d\u0468\u046f\u0475\u0478\u0490"+
		"\u0496\u049f\u04b6\u04b9\u04bc\u04c4\u04c8\u04d4\u04de\u04e4\u04f0\u0500"+
		"\u050d\u0516\u051f\u0525\u052d\u0533\u0538\u053d\u0545\u054a\u054e\u0552"+
		"\u0556\u0558\u055c\u0561\u0566\u056e\u0577\u057d\u0584\u058a\u058d\u0598"+
		"\u05a0\u05af\u05b3\u05b8\u05bc\u05cc\u05f4\u05fa\u0607\u060c\u060f\u0611"+
		"\u0617\u061e\u062a\u0633\u063a\u063d\u0641\u0653\u0655\u065d\u0666\u066d"+
		"\u0677\u067e\u0686\u0689\u0690\u0697\u069a\u069f\u06a4\u06a9\u06b2\u06b4"+
		"\u06b8\u06bd\u06c1\u06c5\u06c9\u06d3\u06df\u06e6\u06e9\u06ed\u06f5\u06fa"+
		"\u0705\u070b\u0710\u0715\u071c\u0727\u072f\u0733\u0735\u073c\u0740";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}