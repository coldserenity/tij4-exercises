package edu.coldserenity.tij.ch07.ex10;

/**
 * Exercise 10: (3)
 * <p/>
 * Create a base class with two methods. In the first method,
 * call the second method.
 * Inherit a class and override the second method.
 * Create an object of the derived class, upcast it to the
 * base type, and call the first method. Explain what happens.
 * <p/>
 * =====================
 * Explanation
 * Because there is no first() implementation in Heir, first
 * from base class is called.
 * It then calls second(), but since there exists
 * re-implementation of this method in Heir, it has been
 * dynamically bound to base instance when we created it via
 * new Heir() and hence overridden second() got called.
 */
public class PolymorphicTest {
    public static void main(String[] args) {
        BaseClass base = new Heir();
        base.first();
    }
}

class BaseClass {
    public void first() {
        System.out.println("BaseClass.first()");
        second();
    }

    public void second() {
        System.out.println("BaseClass.second()");
    }
}

class Heir extends BaseClass {
    @Override
    public void second() {
        System.out.println("Heir.second()");
    }
}