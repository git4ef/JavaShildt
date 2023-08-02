package main.java.com.ef.javacore.chapter15;

interface NumericTest2 {
    boolean test(int n, int d);
}

public class LambdaDemo3 {
    public static void runLambdaDemo3() {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10,2)) System.out.println("2 ");

    }
}
