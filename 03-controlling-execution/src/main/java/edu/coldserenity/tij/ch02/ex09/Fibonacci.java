package edu.coldserenity.tij.ch02.ex09;

import java.util.LinkedList;
import java.util.List;

/**
 * Exercise 9: (4)
 * <p/>
 * A Fibonacci sequence is the sequence of numbers
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,
 * where each number (from the third on) is the sum of the previous two.
 * <p/>
 * Create a method that takes an integer as an argument and displays
 * that many Fibonacci numbers starting from the beginning,
 * e.g., If you run <code>java Fibonacci 5</code>
 * (where Fibonacci is the name of the class) the output will be:
 * <code>1, 1, 2, 3, 5</code>.
 */
public class Fibonacci {

    public static List getNumbers(int count) {
        LinkedList result = new LinkedList();

        switch (count) {
            case 0:
                break;
            case 1:
                result.add(1);
                break;
            default: {
                result.add(1);
                result.add(1);

                while (result.size() < count) {
                    result.add((Integer) result.getLast() + (Integer) result.get(result.size() - 2));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int count = 30;
        if (args.length>0) {
            System.out.printf("User input for desired Fibonacci numbers count is: %s", args[0]);
            count = Integer.parseInt(args[0]);
        } else {
            System.out.printf("No user input for desired Fibonacci numbers. Using default value: %s\n", count);
        }

        System.out.println("\nGenerating numbers: ");
        System.out.println(getNumbers(count));
    }
}
