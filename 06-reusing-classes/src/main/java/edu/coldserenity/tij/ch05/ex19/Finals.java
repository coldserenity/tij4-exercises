package edu.coldserenity.tij.ch05.ex19;

/**
 * Exercise 19: (2)
 * Create a class with a blank final reference to an object.
 * Perform the initialization of the blank final inside all
 * constructors.
 * Demonstrate the guarantee that the final must be
 * initialized before use, and that it cannot be changed
 * once initialized.
 */
public class Finals {
}


class BlankFinalClass {
    final Object o;

    public BlankFinalClass(Object o) {
        // if commented out, produces compilation error:
        //  Error:(21, 5) java: variable o might not have been initialized
        this.o = o;

        // if uncommented, produces compilation error:
        //  Error:(25, 13) java: variable o might already have been assigned
        //this.o = new Object();
    }
}