package runtime;

import AstGenerator.AstInfo;
import AstGenerator.JavaAstInfo;
import Query.QueryTreeInfo;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.cli.*;
import util.QueryResult;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CLI {
    // 输入参数
    private Option pathOpt;
    private Option cmdOpt;

    private Option dirOpt;

    private Option langOpt;
    private final Options options = new Options();
    // 输入参数解析
    private final DefaultParser parser = new DefaultParser();
    private static final CLIInfo cliInfo = new CLIInfo();
    /**
     * 设置输入参数
     */
    public void setOptions() {
        pathOpt = new Option("p", "path", true,
                "The path of the search or replace.");
        cmdOpt = new Option("t","terminal",true,
                "use the terminal,with the query language");
        dirOpt = new Option("d", "dir", true,
                            "specified the out put directory of query result");
        langOpt = new Option("l","lang",true,
                "Choose the subQuery Language");
        options.addOption(pathOpt);
        options.addOption(cmdOpt);
        options.addOption(dirOpt);
        options.addOption(langOpt);
    }

    public void parseArgs(String[] args) throws ParseException, IllegalArgumentException {
        CommandLine cmd = parser.parse(options, args);
        // 路径
        if ((cliInfo.path = cmd.getOptionValue(pathOpt)) == null) {
            throw new ParseException("Please input -p to set search path.");
        }
        if(cmd.hasOption(cmdOpt)) {
            cliInfo.cmd = true;
            if ((cliInfo.queryInput = cmd.getOptionValue(cmdOpt)) == null) {
                throw new ParseException("Input Query Language");
            }
        } else {
            cliInfo.cmd = false;
        }
        if (cmd.hasOption(dirOpt)) {
            if ((cliInfo.outputDir = cmd.getOptionValue(dirOpt)) == null) {
                throw new ParseException("no output dir");
            }
        }
        if (cmd.hasOption(langOpt)) {
            var tmp = cmd.getOptionValue(langOpt);
            if (tmp == null) {
                throw new ParseException("no input language");
            }else {
                if (tmp.equals("cpp")){
                    cliInfo.langType = CLIInfo.LanguageType.CPP;
                } else if (tmp.equals("java")){
                    cliInfo.langType = CLIInfo.LanguageType.JAVA;
                }
            }
        }
    }

    // 完成S/R任务的分派, 具体接口调用交给Search/Replace
    public void exec() throws Exception {
        // 打开 路径下所有文件 / 文件
        if (cliInfo.langType == CLIInfo.LanguageType.JAVA)
            IO.readJavaFile(cliInfo.path);
        else if (cliInfo.langType == CLIInfo.LanguageType.CPP)
            IO.readCppFile(cliInfo.path);
        String queryLanguage;
        if (cliInfo.cmd)
            queryLanguage = cliInfo.queryInput;
        else
            queryLanguage= inputQueryLanguage();
//        System.out.println(queryLanguage);
        QueryTreeInfo queryTreeInfo = new QueryTreeInfo(queryLanguage);
        // 查找
        var result = Search.execSearch(cliInfo, queryTreeInfo);
        if (Search.cnt == 0) {// 没有匹配结果直接返回
            throw new Exception("No matching results.");
        } else if (cliInfo.cmd){
            Print.printJsonFile(result,cliInfo.outputDir);

            //for debug
//            Print.printJson(result);
        }
        else {
//            // 输出查询结果列表
            Map<AstInfo,List<ParserRuleContext>> res = new HashMap<>();
            for (var item : result.entrySet()){
                res.put(item.getKey(),item.getValue().get(0).stream().map(QueryResult::getParserRuleContext).collect(Collectors.toList()));
            }
            Print.printResult(res);
//            // 交互式允许用户查看详细的查找结果
            openDetail(res);
        }
    }

    public static String inputQueryLanguage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input query language:");
        System.out.print("\u001b[32m" + "ctrl-h >>> " + "\u001b[0m");
        StringBuilder queryLanguage = new StringBuilder();
        boolean flag = true;
        while (flag) {
            String s = scan.nextLine();
            flag = s.endsWith("\\");
            System.out.println();
            if (flag) queryLanguage.append(s, 0, s.length()-1);
            else queryLanguage.append(s);
        }
        return queryLanguage.toString();
    }

    public static boolean confirm() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Are you sure to replace all? [y/n]:");
        String next = scan.next();
        scan.close();
        return next.equals("y") || next.equals("yes");
    }

    public static void openDetail(Map<AstInfo, List<ParserRuleContext>> resultMap) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Input number before result to check context, or 'exit' to exit, or 'r' to replace.");
            System.out.print("\u001b[32m" + "ctrl-h >>> " + "\u001b[0m");
            String next = scan.next();
            if (next.equals("exit")) break;
            // 用户输入异常处理
            if (!next.matches("[0-9r]*")) {
                System.out.println("Please input a positive integer, or 'exit' to exit, or 'r' to replace.");
                continue;
            }
            if (next.equals("r")) {
                System.out.println("Input replace text:");
                System.out.print("\u001b[32m" + "ctrl-h >>> " + "\u001b[0m");
                StringBuilder text = new StringBuilder();
                boolean flag = true;
                while (flag) {
                    String s = scan.nextLine();
                    flag = s.endsWith("\\");
                    if (flag) text.append(s, 0, s.length()-1);
                    else text.append(s);
                }
                System.out.println(text);
                Replace.execReplace(resultMap, text.toString(), false);
            } else {
                int idx = Integer.parseInt(next);
                if (idx < 1 || idx > Search.cnt) {
                    System.out.println("Please input a number from 1 to " + Search.cnt);
                    continue;
                }
                // 打开第idx的结果
                for (Map.Entry<AstInfo, List<ParserRuleContext>> entry: resultMap.entrySet()) {
                    List<ParserRuleContext> result = entry.getValue();
                    if (idx <= result.size()) {
                        String fileName = entry.getKey().getPath();
                        int row = result.get(idx-1).start.getLine();
                        int col = result.get(idx-1).start.getCharPositionInLine();
                        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                            Runtime.getRuntime().exec("cmd /c code -g " + fileName + ":" + row + ":" + col);
                        } else {
                            Runtime.getRuntime().exec("code -g " + fileName + ":" + row + ":" + col);
                        }
                        break;
                    }
                    idx -= result.size();
                }
            }
        }
    }

    public static void main(String[] args) {
        // 模拟用户输入参数
        String[] Args = new String[]{
                "-p",
//                "../../antlr4/",
                "test/",
                "-t",
                "if(){[1]if(){} $ [2] a = 0}",
                "-d","out/res.json",
                "-l","cpp"
        };
        CLI cli = new CLI();
        cli.setOptions();
        try {
            cli.parseArgs(Args);
            cli.exec();
        } catch (IOException e) {
            System.err.println("No such file or directory: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
