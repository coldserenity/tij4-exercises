package edu.coldserenity.tij.ch05.ex06;

/**
 * Exercise 6: (1)
 * <p/>
 * Create a class with protected data. Create a second class in the same file
 * with a method that manipulates the protected data in the first class.
 */
public class TestProtected {
    public static void main(String[] args) {
        ClassWithProtectedData cwpd = new ClassWithProtectedData();
        System.out.printf("Data before modification [%s]\n", cwpd.protectedData);
        cwpd.protectedData = "new data";
        System.out.printf("Data after modification [%s]\n", cwpd.protectedData);
    }
}

class ClassWithProtectedData {
    protected String protectedData;
}
