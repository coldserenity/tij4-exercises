package edu.coldserenity.tij.ch09.ex11;

/**
 * Exercise 11: (2)
 * <p/>
 * Create a private inner class that implements a public interface. Write
 * a method that returns a reference to an instance of the private inner
 * class, upcast to the interface. Show that the inner class is completely
 * hidden by trying to downcast to it.
 */
public class PrivateInner {
    public static void main(String[] args) {
        SomeClass.PublicInterface pi = new SomeClass().getInstance();
        System.out.println(pi);

        // SomeClass.PrivateInnerClass privateInnerClass = pi;
        //   ^-- Error:(16, 18) java: edu.coldserenity.tij.ch09.ex11.SomeClass.PrivateInnerClass has private access
        //                            in edu.coldserenity.tij.ch09.ex11.SomeClass
    }
}


class SomeClass {
    interface PublicInterface {
    }

    private class PrivateInnerClass implements PublicInterface {
        public PrivateInnerClass() {
            super();
        }
    }

    public PublicInterface getInstance() {
        return new PrivateInnerClass();
    }
}


