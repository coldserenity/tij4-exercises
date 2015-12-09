package edu.coldserenity.tij.ch02.ex08;

/**
 * Exercise 8: (2)
 * Show that hex and octal notations work with long values.
 * Use Long.toBinaryString( ) to display the results.
 */
public class HexAndOctalWorkWithLong {
    public static void main(String[] args) {
        long hex = 0xFDFDFL;
        long oct = 0322222567L;

        System.out.printf("0xFDFDFL is %s\n", Long.toBinaryString(hex));
        System.out.printf("0322222567L is %s\n", Long.toBinaryString(oct));
    }
}
