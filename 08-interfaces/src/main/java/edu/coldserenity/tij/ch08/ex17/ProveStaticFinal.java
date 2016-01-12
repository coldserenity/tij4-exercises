package edu.coldserenity.tij.ch08.ex17;

/**
 * Exercise 17: (2)
 * <p/>
 * Prove that the fields in an interface are implicitly static and final.
 */
public class ProveStaticFinal {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println("a.OBJECT=" + a.OBJECT.toString());
        System.out.println("b.OBJECT=" + b.OBJECT);
        System.out.println("a==b: " + (a.OBJECT == b.OBJECT));

        // a.OBJECT = new Object();
        //   ^-- Error:(17, 10) java: cannot assign a value to final variable OBJECT
    }
}

interface Interface {
    Object OBJECT = new Object();
}

class A implements Interface {
}

class B implements Interface {
}
