package edu.coldserenity.tij.ch08.ex10;

/**
 * Exercise 10: (3)
 * <p/>
 * Modify Musics.java by adding a Playable interface.
 * Move the play( ) declaration from Instrument to Playable.
 * Add Playable to the derived classes by including it in the implements list.
 * Change tune( ) so that it takes a Playable instead of an Instrument.
 */
public class Musics {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void tune(Playable i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable i : e)
            tune(i);
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
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

    void adjust();
}

interface Playable {
    void play(Note n); // Automatically public
}

class AbstractInstrument implements Instrument, Playable {
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
