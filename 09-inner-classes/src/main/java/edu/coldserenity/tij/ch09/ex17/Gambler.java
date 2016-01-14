package edu.coldserenity.tij.ch09.ex17;

import java.util.Random;

/**
 * Exercise 17: (1)
 * Modify the solution to Exercise 19 from the Interfaces chapter to use
 * anonymous inner classes.
 * <p/>
 * Exercise 19: (3)
 * <p/>
 * Create a framework using Factory Methods that performs both coin tossing
 * and dice tossing.
 */
public class Gambler {
    public static void gamble(GamblingFactory factory) {
        factory.getGame().play();
    }

    public static void main(String[] args) {
        System.out.println("Feeling lucky ... ");
        Gambler.gamble(DiceGambling.factory);
        Gambler.gamble(DiceGambling.factory);
        Gambler.gamble(DiceGambling.factory);
        System.out.println("emm ... lets try the coin ...");
        Gambler.gamble(CoinGambling.factory);
        Gambler.gamble(CoinGambling.factory);
        Gambler.gamble(CoinGambling.factory);
        System.out.println("Out of money.");
    }
}


interface GamblingFactory {
    Gambling getGame();
}

interface Gambling {
    void play();
}

class CoinGambling implements Gambling {
    Random random = new Random();

    public static GamblingFactory factory = new GamblingFactory() {
        @Override
        public Gambling getGame() {
            return new CoinGambling();
        }
    };


    @Override
    public void play() {
        System.out.println(random.nextInt(2) == 0 ? "Heads" : "Tails");
    }
}

class DiceGambling implements Gambling {
    Random random = new Random();

    public static GamblingFactory factory = new GamblingFactory() {
        @Override
        public Gambling getGame() {
            return new DiceGambling();
        }
    };

    @Override
    public void play() {
        System.out.println((1 + random.nextInt(6)) + " " + (1 + random.nextInt(6)));
    }
}
