package edu.coldserenity.tij.ch05.ex09;

/**
 * Exercise 9: (2)
 * <p/>
 * Create a class called Root that contains an instance of
 * each of the classes (that you also create) named
 * Component1, Component2, and Component3.
 * <p/>
 * Derive a class Stem from Root that also contains an
 * instance of each “component.” All classes should have
 * default constructors that print a message about that
 * class.
 */
public class TestClass {
    public static void main(String[] args) {
        new Stem();
    }
}


class Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Root() {
        System.out.println("Root()");

        // Calling
        //      System.out.println(this);
        // will do polymorphic call of Stem.toString()

        System.out.println(asString());
    }

    @Override
    public String toString() {
        return asString();
    }

    private String asString() {
        return "Root{" +
                "component1=" + component1 +
                ", component2=" + component2 +
                ", component3=" + component3 +
                '}';
    }
}

class Stem extends Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Stem() {
        System.out.println("Stem()");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Stem{" +
                "component1=" + component1 +
                ", component2=" + component2 +
                ", component3=" + component3 +
                '}';
    }
}

class Component1 {}
class Component2 {}
class Component3 {}