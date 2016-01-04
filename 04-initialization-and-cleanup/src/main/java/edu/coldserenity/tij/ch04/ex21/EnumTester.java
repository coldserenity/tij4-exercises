package edu.coldserenity.tij.ch04.ex21;

/**
 * Exercise 21: (1)
 * <p/>
 * Create an enum of the least-valuable six types of paper currency.
 * Loop through the values( ) and print each value and its ordinal( ).
 */
public class EnumTester {
    public static void main(String[] args) {
        for ($ value : $.values()) {
            System.out.printf("value = %s; ordinal = %s\n",
                    value.toString(), value.ordinal());
        }
    }
}
