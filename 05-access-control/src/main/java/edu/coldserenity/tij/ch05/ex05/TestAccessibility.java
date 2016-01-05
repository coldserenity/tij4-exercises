package edu.coldserenity.tij.ch05.ex05;

import edu.coldserenity.tij.ch05.ex05.somepackage.TestClass;

/**
 * Exercise 5: (2)
 * <p/>
 * Create a class with public, private, protected, and package-access
 * fields and method members. Create an object of this class and see what
 * kind of compiler messages you get when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package.
 */
public class TestAccessibility {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.publicMethod();

        // Error:(19, 11) java: packageMethod() is not public in edu.coldserenity.tij.ch05.ex05.somepackage.TestClass; cannot be accessed from outside package
        //tc.packageMethod();

        // Error:(22, 11) java: protectedMethod() has protected access in edu.coldserenity.tij.ch05.ex05.somepackage.TestClass
        //tc.protectedMethod();

        // Error:(25, 11) java: privateMethod() has private access in edu.coldserenity.tij.ch05.ex05.somepackage.TestClass
        //tc.privateMethod();
    }
}
