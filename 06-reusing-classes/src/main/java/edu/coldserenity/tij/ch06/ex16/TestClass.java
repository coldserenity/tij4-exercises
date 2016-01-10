package edu.coldserenity.tij.ch06.ex16;

/**
 * Exercise 16: (2) Create a class called Amphibian.
 * From this, inherit a class called Frog.
 * Put appropriate methods in the base class.
 * In main( ), create a Frog and upcast it to Amphibian
 * and demonstrate that all the methods still work.
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
}
