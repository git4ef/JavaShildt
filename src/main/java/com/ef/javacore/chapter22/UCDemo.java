package main.java.com.ef.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://twitter.com");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d == 0) System.out.println("Сведения отсутсвуют");
        else System.out.println("Дата: " + new Date(d));

        System.out.println("Тип содержимого" + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0) System.out.println("Сведения о сроке действия отсутствуют");
        else System.out.println("Срок действия истекат " + new Date(d));

        d = hpCon.getLastModified();
        if (d == 0) System.out.println("Сведения о дате последней модификации отсутствуют");
        else System.out.println("Дата последней модификации " + new Date(d));

        long len = hpCon.getContentLengthLong();
        if (len == -1) System.out.println("Длина содержимого недоступна");
        else System.out.println("Длина содержимого " + len);

        if (len != 0) {
            System.out.println("=== Содержимое ===");
            InputStream inputStream = hpCon.getInputStream();
            while (((c = inputStream.read()) != -1)) {
                System.out.print((char) c);
            }
            inputStream.close();
        } else {
            System.out.println("Содержимое недоступно");
        }
    }
}
