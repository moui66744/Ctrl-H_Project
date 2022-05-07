package runtime;

import org.apache.commons.cli.*;

import java.util.Properties;

public class CLI {
    // 输入参数
    private Option helpOpt;
    private Option searchOpt;
    private Option replaceOpt;
    private Option openOpt;
    private Option printOpt;
    private Option propertyOpt;
    private final Options options = new Options();
    // 输出帮助信息
    private final HelpFormatter helpFormatter = new HelpFormatter();
    // 输入参数解析
    private final DefaultParser parser = new DefaultParser();

    /**
     * 设置输入参数
     */
    public void setOptions() {
        helpOpt = new Option("h", "help", false,
            "Print help message.");
        searchOpt = new Option("s", "search", false,
            "Search code.");
        replaceOpt = new Option("r", "replace", true,
            "Replace code.");
        printOpt = new Option("p", "print-list", false,
            "Print the last search result list.");
        openOpt = Option.builder()
            .option("o")
            .longOpt("open")
            .hasArg()
            .argName("I")
            .desc("Open the I-th result in the list of search results.")
            .build();
        propertyOpt = Option.builder()
            .option("D")
            .argName("property=value")
            .hasArg()
            .valueSeparator()
            .numberOfArgs(2)
            .desc("Use value for given properties")
            .build();


        options.addOption(helpOpt);
        options.addOption(searchOpt);
        options.addOption(replaceOpt);
        options.addOption(printOpt);
        options.addOption(openOpt);
        options.addOption(propertyOpt);
    }

    public CommandLine parseArgs(String[] args) throws ParseException {
        return parser.parse(options, args);
    }

    public void exec(CommandLine cmd) {
        if (cmd.hasOption(helpOpt)) {// 打印帮助信息
            helpFormatter.printHelp("ctrl-h", options);
        }
        if (cmd.hasOption(searchOpt)) {// TODO: 执行查询

        }
        if (cmd.hasOption(replaceOpt)) {// TODO: 执行替换

        }
        if (cmd.hasOption(propertyOpt)) {
            Properties properties = cmd.getOptionProperties(propertyOpt);
            String target = properties.getProperty("target");
            String cond = properties.getProperty("cond");
            String with_else = properties.getProperty("with_else");
            String with_catch = properties.getProperty("with_catch");
            String with_finally = properties.getProperty("with_finally");
            String forInit = properties.getProperty("forInit");
            String forUpdate = properties.getProperty("forUpdate");
            // TODO: 增加其他属性

            System.out.println("target: " + target);
            System.out.println("with_else: " + with_else);
            System.out.println("cond: " + cond);

            // TODO: 处理属性, 将属性发送给对应的查询类

        }
        if (cmd.hasOption(printOpt)) {// TODO: 打印前一次查询结果

        }
        if (cmd.hasOption(openOpt)) {
            String idx = cmd.getOptionValue(openOpt);
            // TODO: 打开输出中第idx个查询结果
            System.out.println(idx);
//            系统调用示例: code -g <filename>:<row>:<column>
//            Runtime.getRuntime().exec("cmd /c code -g C:/Users/86187/Desktop/dp.md:5");
        }
    }

    public static void main(String[] args) throws ParseException {
        // 模拟用户输入参数
        String[] Args = new String[]{
//                "ctrl-h",
                "-ho",
                "45",
                "-s",
                "-Dtarget=if",
                "-Dcond=i>0",
        };
        CLI cli = new CLI();
        cli.setOptions();
        CommandLine cmd = cli.parseArgs(Args);
        cli.exec(cmd);
    }
}
