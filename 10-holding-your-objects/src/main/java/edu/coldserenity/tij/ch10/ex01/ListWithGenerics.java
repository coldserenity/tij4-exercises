package edu.coldserenity.tij.ch10.ex01;

import java.util.ArrayList;

/**
 * Exercise 1: (2)
 * <p/>
 * Create a new class called Gerbil with an int gerbilNumber that’s
 * initialized in the constructor. Give it a method called hop( )
 * that displays which gerbil number this is, and that it’s hopping.
 * Create an ArrayList and add Gerbil objects to the List.
 * Now use the get( ) method to move through the List and call
 * hop( ) for each Gerbil.
 */
public class ListWithGenerics {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }


        for (int i = 0; i < gerbils.size(); i++) {
            Gerbil gerbil = gerbils.get(i);
            gerbil.hop();
        }
    }
}

class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil #" + gerbilNumber + " is hopping");
    }
}