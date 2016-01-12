package edu.coldserenity.tij.ch08.ex05;

import edu.coldserenity.tij.ch08.ex05.different.InterfaceImpl;

/**
 * Exercise 5: (2)
 * <p/>
 * Create an interface containing three methods, in its own package.
 * Implement the interface in a different package.
 */
public class InterfacesAndPackages {
    public static void main(String[] args) {
        new InterfaceImpl().print();
    }
}
