package main.java.com.ef.javacore.chapter15;

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayExc;
}

public class LambdaExceptionDemo {
    public static void runLambdaExcDemo() throws EmptyArrayExc {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        DoubleNumericArrayFunc avarage = (n) -> {
            double sum = 0;

            if (n.length == 0) throw new EmptyArrayExc();

            for (int i = 0; i < n.length; i++) sum += n[i];

            return sum / n.length;
        };

      //  System.out.println("Avarage = " + avarage.func(values));

        System.out.println("Avarage = " + avarage.func(new double[0]));
    }
}



