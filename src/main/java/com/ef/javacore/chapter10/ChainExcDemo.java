package main.java.com.ef.javacore.chapter10;

public class ChainExcDemo {
    public static void demoproc() {
        NullPointerException e = new NullPointerException("upper lvl");

        e.initCause(new ArithmeticException("reason"));
        throw e;
    }
}
