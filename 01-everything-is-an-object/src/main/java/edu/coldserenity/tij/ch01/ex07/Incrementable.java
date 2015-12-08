package edu.coldserenity.tij.ch01.ex07;

public class Incrementable {
    static void increment() { StaticStructure.i++; }

    public static void main(String[] args) {
        System.out.println("Initial value [" + StaticStructure.i + "]");

        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("After sf.increment(): [" + StaticStructure.i + "]");

        Incrementable.increment();
        System.out.println("After Incrementable.increment(): [" + StaticStructure.i + "]");
    }
}
