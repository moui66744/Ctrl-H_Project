package runtime;

import AstGenerator.AstInfo;
import Visitor.StmtVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class CLI {
    // 输入参数
    private Option searchOpt;
    private Option replaceOpt;
    private Option stmtOpt;
    private Option declOpt;
    private Option exprOpt;
    private Option yesOpt;
    private Option quietOpt;
    private Option helpOpt;
    private Option pathOpt;
    private Option propertyDOpt;
    private Option propertyTOpt;
    private final OptionGroup stmt_decl_expr = new OptionGroup();
    private final OptionGroup search_replace = new OptionGroup();
    private final Options options = new Options();
    // 输出帮助信息
    private final HelpFormatter helpFormatter = new HelpFormatter();
    // 输入参数解析
    private final DefaultParser parser = new DefaultParser();

    private static final CLIParseInfo cliInfo = new CLIParseInfo();

    static long stime;
    static long etime_without_io;
    static long etime_with_io;

    /**
     * 设置输入参数
     */
    public void setOptions() {
        searchOpt = new Option("s", "search", false,
            "Search code mode.");
        replaceOpt = new Option("r", "replace", false,
            "Replace code mode.");

        stmtOpt = Option.builder()
                .longOpt("stmt")
                .hasArg()
                .argName("type")
                .desc("Search statement which type is <type>.")
                .valueSeparator('=')
                .build();
        declOpt = Option.builder()
                .longOpt("decl")
                .hasArg()
                .argName("type")
                .desc("Search declaration which type is <type>.")
                .valueSeparator('=')
                .build();
        exprOpt = Option.builder()
                .longOpt("expr")
                .desc("Search expression.")
                .valueSeparator('=')
                .build();

        yesOpt = new Option("y", "yes", false,
                "Confirm to replace.");
        helpOpt = new Option("h", "help", false,
            "Print help message.");
        quietOpt = new Option("q", "quiet", false,
                "Do not print search results when execute replace.");
        pathOpt = new Option("p", "path", true,
                "The path of the search or replace.");

        propertyDOpt = Option.builder()
            .option("D")
            .argName("property=value")
            .hasArg()
            .valueSeparator()
            .numberOfArgs(2)
            .desc("Use value for given properties.")
            .build();
        propertyTOpt = Option.builder()
            .option("T")
            .argName("text")
            .hasArg()
            .valueSeparator()
            .numberOfArgs(2)
            .desc("Text to Replace.")
            .build();

        // search/replace不能同时选择
        search_replace.addOption(searchOpt);
        search_replace.addOption(replaceOpt);

        // stmt/decl/expr不能同时选择
        stmt_decl_expr.addOption(stmtOpt);
        stmt_decl_expr.addOption(declOpt);
        stmt_decl_expr.addOption(exprOpt);

        options.addOption(pathOpt);
        options.addOption(helpOpt);
        options.addOption(yesOpt);
        options.addOption(quietOpt);
        options.addOption(propertyDOpt);
        options.addOption(propertyTOpt);
        options.addOptionGroup(search_replace);
        options.addOptionGroup(stmt_decl_expr);
    }

    public void parseArgs(String[] args) throws ParseException, IllegalArgumentException {
        CommandLine cmd = parser.parse(options, args);
        if (cmd.hasOption(helpOpt)) {// 打印帮助信息
            helpFormatter.printHelp("ctrl-h", options);
            throw new ParseException("");
        }
        // 路径
        if ((cliInfo.path = cmd.getOptionValue(pathOpt)) == null) {
            throw new ParseException("Please input -p to set search path.");
        }

        // 模式：查询 or 替换.
        if (cmd.hasOption(searchOpt)) {
            cliInfo.isReplace = false;
        } else if (cmd.hasOption(replaceOpt)) {
            cliInfo.isReplace = true;
            // 替换文本
            Properties properties = cmd.getOptionProperties(propertyTOpt);
            if (properties == null || (cliInfo.text = properties.getProperty("text")) == null) {
                throw new ParseException("Please input -Ttext=<value> to set text after replacing.");
            }
        } else {// -s/-r至少选择一个
            throw new ParseException("Please input -s or -r to choose mode: Search or Replace.");
        }

        cliInfo.isQuiet = cmd.hasOption(quietOpt);
        cliInfo.noAsk = cmd.hasOption(yesOpt);

        // 检查查询对象：stmt or decl or expr.
        if (cmd.hasOption(stmtOpt)) {// 获取stmt的具体查询信息
            cliInfo.target = cmd.getOptionValue(stmtOpt);
            if (cmd.hasOption(propertyDOpt)) {
                Properties properties = cmd.getOptionProperties(propertyDOpt);
                cliInfo.cond = properties.getProperty("cond");
                switch (cliInfo.target) {
                    case "for":
                        cliInfo.forInit = properties.getProperty("forInit");
                        cliInfo.forUpdate = properties.getProperty("forUpdate");
                        break;
                    case "if":
                        try {
                            String ifType = properties.getProperty("ifType");
                            cliInfo.ifType = ifType == null ? StmtVisitor.IF_TYPE.DONT_CARE
                                : StmtVisitor.IF_TYPE.valueOf(ifType);
                        } catch (IllegalArgumentException e) {
                            throw new IllegalArgumentException(
                                "The ifType is illegal, options: DONT_CARE/WITH_ELSE/WITHOUT_ELSE"
                            );
                        }
                        break;
                    case "try":
                        try {
                            String tryType = properties.getProperty("tryType");
                            cliInfo.tryType = tryType == null ? StmtVisitor.TRY_TYPE.DONT_CARE
                                : StmtVisitor.TRY_TYPE.valueOf(tryType);
                        } catch (IllegalArgumentException e) {
                            throw new IllegalArgumentException(
                                "The tryType is illegal, options: " +
                                "DONT_CARE/WITH_CATCH_WITH_FINALLY/WITH_CATCH_WITHOUT_FINALLY/" +
                                "WITH_CATCH_WITHOUT_FINALLY"
                            );
                        }
                        break;
                }
            }
        } else if (cmd.hasOption(declOpt)) {// 获取decl的具体查询信息
            cliInfo.target = cmd.getOptionValue(declOpt);
            if (cmd.hasOption(propertyDOpt)) {
                Properties properties = cmd.getOptionProperties(propertyDOpt);
                cliInfo.name = properties.getProperty("name");
                cliInfo.type = properties.getProperty("type");
                cliInfo.voidBoolean = Boolean.parseBoolean(properties.getProperty("isVoid"));
            }
        } else if (cmd.hasOption(exprOpt)) {// 获取expr的具体查询信息
            cliInfo.target = "expr";// expr没有细分的类型
            if (cmd.hasOption(propertyDOpt)) {
                Properties properties = cmd.getOptionProperties(propertyDOpt);
                cliInfo.expr = properties.getProperty("expr");
            }
        } else {
            throw new ParseException("Please input -stmt or -decl or -expr to choose query target");
        }
    }

    // 完成S/R任务的分派, 具体接口调用交给Search/Replace
    public void exec() throws Exception {
        // 打开 路径下所有文件 / 文件
        IO.readFile(cliInfo.path);
        // 查找
        var result = Search.execSearch(cliInfo);
        if (Search.cnt == 0) {// 没有匹配结果直接返回
            throw new Exception("No matching results.");
        } else if (cliInfo.isReplace) {// 替换
            Replace.execReplace(result, cliInfo.text, cliInfo.isQuiet);
            if (cliInfo.noAsk || confirm()) {// 用户确认
                // 将替换后的文本写入到文件
                IO.writeFile();
            }
        } else {
            etime_without_io = LocalTime.now().getLong(ChronoField.MILLI_OF_DAY);
            // 输出查询结果列表
            Print.printResult(result);
            // 结束时间
            etime_with_io = LocalTime.now().getLong(ChronoField.MILLI_OF_DAY);
            // 计算执行时间
            System.out.println("The execution time without IO: " + (etime_without_io - stime) + " ms.");
            System.out.println("The execution time with IO: " + (etime_with_io - stime) + " ms.");
            // 交互式允许用户查看详细的查找结果
            interact(result);
        }
    }

    public static boolean confirm() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Are you sure to replace all? [y/n]:");
        String next = scan.next();
        scan.close();
        return next.equals("y") || next.equals("yes");
    }

    public static void interact(Map<AstInfo, List<ParserRuleContext>> resultMap) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Input number before result to check context, or 'exit' to quit.");
            System.out.print("ctrl-h>>>");
            String next = scan.next();
            if (next.equals("exit")) break;
            // 用户输入异常处理
            // no a number
            if (!next.matches("[0-9]*")) {
                System.out.println("Please input a positive integer or 'exit'.");
                continue;
            }
            // out of range
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
                    Runtime.getRuntime().exec("cmd /c code -g " + fileName + ":" + row + ":" + col);
                    break;
                }
                idx -= result.size();
            }
        }
    }

    public static void main(String[] args) {
        // 开始时间
        stime = LocalTime.now().getLong(ChronoField.MILLI_OF_DAY);
        // 模拟用户输入参数
        String[] Args = new String[]{
//            "-h",

//            "-s",
//            "-stmt=for",
//            "-DforInit=i = 0",
//            "-Dcond=i < 5",
//            "-DforUpdate= i++",
//            "-p",
//            "Project/test/DummyTest.java",

            "-r",
            "-stmt=if",
            "-Dcond=(a > 0 && b == 0) || c < 0",
            "-DifType=WITH_ELSE",
            "-Ttext=a + b + c == 0;",
            "-p",
            "Project/test/DummyTest.java",
        };
        CLI cli = new CLI();
        cli.setOptions();
        try {
            cli.parseArgs(args);
            cli.exec();
        } catch (IOException e) {
            System.err.println("No such file or directory: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
