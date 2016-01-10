package edu.coldserenity.tij.ch07.ex03;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void partiallyOverridden() {
        System.out.println("Triangle.partiallyOverridden()");
    }

    @Override
    public void fullyOverridden() {
        System.out.println("Triangle.fullyOverridden()");
    }

}