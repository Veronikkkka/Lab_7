package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;
import ua.edu.ucu.apps.demo.order.Order;

@Getter
public class PayPalPayment implements Payment{
    private final String name;
    private final String description;
    public PayPalPayment(){
        name = "PayPal";
        description = "PayPal payment";
    }

    @Override
    public boolean pay(Order order) {
        order.paid = true;
        System.out.println("Paid with paypal");
        return true;
    }
}
