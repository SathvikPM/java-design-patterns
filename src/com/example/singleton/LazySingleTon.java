package com.example.singleton;


public class LazySingleTon {

    public static void main(String[] args) {
       Database2 db1=Database2.getInstance();
       Database2 db2=Database2.getInstance();
       Database2 db3=Database2.getInstance();

       System.out.println(db1);
       System.out.println(db2);
       System.out.println(db3);

    }

}
class Database2{
    public static Database2 instance=null;
    private Database2(){


    }
    public static Database2 getInstance(){ //if the multiple threads are allowed it will create diffrent objects
        if(instance==null){
            instance=new Database2();
        }

        return instance;
    }

}
