package edu.coldserenity.tij.ch02.ex02;

import java.util.ArrayList;
import java.util.Random;

/**
 * Exercise 2: (2)
 * <p/>
 * Write a program that generates 25 random int values. <br/>
 * For each value, use an if-else statement to classify it as greater than,
 * less than, or equal to a second randomly generated value.
 */
public class TrickyRandom {
    public static final int UPPER_LIMIT = 10;
    public static final int NUMBER_OF_RANDOM_VALUES = 25;
    public static final int DISCRIMINATOR_INDEX = 2;

    private static ArrayList generateRandomList(int size) {
        ArrayList result = new ArrayList(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(UPPER_LIMIT));
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList arrayToClassify = generateRandomList(NUMBER_OF_RANDOM_VALUES);
        System.out.println("Generated random values: ");
        System.out.println(arrayToClassify);

        int discriminator = (Integer) arrayToClassify.get(DISCRIMINATOR_INDEX - 1);
        System.out.println("Discriminator: " + discriminator);

        ArrayList lessThanIndex = new ArrayList();
        ArrayList lessThanValue = new ArrayList();
        ArrayList equalIndex = new ArrayList();
        ArrayList equalValue = new ArrayList();
        ArrayList greaterThanIndex = new ArrayList();
        ArrayList greaterThanValue = new ArrayList();

        for (int i = 0; i < arrayToClassify.size(); i++) {
            int currentElement = (Integer) arrayToClassify.get(i);
            if (currentElement < discriminator) {
                lessThanValue.add(currentElement);
                lessThanIndex.add(i);
            } else if (currentElement == discriminator) {
                equalValue.add(currentElement);
                equalIndex.add(i);
            } else {
                greaterThanValue.add(currentElement);
                greaterThanIndex.add(i);
            }
        }

        System.out.println("\nClassification results:");
        System.out.println("LESS");
        System.out.println("indexes" + lessThanIndex);
        System.out.println("values" + lessThanValue);

        System.out.println("EQUAL");
        System.out.println("indexes" + equalIndex);
        System.out.println("values" + equalValue);

        System.out.println("GREATER");
        System.out.println("indexes" + greaterThanIndex);
        System.out.println("values" + greaterThanValue);

    }
}
