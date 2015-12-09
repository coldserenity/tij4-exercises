package edu.coldserenity.tij.ch02.ex07;

import java.util.Random;

/**
 * Exercise 7: (3) Write a program that simulates coin-flipping.
 */
public class CoinFlipper {
    public static boolean flip() {
        return new Random().nextInt(100) < 50;
    }

    public static void main(String[] args) {
        System.out.println("Toss 1: " + CoinFlipper.flip());
        System.out.println("Toss 2: " + CoinFlipper.flip());
        System.out.println("Toss 3: " + CoinFlipper.flip());
        System.out.println("Toss 4: " + CoinFlipper.flip());
        System.out.println("Toss 5: " + CoinFlipper.flip());
    }
}
