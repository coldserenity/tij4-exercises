package edu.coldserenity.tij.ch04.ex14;

/**
 * Exercise 14: (1)
 * <p/>
 * Create a class with a static String field that is initialized at the point of
 * definition, and another one that is initialized by the static block. Add a static method that
 * prints both fields and demonstrates that they are both initialized before they are used.
 */
public class ExplicitStatic2 {
    private static String atDefinition = "atDefinition";
    private static String inStatic;

    static {
        inStatic = "inStatic";
    }


    public static void printStaticFields () {
        System.out.println(ExplicitStatic2.atDefinition);
        System.out.println(ExplicitStatic2.inStatic);
    }

    public static void main(String[] args) {
        System.out.println("main()");
        printStaticFields();
    }
}
