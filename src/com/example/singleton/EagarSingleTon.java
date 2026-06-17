package com.example.singleton;


class Database{

    private static  Database instance= new Database();//objects will be created even if the object doesn't used also
    private Database(){

    }

    public static final Database getInstance(){
        return instance;
    }
}
public class EagarSingleTon {

    public static void main(String[] args) {

        Database d1=Database.getInstance();
        Database d2=Database.getInstance();
        Database d3=Database.getInstance();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}