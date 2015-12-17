package edu.coldserenity.tij.ch04.ex01;

/**
 * Exercise 1: (1)
 * <p/>
 * Create a class containing an uninitialized String reference.
 * Demonstrate that this reference is initialized by Java to null.
 */
public class InitializationTest {
    String uninitializedString;

    public static void main(String[] args) {
        InitializationTest it = new InitializationTest();
        System.out.println("it.uninitializedString=" + it.uninitializedString);
    }
}
