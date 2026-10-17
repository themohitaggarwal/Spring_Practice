package com.example.abhayy.Payment;

public class CardPayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Paid via Card");
    }
}
