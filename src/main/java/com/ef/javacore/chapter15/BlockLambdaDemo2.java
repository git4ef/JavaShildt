package main.java.com.ef.javacore.chapter15;

interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo2 {

    public static void runBlockLambdaDemo2() {
        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("reverse 'Lambda' -> " + reverse.func("Lambda"));
        System.out.println("reverse 'Value' -> " + reverse.func("Value"));
    }
}
