package runtime;

import Visitor.StmtVisitor;

public class CLIParseInfo {
    public boolean isReplace;   // search or replace
    public boolean isQuiet;     // 替换时是否输出查询结果
    public boolean noAsk;       // 替换时是否需要确认

    public String path;

    public String target;       // 具体查询的类型, 例如if/for/expr, 可选项对应Search.java/execSearch()

    // statement过滤条件
    public String cond;
    public String forInit;
    public String forUpdate;
    public StmtVisitor.IF_TYPE ifType;
    public StmtVisitor.TRY_TYPE tryType;
    // declaration过滤条件
    public String name;
    public String type;
    public boolean voidBoolean;
    // expression过滤条件
    public String expr;
    // 替换文本
    public String text;

    public CLIParseInfo() {
        ifType = StmtVisitor.IF_TYPE.DONT_CARE;
        tryType = StmtVisitor.TRY_TYPE.DONT_CARE;
    }

    @Override
    public String toString() {
        return "CLIParseInfo{" +
                "isReplace=" + isReplace +
                ", isQuiet=" + isQuiet +
                ", noAsk=" + noAsk +
                ", path='" + path + '\'' +
                ", target='" + target + '\'' +
                ", cond='" + cond + '\'' +
                ", forInit='" + forInit + '\'' +
                ", forUpdate='" + forUpdate + '\'' +
                ", ifType=" + ifType +
                ", tryType=" + tryType +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", voidBoolean=" + voidBoolean +
                ", expr='" + expr + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
