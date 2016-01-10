package edu.coldserenity.tij.ch06.ex21;

/**
 * Exercise 21: (1)
 *
 * Create a class with a final method.
 * Inherit from that class and attempt to overwrite that method.
 */
public class FinalOverride {
}

class BaseClass{
    protected final void method() {}
}

class HeirClass extends BaseClass {

    // override is not possible:
    //    Error:(23, 17) java: method() in HeirClass cannot override method() in BaseClass
    //      overridden method is final

    // @Override
    // public void method() {}
}