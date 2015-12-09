package edu.coldserenity.tij.ch02.ex13;

/**
 * Exercise 13: (1)
 * Write a method that displays char values in binary form.
 * Demonstrate it using several different characters.
 */
public class CharToBinary {
    public static String convert(char charToConvert) {
        return Integer.toBinaryString(charToConvert);
    }

    public static void main(String[] args) {
        System.out.printf("'a'=%s\n", CharToBinary.convert('a'));
        System.out.printf("'b'=%s\n", CharToBinary.convert('b'));
        System.out.printf("'c'=%s\n", CharToBinary.convert('c'));
    }
}
