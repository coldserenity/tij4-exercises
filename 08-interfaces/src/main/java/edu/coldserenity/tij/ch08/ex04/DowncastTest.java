package edu.coldserenity.tij.ch08.ex04;

/**
 * Exercise 4: (3)
 * <p/>
 * Create an abstract class with no methods. Derive a class and add a
 * method. Create a static method that takes a reference to the base
 * class, downcasts it to the derived class, and calls the method.
 * In main( ), demonstrate that it works. Now put the abstract
 * declaration for the method in the base class, thus eliminating
 * the need for the downcast.
 */
public class DowncastTest {
    public static void main(String[] args) {
        Abstract a = new Derived();

        Derived.downcastAndCallPrint(a);
        a.noNeedToDowncast();
    }
}

abstract class Abstract {
    abstract void noNeedToDowncast();
}

class Derived extends Abstract {
    public void print() {
        System.out.println("Derived.print()");
    }

    public static void downcastAndCallPrint(Abstract a) {
        ((Derived)a).print();
    }

    @Override
    void noNeedToDowncast() {
        System.out.println("Derived.noNeedToDowncast()");
    }
}