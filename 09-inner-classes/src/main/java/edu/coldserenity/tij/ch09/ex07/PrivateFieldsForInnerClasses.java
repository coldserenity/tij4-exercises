package edu.coldserenity.tij.ch09.ex07;

/**
 * Exercise 7: (2)
 * <p/>
 * Create a class with a private field and a private method. Create an
 * inner class with a method that modifies the outer-class field and
 * calls the outer-class method.
 * In a second outer-class method, create an object of the inner class
 * and call its method, then show the effect on the outer-class object.
 */
public class PrivateFieldsForInnerClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("Initial state of new Outer object: \n" + outer);
        outer.secondMethod();
        System.out.println("\nAfter calling Outer.secondMethod(): \n" + outer);
    }
}

class Outer {
    private Integer privateField = 100;

    private void privateMethod() {
        System.out.println("Outer.privateMethod() was triggered");
    }

    public void secondMethod() {
        new Inner().trickyMethod();
    }

    class Inner {
        void trickyMethod() {
            privateField = 300;
            privateMethod();
        }
    }

    @Override
    public String toString() {
        return "Outer{" +
                "privateField=" + privateField +
                '}';
    }
}
