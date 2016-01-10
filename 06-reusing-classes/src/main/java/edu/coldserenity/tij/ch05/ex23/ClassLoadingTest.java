package edu.coldserenity.tij.ch05.ex23;

/**
 * Exercise 23: (2)
 * <p/>
 * Prove that class loading takes place only once. Prove that loading
 * may be caused by either the creation of the first instance of that
 * class or by the access of a static member.
 */
public class ClassLoadingTest {
    public static void main(String[] args) {
        // initialization happened on constructor access
        new Class1();

        // initialization on static field access
        int k = Class2.i;

        // initialization on static method access
        Class3.test();


        // Class4 initialization never happens
    }
}

class Base {
    static {
        System.out.println("Base class has been initialized. This happens only once");
    }

    protected static int initializeInt(int val) {
        System.out.println("Initialized " + val);
        return val;
    }
}

class Class1 extends Base {
    static int i = initializeInt(1);
}

class Class2 extends Base {
    static int i = initializeInt(2);
}

class Class3 extends Base {
    static int i = initializeInt(3);

    static int test() {
        return 100;
    }
}

class Class4 extends Base {
    static int i = initializeInt(4);
}