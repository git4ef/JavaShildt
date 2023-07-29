package main.java.com.ef.javacore.chapter10;

import java.util.Random;

public class MultipleCatches {
    public static void runMultipleCatches(){
        try {
            int a = 0;
            System.out.println("a = " + a);
            int b =42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e){
            System.out.println("Catch / by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch outside array " + e);
        }
        System.out.println("after block try/catch");
    }
}
