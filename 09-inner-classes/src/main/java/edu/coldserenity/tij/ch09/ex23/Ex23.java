package edu.coldserenity.tij.ch09.ex23;

/**
 * Exercise 23: (4)
 * <p/>
 * [+] Create an interface U with three methods.
 * [+] Create a class A with a method that produces a reference
 * to a U by building an anonymous inner class.
 * [+] Create a second class B that contains an array of U.
 * [+] B should have one method that accepts and stores a reference
 * to a U in the array,
 * [+] a second method that sets a reference in the array
 * (specified by the method argument) to null,
 * [+] and a third method that moves through the array and calls
 * the methods in U.
 * <p/>
 * In main( ), create a group of A objects and a single B.
 * Fill the B with U references produced by the A objects.
 * Use the B to call back into all the A objects.
 * Remove some of the U references from the B.
 */
public class Ex23 {
    public static void main(String[] args) {
        A[] groupOfA = new A[10];
        for (int i = 0; i < groupOfA.length; i++) {
            groupOfA[i] = new A(i);
        }

        B b = new B(groupOfA.length);
        for (A a : groupOfA) {
            b.accept(a.produceU());
        }

        // Sorry, Bruce, I have no idea what "call back into all the A objects" means.
        b.alarm();

        b.wipe(5);
        b.wipe(4);
        b.wipe(7);
        b.wipe(133);
        b.wipe(4);

        System.out.println("\n\nAfter wiping 4,5 and 7");
        b.alarm();
    }
}

interface U {
    void one();

    void two();

    void three();
}

class A {
    final int id;

    A(int id) {
        this.id = id;
    }

    /**
     * A method that produces a reference to a U by building an anonymous inner class.
     *
     * @return a reference to a U
     */
    public U produceU() {
        return new U() {
            @Override
            public void one() {
                System.out.printf("A{id=%s}.one()\n", id);
            }

            @Override
            public void two() {
                System.out.printf("A{id=%s}.two()\n", id);
            }

            @Override
            public void three() {
                System.out.printf("A{id=%s}.three()\n", id);
            }
        };
    }
}

/**
 * Class B that contains an array of U.
 */
class B {
    U[] uArray;
    int count = 0;

    public B(int n) {
        this.uArray = new U[n];
    }

    /**
     * Method that accepts and stores a reference to a U in the array.
     *
     * @param u element to add to an array
     * @return index at which an element has been inserted or -1 if B is full
     */
    public int accept(U u) {
        if (count >= uArray.length) {
            return -1;
        } else {
            int i = 0;
            while (uArray[i] != null) {
                i++;
            }
            uArray[i] = u;
            count++;
            return i;
        }
    }

    /**
     * Method that sets a reference in the array (specified by the method argument) to null.
     *
     * @param index index at which to wipe the reference
     */
    public void wipe(int index) {
        if (index < 0 || index >= uArray.length) return;
        if (uArray[index] != null) {
            count--;
            uArray[index] = null;
        }
    }

    /**
     * A third method that moves through the array and calls the methods in U.
     */
    public void alarm() {
        for (U anUArray : uArray) {
            if (anUArray != null) {
                anUArray.one();
                anUArray.two();
                anUArray.three();
            }
        }
    }

}