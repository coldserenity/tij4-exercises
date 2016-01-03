package edu.coldserenity.tij.ch04.ex08;

/**
 * Exercise 8: (1)
 * <p/>
 * Create a class with two methods.
 * Within the first method, call the second method twice:
 * the first time without using this,
 * and the second time using this — just to see it working;
 * you should not use this form in practice.
 */
public class This {

    public void callerMethod() {
        calleeMethod(this);
        this.calleeMethod(this);
    }

    private void calleeMethod(This param) {
        System.out.println("calleeCalled: " + param);
    }

    public static void main(String[] args) {
        new This().callerMethod();
    }

}
