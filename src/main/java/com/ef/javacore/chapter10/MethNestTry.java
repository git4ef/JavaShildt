package main.java.com.ef.javacore.chapter10;

public class MethNestTry {
    public static void nesttry(int a) {
        try {
            if (a == 1)
                a = a / (a - a);
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch outside array" + e);
        }
    }
}
