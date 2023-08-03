package main.java.com.ef.javacore.chapter15;

interface StringFuncForRef2 {
    String func(String n);
}

class MyStringOps2 {
    String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) result += str.charAt(i);

        return result;
    }
}

public class MethodRefDemo2 {
    static String stringOp(StringFuncForRef sf, String s) {
        return sf.func(s);
    }

    public static void runMethodRefDemo() {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOps2 strOps = new MyStringOps2();

        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + inStr);
    }
}
