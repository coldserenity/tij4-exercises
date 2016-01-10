package edu.coldserenity.tij.ch07.ex07;

/**
 * Exercise 7: (2)
 * <p/>
 * Add a new type of Instrument to Music3.java and verify
 * that polymorphism works for your new type.
 */
public class Music3 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Violin()
        };
        tuneAll(orchestra);

        System.out.println("----------");
        for (Instrument instrument : orchestra) {
            System.out.println(instrument);
        }
    }
}

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {

    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Violin extends Stringed {
    @Override
    void play(Note n) {
        System.out.println("Violin.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Violin");
    }

    @Override
    public String toString() {
        return "Violin";
    }
}


class Brass extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}

