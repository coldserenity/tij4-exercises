package edu.coldserenity.tij.ch07.ex15;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int a = 1;
    private int b = 1;

    RectangularGlyph(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.printf("RectangularGlyph.RectangularGlyph(), a = %s, b = %s\n", a, b);
    }

    void draw() {
        System.out.printf("RectangularGlyph.draw(), a = %s, b = %s\n", a, b);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        System.out.println("-----------");
        new RectangularGlyph(100, 200);
    }
} 
