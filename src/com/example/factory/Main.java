package com.example.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice:\nCargoPlane\nFighterPlane\nPassengerPlane");
        String choice=scanner.next();
        Plane plane=PlaneFactory.getPlane(choice);
        plane.takeOff();
        plane.fly();
        plane.land();



    }
}
