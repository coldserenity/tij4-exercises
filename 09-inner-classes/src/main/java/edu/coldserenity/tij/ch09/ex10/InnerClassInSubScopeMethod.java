package edu.coldserenity.tij.ch09.ex10;

/**
 * Exercise 10: (1)
 * <p/>
 * Repeat the previous exercise but define the inner class within a scope
 * within a method.
 */
public class InnerClassInSubScopeMethod {
    public Interface methodWithInnerClass(boolean yes) {
        Interface result = null;
        if (yes) {
            class Inner implements Interface {
                @Override
                public void oneMethod() {
                    System.out.println("Inner.oneMethod()");
                }

            }
            result = new Inner();
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new InnerClassInSubScopeMethod().methodWithInnerClass(true));
    }
}


interface Interface {
    void oneMethod();
}

