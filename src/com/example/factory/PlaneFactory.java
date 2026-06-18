package com.example.factory;

public class PlaneFactory {

    public static Plane getPlane(String choice){

        if(choice.equals("CargoPlane")){
            return new CargoPlane();
        } else if (choice.equals("FighterPlane")) {
            return new FighterPlane();
        }else if (choice.equals("PassengerPlane")) {
            return new PassengerPlane();
        }



        return null;

    }
}
