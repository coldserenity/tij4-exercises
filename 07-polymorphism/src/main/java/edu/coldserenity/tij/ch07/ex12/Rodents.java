package edu.coldserenity.tij.ch07.ex12;

/**
 * Exercise 12: (3)
 * <p/>
 * Modify Exercise 9 so that it demonstrates the order of initialization of
 * the base classes and derived classes.
 * <p/>
 * Now add member objects to both the base and derived classes and show the
 * order in which their initialization occurs during construction.
 */
public class Rodents {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[]{
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };
    }
}

class Tooth {
    public Tooth() {
        System.out.println("Tooth()");
    }
}

class Rodent {
    protected Tooth[] teeth = new Tooth[]{new Tooth()};

    public Rodent() {
        System.out.println("Rodent()");
    }
}

class Mouse extends Rodent {
    protected Tooth[] teeth = new Tooth[]{new Tooth(), new Tooth()};

    public Mouse() {
        System.out.println("Mouse()");
    }
}

class Gerbil extends Rodent {
    protected Tooth[] teeth = new Tooth[]{new Tooth(), new Tooth(), new Tooth()};

    public Gerbil() {
        System.out.println("Gerbil()");
    }
}

class Hamster extends Rodent {
    protected Tooth[] teeth = new Tooth[]{new Tooth(), new Tooth(), new Tooth(), new Tooth()};

    public Hamster() {
        System.out.println("Hamster()");
    }
}
