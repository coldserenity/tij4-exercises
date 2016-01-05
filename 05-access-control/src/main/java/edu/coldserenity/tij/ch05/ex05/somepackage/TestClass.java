package edu.coldserenity.tij.ch05.ex05.somepackage;

/**
 * Class with public, private, protected, and package-access
 * fields and method members.
 */
public class TestClass {
    public void publicMethod() {
        System.out.println("public");
    }

    void packageMethod() {
        System.out.println("package");
    }

    protected void protectedMethod() {
        System.out.println("protected");
    }

    private void privateMethod() {
        System.out.println("private");
    }

}
