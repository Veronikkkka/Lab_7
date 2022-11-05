package ua.edu.ucu.apps.demo.payment;

import ua.edu.ucu.apps.demo.order.Order;

public class CreditCardPayment implements Payment {
    @Override
    public boolean pay(Order order) {
        return false;
    }
}
