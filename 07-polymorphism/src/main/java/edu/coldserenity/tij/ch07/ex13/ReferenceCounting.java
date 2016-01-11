package edu.coldserenity.tij.ch07.ex13;

/**
 * Exercise 13: (3)
 * <p/>
 * Add a finalize( ) method to ReferenceCounting.java to verify the
 * termination condition (see the Initialization & Cleanup chapter).
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    @Override
    protected void finalize() throws Throwable {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
            super.finalize();
        }
    }

    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("disposing " + this);
        shared.finalize();
        super.finalize();
    }

    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) throws Throwable {
        Shared shared = new Shared();

        new Composing(shared);
        new Composing(shared);
        new Composing(shared);
        new Composing(shared);
        new Composing(shared);
        System.gc();
    }
}
