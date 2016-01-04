package edu.coldserenity.tij.ch04.ex15;

/**
 * Exercise 15: (1)
 * <p/>
 * Create a class with a String that is initialized using instance initialization.
 */
public class FieldInstanceInitialization {
    public String field;
    {
        field = "Instantly";
    }

    public static void main(String[] args) {
        System.out.println(new FieldInstanceInitialization().field);
    }
}
