package edu.coldserenity.tij.ch05.ex09.access;

/**
 * Exercise 9: (2)
 * Create the following file in the access/local directory (presumably in
 * your CLASSPATH):<br/>
 * <code>
 * // access/local/PackagedClass.java<br/>
 * package access.local;<br/>
 * class PackagedClass {<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;public PackagedClass() {<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Creating a packaged class");<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;}<br/>
 * }<br/>
 * </code>
 * <p/>
 * Then create the following file in a directory other than access/local:<br/>
 * <code>
 * // access/foreign/Foreign.java<br/>
 * package access.foreign;<br/>
 * import access.local.*;<br/>
 * public class Foreign {<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;public static void main(String[] args) {<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PackagedClass pc = new PackagedClass();<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;}<br/>
 * }<br/>
 * </code>
 * <p/>
 * Explain why the compiler generates an error. Would making the Foreign class part of the
 * access.local package change anything?
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("We will receive answer if try to explicitly import PackagedClass: \n" +
                "Error:(2, 51) java: edu.coldserenity.tij.ch05.ex09.access.local.PackagedClass is not public" +
                " in edu.coldserenity.tij.ch05.ex09.access.local; cannot be accessed from outside package");
        System.out.println("\n\nPlacing Foreign into access.local package makes it be in the same package as " +
                "PackagedClass and thus becoming visible to each other with package visibility.");
    }
}
