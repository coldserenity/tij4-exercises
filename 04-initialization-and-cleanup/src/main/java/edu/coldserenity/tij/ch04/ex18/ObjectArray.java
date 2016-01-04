package edu.coldserenity.tij.ch04.ex18;

import java.util.Arrays;

/**
 * Exercise 18: (1)
 * <p/>
 * Complete the previous exercise by creating objects to attach to the array
 * of references.
 */
public class ObjectArray {
    private String name;

    public ObjectArray(String name) {
        System.out.printf("In ObjectArray(%s)\n", name);
        this.name = name;
    }

    public static void main(String[] args) {
        ObjectArray[] objectArray = new ObjectArray[]{
                new ObjectArray("One"),
                new ObjectArray("Two"),
                new ObjectArray("Three"),
                new ObjectArray("Four"),
                new ObjectArray("Five"),
        };
        System.out.println(Arrays.toString(objectArray));
    }

    @Override
    public String toString() {
        return "ObjectArray{" +
                "name='" + name + '\'' +
                '}';
    }
}
