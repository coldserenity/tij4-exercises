package edu.coldserenity.tij.ch02.ex11;

/**
 * Exercise 11: (3)
 * Start with a number that has a binary one in the most
 * significant position (hint: Use a hexadecimal constant).
 * <p/>
 * Using the signed right-shift operator, right shift it all the way through
 * all of its binary positions, each time displaying the result using
 * Integer.toBinaryString( ).
 */
public class RidingOne {
    public static void main(String[] args) {
        int i = Integer.parseInt("01000000000000000000000000000000", 2);

        System.out.println("\n\nTesting positive int");
        System.out.printf("i = %s\n", Integer.toBinaryString(i));
        System.out.println(i);

        for (int k = 0; k < 32; k++) {
            System.out.printf("i = %s\n", Integer.toBinaryString(i >>= 1));
        }

        System.out.println("\n\nTesting negative int");
        int j = Integer.parseUnsignedInt("10111111111111111111111111111111", 2);
        System.out.printf("j = %s\n", Integer.toBinaryString(j));
        System.out.println(j);

        for (int k = 0; k < 32; k++) {
            System.out.printf("j = %s\n", Integer.toBinaryString(j >>= 1));
        }

    }
}
