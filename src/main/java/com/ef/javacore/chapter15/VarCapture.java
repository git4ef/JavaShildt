package main.java.com.ef.javacore.chapter15;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    int num = 10;

    MyFunc myLambda = (n) -> {
        int v = num + n;
        //    num++;
        return v;
    };
}
