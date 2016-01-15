package edu.coldserenity.tij.ch09.ex21;

/**
 * Exercise 21: (2)
 * <p/>
 * Create an interface that contains a nested class that has a static method
 * that calls the methods of your interface and displays the results.
 * Implement your interface and pass an instance of your implementation to the method.
 */
public class PlayWithNestyClasses {
    public static void main(String[] args) {
        Interface.NestyClass.display(new Impl());
    }
}

interface Interface {
    int f();

    String g();

    class NestyClass {
        public static void display(Interface inf) {
            System.out.println("inf.f(): " + inf.f());
            System.out.println("inf.g(): " + inf.g());
        }
    }
}

class Impl implements Interface {

    @Override
    public int f() {
        return 100;
    }

    @Override
    public String g() {
        return "100.500";
    }
}
