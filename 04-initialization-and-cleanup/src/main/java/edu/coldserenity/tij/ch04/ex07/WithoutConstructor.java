package edu.coldserenity.tij.ch04.ex07;

/**
 * Exercise 7: (1)
 * <p/>
 * Create a class without a constructor, and then create an object of that
 * class in main( ) to verify that the default constructor is automatically
 * synthesized.
 */
public class WithoutConstructor {
    public static void main(String[] args) {
        System.out.println("Default constructor has been generated: "+new WithoutConstructor());
    }
}
