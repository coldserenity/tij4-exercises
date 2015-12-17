package edu.coldserenity.tij.ch02.ex10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Exercise 10: (5)
 * <p/>
 * A vampire number has an even number of digits and is formed by
 * multiplying a pair of numbers containing half the number of digits
 * of the result.<br/>
 * The digits are taken from the original number in any order.
 * Pairs of trailing zeroes are not allowed.
 * <p/>
 * Examples include:<br/>
 * <code>
 * 1260 = 21 * 60<br/>
 * 1827 = 21 * 87<br/>
 * 2187 = 27 * 81<br/>
 * </code>
 * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 */
public class VampireNumber {
    public static Map find4Digit() {
        // Map that will hold the final results in the following form
        //     key -> value
        //    1260 -> {21, 60}
        //    1827 -> {21, 78}
        //    2178 -> {27, 81}
        Map result = new TreeMap();

        // 2. Iterate numbers 1000 -> 9999
        for (int i = 1000; i < 10000; i++) {
            // 2a. Split into digits: 1260 -> {1,2,6,0}
            int[] digitList = splitNumber(i);

            // 2b. Verify if number is a vampire number
            int[] matchingPair = findMatchingPair(digitList, i);

            // 2c. If matching pair found - add vampire number to the map
            if (matchingPair != null) result.put(i, matchingPair);
        }

        return result;
    }

    /**
     * Searches for the pair of multipliers that satisfy vampiricity condition.
     *
     * @param digitList list of digits to combine into multipliers
     * @param number    number to verify
     * @return array of 2 multiplies that produce vampire number
     */
    private static int[] findMatchingPair(int[] digitList, int number) {
        int[] result;
        // selecting pairs

        List permutations = Permutations.generate(digitList);
        if (permutations != null) {
            for (Object permutation : permutations) {
                int[] arr = (int[]) permutation;
                if ((arr[0] * 10 + arr[1]) * (arr[2] * 10 + arr[3]) == number) {
                    result = new int[]{arr[0] * 10 + arr[1], arr[2] * 10 + arr[3]};
                    return result;
                }
            }
        }

        return null;
    }

    /**
     * Splits an integer into array of digits.
     *
     * @param number number to split.
     * @return array of digits (preserving order)
     */
    public static int[] splitNumber(int number) {
        // find number size to initialize result array
        int numberLength = getDigitCount(number);
        int[] result = new int[numberLength];

        int digitSource = number;
        int i = numberLength - 1;
        do {
            result[i] = digitSource % 10;
            digitSource /= 10;
            i--;
        } while (digitSource > 0);
        return result;
    }

    /**
     * Counts digits in a number.
     *
     * @param number number to count digits in.
     * @return number of digits in a number
     */
    public static int getDigitCount(int number) {
        int result = 1;
        while (number / 10 > 0) {
            result++;
            number /= 10;
        }
        return result;
    }

    /**
     * Print the map nicely for the main method launch.
     *
     * @param map map to print. Expects int -> int[] in map.
     */
    private static void printResult(Map map) {
        for (Object entry : map.entrySet()) {
            System.out.printf("%s: %s\n",
                    ((Map.Entry) entry).getKey(),
                    Arrays.toString((int[]) ((Map.Entry) entry).getValue()));
        }
    }

    public static void main(String[] args) {
        printResult(find4Digit());
    }
}
