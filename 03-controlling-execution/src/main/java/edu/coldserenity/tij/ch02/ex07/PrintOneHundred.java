package edu.coldserenity.tij.ch02.ex07;

/**
 * Exercise 7: (1)
 * Modify Exercise 1 so that the program exits by using the break keyword at value 99.
 * Try using return instead.
 *
 * ORIGINAL EXERCISE
 * Exercise 1: (1)
 * <p/>
 * Write a program that prints values from 1 to 100.
 */
public class PrintOneHundred {
    public static void main(String[] args) {
        System.out.println("Interrupter with break: ");
        for (int i=1; i<101; i++){
            System.out.print(" " + i);
            if (i==99) break;
        }

        System.out.println("\n\nInterrupter with return: ");
        for (int i=1; i<101; i++){
            System.out.print(" " + i);
            if (i==99) return;
        }
    }
}
