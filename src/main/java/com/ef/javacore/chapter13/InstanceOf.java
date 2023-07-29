package main.java.com.ef.javacore.chapter13;

public class InstanceOf {
    class A {
        int i, j;
    }

    class B {
        int i, j;
    }

    class C extends A {
        int k;
    }

    class D extends A {
        int k;
    }

    public void runInstanceOf() {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("a instance A");
        if (b instanceof B)
            System.out.println("b instance B");
        if (c instanceof C)
            System.out.println("c instance A");
        if (c instanceof A)
            System.out.println("c type class A");

        if (a instanceof C)
            System.out.println("a type class C");

        System.out.println();

        A ob;

        ob = d;
        System.out.println("ob = d");
        if (ob instanceof D)
            System.out.println("ob is D");
        System.out.println();

        ob = c;
        System.out.println("ob = c");

        if (ob instanceof D)
            System.out.println("ob type class D");
        else
            System.out.println("ob type not class D");

        if (ob instanceof A)
            System.out.println("ob type class A");

        System.out.println();

        if (a instanceof Object) System.out.println("a type Object");
        if (b instanceof Object) System.out.println("b type Object");
        if (c instanceof Object) System.out.println("c type Object");
        if (d instanceof Object) System.out.println("d type Object");
    }
}
