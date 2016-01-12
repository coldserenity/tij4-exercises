package edu.coldserenity.tij.ch08.ex11;

/**
 * A class with a method that takes a String argument
 * and produces a result that swaps each pair of characters in that argument.
 */
public class SwapChars {
    public String doSwap(String input) {

        if (input == null) return null;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length() / 2; i++) {
            result.append(input.charAt(i * 2 + 1)).append(input.charAt(i * 2));
        }

        if (input.length() % 2 == 1) {
            result.append(input.charAt(input.length() - 1));
        }

        return result.toString();
    }
}
