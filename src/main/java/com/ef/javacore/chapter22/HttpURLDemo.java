package main.java.com.ef.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;


public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection httpURLConnection = (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запроса: "+httpURLConnection.getRequestMethod());
        System.out.println("Ко ответа: "+httpURLConnection.getResponseCode());
        System.out.println("Ответное сообщение: "+httpURLConnection.getResponseMessage());

        Map<String, List<String>> hdrMap = httpURLConnection.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок:");

        for(String k:hdrField) {
            System.out.println("Ключ: "+k+" Значение: "+hdrMap.get(k));
        }
    }
}
