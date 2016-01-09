package edu.coldserenity.tij.ch05.ex08;

/**
 * Exercise 8: (1)
 * <p/>
 * Create a base class with only a non-default constructor,
 * and a derived class with both a default (no-arg) and
 * non-default constructor.
 * In the derived-class constructors, call the base-class
 * constructor.
 */
public class TestClass {
    public static void main(String[] args) {
        new DerivedClass();
        System.out.println("");
        new DerivedClass("test");
    }
}

class BaseClass {
    public BaseClass(String message) {
        System.out.printf("BaseClass(%s)\n", message);
    }
}

class DerivedClass extends BaseClass {
    public DerivedClass() {
        super("Default");
        System.out.println("DerivedClass()");
    }

    public DerivedClass(String message) {
        super(message);
        System.out.printf("DerivedClass(%s)", message);
    }
}