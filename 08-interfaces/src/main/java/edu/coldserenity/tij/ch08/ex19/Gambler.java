package edu.coldserenity.tij.ch08.ex19;

import java.util.Random;

/**
 * Exercise 19: (3)
 * <p/>
 * Create a framework using Factory Methods that performs both coin tossing and dice tossing.
 */
public class Gambler {
    public static void gamble(GamblingFactory factory) {
        factory.getGame().play();
    }

    public static void main(String[] args) {
        System.out.println("Feeling lucky ... ");
        Gambler.gamble(new DiceGamblingFactory());
        Gambler.gamble(new DiceGamblingFactory());
        Gambler.gamble(new DiceGamblingFactory());
        System.out.println("emm ... lets try the coin ...");
        Gambler.gamble(new CoinGamblingFactory());
        Gambler.gamble(new CoinGamblingFactory());
        Gambler.gamble(new CoinGamblingFactory());
        System.out.println("Out of money.");
    }
}


interface GamblingFactory {
    Gambling getGame();
}

class CoinGamblingFactory implements GamblingFactory{
    @Override
    public Gambling getGame() {
        return new CoinGambling();
    }
}

class DiceGamblingFactory implements GamblingFactory{
    @Override
    public Gambling getGame() {
        return new DiceGambling();
    }
}

interface Gambling {
    void play();
}

class CoinGambling implements Gambling {
    Random random = new Random();

    @Override
    public void play() {
        System.out.println(random.nextInt(2) == 0 ? "Heads" : "Tails");
    }
}

class DiceGambling implements Gambling {
    Random random = new Random();

    @Override
    public void play() {
        System.out.println((1 + random.nextInt(6)) + " " + (1 + random.nextInt(6)));
    }
}
