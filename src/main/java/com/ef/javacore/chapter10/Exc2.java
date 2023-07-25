package main.java.com.ef.javacore.chapter10;

public class Exc2 {
    int d, a;
    public void runExc2() {
        try {
            d=0;
            a=42/d;
            System.out.println("not show");
        } catch (ArithmeticException e) {
            System.out.println("my catch -> / by zero");
        }
        System.out.println("after catch");
    }
}
