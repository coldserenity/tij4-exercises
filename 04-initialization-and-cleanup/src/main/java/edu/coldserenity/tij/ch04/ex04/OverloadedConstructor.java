package edu.coldserenity.tij.ch04.ex04;

/**
 * Exercise 4: (1)
 * <p/>
 * Add an overloaded constructor to the previous exercise that takes a
 * String argument and prints it along with your message.
 */
public class OverloadedConstructor {
    public OverloadedConstructor() {
        System.out.println("Message");
    }

    public OverloadedConstructor(String arg) {
        System.out.println("Message: " + arg);
    }

    public static void main(String[] args) {
        new OverloadedConstructor();
        new OverloadedConstructor("new!");
    }
}
