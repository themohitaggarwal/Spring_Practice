package com.example.abhayy;


import com.example.abhayy.Payment.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
     PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}
