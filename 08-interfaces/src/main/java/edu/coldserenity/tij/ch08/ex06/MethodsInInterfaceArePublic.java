package edu.coldserenity.tij.ch08.ex06;

import edu.coldserenity.tij.ch08.ex05.different.InterfaceImpl;
import edu.coldserenity.tij.ch08.ex05.own.Interface;

/**
 * Exercise 6: (2)
 * <p/>
 * Prove that all the methods in an interface are automatically public.
 */
public class MethodsInInterfaceArePublic {
    public static void main(String[] args) {
        Interface impl = new InterfaceImpl();
        impl.print(); // it's public
    }
}
