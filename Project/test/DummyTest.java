// a single test containing all the situations need to be realized in stage 1

//test class declaration
public class DummyTest {
    final int data = 0;
    final int a [] /* test */ = {0, 1, 2, 3};
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
            System.out.print(i);
        }
        System.out.print("\n");

//        test "while"
        i = 0;
        while (i < 5) {
            System.out.print(i);
            i++;
        }
        System.out.print("\n");

//        test "do-while"
        i = 0;
        do {
            System.out.print(i);
            i++;
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
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}