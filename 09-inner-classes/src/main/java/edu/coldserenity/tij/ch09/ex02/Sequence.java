package edu.coldserenity.tij.ch09.ex02;

/**
 * Exercise 2: (1)
 * <p/>
 * Create a class that holds a String, and has a toString( ) method that
 * displays this String. Add several instances of your new class to a
 * Sequence object, then display them.
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(new StringContainer("Integer " + i + " with bells&whistles"));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

class StringContainer {
    private String string;

    public StringContainer(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}
