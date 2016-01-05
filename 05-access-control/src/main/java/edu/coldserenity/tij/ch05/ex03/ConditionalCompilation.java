package edu.coldserenity.tij.ch05.ex03;

// switch import to turn debugging on/off
import static edu.coldserenity.tij.ch05.ex03.debug.Identical.debug;
//import static edu.coldserenity.tij.ch05.ex03.debugoff.Identical.debug;

/**
 * Exercise 3: (2)
 * <p/>
 * Create two packages: debug and debugoff, containing an identical class
 * with a debug( ) method. The first version displays its String argument
 * to the console, the second does nothing.
 * <p/>
 * Use a static import line to import the class into a test program, and
 * demonstrate the conditional compilation effect.
 */
public class ConditionalCompilation {
    public static void main(String[] args) {
        debug();
    }
}
