package edu.coldserenity.tij.ch02.ex08;

/**
 * Exercise 8: (2)
 * <p/>
 * Create a switch statement that prints a message for each case,
 * and put the switch inside a for loop that tries each case.
 * <p/>
 * Put a break after each case and test it, then remove the breaks
 * and see what happens.
 */
public class TestSwitch {
    public static void main(String[] args) {

        System.out.println("Testing switch WITH \"break\" statements: ");
        System.out.println("------------------------------------------");
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("case 0");
                    break;
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                default:
                    System.out.printf("case defaul (with value %s)\n", i);
            }
        }

        System.out.println("Testing switch WITHOUT \"break\" statements: ");
        System.out.println("------------------------------------------");
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("case 0");
                case 1:
                    System.out.println("case 1");
                case 2:
                    System.out.println("case 2");
                default:
                    System.out.printf("case defaul (with value %s)\n", i);
            }
        }
    }
}
