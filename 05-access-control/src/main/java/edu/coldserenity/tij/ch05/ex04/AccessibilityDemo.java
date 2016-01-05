package edu.coldserenity.tij.ch05.ex04;

import edu.coldserenity.tij.ch05.ex04.somepackage.FriendlyClassUsingProtectedMethods;

/**
 * Exercise 4: (2)
 * <p/>
 * Show that protected methods have package access but are not public.
 */
public class AccessibilityDemo {
    public static void main(String[] args) {
        new FriendlyClassUsingProtectedMethods().publicUseOfProtectedMethod();

        // following does not work, since protectedUseOfProtectedMethod(); is protected
        // new FriendlyClassUsingProtectedMethods().protectedUseOfProtectedMethod();
    }
}
