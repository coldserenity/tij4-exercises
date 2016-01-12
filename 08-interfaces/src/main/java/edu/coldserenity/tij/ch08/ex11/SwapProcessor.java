package edu.coldserenity.tij.ch08.ex11;

/**
 * Exercise 11: (4)
 * <p/>
 * Create a class with a method that takes a String argument and produces
 * a result that swaps each pair of characters in that argument.
 * Adapt the class so that it works with Apply.process( ).
 */
public class SwapProcessor {
    public static void main(String[] args) {
        Apply.process(new SwapAdapter(),
                "If she weighs the same as a duck, she’s made of wood");
    }
}

class SwapAdapter implements Processor {
    SwapChars swapChars = new SwapChars();

    @Override
    public String name() {
        return "Swap chars adapter";
    }

    @Override
    public String process(Object input) {
        return swapChars.doSwap((String) input);
    }
}

