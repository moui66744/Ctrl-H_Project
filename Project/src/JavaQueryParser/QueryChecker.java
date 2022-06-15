package JavaQueryParser;

import java.util.HashSet;
import java.util.Set;

public class QueryChecker extends JavaQueryBaseListener{
    Set<Integer> s;
    public QueryChecker(){
        s = new HashSet<>();
    }
    @Override
    public void exitQueryLabel(JavaQueryParser.QueryLabelContext ctx) {
        if (ctx == null) return;
        if (ctx.integerLiteral() == null) return ;
        int value = Integer.parseInt(ctx.integerLiteral().getText());
        if(s.contains(value)){
            throw new RuntimeException("Invalid Query Label");
        } else {
            s.add(value);
        }
    }
}
