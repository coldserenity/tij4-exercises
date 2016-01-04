package edu.coldserenity.tij.ch04.ex20;

import java.util.Arrays;

/**
 * Exercise 20: (1)
 * <p/>
 * Create a main( ) that uses varargs instead of the ordinary main( )
 * syntax. Print all the elements in the resulting args array.
 * Test it with various numbers of command-line arguments.
 */
public class VarargsMain {
    public static void main(String ... args) {
        System.out.println(Arrays.toString(args));
    }
}
