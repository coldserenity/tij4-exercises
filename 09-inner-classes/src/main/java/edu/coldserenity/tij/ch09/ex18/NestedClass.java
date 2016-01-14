package edu.coldserenity.tij.ch09.ex18;

/**
 * Exercise 18: (1)
 * <p/>
 * Create a class containing a nested class. In main( ), create an instance
 * of the nested class.
 */
public class NestedClass {
    public static void main(String[] args) {
        System.out.println(new A.B());
    }
}

class A {
    static class B {

    }
}
