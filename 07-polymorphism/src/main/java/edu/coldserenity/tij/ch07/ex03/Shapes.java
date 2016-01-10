package edu.coldserenity.tij.ch07.ex03;


/**
 * Exercise 3: (1)
 *
 * Add a new method in the base class of Shapes.java that
 * prints a message, but don’t override it in the derived
 * classes. Explain what happens.
 *
 * Now override it in one of the derived classes but not
 * the others, and see what happens. Finally, override
 * it in all the derived classes.
 *
 * ========================
 * Explanation:
 * --- nonOverridden()
 * Because no implementation exists in derived classes,
 * Shape implementation is taken at execution time for
 * all shapes.
 *
 * --- partiallyOverridden()
 * There exists only one re-implementation of this
 * method in Triangle, which gets called for triangle.
 * For the rest of shapes, Shape implementation is taken.
 *
 * --- fullyOverridden()
 * For each shape uses it's own implementation of this
 * method much the same as in case with draw() in the
 * initial example.
 *
 */
public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for (Shape shp : s) {
            System.out.println("--------");
            shp.draw();
            shp.nonOverridden();
            shp.partiallyOverridden();
            shp.fullyOverridden();
        }
    }
}