package edu.coldserenity.tij.ch01.ex06;

/**
 * Created by castle on 08.12.15.
 */
public class StorageCall {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        StorageCall storageCall = new StorageCall();

        String testString = "Test string";
        System.out.println(String.format("[%s] requires [%d] bytes of storage",
                testString, storageCall.storage(testString)));
    }
}
