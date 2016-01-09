package edu.coldserenity.tij.ch05.ex15;

import edu.coldserenity.tij.ch05.ex15.somepackage.AClass;

/**
 * Exercise 15: (2)
 * <p/>
 * Create a class inside a package. Your class should contain a protected
 * method. Outside of the package, try to call the protected method and
 * explain the results.
 * <p/>
 * Now inherit from your class and call the protected method from inside
 * a method of your derived class.
 */
public class TestClass {
    public static void main(String[] args) {
        AClass aClass = new AClass();

        System.out.println(
                "Calling " +
                "\n   aClass.protectedMethod();" +
                "\nwill produce \n" +
                "   Error:(27, 15) java: protectedMethod() has protected access in edu.coldserenity.tij.ch05.ex15.somepackage.AClass" +
                "\nthis is because TestClass " +
                "\n   1. does not inherit AClass" +
                "\n   2. TestClass is not in package visibility with AClass");
        //aClass.protectedMethod();

        System.out.println("\nNow AClassHeir extends AClass and we can call " +
                "protected AClass method from within AClassHeir:");
        new AClassHeir().doProtected();
    }

}

class AClassHeir extends AClass {
    void doProtected() {
        // now everything's ok, because we've inherited the method.
        protectedMethod();
    }
}