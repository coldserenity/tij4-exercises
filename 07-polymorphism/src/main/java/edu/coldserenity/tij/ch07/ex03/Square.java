package edu.coldserenity.tij.ch07.ex03;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void fullyOverridden() {
        System.out.println("Square.fullyOverridden()");
    }

}