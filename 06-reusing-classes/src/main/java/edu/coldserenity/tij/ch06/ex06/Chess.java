package edu.coldserenity.tij.ch06.ex06;

/**
 * Exercise 6: (1)
 * <p/>
 * Using Chess.java, prove the statements in the next paragraph.
 * <p/>
 * If you don’t call the base-class constructor in BoardGame( ),
 * the compiler will complain that it can’t find a constructor
 * of the form Game( ).
 * In addition, the call to the base-class constructor must be
 * the first thing you do in the derived-class constructor.
 * (The compiler will remind you if you get it wrong.)
 */

public class Chess extends BoardGame {
    Chess() {
        // removing call to super constructor results in
        // following error:
        //    Error:(17, 13) java: constructor BoardGame in class BoardGame cannot be applied to given types;
        //    required: int
        //    found: no arguments
        //    reason: actual and formal argument lists differ in length
        //
        // making call to super constuctor not the first statement
        // results in following error
        //    Error:(29, 14) java: call to super must be first statement in constructor
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
