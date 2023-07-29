package main.java.com.ef.javacore.chapter10;

public class NestTry {
    public static void runNestTry() {
        try {
            int a = 2;
            int b = 42 / a;
            System.out.println("a = " + a);
            try {
                if (a == 1)
                    a = a / (a - a);
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Catch outside array");
            }
        } catch (ArithmeticException e) {
            System.out.println("Catch / by zero");
        }
    }
}
