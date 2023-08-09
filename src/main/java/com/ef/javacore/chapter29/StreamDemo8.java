package main.java.com.ef.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Альфа");
        arrayList.add("Бета");
        arrayList.add("Гамма");
        arrayList.add("Дельта");
        arrayList.add("Кси");
        arrayList.add("Омега");

        Stream<String> myStream = arrayList.stream();

        Iterator<String> iterator = myStream.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
