package edu.coldserenity.tij.ch07.ex03;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void fullyOverridden() {
        System.out.println("Circle.fullyOverridden()");
    }

}