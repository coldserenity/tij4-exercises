package edu.coldserenity.tij.ch09.ex26;

/**
 * Exercise 26: (2)
 * <p/>
 * Create a class with an inner class that has a non-default constructor
 * (one that takes arguments). Create a second class with an inner class
 * that inherits from the first inner class.
 */
public class InheritingFromInnerClasses {
    public static void main(String[] args) {
        System.out.println(new InheritInner(new WithInner(10)));
    }
}

class WithInner {
    int field;

    public WithInner(int field) {
        this.field = field;
    }

    class Inner {
    }

    @Override
    public String toString() {
        return "WithInner{" +
                "field=" + field +
                '}';
    }
}

class InheritInner extends WithInner.Inner {
    private WithInner wi;

    public InheritInner(WithInner wi) {
        wi.super();
        this.wi = wi;
    }

    @Override
    public String toString() {
        return "InheritInner{" +
                "\n  " + wi +
                "\n}";
    }
}