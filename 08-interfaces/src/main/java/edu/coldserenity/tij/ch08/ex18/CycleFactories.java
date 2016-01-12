package edu.coldserenity.tij.ch08.ex18;

/**
 * Exercise 18: (2)
 * <p/>
 * Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
 * Create factories for each type of Cycle, and code that uses these factories.
 */
public class CycleFactories {
    public static void rideSomeCycle(CycleFactory factory) {
        factory.getCycle().ride();
    }

    public static void main(String[] args) {
        rideSomeCycle(new UnicycleFactory());
        rideSomeCycle(new BicycleFactory());
        rideSomeCycle(new TricycleFactory());
    }
}


interface CycleFactory {
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

interface Cycle {
    void ride();
}

class Unicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Unicycle riding!");
    }
}

class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle riding!");
    }
}

class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle riding!");
    }
}
