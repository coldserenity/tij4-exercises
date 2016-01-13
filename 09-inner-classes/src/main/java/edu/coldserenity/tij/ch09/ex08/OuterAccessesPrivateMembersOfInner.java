package edu.coldserenity.tij.ch09.ex08;

/**
 * Exercise 8: (2)
 * <p/>
 * Determine whether an outer class has access to the private elements of
 * its inner class.
 * <p/>
 * =======================
 * Yes it has access to private members of instances of inner classes.
 */
public class OuterAccessesPrivateMembersOfInner {
    public static void main(String[] args) {
        new Outer().testMethod();
    }
}


class Outer {
    class Inner {
        private int privateField = 300;

        private void privateMethod() {
            System.out.println("Outer.Inner.privateMethod() triggered");
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "privateField=" + privateField +
                    '}';
        }
    }

    public void testMethod() {
        Inner inner = new Inner();
        System.out.println("New Inner created:");
        System.out.println(inner);
        inner.privateField = 100;
        inner.privateMethod();
        System.out.println("\nAfter direct field access:");
        System.out.println(inner);
    }
}