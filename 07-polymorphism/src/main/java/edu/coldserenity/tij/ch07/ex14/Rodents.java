package edu.coldserenity.tij.ch07.ex14;

/**
 * Exercise 14: (4)
 * <p/>
 * Modify Exercise 12 so that one of the member objects is a shared object
 * with reference counting, and demonstrate that it works properly.
 */
public class Rodents {
    public static void main(String[] args) {
        Incubator incubator = new Incubator();
        Rodent[] rodents = new Rodent[]{
                new Mouse(incubator),
                new Gerbil(incubator),
                new Hamster(incubator),
        };

        for (Rodent rodent : rodents) {
            rodent.dispose();
        }
    }
}

class Incubator {
    private long referenceCount = 0;

    public Incubator() {
        System.out.println("Creating incubator");
    }

    public long add() {
        return ++referenceCount;
    }

    public void dispose() {
        if (--referenceCount == 0) {
            System.out.println("Disposing incubator");
        }
    }
}

class Tooth {
    public Tooth() {
        System.out.println("Tooth()");
    }
}

class Rodent {
    protected Tooth[] teeth = new Tooth[]{new Tooth()};
    protected Incubator incubator;

    public Rodent(Incubator incubator) {
        this.incubator = incubator;
        incubator.add();
        System.out.println("Rodent()");
    }

    public void dispose() {
        System.out.println("Disposing another " + this);
        incubator.dispose();
    }
}

class Mouse extends Rodent {
    protected Tooth[] teeth = new Tooth[]{new Tooth(), new Tooth()};

    public Mouse(Incubator incubator) {
        super(incubator);
        System.out.println("Mouse()");
    }
}

class Gerbil extends Rodent {
    protected Tooth[] teeth = new Tooth[]{new Tooth(), new Tooth(), new Tooth()};

    public Gerbil(Incubator incubator) {
        super(incubator);
        System.out.println("Gerbil()");
    }
}

class Hamster extends Rodent {
    protected Tooth[] teeth = new Tooth[]{new Tooth(), new Tooth(), new Tooth(), new Tooth()};

    public Hamster(Incubator incubator) {
        super(incubator);
        System.out.println("Hamster()");
    }
}
