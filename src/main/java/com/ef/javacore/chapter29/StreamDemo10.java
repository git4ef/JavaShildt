package main.java.com.ef.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Альфа");
        arrayList.add("Бета");
        arrayList.add("Гамма");
        arrayList.add("Дельта");
        arrayList.add("Кси");
        arrayList.add("Омега");

        Stream<String> myStream = arrayList.stream();

        Spliterator<String> spliterator = myStream.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        if (spliterator2 != null) {
            System.out.println("Результат, выводимый итератором spliterator2: ");
            spliterator2.forEachRemaining((n) -> System.out.println(n));
        }
        System.out.println("\nРезультат, выводимый итератором spliterator: ");
        spliterator.forEachRemaining((n) -> System.out.println(n));
    }
}
