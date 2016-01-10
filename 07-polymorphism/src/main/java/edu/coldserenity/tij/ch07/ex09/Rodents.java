package edu.coldserenity.tij.ch07.ex09;

import java.util.Random;

/**
 * Exercise 9: (3)
 * <p/>
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil,
 * Hamster, etc.
 * <p/>
 * In the base class, provide methods that are common to all
 * Rodents, and override these in the derived classes to
 * perform different behaviors depending on the specific
 * type of Rodent.
 * <p/>
 * Create an array of Rodent, fill it with different
 * specific types of Rodents, and call your base-class
 * methods to see what happens.
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

class Rodent {
    public int spawn() {
        return -1;
    }
}

class Mouse extends Rodent {
    @Override
    public int spawn() {
        System.out.println("Mice spawning!!!");
        return 10;
    }
}

class Gerbil extends Rodent {
    @Override
    public int spawn() {
        System.out.println("Gerbils spawning!!!");
        return 15;
    }
}

class Hamster extends Rodent {
    @Override
    public int spawn() {
        System.out.println("Hamsters spawning!!!");
        return 20;
    }
}
