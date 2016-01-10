package edu.coldserenity.tij.ch06.ex17;

/**
 * Exercise 17: (1)
 * <p/>
 * Modify Exercise 16 so that Frog overrides the method
 * definitions from the base class (provides new definitions
 * using the same method signatures). Note what happens in
 * main( ).
 */
public class TestClass {

    public static void main(String[] args) {
        Frog frog = new Frog();

        escape(frog);

        frog.jump();
    }

    public static void escape(Amphibian amphibian) {
        amphibian.swim();
        amphibian.swim();
        amphibian.swim();
    }
}

class Amphibian {
    public void swim() {
        System.out.print("swirl ... ");
    }
}

class Frog extends Amphibian {
    public void jump() {
        System.out.print("jump");
    }

    @Override
    public void swim() {
        super.swim();
        System.out.print("brrum ... ");
    }
}
