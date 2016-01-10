package edu.coldserenity.tij.ch06.ex20;

/**
 * Exercise 20: (1)
 *
 * Show that @Override annotation solves the problem in this section.
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
// You can upcast:
        OverridingPrivate op = op2;
// But you can’t call the methods:
//! op.f();
//! op.g();
// Same here:
        WithFinals wf = op2;
//! wf.f();
//! wf.g();
    }
}


class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    // Also automatically "final":
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    // with @Override annotation there will be a compilation
    // error
    //    Error:(30, 5) java: method does not override or implement a method from a supertype
    // that explicitly tells us that we're not overriding anything
    //@Override
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    // with @Override annotation there will be a compilation
    // error
    //    Error:(39, 5) java: method does not override or implement a method from a supertype
    // that explicitly tells us that we're not overriding anything
    //@Override
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}
