package edu.coldserenity.tij.ch04.ex06;

/**
 * Exercise 6: (1)
 * <p/>
 * Modify the previous exercise so that two of the overloaded methods have
 * two arguments (of two different types), but in reversed order relative
 * to each other.
 *
 * Verify that this works.
 */
public class DogTwo {

    // http://www.thesaurus.com/browse/bark

    public void bark(char p) {
        System.out.println("bark");
    }

    public void bark(byte p) {
        System.out.println("shriek");
    }


    public void bark(short ps, int pi) {
        System.out.println("ps pi bluster");
    }

    public void bark(int pi, short ps) {
        System.out.println("pi ps howl");
    }

    public void bark(long p) {
        System.out.println("holler");
    }

    public void bark(float p) {
        System.out.println("vociferate");
    }

    public void bark(double p) {
        System.out.println("roar");
    }

    public static void main(String[] args) {
        char c = 0;
        DogTwo dog = new DogTwo();
        dog.bark((char) c);
        dog.bark((byte) c);
        dog.bark((short) c, (int)c);
        dog.bark((int) c, (short)c);
        dog.bark((float) c);
        dog.bark((double) c);
    }
}
