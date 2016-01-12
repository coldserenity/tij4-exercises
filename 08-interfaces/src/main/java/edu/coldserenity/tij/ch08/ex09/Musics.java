package edu.coldserenity.tij.ch08.ex09;

/**
 * Exercise 9: (3)
 * <p/>
 * Refactor Musics.java by moving the common methods in Wind, Percussion and
 * Stringed into an abstract class.
 */
public class Musics {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
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
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}


interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final

    // Cannot have method definitions:
    void play(Note n); // Automatically public

    void adjust();
}

class AbstractInstrument implements Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Wind extends AbstractInstrument {
    public String toString() {
        return "Wind";
    }
}

class Percussion extends AbstractInstrument {
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends AbstractInstrument {
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }

}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }

}
