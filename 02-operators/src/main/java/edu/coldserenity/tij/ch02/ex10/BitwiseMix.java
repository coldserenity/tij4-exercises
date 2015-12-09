package edu.coldserenity.tij.ch02.ex10;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Exercise 10: (3)
 * Write a program with two constant values:
 * <ul>
 * <li>one with alternating binary ones and zeroes, with a zero in the least-significant digit</li>
 * <li>and the second, also alternating, with a one in the least-significant digit</il>
 * </ul>
 * (hint: It’s easiest to use hexadecimal constants for this).
 * <p/>
 * Take these two values and combine them in all possible ways using the bitwise
 * operators, and display the results using Integer.toBinaryString( ).
 */
public class BitwiseMix {
    public static void main(String[] args) {
        long one = Long.parseLong("111010101010", 2);
        long two = Long.parseLong("1110101010101", 2);

        System.out.println("Testing bitwise operators: ");
        System.out.printf("One = \t\t %s\n", Long.toBinaryString(one));
        System.out.printf("Two = \t\t%s\n", Long.toBinaryString(two));

        System.out.printf("one & two =  %s\n", Long.toBinaryString(one & two));
        System.out.printf("one | two = %s\n", Long.toBinaryString(one | two));
        System.out.printf("one ^ two = %s\n", Long.toBinaryString(one ^ two));
        System.out.printf("~one = %s\n", Long.toBinaryString(~one));
        System.out.printf("~two = %s\n", Long.toBinaryString(~two));
    }
}
