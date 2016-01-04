package edu.coldserenity.tij.ch04.ex17;

/**
 * Exercise 17: (2)
 * <p/>
 * Create a class with a constructor that takes a String argument.
 * During construction, print the argument.
 * <p/>
 * Create an array of object references to this class, but don’t
 * actually create objects to assign into the array.
 * When you run the program, notice whether the initialization
 * messages from the constructor calls are printed.
 */
public class ObjectArray {
    public ObjectArray(String name) {
        System.out.printf("In ObjectArray(%s)", name);
    }

    public static void main(String[] args) {
        ObjectArray[] objectArray = new ObjectArray[5];
        // initialization message is not printed
    }
}
