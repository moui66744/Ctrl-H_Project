package Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class CLITest {
    public static void main(String[] args) throws InterruptedException {
        long s = LocalTime.now().getLong(ChronoField.MILLI_OF_DAY);
        Thread.sleep(1000);
        long e = LocalTime.now().getLong(ChronoField.MILLI_OF_DAY);
        System.out.println(e-s);
    }
}
