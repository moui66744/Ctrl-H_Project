package runtime;

import org.apache.commons.cli.*;

import java.util.Properties;

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
//    private Option openOpt;
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

//        openOpt = Option.builder()
//                .option("o")
//                .longOpt("open")
//                .hasArg()
//                .argName("I")
//                .desc("Open the I-th result in the list of search results.")
//                .build();

        propertyDOpt = Option.builder()
            .option("D")
            .argName("property=value")
            .hasArg()
            .valueSeparator()
            .numberOfArgs(2)
            .desc("Use value for given properties")
            .build();
        propertyTOpt = Option.builder()
            .option("T")
            .argName("text")
            .hasArg()
            .valueSeparator()
            .numberOfArgs(2)
            .desc("Text to Replace")
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
//        options.addOption(openOpt);
        options.addOption(propertyDOpt);
        options.addOption(propertyTOpt);
        options.addOptionGroup(search_replace);
        options.addOptionGroup(stmt_decl_expr);
    }

    public boolean parseArgs(String[] args) throws ParseException {
        CommandLine cmd = parser.parse(options, args);
        if (cmd.hasOption(helpOpt)) {// 打印帮助信息
            helpFormatter.printHelp("ctrl-h", options);
            return false;
        }
        // 路径
        cliInfo.path = cmd.getOptionValue(pathOpt);

        // 检查模式：查询 or 替换.
        if (cmd.hasOption(searchOpt)) {
            cliInfo.isReplace = false;
        } else if (cmd.hasOption(replaceOpt)) {
            cliInfo.isReplace = true;
            if (cmd.hasOption(propertyTOpt)) {
                Properties properties = cmd.getOptionProperties(propertyTOpt);
                cliInfo.text = properties.getProperty("text");
            } else {
                System.out.println("Please input -Ttext=<value> to set text after replacing.");
                return false;
            }
        } else {
            System.out.println("Please input -s or -r to choose mode: Search or Replace.");
            return false;
        }

        cliInfo.isQuiet = cmd.hasOption(quietOpt);
        cliInfo.noAsk = cmd.hasOption(yesOpt);

        // 检查查询对象：stmt or decl or expr.
        if (cmd.hasOption(stmtOpt)) {// 获取stmt的具体查询信息
            cliInfo.target = cmd.getOptionValue(stmtOpt);
            if (cmd.hasOption(propertyDOpt)) {
                Properties properties = cmd.getOptionProperties(propertyDOpt);
                cliInfo.cond = properties.getProperty("cond");
                if (cliInfo.target.equals("for")) {
                    cliInfo.forInit = properties.getProperty("forInit");
                    cliInfo.forUpdate = properties.getProperty("forUpdate");
                } else if (cliInfo.target.equals("if")) {
                    // TODO: 解析ifType

                } else if (cliInfo.target.equals("try")) {
                    // TODO: 解析tryTry

                }
            }
        } else if (cmd.hasOption(declOpt)) {// 获取decl的具体查询信息
            cliInfo.target = cmd.getOptionValue(declOpt);
            if (cmd.hasOption(propertyDOpt)) {
                Properties properties = cmd.getOptionProperties(propertyDOpt);
                cliInfo.name = properties.getProperty("name");
                cliInfo.type = properties.getProperty("type");
                cliInfo.voidBoolean = Boolean.parseBoolean(properties.getProperty("is_void"));
            }
        } else if (cmd.hasOption(exprOpt)) {// 获取expr的具体查询信息
            cliInfo.target = "expr";// expr没有细分的类型
            if (cmd.hasOption(propertyDOpt)) {
                Properties properties = cmd.getOptionProperties(propertyDOpt);
                cliInfo.expr = properties.getProperty("expr");
            }
        } else {
            System.out.println("Please input -stmt or -decl or expr to choose query target");
            return false;
        }
        return true;
    }

    public void exec() {
        // TODO: 完成S/R任务的分派, 具体接口调用交给Search/Replace
        // TODO: 查询
        var result = Search.execSearch(cliInfo);
        // TODO: 输出查询结果
        if (!cliInfo.isQuiet) {
            Search.printSearchResults();
        }
        // TODO: 替换
        if (cliInfo.isReplace) {
            Replace.execReplace(cliInfo);
        }


//        if (cmd.hasOption(openOpt)) {
//            String idx = cmd.getOptionValue(openOpt);
//            // 打开输出中第idx个查询结果
//            System.out.println(idx);
////            系统调用示例: code -g <filename>:<row>:<column>
////            Runtime.getRuntime().exec("cmd /c code -g C:/Users/86187/Desktop/dp.md:5");
//        }
    }

    public static void main(String[] args) throws ParseException {
        // 模拟用户输入参数
        String[] Args = new String[]{
//            "-h",

            "-s",
            "-stmt=for",
            "-DforInit=int i = 0",
            "-Dcond=i < n",
            "-DforUpdate= i++",
            "-p",
            "Desktop/exp.java",

//            "-ryq",
//            "-stmt=if",
//            "-Dcond=(a > 0 && b == 0) || c < 0",
//            // TODO: "-DifType="
//            "-Ttext=a + b + c == 0",
//            "-p",
//            "Desktop/exp.java",

        };
        CLI cli = new CLI();
        cli.setOptions();
        if (cli.parseArgs(Args)) {
            cli.exec();
        }
        System.out.println(cliInfo);
    }
}
