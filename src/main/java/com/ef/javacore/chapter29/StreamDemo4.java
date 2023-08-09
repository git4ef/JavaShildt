package main.java.com.ef.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();

        arrayList.add(7.0);
        arrayList.add(18.0);
        arrayList.add(10.0);
        arrayList.add(24.0);
        arrayList.add(17.0);
        arrayList.add(5.0);

        Stream<Double> sqrtRootStream = arrayList.stream().map((a) -> Math.sqrt(a));

        double productOfSqrRoots = sqrtRootStream.reduce(1.0, (a, b) -> a * b);

        System.out.println("Произведение квадратных корней равно " + productOfSqrRoots);
    }
}
