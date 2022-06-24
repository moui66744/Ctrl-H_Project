package runtime;

import AstGenerator.AstInfo;
import AstGenerator.CppAstInfo;
import AstGenerator.JavaAstInfo;
import Query.JavaQuery;
import Query.CppQuery;
import Query.QueryTreeInfo;
import util.QueryResult;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Search {
    public static int cnt;
    public static Map<AstInfo, Map<Integer,List<QueryResult>>> execSearch(CLIInfo cliInfo, QueryTreeInfo queryTreeInfo) {
        Map<AstInfo, Map<Integer,List<QueryResult>>> result = new HashMap<>();
        cnt = 0;
        if (cliInfo.langType == CLIInfo.LanguageType.JAVA){
            for (AstInfo astInfo : IO.getAstList()) {
                JavaAstInfo javaAstInfo = (JavaAstInfo) astInfo;
                var res = new JavaQuery(javaAstInfo).query(javaAstInfo.getRoot(), queryTreeInfo.getRoot());
                if (res != null) {
                    result.put(javaAstInfo, res);
                    cnt += res.size();
                }
            }
        } else if (cliInfo.langType == CLIInfo.LanguageType.CPP) {
            for (AstInfo astInfo : IO.getAstList()) {
                CppAstInfo cppAstInfo = (CppAstInfo) astInfo;
                var res = new CppQuery(cppAstInfo).query(cppAstInfo.getRoot(), queryTreeInfo.getRoot());
                if (res != null) {
                    result.put(cppAstInfo, res);
                    cnt += res.size();
                }
            }
        }
        return result;
    }
}
