package edu.coldserenity.tij.ch04.ex16;

/**
 * Exercise 16: (1)
 * <p/>
 * Create an array of String objects and assign a String to each element.
 * Print the array by using a for loop.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] array = new String[] {"one", "two", "three"};
        for (String s: array) {
            System.out.println(s);
        }
    }
}
