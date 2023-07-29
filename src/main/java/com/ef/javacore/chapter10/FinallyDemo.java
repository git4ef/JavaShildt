package main.java.com.ef.javacore.chapter10;

public class FinallyDemo {

    public static void procA() {
        try {
            System.out.println("in method procA()");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("Operator finally in method procA");
        }
    }
    public static void procB() {
        try {
            System.out.println("in method procB()");
            return;
        } finally {
            System.out.println("Operator finally in method procB");
        }
    }
    public static void procC() {
        try {
            System.out.println("in method procC()");
        } finally {
            System.out.println("Operator finally in method procC");
        }
    }
}
