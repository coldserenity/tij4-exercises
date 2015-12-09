package edu.coldserenity.tij.ch02.ex04;


public class SimplePhysics {

    public static double v(double s, double t) {
        if (0 == s) {
            return 0;
        }

        if (0 == t) {
            return Double.POSITIVE_INFINITY * Math.signum(s);
        }

        return s / t;
    }

    public static void main(String[] args) {
        double s = 100, t = 30;
        System.out.printf("Space %fm, time %fs; velocity %fm/s", s, t,
                v(s, t));
    }
}
