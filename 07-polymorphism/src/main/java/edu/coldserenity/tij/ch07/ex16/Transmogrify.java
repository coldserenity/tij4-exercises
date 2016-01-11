package edu.coldserenity.tij.ch07.ex16;

/**
 * Exercise 16: (3)
 *
 * Following the example in Transmogrify.java, create a Starship class
 * containing an AlertStatus reference that can indicate three different
 * states.
 * Include methods to change the states.
 */
public class Transmogrify {
    public static void main(String[] args) {
        Spaceship spaceship = new Spaceship();
        spaceship.reportStatus();
        spaceship.change();
        spaceship.reportStatus();
        spaceship.returnHome();
        spaceship.reportStatus();
    }
}
class AlterStatus {
    public void reportState() {
    }

}
class HyperSpace extends AlterStatus {
    public void reportState() {
        System.out.println("In hyperspace");
    }
}

class Space extends AlterStatus {
    public void reportState() {
        System.out.println("In space");
    }
}

class Docked extends AlterStatus {
    public void reportState() {
        System.out.println("In dock");
    }
}

class Spaceship {

    private AlterStatus status = new HyperSpace();

    public void change() {
        status = new Space();
    }

    public void returnHome() {
        status = new Docked();
    }

    public void reportStatus() {
        status.reportState();
    }

}
