package edu.coldserenity.tij.ch09.ex04;

/**
 * Exercise 4: (2)
 * <p/>
 * Add a method to the class Sequence.SequenceSelector that produces
 * the reference to the outer class Sequence.
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

        public Sequence getParent() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        for (int i = 0; i < 5; i++)
            sequence.add(new StringContainer("Integer " + i + " with bells&whistles"));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            System.out.println(sequence.selector().getParent());
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

    Sequence getParent();
}
