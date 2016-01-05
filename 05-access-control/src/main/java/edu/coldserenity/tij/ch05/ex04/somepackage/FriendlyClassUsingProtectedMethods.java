package edu.coldserenity.tij.ch05.ex04.somepackage;

/**
 * A friendly class that is able to access protected
 * member in {@link ClassWithProtectedMethods}.
 */
public class FriendlyClassUsingProtectedMethods {

    protected void protectedUseOfProtectedMethod() {
        // we're able to access protected method from friendly class
        new ClassWithProtectedMethods().testMe();
    }

    public void publicUseOfProtectedMethod() {
        // we're able to access protected method from friendly class
        new ClassWithProtectedMethods().testMe();
    }
}
