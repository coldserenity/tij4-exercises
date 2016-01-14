package edu.coldserenity.tij.ch09.ex19;

/**
 * Exercise 19: (2)
 * <p/>
 * Create a class containing an inner class that itself contains an inner
 * class. Repeat this using nested classes. Note the names of the .class
 * files produced by the compiler.
 */
public class NestedAndInner {
    public static void main(String[] args) {
        System.out.println("Names for the classes are: ");
        System.out.println("NestedAndInner.class                  OuterWithNested.class\n" +
                "OuterWithInner.class                  OuterWithNested$InnerL1.class\n" +
                "OuterWithInner$InnerL1.class          OuterWithNested$InnerL1$InnerL2.class\n" +
                "OuterWithInner$InnerL1$InnerL2.class\n");
    }
}


class OuterWithInner {
    class InnerL1 {
        class InnerL2 {
        }
    }
}

class OuterWithNested {
    static class InnerL1 {
        static class InnerL2 {
        }
    }
}

