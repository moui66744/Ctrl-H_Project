package util;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
public class QueryResult {
    static int instCount = 0;
    public class Position {
        int sr;
        int sc;
        int er;
        int ec;
        int si;
        int ei;

        public Position(){
        }
        public Position(int sr, int sc, int er, int ec, int si, int ei) {
            this.sr = sr;
            this.sc = sc;
            this.er = er;
            this.ec = ec;
            this.si = si;
            this.ei = ei;
        }

        public void setSr(int sr) {
            this.sr = sr;
        }

        public void setSc(int sc) {
            this.sc = sc;
        }

        public void setEr(int er) {
            this.er = er;
        }

        public void setEc(int ec) {
            this.ec = ec;
        }

        public void setSi(int si) {
            this.si = si;
        }

        public void setEi(int ei) {
            this.ei = ei;
        }

        public int getSr() {
            return sr;
        }

        public int getSc() {
            return sc;
        }

        public int getEr() {
            return er;
        }

        public int getEc() {
            return ec;
        }

        public int getSi() {
            return si;
        }

        public int getEi() {
            return ei;
        }

        public String makeJson(){
            return "{\"sr\":" + sr + ",\"sc\":" + sc + ",\"er\":" + er + ",\"ec\":" + ec + ",\"si\":" + si + ",\"ei\":" + ei + "}";
        }
    }
    public int id;
    public Position contextPosition;

    public ParserRuleContext parserRuleContext;
    public List<Position> subNodes;


    public QueryResult(){
        contextPosition = new Position();
        subNodes = new ArrayList<>();
    }

    public QueryResult(ParserRuleContext t) {
        contextPosition = new Position(
                t.start.getLine(),
                t.start.getCharPositionInLine(),
                t.stop.getLine(),
                t.stop.getCharPositionInLine(),
                t.start.getStartIndex(),
                t.stop.getStopIndex()
        );
        parserRuleContext = t;
        subNodes = new ArrayList<>();
    }

    public QueryResult addSubNode(ParserRuleContext t){
        if (t == null) return this;
        subNodes.add(new Position(
                t.start.getLine(),
                t.start.getCharPositionInLine(),
                t.stop.getLine(),
                t.stop.getCharPositionInLine(),
                t.start.getStartIndex(),
                t.stop.getStopIndex()
        ));
        return this;
    }
    public QueryResult addSubNode(int sr, int sc, int er, int ec, int si, int ei){
        subNodes.add(new Position(sr,sc,er,ec,si,ei));
        return this;
    }
    public <T extends ParserRuleContext>QueryResult addSubNodes(List<T> l){
        if (l == null) return this;
        for (var t : l){
            subNodes.add(new Position(
                    t.start.getLine(),
                    t.start.getCharPositionInLine(),
                    t.stop.getLine(),
                    t.stop.getCharPositionInLine(),
                    t.start.getStartIndex(),
                    t.stop.getStopIndex()
        ));
        }
        return this;
    }

    public void setContextPosition(ParserRuleContext t){
        contextPosition = new Position(
                t.start.getLine(),
                t.start.getCharPositionInLine(),
                t.stop.getLine(),
                t.stop.getCharPositionInLine(),
                t.start.getStartIndex(),
                t.stop.getStopIndex()
        );
    }

    public ParserRuleContext getParserRuleContext() {
        return parserRuleContext;
    }

    public String makeJson(){
        StringBuilder b = new StringBuilder();
        b.append("{ \"position\":").append(contextPosition.makeJson()).append(",\"subNode\":[");
        for (var i: subNodes){
            b.append(i.makeJson()).append(",");
        }
        b.deleteCharAt(b.length() - 1).append("]}");
        return b.toString();
    }

    public String getText() {
        return parserRuleContext.getText();
    }
}
