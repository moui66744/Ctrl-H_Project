package runtime;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

public class Search {
    /*
    或许可以将execSearch分成多个函数, 例如stmt/decl/expr分别查询
    返回值类型待定
    可能要同时记录所属文件, 可以使用/完善utils/SourcePosition类
     */
    public static ArrayList<ParserRuleContext> execSearch(CLIParseInfo cliInfo) {
        ArrayList<ParserRuleContext> results = new ArrayList<>();

        // TODO: 打开 路径下所有文件 / 文件
        // TODO: 对每个文件分别查询

        switch (cliInfo.target) {
            // TODO: 语句查询
            case "if" -> {

            }
            case "switch" -> {

            }
            case "for" -> {

            }
            case "while" -> {

            }
            case "do-while" -> {// 也许可以换个名字?

            }
            case "try" -> {

            }
            case "throw" -> {

            }
//            case "assert" -> {
//
//            }
            // TODO: 声明查询

            // TODO: 表达式查询
            case "expr" -> {

            }
        }
        return results;
    }

    public static void printSearchResults() {
        // TODO: 输出序号/文件名/行号/列号
        // 推荐使用utils/SourcePosition类
    }
}
