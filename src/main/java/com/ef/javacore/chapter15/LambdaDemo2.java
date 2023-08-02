package main.java.com.ef.javacore.chapter15;


interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void runLambdaDemo2() {
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("10 even");
        if (!isEven.test(9)) System.out.println("9 odd");

        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("1 non-negative number");
        if (!isNonNeg.test(-1)) System.out.println("-1 negative number");
    }
}
