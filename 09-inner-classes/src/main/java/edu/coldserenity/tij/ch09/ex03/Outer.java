package edu.coldserenity.tij.ch09.ex03;

/**
 * Exercise 3: (1)
 * <p/>
 * Modify Exercise 1 so that Outer has a private String field (initialized
 * by the constructor), and Inner has a toString( ) that displays this field.
 * Create an object of type Inner and display it.
 */
public class Outer {

    private String field;

    public Outer(String field) {
        this.field = field;
    }

    class Inner {
        @Override
        public String toString() {
            return field;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Inner inner = new Outer("Test field visibility ... PASS").getInner();
        System.out.println(inner);
    }
}
