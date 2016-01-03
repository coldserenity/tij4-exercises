package edu.coldserenity.tij.ch04.ex05;

/**
 * Exercise 5: (2)
 * <p/>
 * Create a class called Dog with an overloaded bark( ) method.
 * This method should be overloaded based on various primitive data types,
 * and print different types of barking, howling, etc.,
 * depending on which overloaded version is called.
 * <p/>
 * Write a main( ) that calls all the different versions.
 */
public class Dog {

    // http://www.thesaurus.com/browse/bark

    public void bark(char p) {
        System.out.println("bark");
    }

    public void bark(byte p) {
        System.out.println("howl");
    }


    public void bark(short p) {
        System.out.println("bluster");
    }

    public void bark(int p) {
        System.out.println("howl");
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
        Dog dog = new Dog();
        dog.bark((char) c);
        dog.bark((byte) c);
        dog.bark((short) c);
        dog.bark((int) c);
        dog.bark((float) c);
        dog.bark((double) c);
    }
}
