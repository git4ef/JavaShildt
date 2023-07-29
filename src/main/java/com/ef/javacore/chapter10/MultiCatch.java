package main.java.com.ef.javacore.chapter10;

public class MultiCatch {
    public static void runMultiCatch() {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};

        try {
            //  int result = a / b;
            vals[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            System.out.println("Catch exc: " + e);
        }
        System.out.println("After MultiCatch");
    }
}
