package main.java.com.ef.javacore.chapter10;

public class ExceptionDemo {
    public static void compute(int a) throws MyException {
        System.out.println("call method compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("normal completion");

    }
}


