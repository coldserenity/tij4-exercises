package edu.coldserenity.tij.ch02.ex03;

import java.util.Random;

/**
 * Exercise 3: (1)
 * <p/>
 * Modify Exercise 2 so that your code is surrounded by an “infinite” while loop.
 * It will then run until you interrupt it from the keyboard
 * (typically by pressing Control+C).
 */
public class InfiniteTrickyRandom {
    public static final int UPPER_LIMIT = 10;

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        random.nextInt(UPPER_LIMIT);
        // take second values as discriminator
        int discriminator = random.nextInt(UPPER_LIMIT);

        int generatedValueNumber = 2;
        int randomValue;

        while (true) {
            randomValue = random.nextInt(UPPER_LIMIT);
            generatedValueNumber++;
            if (randomValue < discriminator) {
                System.out.printf("Value %s is LESS than %s\n", randomValue, discriminator);
            } else if (randomValue == discriminator) {
                System.out.printf("Value %s is EQUAL to %s\n", randomValue, discriminator);
            } else {
                System.out.printf("Value %s is GREATER than %s\n", randomValue, discriminator);
            }

            // add delay to avoid too much printing at once
            Thread.sleep(500);
        }
    }
}
