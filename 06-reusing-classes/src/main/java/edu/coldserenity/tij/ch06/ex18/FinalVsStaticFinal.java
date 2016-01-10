package edu.coldserenity.tij.ch06.ex18;

import java.util.Random;

/**
 * Exercise 18: (2)
 * <p/>
 * Create a class with a static final field and a final field and
 * demonstrate the difference between the two.
 */
public class FinalVsStaticFinal {
    // initialized only once, at first referring to the class
    static final int STATIC_FINAL_INT = new Random().nextInt();
    // initialized with each FinalVsStaticFinal instance
    final int justInt = new Random().nextInt();

    public static void main(String[] args) {
        System.out.printf("%s\n", new FinalVsStaticFinal());
        System.out.printf("%s\n", new FinalVsStaticFinal());

        // Error:(22, 9) java: cannot assign a value to final variable STATIC_FINAL_INT
        // STATIC_FINAL_INT = 500;

        // Error:(25, 33) java: cannot assign a value to final variable justInt
        // new FinalVsStaticFinal().justInt = 100;
    }

    @Override
    public String toString() {
        return "FinalVsStaticFinal{" +
                "\n   hasCode = " + hashCode() +
                "\n   STATIC_FINAL_INT=" + STATIC_FINAL_INT +
                "\n   justInt=" + justInt +
                "}";
    }
}
