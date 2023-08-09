package main.java.com.ef.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail(("Пётр"), "555-5555", "petr@mail.com"));
        myList.add(new NamePhoneEmail(("Вася"), "444-4444", "vasya@mail.com"));
        myList.add(new NamePhoneEmail(("Ольга"), "333-3333", "olga@mail.com"));


        Stream<NamePhone> namePhoneStream = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));
        List<NamePhone> npList = namePhoneStream.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке типа List:");
        for (NamePhone e :
                npList) {
            System.out.println(e.name + ": " + e.phonenum);

            namePhoneStream = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));
        }

        Set<NamePhone> namePhoneSet = namePhoneStream.collect(Collectors.toSet());
        System.out.println("\nИмена и номера телефонов в множестве типа Set:");
        for (NamePhone e :
                namePhoneSet) {
            System.out.println(e.name + ": " + e.phonenum);
        }
    }
}
