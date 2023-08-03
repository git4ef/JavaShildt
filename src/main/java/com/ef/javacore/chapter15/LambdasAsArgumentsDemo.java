package main.java.com.ef.javacore.chapter15;

interface StringFuncForArgs {
    String func(String n);
}

public class LambdasAsArgumentsDemo {

    static String stringOp(StringFuncForArgs sf, String s) {
        return sf.func(s);
    }

    public static void runLambdasAsArgs() {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ') result += str.charAt(i);
            return result;
        }, inStr);

        System.out.println("Это строка с удаленными пробелами: " + outStr);

        StringFuncForArgs reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));

    }
}
