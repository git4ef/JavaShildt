package main.java.com.ef.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();

        arrayList.add(1.1);
        arrayList.add(3.6);
        arrayList.add(9.2);
        arrayList.add(4.7);
        arrayList.add(12.1);
        arrayList.add(5.0);

        System.out.print("Исходные значения из списка myList: ");
        arrayList.stream().forEach((a) -> System.out.print(a + " "));
        System.out.println();

        IntStream intStream = arrayList.stream().mapToInt((a) -> (int) Math.ceil(a));
        System.out.print("Максимально допустимые пределы значений" + "из списка myList: ");
        intStream.forEach((a) -> {
            System.out.print(a + " ");
        });
    }
}
