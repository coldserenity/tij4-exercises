package edu.coldserenity.tij.ch04.ex02;

/**
 * Exercise 2: (2)
 * <p/>
 * Create a class with a String field that is initialized at the point of
 * definition, and another one that is initialized by the constructor.
 * What is the difference between the two approaches?
 */
public class InitializationTest02 {
    String initializedAtDefinition = "initializedAtDefinition";
    String initializedByConstructor;

    public InitializationTest02(String initializedByConstructor) {
        System.out.println("At the beginning of constructor");
        System.out.println(this);
        this.initializedByConstructor = initializedByConstructor;
    }

    public static void main(String[] args) {
        InitializationTest02 it = new InitializationTest02("byConstructor");
        System.out.println("\nAfter running constructor \n" + it.toString());

        System.out.println("\n\n COCLUSION:\nFields initialized at definition are ready before constructor is called.");
    }

    @Override
    public String toString() {
        return "InitializationTest02{" +
                "initializedAtDefinition='" + initializedAtDefinition + '\'' +
                ", initializedByConstructor='" + initializedByConstructor + '\'' +
                '}';
    }
}
