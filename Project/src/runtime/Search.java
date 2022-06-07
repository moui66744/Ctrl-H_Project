package runtime;

import AstGenerator.AstInfo;
import JavaQuery.Query;
import JavaQuery.QueryTreeInfo;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Search {
    public static int cnt;
    public static Map<AstInfo, List<ParserRuleContext>> execSearch(CLIInfo cliInfo, QueryTreeInfo queryTreeInfo) {
        Map<AstInfo, List<ParserRuleContext>> result = new HashMap<>();
        cnt = 0;
        for (AstInfo astInfo : IO.getAstList()) {
            List<ParserRuleContext> res = new Query().query(astInfo.getRoot(), queryTreeInfo.getRoot());
            result.put(astInfo, res);
            cnt += res.size();
        }
        return result;
    }
}
