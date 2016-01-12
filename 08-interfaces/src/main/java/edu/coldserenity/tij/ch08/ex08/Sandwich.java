package edu.coldserenity.tij.ch08.ex08;

/**
 * Exercise 8: (2)
 * <p/>
 * In polymorphism.Sandwich.java, create an interface called FastFood
 * (with appropriate methods) and change Sandwich so that it also implements
 * FastFood.
 */
public class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        FastFood sandwich = new Sandwich();
        sandwich.overweightMe();
    }

    @Override
    public void overweightMe() {
        System.out.println("I'm making you fat (devilish_laughter)");
    }
}

interface FastFood {
    void overweightMe();
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}
