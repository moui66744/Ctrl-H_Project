// a single test containing all the situations need to be realized in stage 1 & 2


import JavaParser.JavaBaseVisitor;
import JavaParser.JavaParser;
import JavaParser.JavaParser.StatementContext;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

//test class declaration
public class DummyTest extends Class1 implements impl1, impl2 {
    final int data = 0;
    final int a[] /* test */ = {0, 1, 2, 3};
    var ab = 123;
    public static int retinput(int input) {
        int i;
        return input;
    }

    //    test method declaration
    public static void main(String[] args) {

//        test int variable declaration and calculation
        int i;
        i = 1 * 2;
        i = 2 * i;

//        test array declaration
        int[] a = new int[5];
        a[0] = 0;

//        test "for"
        for (i = 0; i < 5; i++) {
            if (a == 0) {
                a = 0;
            }
            System.out.print(i);
        }
        System.out.print("\n");

//        test "while" and nested "while"
        i = 0;
        while (i < 5) {
            System.out.print(i);
            i++;
            int j = 0;
            while (j < 10) {
                System.out.print(j);
                j++;
                continue;
            }
        }
        System.out.print("\n");

//        test "do-while"
        i = 0;
        do {
            System.out.print(i);
            i++;
            if (a == 0) {
                a = 0;
                break;
            }
        }
        while (i < 5);
        System.out.print("\n");

//        test "if with else"
        if (i == 0) System.out.print("i==0\n");
        else System.out.print("i!=0\n");

//        test "if without else"
        if (i == 1) System.out.print("i==1\n");

//        test try-catch-throw
        try {
            i /= 0;
        } catch (IOException e1) {
            System.out.println("error");
        } catch (Exception e2) {
            throw new RuntimeException();
        }

        try {
            i /= 0;
        } finally {
            i++;
        }

//        test "switch"
        switch (i) {
            case 1: {
                fun1();
                break;
            }
            case 2: {
                func2();
                break;
            }
            default: {
                fun();
                if (a == 0) {
                    assert a == 0;
                }
                break;
            }
        }

        // replease test
        if ((a > 0 && b == 0) || c < 0) {
            doSth();
        } else {
            doSth();
        }

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                }
            }
            if (d == 0) {
            }
        }

        if (a == 0) {
            if (b == 0) {
            }
        }

        if (a == 0) {
            if (c == 0) {
            }
        }

        for(int i=0; i<1; i++)
            i++;

    }
}

public interface inter1 extends inter2 {
    public static void main(String[] args) {
        System.out.printf("This is inter1");
    }
}
