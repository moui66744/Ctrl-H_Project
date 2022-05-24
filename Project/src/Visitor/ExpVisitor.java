package Visitor;

import AstGenerator.AstInfo;
import JavaParser.JavaBaseVisitor;
import JavaParser.JavaLexer;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;

import java.io.IOException;
import java.util.ArrayList;
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
    public List<JavaParser.ExpressionContext> filter(List<JavaParser.ExpressionContext> input, String expr){
        //parsing the expression
        CharStream charStream = CharStreams.fromString(expr);
        JavaLexer lexer = new JavaLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JavaParser javaParser = new JavaParser(tokenStream);
        try {
            JavaParser.ExpressionContext ctx = javaParser.expression();
            patternTokenStream = tokenStream;
            patternExp = ctx;
            return filter(input);
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
    public List<JavaParser.ExpressionContext> filter(List<JavaParser.ExpressionContext> input) {
        checkMode();//set the mode if the mode is null, the default mode is partial matching
        List<JavaParser.ExpressionContext> output = null;
        if (input == null) return null;
        var ctx = patternExp;
        if (matchMode == MatchMode.FullMatch)
            output = input.stream().filter(item -> item.getText().equals(ctx.getText())).collect(Collectors.toList());
        else if (matchMode == MatchMode.PartialMatch){
            if(patternNext == null )patternPreCompile(ctx,patternTokenStream);
            output = input.stream().filter(this::subTokenOf).collect(Collectors.toList());
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
    private boolean subTokenOf(JavaParser.ExpressionContext ctx) {
        var tar = ctx.start;
        List<Pair<Token,Integer>> next = patternNext;
        final int stop = ctx.stop.getTokenIndex() + 1;
        int pos = 0;
        while (tar.getTokenIndex() > 0 &&tar.getTokenIndex() != stop){
            if (tar.getText().equals(next.get(pos).a.getText())){
                tar = tar.getTokenSource().nextToken();
                ++pos;
            } else if (pos != 0) {
                pos = next.get(pos - 1).b;
            } else {
                tar = tar.getTokenSource().nextToken();
            }
            if (pos == next.size()){
                return true;
            }
        }
        return false;
    }
    public List<JavaParser.ExpressionContext> filterByExp(List<JavaParser.ExpressionContext> input, String pattern){
        patternPreCompile(pattern);
        return filter(input);
    }
}



class ExpVisitorTest {
    static String inputFileName = "test/DummyTestBackup.java";
    public static void main(String [] argv) throws IOException {
        AstInfo ast = new AstInfo(inputFileName);
        ExpVisitor expVisitor = new ExpVisitor();
        List<JavaParser.ExpressionContext> allExp = expVisitor.visitCompilationUnit(ast.getRoot());
        //test 1: find all expression
        for (var item :allExp){
            System.out.println(item.getText());
        }

        System.out.println("//////////////////////////////\n Partial Match Filter");
        expVisitor.patternPreCompile("i++");
        assert expVisitor.patternNext.size() == 3;

        var partialMatchResult = expVisitor.filter(allExp);
        for (var item : partialMatchResult) {
            System.out.println(item.getText());
        }
        System.out.println("//////////////////////////////\n Full Match Filter");
        expVisitor.setMatchMode(ExpVisitor.MatchMode.FullMatch);
        expVisitor.patternPreCompile("1*2");
        var fullMatchResult = expVisitor.filter(allExp);

        for (var item : fullMatchResult) {
            System.out.println(item.getText());
        }


    }
}

