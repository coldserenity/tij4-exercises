package edu.coldserenity.tij.ch02.ex12;

/**
 * Exercise 12: (3)
 * Start with a number that is all binary ones.
 * <p/>
 * Left shift it, then use the unsigned right-shift operator
 * to right shift through all of its binary positions,
 * each time displaying the result using Integer.toBinaryString( ).
 */
public class RidingZero {
    public static void main(String[] args) {

        int j = Integer.parseUnsignedInt("11111111111111111111111111111111", 2);
        System.out.printf("j = %s\n", Integer.toBinaryString(j));
        System.out.println(j);
        System.out.println("\nLeft-shifted j");
        j <<= 1;
        System.out.printf("j = %s\n", Integer.toBinaryString(j));

        System.out.println("\nUnsigned right-shifting j: ");
        for (int k = 0; k < 35; k++) {
            System.out.printf("j = %s\n", Integer.toBinaryString(j >>>= 1));
        }

    }
}
