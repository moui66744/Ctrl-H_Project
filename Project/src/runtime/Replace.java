package runtime;

import AstGenerator.AstInfo;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.Map;

public class Replace {
    public static void execReplace(
        Map<String, List<ParserRuleContext>> resultMap,
        String text,
        boolean isQuiet
    ) {
        int idx = 0;
        for (AstInfo ast : IO.getAstList()) {
            String path = ast.getPath();
            for (ParserRuleContext parserRuleContext : resultMap.get(path)) {
                ast.replace(parserRuleContext, text);
                String before = ast.getText(parserRuleContext);
                int row = parserRuleContext.start.getLine();
                int col = parserRuleContext.start.getCharPositionInLine();
                if (!isQuiet) Print.printDiff(++idx, path, row, col, before, text);
            }
        }
    }
}
