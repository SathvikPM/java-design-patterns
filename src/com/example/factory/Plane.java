package com.example.factory;

public interface Plane {

    void takeOff();
    void fly();
    void land();
}
class CargoPlane implements Plane{

    @Override
    public void takeOff() {
        System.out.println("cargoPlane taking off");
    }

    @Override
    public void fly() {
        System.out.println("cargoPlane flying");
    }

    @Override
    public void land() {
        System.out.println("cargoPlane landed");
    }
}
class FighterPlane implements Plane{

    @Override
    public void takeOff() {
        System.out.println("FighterPlane taking off");
    }

    @Override
    public void fly() {
        System.out.println("FighterPlane flying");
    }

    @Override
    public void land() {
        System.out.println("FighterPlane landed");
    }

}

class PassengerPlane implements Plane{

    @Override
    public void takeOff() {
        System.out.println("PassengerPlane taking off");
    }

    @Override
    public void fly() {
        System.out.println("PassengerPlane flying");
    }

    @Override
    public void land() {
        System.out.println("PassengerPlane landed");
    }

}

