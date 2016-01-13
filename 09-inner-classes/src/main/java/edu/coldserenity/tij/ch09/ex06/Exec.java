package edu.coldserenity.tij.ch09.ex06;

import edu.coldserenity.tij.ch09.ex06.own.InterfaceWithAtLeast;
import edu.coldserenity.tij.ch09.ex06.third.InheritMyClass;

/**
 * Exercise 6: (2)
 * <p/>
 * Create an interface with at least one method, in its own package. Create a
 * class in a separate package. Add a protected inner class that implements the
 * interface. In athird package, inherit from your class and, inside a method,
 * return an object of the protected inner class, upcasting to the interface
 * during the return.
 */
public class Exec {
    public static void main(String[] args) {
        InterfaceWithAtLeast v = new InheritMyClass().insideAMethod();
        System.out.println(v);
        v.oneMethod();
    }
}
