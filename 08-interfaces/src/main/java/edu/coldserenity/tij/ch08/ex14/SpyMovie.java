package edu.coldserenity.tij.ch08.ex14;

/**
 * Exercise 14: (2)
 * <p/>
 * Create three interfaces, each with two methods. Inherit a new interface
 * that combines the three, adding a new method. Create a class by
 * implementing the new interface and also inheriting from a concrete class.
 * Now write four methods, each of which takes one of the four interfaces
 * as an argument. In main( ), create an object of your class and pass it
 * to each of the methods.
 */
public class SpyMovie {
    public static void p(Car car) {
        car.ride();
        car.pumpWheels();
    }
    public static void q(Ship ship) {
        ship.swim();
        ship.pumpOutWater();
    }
    public static void r(Plane plane) {
        plane.fly();
        plane.ejectParachute();
    }
    public static void s(SpyCar spyCar) {
        spyCar.ride();
        spyCar.pumpWheels();
        spyCar.swim();
        spyCar.pumpOutWater();
        spyCar.fly();
        spyCar.ejectParachute();
        spyCar.launchRocket();
    }

    public static void main(String[] args) {
        JamesBondCar astonMartin = new JamesBondCar();
        p(astonMartin);
        q(astonMartin);
        r(astonMartin);
        s(astonMartin);

        astonMartin.snapLaser();
    }
}

interface Car {
    void ride();

    void pumpWheels();
}

interface Ship {
    void swim();

    void pumpOutWater();
}

interface Plane {
    void fly();

    void ejectParachute();
}

interface SpyCar extends Car, Ship, Plane {
    void launchRocket();
}

class CarWithLaserGun {

    public void ride() {

    }

    public void snapLaser() {

    }

}

class JamesBondCar extends CarWithLaserGun implements SpyCar {

    @Override
    public void launchRocket() {

    }

    @Override
    public void pumpWheels() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void ejectParachute() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void pumpOutWater() {

    }
}