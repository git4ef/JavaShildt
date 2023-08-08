package main.java.com.ef.javacore.chapter20;

import main.java.com.ef.javacore.chapter13.MyClass;

import java.io.*;

class MyClassS implements Serializable {
    String s;
    int i;
    double d;

    public MyClassS(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}


public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClassS object1 = new MyClassS("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objectOutputStream.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClassS object2 = (MyClassS) objectInputStream.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десериализации: " + e);
            System.exit(0);
        }
    }
}
