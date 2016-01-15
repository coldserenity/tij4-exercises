package edu.coldserenity.tij.ch10.ex02;

import java.util.HashSet;
import java.util.Set;


/**
 * Exercise 2: (1)
 * <p/>
 * Modify SimpleCollection.java to use a Set for c.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}