package edu.coldserenity.tij.ch04.ex13;

/**
 * Exercise 13: (1) Verify the statements in the previous paragraph.
 * <p/>
 * The static initializers for Cups run when either the access of the static object cup1 occurs
 * on the line marked (1),
 * <p/>
 * or if line (1) is commented out and the lines marked (2) are uncommented.
 * <p/>
 * If both (1) and (2) are commented out, the static initialization for Cups
 * never occurs, as you can see from the output.
 * <p/>
 * Also, it doesn’t matter if one or both of the lines
 * marked (2) are uncommented; the static initialization only occurs once.
 */
class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // (1)
    }
// static Cups cups1 = new Cups(); // (2)
// static Cups cups2 = new Cups(); // (2)
}
