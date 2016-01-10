package edu.coldserenity.tij.ch06.ex01;

/**
 * Exercise 1: (2)
 * <p/>
 * Create a simple class.
 * Inside a second class, define a reference to an object
 * of the first class.
 * Use lazy initialization to instantiate this object.
 */

public class LazyInitialization {
    SimpleClass lazyReference;

    public static void main(String[] args) {
        System.out.println(new LazyInitialization());
    }

    public SimpleClass getLazyReference() {
        if (lazyReference == null) lazyReference = new SimpleClass();
        return lazyReference;
    }

    @Override
    public String toString() {
        return "LazyInitialization{" +
                "lazyReference=" + getLazyReference() +
                '}';
    }
}

class SimpleClass {

}