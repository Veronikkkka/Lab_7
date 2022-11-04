package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;
import lombok.Setter;

@Getter
public class PayPalPayment implements Payment{
    private final String name;
    private final String description;
    public PayPalPayment(){
        name = "PayPal";
        description = "PayPal payment";
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid with paypal");
    }
}
