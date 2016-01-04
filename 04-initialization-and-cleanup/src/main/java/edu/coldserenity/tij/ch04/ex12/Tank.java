package edu.coldserenity.tij.ch04.ex12;

/**
 * Exercise 12: (4)
 * <p/>
 * Create a class called Tank that can be filled and emptied, and has a
 * termination condition that it must be empty when the object is cleaned up.
 * Write a finalize( ) that verifies this termination condition.
 * In main( ), test the possible scenarios that can occur when your Tank is used.
 */
public class Tank {
    boolean isFull;

    public Tank(boolean isFull) {
        this.isFull = isFull;
    }

    @Override
    protected void finalize() throws Throwable {
        if (isFull) {
            System.out.println("One does not simply go and garbage-collect a FULL tank!");
        } else {
            System.out.println("Tank's empty, go and GC it");
        }
    }

    public static void main(String[] args) {
        new Tank(true);
        System.gc();

        new Tank(false);
        System.gc();
    }
}
