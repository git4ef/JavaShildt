package main.java.com.ef.javacore.chapter15;

interface NumericFunc {
    int func(int i);
}

public class BlockLambdaDemo {
    public static void runBlockLambdaDemo() {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("factorial 3 = " + factorial.func(3));
        System.out.println("factorial 5 = " + factorial.func(5));
    }
}
