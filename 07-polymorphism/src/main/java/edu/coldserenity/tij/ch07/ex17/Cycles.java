package edu.coldserenity.tij.ch07.ex17;

/**
 * Exercise 17: (2)
 * <p/>
 * Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
 * Unicycle and Bicycle, but not to Tricycle. Create instances of all
 * three types and upcast them to an array of Cycle. Try to call balance( )
 * on each element of the array and observe the results.
 * Downcast and call balance( ) and observe what happens.
 */
public class Cycles {

    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };

        // cycles[0].balance();
        // cycles[1].balance();
        // cycles[2].balance();
        //  ^-- results in
        //          Error:(21, 18) java: cannot find symbol
        //          symbol:   method balance()
        //          location: class edu.coldserenity.tij.ch07.ex17.Cycle

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        // ((Tricycle)cycles[2]).balance();
        //  ^-- results in
        //          Error:(31, 30) java: cannot find symbol
        //          symbol:   method balance()
        //          location: class edu.coldserenity.tij.ch07.ex17.Tricycle

        // ((Bicycle)cycles[0]).balance();
        //  ^-- results in
        //          Exception in thread "main" java.lang.ClassCastException:
        //          edu.coldserenity.tij.ch07.ex17.Unicycle cannot be cast to edu.coldserenity.tij.ch07.ex17.Bicycle
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

    public void balance() {
        System.out.println("Unicycle balancing!");
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle riding!");
    }

    public void balance() {
        System.out.println("Bicycle balancing!");
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle riding!");
    }
}
