package edu.coldserenity.tij.ch08.ex02;

/**
 * Exercise 2: (1)
 *
 * Create a class as abstract without including any abstract methods
 * and verify that you cannot create any instances of that class.
 */
public class AbstractTest {
    public static void main(String[] args) {
        // new AbstractClass();
        //   ^-- produces error:
        // Error:(11, 9) java: edu.coldserenity.tij.ch08.ex02.AbstractClass is abstract; cannot be instantiated
    }
}

abstract class AbstractClass {
    public void methed() {}
}
