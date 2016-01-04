package edu.coldserenity.tij.ch04.ex09;

/**
 * Exercise 9: (1)
 * <p/>
 * Create a class with two (overloaded) constructors.
 * Using this, call the second constructor inside the first one.
 */
public class ThisConstructor {
    public ThisConstructor() {
        System.out.println("In ThisConstructor()");
    }

    public ThisConstructor(String message) {
        this();
        System.out.println("In ThisConstructor(String message)");
    }

    public static void main(String[] args) {
        new ThisConstructor("Hello");
    }
}
