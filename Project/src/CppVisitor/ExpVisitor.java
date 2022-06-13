package CppVisitor;

import AstGenerator.CppAstInfo;
import CppParser.CppBaseVisitor;
import CppParser.CppLexer;
import CppParser.CppParser;
import CppParser.CppParser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpVisitor extends CppBaseVisitor<List<ExpressionContext>> {
    List<Pair<Token,Integer>> patternNext;
    ExpressionContext patternExp;
    TokenStream patternTokenStream;
    @Override
    protected List<ExpressionContext> aggregateResult(List<ExpressionContext> aggregate, List<ExpressionContext> nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        aggregate.addAll(nextResult);
        return aggregate;
    }

    @Override
    public List<ExpressionContext> visitExpression(ExpressionContext ctx) {
        List<ExpressionContext> result = new ArrayList<>();
        result.add(ctx);
        return result;
    }

    // the supported mode
    public enum MatchMode {
        FullMatch,
        PartialMatch
    }
    private Visitor.ExpVisitor.MatchMode matchMode;

    /**
     * this method is used to set the mode when user not specifies the mode
     */
    private void checkMode() {
        if (matchMode == null) {
            matchMode = Visitor.ExpVisitor.MatchMode.PartialMatch;
        }
    }

    /**
     * the setter of mode
     * @param matchMode:mode
     */
    public void setMatchMode(Visitor.ExpVisitor.MatchMode matchMode) {
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
    public List<ExpressionContext> filter(List<ExpressionContext> input, String expr, TokenStream userStream){
        //parsing the expression
        CharStream charStream = CharStreams.fromString(expr);
        CppLexer lexer = new CppLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CppParser CppParser = new CppParser(tokenStream);
        try {
            ExpressionContext ctx = CppParser.expression();
            patternTokenStream = tokenStream;
            patternExp = ctx;
            return filter(input, userStream);
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
    public List<ExpressionContext> filter(List<ExpressionContext> input, TokenStream stream) {
        checkMode();//set the mode if the mode is null, the default mode is partial matching
        List<ExpressionContext> output = null;
        if (input == null) return null;
        var ctx = patternExp;
        if (matchMode == Visitor.ExpVisitor.MatchMode.FullMatch)
            output = input.stream().filter(item -> item.getText().equals(ctx.getText())).collect(Collectors.toList());
        else if (matchMode == Visitor.ExpVisitor.MatchMode.PartialMatch){
            if(patternNext == null )patternPreCompile(ctx,patternTokenStream);
            output = input.stream().filter(item -> subTokenOf(item,stream)).collect(Collectors.toList());
        }
        else
            // no suppose to be here
            assert false : "In the middle of nowhere";

        return output;
    }

    public void patternPreCompile(String expr){
        CharStream charStream = CharStreams.fromString(expr);
        CppLexer lexer = new CppLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CppParser CppParser = new CppParser(tokenStream);
        try {
            ExpressionContext ctx = CppParser.expression();
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
     * @param <T> : T is a subclass of ParserRuleContext
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
        while(start.getTokenIndex() + x <= pattern.getStop().getTokenIndex()){
            if (t.get(start.getTokenIndex() + x).getChannel() == Token.HIDDEN_CHANNEL){
                x ++;
            }
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
    private boolean subTokenOf(ExpressionContext ctx, TokenStream stream) {
        var tar = ctx.start.getTokenIndex();
        List<Pair<Token,Integer>> next = patternNext;
        final int stop = ctx.stop.getTokenIndex() + 1;
        int pos = 0;
        ctx.start.getTokenSource();
        while (tar != stop){
            if (stream.get(tar).getChannel() == Token.HIDDEN_CHANNEL){
                ++tar;
            }
            if (stream.get(tar).getText().equals(next.get(pos).a.getText())){
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
    public List<ExpressionContext> filterByExp(List<ExpressionContext> input, String pattern, TokenStream mainTokenStream){
        patternPreCompile(pattern);
        return filter(input,mainTokenStream);
    }
    public List<ExpressionContext> filterByExp(List<ExpressionContext> input, String pattern){
//        patternPreCompile(pattern);
        return input.stream().filter(item -> item.getText().equals(pattern)).collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        CppAstInfo ast = new CppAstInfo("Project/test/CppTest/test.cpp");
        ExpVisitor expVisitor = new ExpVisitor();
        List<ExpressionContext> allExp = expVisitor.visit(ast.getRoot());
        //test 1: find all expression
        for (var item :allExp){
            System.out.println(item.getText());
        }

        System.out.println("//////////////////////////////\n Partial Match Filter");

        var partialMatchResult = expVisitor.filterByExp(allExp,"1*2", ast.getTokenStream());
        for (var item : partialMatchResult) {
            System.out.println(item.getText());
        }
        System.out.println("//////////////////////////////\n Full Match Filter");
        expVisitor.setMatchMode(Visitor.ExpVisitor.MatchMode.FullMatch);
        expVisitor.patternPreCompile("1*2");
        var fullMatchResult = expVisitor.filter(allExp, ast.getTokenStream());

        for (var item : fullMatchResult) {
            System.out.println(item.getText());
        }

    }
}

