package Query;

import JavaQueryParser.JavaQueryLexer;
import JavaQueryParser.JavaQueryParser;
import JavaQueryParser.QueryChecker;
import org.antlr.v4.runtime.*;

public class QueryTreeInfo {
    JavaQueryLexer lexer;
    JavaQueryParser parser;
    CommonTokenStream tokenStream;
    JavaQueryParser.QueryInputContext root;

    public QueryTreeInfo(CharStream input) {
        lexer = new JavaQueryLexer(input);
        tokenStream = new CommonTokenStream(lexer);
        parser = new JavaQueryParser(tokenStream);
        parser.addParseListener(new QueryChecker());
        root = parser.queryInput();
    }
    public QueryTreeInfo(String queryLanguage) {
        this(CharStreams.fromString(queryLanguage));
    }
    public JavaQueryParser.QueryInputContext getRoot(){
        return root;
    }
    public JavaQueryLexer getLexer() {
        return lexer;
    }
    public JavaQueryParser getParser() {
        return parser;
    }
    public String getText(ParserRuleContext ctx) {
        return this.tokenStream.getText(ctx.start, ctx.stop);
    }
}
