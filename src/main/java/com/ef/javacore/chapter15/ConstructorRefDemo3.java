package main.java.com.ef.javacore.chapter15;

interface MyFuncForFactory<R, T> {
    R func(T n);
}

class MyClassForFactory<T> {
    private T val;

    MyClassForFactory(T v) {
        val = v;
    }

    MyClassForFactory() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClassForFactory2 {
    String str;

    MyClassForFactory2(String s) {
        str = s;
    }

    MyClassForFactory2() {
        str = "";
    }

    String getVal() {
        return str;
    }
}


public class ConstructorRefDemo3 {

    static <R, T> R myClassFactory(MyFuncForFactory<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void runFactory() {
        MyFuncForFactory<MyClassForFactory<Double>, Double> myClassCons = MyClassForFactory<Double>::new;
        MyClassForFactory<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc = " + mc.getVal());

        MyFuncForFactory<MyClassForFactory2, String> myFuncForFactory2 = MyClassForFactory2::new;
        MyClassForFactory2 mc2 = myClassFactory(myFuncForFactory2, "Лямбда");
        System.out.println("Значение str в объекте mc2 = " + mc2.getVal());
    }
}

