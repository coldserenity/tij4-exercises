package edu.coldserenity.tij.ch06.ex05;

/**
 * Exercise 5: (1)
 * <p/>
 * Create two classes, A and B, with default constructors
 * (empty argument lists) that announce themselves.
 * <p/>
 * Inherit a new class called C from A, and create a member of
 * class B inside C. Do not create a constructor for C.
 * Create an object of class C and observe the results.
 */
public class TestClass {
    public static void main(String[] args) {
        new C();
    }
}

class A {
    public A() {
        System.out.println("A()");
    }
}

class B {
    public B() {
        System.out.println("B()");
    }
}

class C extends A {
    B b = new B();
}