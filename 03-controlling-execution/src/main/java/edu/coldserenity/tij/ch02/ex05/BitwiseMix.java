package edu.coldserenity.tij.ch02.ex05;

/**
 * Exercise 5: (4) Repeat Exercise 10 from the previous chapter,
 * using the ternary operator and a bitwise test to display the
 * ones and zeroes, instead of Integer.toBinaryString( ).
 * <p/>
 * ORIGINAL EXERCISE
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

    public static String toBinaryString(long a) {
        if (a == 0) return "0";

        StringBuilder result = new StringBuilder("");
        long testBit = 1;
        for (int i = 0; i < 63; i++) {
            result.append(((a & testBit) == 0) ? "0" : "1");
            testBit <<= 1;

            // end loop if nex values are all 0
            if (!((a > 0 && a > testBit) || (a < 0 && a < testBit))) {
                i = 64;
            }
        }

        if (a<0) {
            result.append("1");
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        long one = Long.parseLong("111010101010", 2);
        long two = Long.parseLong("1110101010101", 2);

        System.out.println("Testing bitwise operators: ");
        System.out.printf("One = \t\t %s\n", Long.toBinaryString(one));
        System.out.printf("One = \t\t %s [custom print]\n", toBinaryString(one));

        System.out.printf("Two = \t\t%s\n", Long.toBinaryString(two));
        System.out.printf("Two = \t\t%s [custom print]\n", toBinaryString(two));

        System.out.printf("one & two =  %s\n", Long.toBinaryString(one & two));
        System.out.printf("one & two =  %s  [custom print]\n", toBinaryString(one & two));

        System.out.printf("one | two = %s\n", Long.toBinaryString(one | two));
        System.out.printf("one | two = %s [custom print]\n", toBinaryString(one | two));

        System.out.printf("one ^ two = %s\n", Long.toBinaryString(one ^ two));
        System.out.printf("one ^ two = %s [custom print]\n", toBinaryString(one ^ two));

        long tmp = ~one;
        System.out.printf("~one = %s\n", Long.toBinaryString(tmp));
        System.out.printf("~one = %s [custom print]\n", toBinaryString(tmp));

        System.out.printf("~two = %s\n", Long.toBinaryString(~two));
        System.out.printf("~two = %s [custom print]\n", toBinaryString(~two));
    }
}
