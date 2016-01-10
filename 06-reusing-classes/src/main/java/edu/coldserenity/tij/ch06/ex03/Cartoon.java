package edu.coldserenity.tij.ch06.ex03;

/**
 * Exercise 3: (2)
 * <p/>
 * Prove the nex sentence:
 * Even if you don’t create a constructor for Cartoon( ),
 * the compiler will synthesize a default constructor for you that
 * calls the base class constructor.
 */
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}