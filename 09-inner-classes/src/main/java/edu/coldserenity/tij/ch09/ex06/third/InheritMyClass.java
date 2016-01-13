package edu.coldserenity.tij.ch09.ex06.third;

import edu.coldserenity.tij.ch09.ex06.own.InterfaceWithAtLeast;
import edu.coldserenity.tij.ch09.ex06.separate.MyClass;

/**
 * In a third package, inherit from your class and, inside a method, return an object of the
 * protected inner class, upcasting to the interface during the return.
 */
public class InheritMyClass extends MyClass {
    public InterfaceWithAtLeast insideAMethod() {
        return new InnerClass();
    }
}
