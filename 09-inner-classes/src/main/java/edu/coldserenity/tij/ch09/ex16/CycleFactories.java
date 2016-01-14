package edu.coldserenity.tij.ch09.ex16;

/**
 * Exercise 16: (1)
 * Modify the solution to Exercise 18 from the Interfaces chapter to use
 * anonymous inner classes.
 * <p/>
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
        rideSomeCycle(Unicycle.factory);
        rideSomeCycle(Bicycle.factory);
        rideSomeCycle(Tricycle.factory);
    }
}


interface CycleFactory {
    Cycle getCycle();
}

interface Cycle {
    void ride();
}

class Unicycle implements Cycle {
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };

    @Override
    public void ride() {
        System.out.println("Unicycle riding!");
    }
}

class Bicycle implements Cycle {
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };

    @Override
    public void ride() {
        System.out.println("Bicycle riding!");
    }
}

class Tricycle implements Cycle {
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };

    @Override
    public void ride() {
        System.out.println("Tricycle riding!");
    }
}
