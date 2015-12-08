package edu.coldserenity.tij.ch01.ex01;

public class IntCharVerifier {
    int i;
    char c;

    public static void main(String[] args) {
        IntCharVerifier icv = new IntCharVerifier();

        System.out.println("Testing uninitialized primitive fields: ");
        System.out.println("i = [" + icv.i + "]");
        System.out.println("c = [" + icv.c + "]");
    }
}
