package edu.coldserenity.tij.ch05.ex01;

import edu.coldserenity.tij.ch05.ex01.somepack.ClassInAPackage;

/**
 * Exercise 1: (1)
 *
 * Create a class in a package. Create an instance of your class outside of that package.
 */
public class TestClass {
    public static void main(String[] args) {
        ClassInAPackage cip = new ClassInAPackage();
        System.out.println(cip);
    }
}
