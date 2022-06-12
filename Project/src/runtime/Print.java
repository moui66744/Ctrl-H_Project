package runtime;

import AstGenerator.AstInfo;
import org.antlr.v4.runtime.ParserRuleContext;

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
    public static String makeJson(Map<AstInfo,List<ParserRuleContext>> resultMap) {

        StringBuilder str = new StringBuilder();
        str.append("{\"results\":[");
        for (Map.Entry<AstInfo, List<ParserRuleContext>> entry : resultMap.entrySet()) {
            String filePath = entry.getKey().getPath().replace('\\','/');
            str.append("{\"path\":" + "\"").append(filePath).append("\",\"result\":[");
            for (ParserRuleContext parserRuleContext : entry.getValue()) {
                int sr = parserRuleContext.start.getLine();
                int sc = parserRuleContext.start.getCharPositionInLine();
                int er = parserRuleContext.stop.getLine();
                int ec = parserRuleContext.stop.getCharPositionInLine();
                int si = parserRuleContext.start.getTokenIndex();
                int ei = parserRuleContext.stop.getTokenIndex();
                str.append("{\"sr\":").append(sr).append(",\"sc\":").append(sc).append(",\"er\":").append(er).append(",\"ec\":").append(ec).append(",\"si\":").append(si).append(",\"ei\":").append(ei).append("},");
            }
            str.deleteCharAt(str.length() - 1);
            str.append("]},");
        }
        str.deleteCharAt(str.length() - 1);
        str.append("]}");
        return str.toString();
    }
    public static void printJson(Map<AstInfo,List<ParserRuleContext>> resultMap){
        System.out.println(makeJson(resultMap));
    }

    public static void printJsonFile(Map<AstInfo,List<ParserRuleContext>> resultMap, String Path) throws IOException {
        File f ;
        if (Path != null)f= new File(Path); else f = new File("out/res.json");
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        fileOutputStream.write(makeJson(resultMap).getBytes());
    }
}