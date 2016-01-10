package edu.coldserenity.tij.ch07.ex05;

/**
 * Exercise 5: (1)
 * <p/>
 * Starting from Exercise 1, add a wheels( ) method in Cycle,
 * which returns the number of wheels.
 * Modify ride( ) to call wheels( ) and verify that
 * polymorphism works.
 */
public class Cycles {

    public static void main(String[] args) {
        rideThisCyke(new Unicycle());
        rideThisCyke(new Bicycle());
        rideThisCyke(new Tricycle());
    }

    static void rideThisCyke(Cycle cycle) {
        cycle.ride();
        System.out.println("Oh dear! It has " + cycle.wheels() + " wheel(s)\n");
    }
}

class Cycle {
    public void ride() {
        System.out.println("Cycle riding!");
    }

    public int wheels() {
        return -1;
    }
}

class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Unicycle riding!");
    }

    @Override
    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle riding!");
    }

    @Override
    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle riding!");
    }

    @Override
    public int wheels() {
        return 3;
    }
}
