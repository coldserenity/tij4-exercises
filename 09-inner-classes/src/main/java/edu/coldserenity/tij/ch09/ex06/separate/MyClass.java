package edu.coldserenity.tij.ch09.ex06.separate;

import edu.coldserenity.tij.ch09.ex06.own.InterfaceWithAtLeast;

/**
 * A class in a separate package.
 */
public class MyClass {
    /**
     * Add a protected inner class that implements the interface.
     */
    protected class InnerClass implements InterfaceWithAtLeast {

        /**
         * The default constructor of protected InnerClass is protected.
         * We need to define a public constructor to your inner class to be able to instantiate it in sub-classes.
         * <p/>
         * Sub-class can access the protected members of MyClass, but it cannot access the protected members
         * of InnerClass, since its DEFAULT constructor is protected hence you'll get compilation error if no
         * explicit public constructor is defined and you try to instantiate InnerClass in sub-classes of MyClass.
         */
        public InnerClass() {
        }

        @Override
        public void oneMethod() {
            System.out.println("MyClass.InnerClass.oneMethod()");
        }
    }
}
