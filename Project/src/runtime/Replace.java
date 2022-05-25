package runtime;

import AstGenerator.AstInfo;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.Map;

public class Replace {
    public static void execReplace(
            Map<AstInfo, List<ParserRuleContext>> resultMap,
            String text,
            boolean isQuiet
    ) {
        int idx = 0;
        for (Map.Entry<AstInfo, List<ParserRuleContext>> entry: resultMap.entrySet()) {
            AstInfo ast = entry.getKey();
            String filePath = ast.getPath();
            for (ParserRuleContext parserRuleContext : entry.getValue()) {
                ast.replace(parserRuleContext, text);
                String before = ast.getText(parserRuleContext);
                int row = parserRuleContext.start.getLine();
                int col = parserRuleContext.start.getCharPositionInLine();
                if (!isQuiet) Print.printDiff(++idx, filePath, row, col, before, text);
            }
        }
    }
}
