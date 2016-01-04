package edu.coldserenity.tij.ch04.ex22;

/**
 * Exercise 22: (2)
 *
 * Write a switch statement for the enum in the previous example.
 * For each case, output a description of that particular currency.
 */
public class EnumTester {
    public static void main(String[] args) {
        for ($ value : $.values()) {
            switch (value) {
                case ONE:
                    System.out.println("1 dollar");
                    break;
                case TWO:
                    System.out.println("2 dollars, very rare!");
                    break;
                case FIVE:
                    System.out.println("5 dollars");
                    break;
                case TEN:
                    System.out.println("10 dollars");
                    break;
                case TWENTY:
                    System.out.println("20 dollars");
                    break;
                case FIFTY:
                    System.out.println("50 dollars");
                    break;
            }
        }
    }
}
