package main.java.com.ef.javacore.chapter10;

import java.util.Random;

public class HandleError {
    int a,b,c = 0;
    Random random = new Random();
    public void runHandleError(){
        for (int i = 0; i < 32000; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345/(b/c);
            } catch (ArithmeticException e) {
                System.out.println("exc: / by zero");
                a = 0;
            }
            System.out.println("a: "+ a);
        }
    }
}
