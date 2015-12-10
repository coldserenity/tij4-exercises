package edu.coldserenity.tij.ch02.ex06;

/**
 * Exercise 6: (2)
 * <p/>
 * Modify the two test( ) methods in the previous two programs
 * so that they take two extra arguments, begin and end,
 * and so that testval is tested to see if it is within
 * the range between (and including) begin and end.
 */
public class IfElse {
    static int result = 0;

    static void test(int testval, int begin, int end) {
        if (testval > end)
            result = +1;
        else if (testval < begin)
            result = -1;
        else
            result = 0; // Match
    }

    public static void main(String[] args) {
        test(10, 5, 7);
        System.out.println(result);
        test(5, 5, 10);
        System.out.println(result);
        test(5, 7, 8);
        System.out.println(result);
    }
}
