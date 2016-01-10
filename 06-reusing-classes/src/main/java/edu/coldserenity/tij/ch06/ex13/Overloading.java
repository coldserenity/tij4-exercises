package edu.coldserenity.tij.ch06.ex13;

/**
 * Exercise 13: (2)
 * <p/>
 * Create a class with a method that is overloaded three times.
 * Inherit a new class, add a new overloading of the method,
 * and show that all four methods are available in the derived
 * class.
 */
public class Overloading {
    public static void main(String[] args) {
        ExtendedClass ec = new ExtendedClass();
        ec.overload(new One());
        ec.overload(new Two());
        ec.overload(new Three());
        ec.overload(new Four());
    }
}

class BaseClass {
    public void overload(One one) {
        System.out.printf("overload(%s)\n", one);
    }

    public void overload(Two two) {
        System.out.printf("overload(%s)\n", two);
    }

    public void overload(Three three) {
        System.out.printf("overload(%s)\n", three);
    }
}

class ExtendedClass extends BaseClass {
    public void overload(Four four) {
        System.out.printf("overload(%s)\n", four);
    }
}

class One {
}

class Two {
}

class Three {
}

class Four {
}
