package com.example.templete;

abstract class FoodOrder {
    public  void placeOrder(){
        selectFood();
        makePayment();
        prepareFood();
        deliver();
    }

    abstract void selectFood();

    abstract void makePayment();

     void prepareFood(){
         System.out.print("preparing food");
     }

    void deliver(){
        System.out.print("food Delvered");
    }


}

class UPIOrder extends FoodOrder{

    @Override
    void selectFood() {
        System.out.println("chains food selected");
    }

    @Override
    void makePayment() {
        System.out.println("payment through ATM");
    }
}

public  class MakeOrder{
    public static void main(String[] args) {
        UPIOrder order=new UPIOrder();

        order.placeOrder();
    }


}