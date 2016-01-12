package edu.coldserenity.tij.ch08.ex07;

import java.util.Random;

/**
 * Exercise 7: (1)
 * <p/>
 * Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.
 */
public class Rodents {
    public static void main(String[] args) {
        Rodent[] rodents = RodentBreeder.breed(15);
        for (Rodent rodent : rodents) {
            rodent.spawn();
        }
    }
}

class RodentBreeder {
    private static Random random = new Random(42);

    public static Rodent next() {
        switch (random.nextInt(4)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Gerbil();
            case 2:
                return new Hamster();
        }
    }

    public static Rodent[] breed(int count) {
        Rodent[] result = new Rodent[count];
        for (int i = 0; i < count; i++) {
            result[i] = next();
        }
        return result;
    }
}

interface Rodent {
    int spawn();
}

class Mouse implements Rodent {
    @Override
    public int spawn() {
        System.out.println("Mice spawning!!!");
        return 10;
    }
}

class Gerbil implements Rodent {
    @Override
    public int spawn() {
        System.out.println("Gerbils spawning!!!");
        return 15;
    }
}

class Hamster implements Rodent {
    @Override
    public int spawn() {
        System.out.println("Hamsters spawning!!!");
        return 20;
    }
}
