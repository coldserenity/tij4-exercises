package edu.coldserenity.tij.ch08.ex03;

/**
 * Exercise 3: (2)
 * <p/>
 * Create a base class with an abstract print( ) method that is
 * overridden in a derived class. The overridden version of the
 * method prints the value of an int variable defined in the derived
 * class. At the point of definition of this variable, give it a
 * nonzero value.
 * In the base-class constructor, call this method. In main( ),
 * create an object of the derived type, and then call its print( )
 * method. Explain the results.
 * <p/>
 * ===========================
 * Explanation:
 * Because Derived class initialization begins only after base class
 * has been fully initialized. While in the base class we call method
 * that references members of the derived class which hasn't been
 * properly initialized yet.
 * 0 value is because all space allocated to object is initialized
 * to 0 as the first step in object creation.
 */
public class InitializationTest {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.print();
    }
}

abstract class Base {
    public Base() {
        print();
    }

    abstract void print();
}

class Derived extends Base {
    int variable = 100;

    @Override
    void print() {
        System.out.println("variable=" + variable);
    }
}
