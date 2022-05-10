package Visitor;

import JavaParser.JavaParser;
import JavaParser.JavaLexer;
import JavaParser.JavaVisitor;
import JavaParser.JavaBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.stream.Collectors;

public class ExpVisitor extends JavaBaseVisitor<List<JavaParser.ExpressionContext>> {

    List<Pair<Token,Integer>> patternNext;
    JavaParser.ExpressionContext patternExp;
    TokenStream patternTokenStream;
    @Override
    protected List<JavaParser.ExpressionContext> aggregateResult(List<JavaParser.ExpressionContext> aggregate, List<JavaParser.ExpressionContext> nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        aggregate.addAll(nextResult);
        return aggregate;
    }

    @Override
    protected List<JavaParser.ExpressionContext> defaultResult() {
        return super.defaultResult();
    }

    @Override
    public List<JavaParser.ExpressionContext> visitExpression(JavaParser.ExpressionContext ctx) {
        List<JavaParser.ExpressionContext> result = new ArrayList<>();
        result.add(ctx);
        return result;
    }

    @Override
    public List<JavaParser.ExpressionContext> visitExpressionList(JavaParser.ExpressionListContext ctx) {
        return ctx.expression();
    }

    @Override
    public List<JavaParser.ExpressionContext> visitParExpression(JavaParser.ParExpressionContext ctx) {
        return super.visitParExpression(ctx);
    }

    // the supported mode
    public enum MatchMode {
        FullMatch,
        PartialMatch
    }
    private MatchMode matchMode;

    /**
     * this method is used to set the mode when user not specifies the mode
     */
    private void checkMode() {
        if (matchMode == null) {
            matchMode = MatchMode.PartialMatch;
        }
    }

    /**
     * the setter of mode
     * @param matchMode:mode
     */
    public void setMatchMode(MatchMode matchMode) {
        this.matchMode = matchMode;
    }

    /**
     *
     * @param input : the list of expressions
     * @param expr : the expression to be filtered with
     * @return the list of expression after the filter
     *
     * This method is used to filter the List of expression. User can choose two different mode for matching
     * This method will eventually call the other method with the same name
     */
    @Deprecated
    public List<JavaParser.ExpressionContext> filter(List<JavaParser.ExpressionContext> input, String expr, TokenStream mainTokenStream){
        //parsing the expression
        CharStream charStream = CharStreams.fromString(expr);
        JavaLexer lexer = new JavaLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JavaParser javaParser = new JavaParser(tokenStream);
        try {
            JavaParser.ExpressionContext ctx = javaParser.expression();
            patternTokenStream = tokenStream;
            patternExp = ctx;
            return filter(input,mainTokenStream);
        }catch (RecognitionException e) {
            System.err.println("Invalid Expression");
        }
        return null;
    }

    /**
     *
     * @param input : the list to be filtered
     * @return
     *  return the list of expression after filter
     *
     */
    public List<JavaParser.ExpressionContext> filter(List<JavaParser.ExpressionContext> input, TokenStream mainTokenStream) {
        checkMode();//set the mode if the mode is null, the default mode is partial matching
        List<JavaParser.ExpressionContext> output = null;
        var ctx = patternExp;
        if (matchMode == MatchMode.FullMatch)
            output = input.stream().filter(item -> item.getText().equals(ctx.getText())).collect(Collectors.toList());
        else if (matchMode == MatchMode.PartialMatch){
            if(patternNext == null )patternPreCompile(ctx,patternTokenStream);
            output = input.stream().filter(item -> subTokenOf(item,mainTokenStream)).collect(Collectors.toList());
        }
        else
            // no suppose to be here
            assert false : "In the middle of nowhere";

        return output;
    }

    public void patternPreCompile(String expr){
        CharStream charStream = CharStreams.fromString(expr);
        JavaLexer lexer = new JavaLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JavaParser javaParser = new JavaParser(tokenStream);
        try {
            JavaParser.ExpressionContext ctx = javaParser.expression();
            patternExp = ctx;
            patternTokenStream = tokenStream;
            patternPreCompile(ctx,tokenStream);
        }catch (RecognitionException e) {
            System.err.println("Invalid Expression");
        }
    }

    /**
     *
     * @param pattern: the input pattern
     * @param <T> : T is a sub-class of ParserRuleContext
     *
     */
    public <T extends ParserRuleContext > void patternPreCompile(T pattern, TokenStream t) {
        if (pattern == null){
            return;
        }
        var next = new ArrayList<Pair<Token, Integer>>();
        var start = pattern.start;
        next.add(new Pair<>(start, 0));
        int now = 0;
        int x = 1;
        while(start.getTokenIndex() + x < start.getTokenIndex()){
            if (t.get(start.getTokenIndex() + x).getText().equals(t.get(start.getTokenIndex() + now).getText())){
                now ++;
                x ++;
                next.add(new Pair<>(t.get(start.getTokenIndex() + x),now));
            } else if (now != 0){
                now = next.get(now - 1).b;
            } else {
                next.add(new Pair<>(t.get((start.getTokenIndex() + x)),0));
                ++ x;
            }
        }
        patternNext = next;
    }
    private <T extends ParserRuleContext > boolean subTokenOf(T input, TokenStream mainTokenStream) {
        int tar = input.start.getTokenIndex();
        List<Pair<Token,Integer>> next = patternNext;
        final int stop = input.stop.getTokenIndex() + 1;
        int pos = 0;

        while (tar < stop){
            if (mainTokenStream.get(tar).getText().equals(next.get(pos).a.getText())){
                ++tar;
                ++pos;
            } else if (pos != 0) {
                pos = next.get(pos - 1).b;
            } else {
                ++tar;
            }
            if (pos == next.size()){
                return true;
            }
        }
        return false;
    }
}
