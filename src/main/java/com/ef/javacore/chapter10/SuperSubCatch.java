package main.java.com.ef.javacore.chapter10;

public class SuperSubCatch {
    public static void runSuperSunCatch() {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("Unreachable, because it is a subclass of Exception");
        } catch (Exception e) {
            System.out.println("Catch Exception.java");
        }
    }
}
