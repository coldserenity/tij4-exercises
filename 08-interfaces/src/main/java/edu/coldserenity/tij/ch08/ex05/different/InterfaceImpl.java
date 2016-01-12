package edu.coldserenity.tij.ch08.ex05.different;

import edu.coldserenity.tij.ch08.ex05.own.Interface;

/**
 * Implementation in different package.
 */
public class InterfaceImpl implements Interface {
    @Override
    public void print() {
        System.out.println("InterfaceImpl.print()");
    }
}
