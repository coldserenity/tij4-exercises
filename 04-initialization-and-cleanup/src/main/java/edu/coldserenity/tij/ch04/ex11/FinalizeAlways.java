package edu.coldserenity.tij.ch04.ex11;

/**
 * Exercise 11: (4)
 * <p/>
 * Modify the previous exercise so that your finalize( ) will always be called.
 */
public class FinalizeAlways {

    @Override
    protected void finalize() {
        System.out.println("In finalize()");
    }

    public static void main(String[] args) {
        new FinalizeAlways();

        System.gc();
    }
}
