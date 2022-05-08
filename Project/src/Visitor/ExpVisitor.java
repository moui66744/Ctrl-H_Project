package Visitor;

import JavaParser.JavaParser;
import JavaParser.JavaLexer;
import JavaParser.JavaVisitor;
import JavaParser.JavaBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpVisitor extends JavaBaseVisitor<List<JavaParser.ExpressionContext>> {
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
    public List<JavaParser.ExpressionContext> filter(List<JavaParser.ExpressionContext> input, String expr){
        //parsing the expression
        CharStream charStream = CharStreams.fromString(expr);
        JavaLexer lexer = new JavaLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JavaParser javaParser = new JavaParser(tokenStream);
        try {
            JavaParser.ExpressionContext ctx = javaParser.expression();
            return filter(input,ctx);
        }catch (RecognitionException e) {
            System.err.println("Invalid Expression");
        }
        return null;
    }

    /**
     *
     * @param input : the list to be filtered
     * @param ctx: the context node of the expression to be filtered with
     * @return
     *  return the list of expression after filter
     *
     */
    public List<JavaParser.ExpressionContext> filter(List<JavaParser.ExpressionContext> input, JavaParser.ExpressionContext ctx) {
        checkMode();//set the mode if the mode is null, the default mode is partial matching
        List<JavaParser.ExpressionContext> output = null;

        if (matchMode == MatchMode.FullMatch)
            output = input.stream().filter(item -> item.getText().equals(ctx.getText())).collect(Collectors.toList());
        else if (matchMode == MatchMode.PartialMatch)
            output = input.stream().filter(item -> item.getText().contains(ctx.getText())).collect(Collectors.toList());
        else
            // no suppose to be here
            assert false : "In the middle of nowhere";

        return output;
    }
}
