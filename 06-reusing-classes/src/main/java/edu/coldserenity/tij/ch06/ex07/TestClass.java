package edu.coldserenity.tij.ch06.ex07;

/**
 * Exercise 7: (1)
 * <p/>
 * Modify Exercise 5 so that A and B have constructors
 * with arguments instead of default constructors.
 * Write a constructor for C and perform all initialization within
 * C’s constructor.
 */
public class TestClass {
    public static void main(String[] args) {
        new C(42);
    }
}

class A {
    public A(int id) {
        System.out.printf("A(%d)\n", id);
    }
}

class B {
    public B(int id) {
        System.out.printf("B(%d)\n", id);
    }
}

class C extends A {
    B b2;
    B b = new B(12);

    public C(int id) {
        super(id);
        b2=new B(2);
        System.out.printf("C(%d)\n", id);
    }
}