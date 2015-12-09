package edu.coldserenity.tij.ch02.ex09;

/**
 * Exercise 9: (1)
 * Display the largest and smallest numbers for both float and double
 * exponential notation.
 */
public class LargestAndSmallest {
    public static void main(String[] args) {
        System.out.printf("Largest Float: %e\n", Float.MAX_VALUE);
        System.out.printf("Smallest Float: %e\n", Float.MIN_VALUE);
        System.out.printf("Largest Double: %e\n", Double.MAX_VALUE);
        System.out.printf("Smallest Double: %e\n", Double.MIN_VALUE);
    }
}
