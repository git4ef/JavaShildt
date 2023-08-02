package main.java.com.ef.javacore.chapter15;


interface MyNumber {
    double getValue();
}

public class LambdaDemo {

    public static void runLambdaDemo() {
        MyNumber myNumber;
        myNumber = () -> 123.45;

        System.out.println("fix value: " + myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println("Random value: " + myNumber.getValue());
        System.out.println("More one random value: " + myNumber.getValue());

        // myNumber = () -> "123.03";
    }
}
