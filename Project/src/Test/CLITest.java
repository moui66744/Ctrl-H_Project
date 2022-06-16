package Test;

import runtime.CLI;

import java.io.IOException;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class CLITest {
    public static void main(String[] args) throws InterruptedException {
        CLI cli = new CLI();
        cli.setOptions();
        String [] Args = new String[]{
                "-p",
                "../../antlr4/",
                "-d","out/res.json",
                "-l","java",
                "-t",""
        };
        int index = Args.length - 1;

        String [] TestCase = new String[]{
                "if (){}",
                "for(;;){}",
                "if (){<<empty>>}",
                "if () {} else {<<null>>}",
                "while(){}",
                "while(true){\\break;}",
                "a == 0",
                "i++",
                "public class <<>> {}"

          };
        for (var item : TestCase) {
            Args[index] = item;
            long s = LocalTime.now().getLong(ChronoField.MILLI_OF_DAY);
            try {
                cli.parseArgs(Args);
                cli.exec();
            } catch (IOException e) {
                System.err.println("No such file or directory: " + e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
//            e.printStackTrace();
            }
            long e = LocalTime.now().getLong(ChronoField.MILLI_OF_DAY);
            System.out.println(item +"," + (e - s));
        }
    }
}
