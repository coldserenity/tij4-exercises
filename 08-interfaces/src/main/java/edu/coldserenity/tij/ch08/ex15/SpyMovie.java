package edu.coldserenity.tij.ch08.ex15;

/**
 * Exercise 15: (2)
 * Modify the previous exercise by creating an abstract class and
 * inheriting that into the derived class.
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

abstract class CarWithLaserGun {

    public abstract void snapLaser();

}

class JamesBondCar extends CarWithLaserGun implements SpyCar {

    @Override
    public void launchRocket() {

    }

    @Override
    public void ride() {

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

    @Override
    public void snapLaser() {

    }
}