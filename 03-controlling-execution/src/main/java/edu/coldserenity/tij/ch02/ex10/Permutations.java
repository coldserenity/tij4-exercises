package edu.coldserenity.tij.ch02.ex10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Utility class for generating permutations.
 */
public class Permutations {

    /**
     * Generates permutations of given sequence using
     * "<a href="ttps://en.wikipedia.org/wiki/Permutation#Generation_in_lexicographic_order">lexicographic order</a>"
     * algorithm.
     *
     * @param digitList list of digits to generate permutation from.
     * @return list of arrays (int[]) representing permutations of given sequence.
     */
    public static List generate(int[] digitList) {
        int[] a = Arrays.copyOf(digitList, digitList.length);
        Arrays.sort(a);
        List result = new LinkedList();

        int k, l;
        result.add(Arrays.copyOf(a, a.length));

        do {
            //  1. Find the largest index k such that a[k] < a[k + 1].
            for (k = a.length - 2; k >= 0 && a[k] >= a[k + 1]; k--) {
            }

            //  1.a If no such index exists, the permutation is the last permutation.
            if (k < 0) break;

            //  2. Find the largest index l greater than k such that a[k] < a[l].
            for (l = a.length - 1; a[k] >= a[l] && l > k; l--) {
            }

            // 3. Swap the value of a[k] with that of a[l].
            swap(a, k, l);

            // 4. Reverse the sequence from a[k + 1] up to and including the final element a[n].
            reverse(a, k + 1, a.length - 1);

            result.add(Arrays.copyOf(a, a.length));
        } while (k >= 0);


        return result;
    }

    /**
     * Reverse part of the array.
     *
     * @param a     array to reverse items in
     * @param start start index
     * @param end   end index
     */
    private static void reverse(int[] a, int start, int end) {
        for (int i = 0; i < Math.round((end - start) / 2.0); i++) {
            swap(a, start + i, end - i);
        }
    }

    /**
     * Swaps 2 elements in an array.
     *
     * @param a array to swap elements in
     * @param k element at index k
     * @param l element at index l
     */
    private static void swap(int[] a, int k, int l) {
        int tmp = a[k];
        a[k] = a[l];
        a[l] = tmp;
    }
}
