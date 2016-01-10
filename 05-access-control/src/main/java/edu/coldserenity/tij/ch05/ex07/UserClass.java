package edu.coldserenity.tij.ch05.ex07;

import edu.coldserenity.tij.ch05.ex07.access.Widget;

// Error:(6, 45) java: edu.coldserenity.tij.ch05.ex03.access.WidgetUtility is not public in edu.coldserenity.tij.ch05.ex03.access; cannot be accessed from outside package
//import edu.coldserenity.tij.ch05.ex03.access.WidgetUtility;

/**
 * Exercise 7: (1)
 * <p/>
 * Create the library according to the code fragments describing access and
 * Widget. Create a Widget in a class that is not part of the access package.
 */
public class UserClass {
    public static void main(String[] args) {
        Widget widget = new Widget();
        widget.saySomething();

        // Error:(22, 9) java: cannot find symbol
        // symbol:   variable WidgetUtility
        // location: class edu.coldserenity.tij.ch05.ex03.UserClass
//        WidgetUtility.sayIt();
    }
}
