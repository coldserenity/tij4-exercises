package edu.coldserenity.tij.ch02.ex04;

/**
 * Exercise 4: (3)
 * <p/>
 * Write a program that uses two nested for loops and the modulus operator (%)
 * to detect and print prime numbers (integral numbers that are not evenly
 * divisible by any other numbers except for themselves and 1).
 */
public class PrimeNumbers {
    public static final int HOW_MANY = 200;

    public static void main(String[] args) {

        int countOfFoundPrimeNumbers = 0;

        for (int i = 1; countOfFoundPrimeNumbers < HOW_MANY; i = (i > 2) ? i + 2 : i+1) {
            int j = 2;
            for (; j < i; j++) {
                if (i % j == 0) {
                    // make the loop finish, set value i+1 to distinguish
                    // from natural loop ending
                    j = i + 1;
                }
            }

            // inner loop ended naturally which mean i is prime number
            if (i == j) {
                System.out.print("\t" + i);
                countOfFoundPrimeNumbers++;

                // print additional line to make output readable
                if (countOfFoundPrimeNumbers % 10 == 0) {
                    System.out.println("");
                }
            }
        }
    }
}
