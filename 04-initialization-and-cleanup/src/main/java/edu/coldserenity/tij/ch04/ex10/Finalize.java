package edu.coldserenity.tij.ch04.ex10;

/**
 * Exercise 10: (2)
 *
 * Create a class with a finalize( ) method that prints a message.
 * In main( ), create an object of your class. Explain the behavior of your program.
 */
public class Finalize {

    @Override
    protected void finalize() {
        System.out.println("In finalize()");
    }

    public static void main(String[] args) {
        new Finalize();

        // Explanation
        // Because program does not run out of memory,
        // garbage collector and thus finalize() never get called.
    }
}
