package edu.coldserenity.tij.ch09.ex15;

/**
 * Exercise 15: (2)
 * <p/>
 * Create a class with a non-default constructor (one with arguments) and
 * no default constructor (no "no-arg" constructor). Create a second class
 * that has a method that returns a reference to an object of the first
 * class. Create the object that you return by making an anonymous inner
 * class that inherits from the first class.
 */
public class NonDefaultConstructorInAnonymousClasses {
    public static void main(String[] args) {
        System.out.println(new SecondClass().getInstance(100));
    }
}

class SimpleClass {
    int x;

    public SimpleClass(int x) {
        this.x = x;
    }
}

class SecondClass {
    public SimpleClass getInstance(int x) {
        return new SimpleClass(x) {
            {
                this.x = x * 2;
            }

            @Override
            public String toString() {
                return "$classname{x=" + x + "}";
            }
        };
    }
}