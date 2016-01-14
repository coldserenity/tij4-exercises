package edu.coldserenity.tij.ch08.ex20;

/**
 * Exercise 20: (1)
 * <p/>
 * Create an interface containing a nested class. Implement this interface
 * and create an instance of the nested class.
 */
public class InterfaceWithNestedClass {
    public static void main(String[] args) {
        Interface instance = new Interface.NestedClass();
        System.out.println(instance);
        instance.f();
    }
}

interface Interface {
    void f();

    class NestedClass implements Interface {

        @Override
        public void f() {
            System.out.println("NestedClass.f()");
        }
    }
}
