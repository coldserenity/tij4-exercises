//: edu/coldserenity/tij/ch01/ex16/Print.java
package edu.coldserenity.tij.ch01.ex16;

import java.io.*;

/**
 * Print methods that can be used without
 * qualifiers, using Java SE5 static imports.
 *
 * Note: I had to copy this class from original sources of TIJ4 samples, because
 * I wanted to make my entire project compile.
 */
public class Print {
    // Print with a newline:
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // Print a newline by itself:
    public static void print() {
        System.out.println();
    }

    // Print with no line break:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    // The new Java SE5 printf() (from C):
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
} ///:~
