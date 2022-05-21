package runtime;

import AstGenerator.AstInfo;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.Map;

public class Print {
    public static void printResult(Map<AstInfo, List<ParserRuleContext>> resultMap) {
        // 输出序号/文件名/行号/列号/内容
        int idx = 0;
        for (Map.Entry<AstInfo, List<ParserRuleContext>> entry: resultMap.entrySet()) {
            AstInfo ast = entry.getKey();
            String filePath = ast.getPath();
            for (ParserRuleContext parserRuleContext : entry.getValue()) {
                int row = parserRuleContext.start.getLine();
                int col = parserRuleContext.start.getCharPositionInLine();
                System.out.printf("\n\33[1;34m=====No.%d %s:%d:%d=====\33[0m\n", ++idx, filePath, row, col);
                System.out.println(ast.getText(parserRuleContext));
            }
        }
    }
    public static void printDiff(int idx, String filePath, int col, int row, String before, String after) {
        // 输出替换前后的差别
        System.out.printf("No.%d %s:%d:%d\n", idx, filePath, col, row);
        System.out.println("Before replacement:");
        System.out.println("\u001b[31m" + before + "\u001b[0m");
        System.out.println("After replacement:");
        System.out.println("\u001b[32m" + after + "\u001b[0m");
    }
}
