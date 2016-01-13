package edu.coldserenity.tij.ch09.ex05;

/**
 * Exercise 5: (1)
 * <p/>
 * Create a class with an inner class. In a separate class, make an instance of
 * the inner class.
 */
public class TestingInnerClassCreation {
    public static void main(String[] args) {
        System.out.println("Instantiating simple inner class");
        System.out.println(new Outer().new Inner());
        System.out.println("--------------------------------");
        System.out.println("Instantiating static inner class");
        System.out.println(new Outer.StaticInner());
    }
}

class Outer {
    class Inner {
    }

    static class StaticInner {
    }
}
