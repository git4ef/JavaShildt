package main.java.com.ef.javacore.chapter15;

interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void runGenericFuncInterDemo() {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };
        System.out.println("reverse with Generic Func -> Lambda: " + reverse.func("Lambda"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 0; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("factorial 3 =" + factorial.func(3));
    }
}

