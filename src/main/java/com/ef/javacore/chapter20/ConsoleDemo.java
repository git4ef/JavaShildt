package main.java.com.ef.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;

        console = System.console();

        if (console == null) return;


        str = console.readLine("Введите строку: ");
        console.printf("Выведенная вами строка: %s\n", str);
    }
}
