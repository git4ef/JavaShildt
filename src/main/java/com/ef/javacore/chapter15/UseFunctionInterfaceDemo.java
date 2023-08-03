package main.java.com.ef.javacore.chapter15;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void runFuncInterface() {
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Факториал числа 3 = " + factorial.apply(3));
        System.out.println("Факториал числа 5 = " + factorial.apply(5));
    }
}
