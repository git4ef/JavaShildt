package main.java.com.ef.javacore.chapter10;

public class ThrowsDemo {
    public static void throwOne() throws IllegalAccessException {
        System.out.println("in method throwOne().");
        throw  new IllegalAccessException("demo");
    }
}
