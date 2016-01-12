package edu.coldserenity.tij.ch08.ex13;

/**
 * Exercise 13: (2)
 * Create an interface, and inherit two new interfaces from that interface.
 * Multiply inherit a third interface from the second two.
 * (This shows how interfaces prevent the "diamond problem" that occurs with C++
 * multiple inheritance.)
 */
public class NoDiamondProblems {
    public static void main(String[] args) {
        new Impl().method_level0();
        new Impl().method_level1();
        new Impl().method_level1_i1();
        new Impl().method_level1_i2();
    }
}

interface Level0 {
    void method_level0();
}

interface Level1_I1 extends Level0 {
    void method_level1();
    void method_level1_i1();
}

interface Level1_I2 extends Level0 {
    void method_level1();
    void method_level1_i2();
}

interface Level2_AkaDiamondComplete extends Level1_I1, Level1_I2 {
}

class Impl implements Level2_AkaDiamondComplete {

    @Override
    public void method_level1() {

    }

    @Override
    public void method_level1_i2() {

    }

    @Override
    public void method_level1_i1() {

    }

    @Override
    public void method_level0() {

    }
}