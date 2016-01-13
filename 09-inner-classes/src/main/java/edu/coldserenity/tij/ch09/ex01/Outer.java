package edu.coldserenity.tij.ch09.ex01;

/**
 * Exercise 1: (1)
 * <p/>
 * Write a class named Outer that contains an inner class named Inner.
 * Add a method to Outer that returns an object of type Inner.
 * In main( ), create and initialize a reference to an Inner.
 */
public class Outer {
    class Inner {
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Inner inner = new Outer().getInner();
        System.out.println(inner);
    }
}
