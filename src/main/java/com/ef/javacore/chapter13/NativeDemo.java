package main.java.com.ef.javacore.chapter13;

public class NativeDemo {
    int i;

    public static void runNativeDemo() {
        NativeDemo ob = new NativeDemo();
        ob.i=10;

        System.out.println("content ob.i before call PO method:" + ob.i);
        ob.test();
        System.out.println("content ob.i after call PO method:" + ob.i);
    }
    public native void test();
    static {
        System.loadLibrary("NativeDemo");
    }
}
