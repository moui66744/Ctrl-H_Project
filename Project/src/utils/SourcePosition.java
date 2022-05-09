package utils;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

/**
 * 获取结点在源码中的位置.
 * */
public class SourcePosition {
    public int row;
    public int column;
    /**
     * 根据整数构造对象
     * */
    public SourcePosition(int row, int column) {
        this.row = row;
        this.column = column;
    }
    /**
     * 根据token构造对象
     * */
    public SourcePosition(Token token) {
        this(token.getLine(), token.getCharPositionInLine());
    }
    /**
     * 根据树上任意结点构造对象
     * 注意: 返回结点的起始位置
     * */
    public SourcePosition(ParserRuleContext ctx) {
        this(ctx.start);
    }
}
