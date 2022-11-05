package ua.edu.ucu.apps.demo.payment;

import ua.edu.ucu.apps.demo.order.Order;

public interface Payment {
    boolean pay(Order order);
}
