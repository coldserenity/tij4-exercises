package edu.coldserenity.tij.ch06.ex22;

/**
 * Exercise 22: (1)
 *
 * Create a final class and attempt to inherit from it.
 */
public class FinalClassOverride {
}

final class FinalClass {

}

// trying to extend final class gives compilation error:
//    Error:(17, 37) java: cannot inherit from final FinalClass
class AttemptExtendingFinal /*extends FinalClass*/ {

}