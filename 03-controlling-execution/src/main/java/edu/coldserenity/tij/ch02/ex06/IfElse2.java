package edu.coldserenity.tij.ch02.ex06;

/**
 * Exercise 6: (2)
 * <p/>
 * Modify the two test( ) methods in the previous two programs
 * so that they take two extra arguments, begin and end,
 * and so that testval is tested to see if it is within
 * the range between (and including) begin and end.
 */
public class IfElse2 {
    static int test(int testval, int begin, int end) {
        if (testval > end)
            return +1;
        else if (testval < begin)
            return -1;
        else
            return 0; // Match
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 7));
        System.out.println(test(5, 5, 10));
        System.out.println(test(5, 7, 10));
    }
}
