package main.java.com.ef.javacore.chapter15;

interface MyFuncForConstructor2 <T> {
    MyClassForConstructorRef2 <T> func(T n);
}

class MyClassForConstructorRef2 <T> {
    private T val;

    MyClassForConstructorRef2(T v) {
        val = v;
    }

    MyClassForConstructorRef2() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void runConstructorRefDemo() {
        MyFuncForConstructor2<Integer> myClassCons = MyClassForConstructorRef2<Integer>::new;

        MyClassForConstructorRef2 mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc = " + mc.getVal());
    }
}
