package edu.coldserenity.tij.ch02.ex06;

/**
 * Exercise 6: (3) Following Exercise 5, create a new Dog reference and
 * assign it to spot’s object.
 *
 * Test for comparison using == and equals( ) for all references.
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

        System.out.println("Objects before new reference");
        System.out.println(spot);
        System.out.println(scruffy);

        Dog newDog = spot;
        System.out.println("\nPrinting object from newDog reference:");
        System.out.println(spot);

        System.out.println("\nComparisons: ");
        System.out.printf("spot == scruffy: %s\n", spot == scruffy);
        System.out.printf("spot == newDog: %s\n", spot == newDog);
        System.out.printf("scruffy == newDog: %s\n", scruffy == newDog);


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
