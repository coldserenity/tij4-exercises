package edu.coldserenity.tij.ch09.ex09;

/**
 * Exercise 9: (1)
 * <p/>
 * Create an interface with at least one method, and implement that
 * interface by defining an inner class within a method, which
 * returns a reference to your interface.
 */
public class MethodInnerClass {
    public Interface methodWithInnerClass() {
        class Inner implements Interface {
            @Override
            public void oneMethod() {
                System.out.println("Inner.oneMethod()");
            }

        }

        return new Inner();
    }


    public static void main(String[] args) {
        System.out.println(new MethodInnerClass().methodWithInnerClass());
    }
}


interface Interface {
    void oneMethod();
}

