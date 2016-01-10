package edu.coldserenity.tij.ch07.ex08;

import java.util.Random;

/**
 * Generates a list of instruments.
 */
public class RandomInstrumentGenerator {
    static Random random = new Random(42);

    public static Instrument next() {
        switch (random.nextInt(5)) {
            default:
            case 0:
                return new Brass();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Wind();
            case 4:
                return new Woodwind();
        }
    }

    public static Instrument[] orchestra(int count) {
        Instrument[] result = new Instrument[count];
        for (int i = 0; i < count; i++) {
            result[i] = next();
        }
        return result;
    }
}
