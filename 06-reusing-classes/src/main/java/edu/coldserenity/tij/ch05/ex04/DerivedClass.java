package edu.coldserenity.tij.ch05.ex04;

/**
 * Exercise 4: (2)
 * <p/>
 * Prove that the base-class constructors are
 * (a) always called and
 * (b) called before derived-class constructors.
 */
public class DerivedClass extends BaseClass {
    public DerivedClass() {
        System.out.printf("DerivedClass(): don't know when I'm called");
    }

    public static void main(String[] args) {
        System.out.println("Creating DerivedClass");
        new DerivedClass();

        System.out.println("\n\nCreating DerivedClassNoConstructor");
        new DerivedClassNoConstructor();
    }
}

class BaseClass {
    BaseClass() {
        System.out.println("BaseClass(): I'm called first AND I'm always called!");
    }
}

class DerivedClassNoConstructor extends BaseClass{

}