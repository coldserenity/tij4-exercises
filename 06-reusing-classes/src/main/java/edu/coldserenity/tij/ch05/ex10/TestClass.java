package edu.coldserenity.tij.ch05.ex10;

/**
 * Exercise 10: (1)
 * <p/>
 * Modify the previous exercise so that each class only has
 * non-default constructors.
 */
public class TestClass {
    public static void main(String[] args) {
        new Stem("hello?");
    }
}


class Root {
    Component1 component1 = new Component1("Root.component1");
    Component2 component2 = new Component2("Root.component2");
    Component3 component3 = new Component3("Root.component3");

    public Root(String message) {
        System.out.printf("Root(%s)\n", message);

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
    Component1 component1 = new Component1("Root.component1");
    Component2 component2 = new Component2("Root.component2");
    Component3 component3 = new Component3("Root.component3");

    public Stem(String message) {
        super(message);
        System.out.printf("Stem(%s)\n", message);
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

class Component1 {
    public Component1(String message) {
        System.out.printf("Component1(%s): %s\n", message, this);
    }
}

class Component2 {
    public Component2(String message) {
        System.out.printf("Component2(%s): %s\n", message, this);
    }
}

class Component3 {
    public Component3(String message) {
        System.out.printf("Component3(%s): %s\n", message, this);
    }
}