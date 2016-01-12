package edu.coldserenity.tij.ch08.ex06.other;

/**
 * Some interface.
 */
public interface Interface {
    // private void printPrivate();
    //   ^-- Error:(7, 18) java: modifier private not allowed here
    // protected void printProtected();
    //   ^-- Error:(9, 20) java: modifier protected not allowed here
    void printPublic();
}
