package edu.coldserenity.tij.ch02.ex05;

/**
 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says.
 * In main( ), create two dog objects with names
 * “spot” (who says, “Ruff!”) and
 * “scruffy” (who says, “Wurf!”).
 * Then display their names and what they say.
 */
public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Ruff!");
        Dog scruffy = new Dog("scruffy", "Wurf!");

        System.out.println(spot);
        System.out.println(scruffy);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "ref='" + super.toString() + '\'' +
                ", name='" + name + '\'' +
                ", says='" + says + '\'' +
                '}';
    }
}
