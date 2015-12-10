package edu.coldserenity.tij.ch02.ex14;

/**
 * Exercise 14: (3)
 * <p/>
 * Write a method that takes two String arguments and uses all the
 * boolean comparisons to compare the two Strings and print the results.
 * For the == and !=, also perform the equals( ) test.
 * <p/>
 * In main( ), call your method with some different String objects.
 */
public class ComparingStrings {
    public static void compareStrings(String a, String b) {
        System.out.printf("\nTesting all comparison types on a=\"%s\" and b=\"%s\"\n: ", a,b);
        System.out.printf(" == : %s\n", a == b);
        System.out.printf(" != : %s\n", a != b);
        System.out.printf(" .equals(): %s\n", a.equals(b));
    }

    public static void main(String[] args) {
        compareStrings("", "");
        compareStrings("", "test");

        String test = "test";
        compareStrings(test, "test");


        String test2 = new StringBuilder().append("t").append("e").append("s").append("t2").toString();
        compareStrings(test2, "test2");

        compareStrings("test", null);
    }
}
