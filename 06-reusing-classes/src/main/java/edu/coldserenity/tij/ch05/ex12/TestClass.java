package edu.coldserenity.tij.ch05.ex12;

/**
 * Exercise 12: (3)
 * <p/>
 * Add a proper hierarchy of dispose( ) methods to all the classes in
 * Exercise 9.
 */
public class TestClass {
    public static void main(String[] args) {
        Stem stem = new Stem();
        try {
            System.out.println("Doing something ....");
        } finally {
            stem.dispose();
        }
    }
}


class Root {
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    public Root() {
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();

        System.out.println("Root()");
        System.out.println(asString());
    }

    public void dispose() {
        component3.dispose();
        component2.dispose();
        component1.dispose();

        System.out.printf("%s has been disposed\n", asString());
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
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    public Stem() {
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();

        System.out.println("Stem()");
        System.out.println(this);
    }


    public void dispose() {
        component3.dispose();
        component2.dispose();
        component1.dispose();

        System.out.printf("%s has been disposed\n", this);
        super.dispose();
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

class Component1 {
    public void dispose() {
        System.out.printf("%s has been disposed\n", this);
    }
}

class Component2 {
    public void dispose() {
        System.out.printf("%s has been disposed\n", this);
    }
}

class Component3 {
    public void dispose() {
        System.out.printf("%s has been disposed\n", this);
    }
}