package main.java.com.ef.javacore.chapter15;

interface MyFuncForConstructor {
    MyClassForConstructorRef func(int n);
}

class MyClassForConstructorRef {
    private int val;

    MyClassForConstructorRef(int v) {
        val = v;
    }

    MyClassForConstructorRef() {
        val = 0;
    }

    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void runConstructorRefDemo() {
        MyFuncForConstructor myClassCons = MyClassForConstructorRef::new;

        MyClassForConstructorRef mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc = " + mc.getVal());
    }
}
