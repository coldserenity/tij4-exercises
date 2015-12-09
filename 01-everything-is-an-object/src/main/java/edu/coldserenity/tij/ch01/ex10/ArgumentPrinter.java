package edu.coldserenity.tij.ch01.ex10;

public class ArgumentPrinter {
    public static void main(String[] args) {
        System.out.println(String.format(
                "{args[0]=\"%s\", args[1]=\"%s\", args[2]=\"%s\"}",
                args[0], args[1], args[2])
        );
    }
}
