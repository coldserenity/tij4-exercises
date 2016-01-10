package edu.coldserenity.tij.ch07.ex01;

/**
 * Exercise 1: (2)
 * <p/>
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via
 * a ride( ) method.
 */
public class Cycles {

    public static void main(String[] args) {
        rideThisCyke(new Unicycle());
        rideThisCyke(new Bicycle());
        rideThisCyke(new Tricycle());
    }

    static void rideThisCyke(Cycle cycle) {
        cycle.ride();
    }
}

class Cycle {
    public void ride() {
        System.out.println("Cycle riding!");
    }
}

class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Unicycle riding!");
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle riding!");
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle riding!");
    }
}
