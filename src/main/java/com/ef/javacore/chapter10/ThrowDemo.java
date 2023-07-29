package main.java.com.ef.javacore.chapter10;

public class ThrowDemo {
    public static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Exception caught in demoproc() method.");
            throw e;
        }
    }
}
