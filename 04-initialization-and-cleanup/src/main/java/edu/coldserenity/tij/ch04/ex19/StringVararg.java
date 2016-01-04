package edu.coldserenity.tij.ch04.ex19;

import java.util.Arrays;

/**
 * Exercise 19: (2)
 * <p/>
 * Write a method that takes a vararg String array. Verify that you can
 * pass either a comma-separated list of Strings or a String[] into this method.
 */
public class StringVararg {

    public static void print(String ... args) {
        for (String s: args) {
            System.out.print("+");
        }
        System.out.println(Arrays.toString(args));
    }

    public static void main(String[] args) {
        print(new String[] {"one", "two", "three"});
        print("four", "five", "six");
    }
}
