package com.example.singleton;

//most Efficent approch
class DataBase3{

    private DataBase3(){

    }
    private static class Holder{
        private static DataBase3 instance=new DataBase3();

    }
    public static DataBase3 getInstance(){
        return Holder.instance;
    }

}

public class SingleTon {

    public static void main(String[] args) {
        DataBase3 db1=DataBase3.getInstance();
        DataBase3 db2=DataBase3.getInstance();
        DataBase3 db3=DataBase3.getInstance();

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);
    }



}