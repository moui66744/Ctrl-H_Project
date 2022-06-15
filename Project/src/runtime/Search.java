package runtime;

import AstGenerator.AstInfo;
import JavaQuery.Query;
import JavaQuery.QueryTreeInfo;
import org.antlr.v4.runtime.ParserRuleContext;
import util.QueryResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Search {
    public static int cnt;
    public static Map<AstInfo, Map<Integer,List<QueryResult>>> execSearch(CLIInfo cliInfo, QueryTreeInfo queryTreeInfo) {
        Map<AstInfo, Map<Integer,List<QueryResult>>> result = new HashMap<>();
        cnt = 0;
        for (AstInfo astInfo : IO.getAstList()) {
            var res = new Query(astInfo).query(astInfo.getRoot(), queryTreeInfo.getRoot());
            if (res != null) {
                result.put(astInfo, res);
                cnt += res.size();
            }
        }
        return result;
    }
}
