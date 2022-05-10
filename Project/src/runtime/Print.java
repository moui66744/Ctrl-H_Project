package runtime;

import AstGenerator.AstInfo;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.Map;

public class Print {
    public static void printResult(Map<String, List<ParserRuleContext>> resultMap) {
        // 输出序号/文件名/行号/列号/内容
        int idx = 0;
        for (Map.Entry<String, List<ParserRuleContext>> entry: resultMap.entrySet()) {
            String filePath = entry.getKey();
            for (ParserRuleContext parserRuleContext : entry.getValue()) {
                int row = parserRuleContext.start.getLine();
                int col = parserRuleContext.start.getCharPositionInLine();
                System.out.printf("=====No.%d %s:%d:%d=====\n", ++idx, filePath, row, col);
                System.out.println(parserRuleContext.getText());
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
