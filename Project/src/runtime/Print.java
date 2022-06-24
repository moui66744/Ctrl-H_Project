package runtime;

import AstGenerator.AstInfo;
import AstGenerator.JavaAstInfo;
import org.antlr.v4.runtime.ParserRuleContext;
import util.QueryResult;

import java.io.*;
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
                System.out.printf("\n=====No.%d %s:%d:%d=====\n", ++idx, filePath, row, col);
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
    public static String makeJson(Map<AstInfo, Map<Integer,List<QueryResult>>> resultMap) {

        StringBuilder str = new StringBuilder();
        str.append("{\"results\":[ ");
        for (Map.Entry<AstInfo, Map<Integer,List<QueryResult>>> entry : resultMap.entrySet()) {
            String filePath = entry.getKey().getPath().replace('\\','/');
            str.append("{\"path\":" + "\"").append(filePath).append("\",\"path_res\":[ ");
            for (var item : entry.getValue().entrySet()){
                str.append("{\"label\":").append(item.getKey()).append(",\"label_res\":[ ");
                for(var res: item.getValue()){
                    str.append(res.makeJson()).append(',');
                }
                str.deleteCharAt(str.length() - 1);
                str.append("]},");
            }
            str.deleteCharAt(str.length() - 1);
            str.append("]},");
        }
        str.deleteCharAt(str.length() - 1);
        str.append("]}");
        return str.toString();
    }
    public static void printJson(Map<AstInfo, Map<Integer,List<QueryResult>>> resultMap){
        System.out.println(makeJson(resultMap));
    }

    public static void printJsonFile(Map<AstInfo, Map<Integer,List<QueryResult>>> resultMap, String Path) throws IOException {
        File f ;
        if (Path != null)f= new File(Path); else f = new File("out/res.json");
        try (FileOutputStream fileOutputStream = new FileOutputStream(f)){
            fileOutputStream.write(makeJson(resultMap).getBytes());
        }
    }
}