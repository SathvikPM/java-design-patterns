package com.example.proxy;



public interface Bank {

    void withdraw(int amount);

}

class RealBank implements Bank{

    @Override
    public void withdraw(int amount) {
        System.out.println(amount +"withdrawn sucessfully");
    }
}

class ATMProxy implements Bank{

    private RealBank realBank=new RealBank();

    @Override
    public void withdraw(int amount) {
        System.out.println("Checking ATM card");
        System.out.println("verifying PIN...");
        System.out.println("Checking balance");
        realBank.withdraw(amount);
        System.out.println("printing recipt");
    }
}

class Customer{

    public static void main(String[] args) {

        new ATMProxy().withdraw(2000);


    }
}
