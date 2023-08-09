package main.java.com.ef.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone {
    String name;
    String phonenum;

    public NamePhone(String n, String p) {
        name = n;
        phonenum = p;
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail(("Пётр"), "555-5555", "petr@mail.com"));
        myList.add(new NamePhoneEmail(("Вася"), "444-4444", "vasya@mail.com"));
        myList.add(new NamePhoneEmail(("Ольга"), "333-3333", "olga@mail.com"));

        System.out.println("Исходные элементы из списка myList: ");
        myList.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();

        Stream<NamePhone> namePhoneStream = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        System.out.println("Список имен и номеров телефонов: ");
        namePhoneStream.forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum);
        });
    }
}
