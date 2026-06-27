package com.example.strategy;

public interface PaymentStrategy {

    void pay();
}
class UPIPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("paid through UPI");
    }
}

class CardPayment implements PaymentStrategy{


    @Override
    public void pay() {
        System.out.println("paid through card");
    }
}

class PaymentService{

    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void makePayment(){
        strategy.pay();
    }
}
class Main{

    public static void main(String[] args) {

        PaymentService service=new PaymentService(new UPIPayment());
        service.makePayment();
    }
}