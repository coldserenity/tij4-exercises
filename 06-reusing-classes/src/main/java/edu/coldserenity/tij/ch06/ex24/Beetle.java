package edu.coldserenity.tij.ch06.ex24;

/**
 * Exercise 24: (2)
 * <p/>
 * In Beetle.java, inherit a specific type of beetle from
 * class Beetle, following the same format as the existing
 * classes. Trace and explain the output.
 * <p/>
 * <p/>
 * =======================
 * Output explanation
 * =======================
 * static Insect.x1 initialized
 * static Beetle.x2 initialized
 * ^-- because we start execution from static main() method of Beetle
 * \-- Insect and Beetle classes get loaded with their static fields initialized
 * RedBeetle constructor
 * ^-- system.out in the main() method
 * static RedBeetle.x3 initialized
 * ^-- refer to static RedBeetle constructor, thus RedBeetle class gets loaded
 * \-- with its static fields initialized
 * i = 9, j = 0
 * ^-- Insect constructor executed
 * Beetle.k initialized
 * ^-- Beetle fields initialized
 * k = 47
 * j = 39
 * ^-- Beetle constructor executed
 * RedBeetle.l initialized
 * ^-- RedBeetle fields initialized
 * l = 47
 * j = 39
 * ^-- RedBeetle constructor executed
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 =
            printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("RedBeetle constructor");
        RedBeetle b = new RedBeetle();
    }
}

class RedBeetle extends Beetle {
    private int l = printInit("RedBeetle.l initialized");

    public RedBeetle() {
        System.out.println("l = " + l);
        System.out.println("j = " + j);
    }

    private static int x3 =
            printInit("static RedBeetle.x3 initialized");
}

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 =
            printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

