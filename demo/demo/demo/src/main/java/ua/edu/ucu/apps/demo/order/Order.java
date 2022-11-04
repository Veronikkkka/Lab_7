package ua.edu.ucu.apps.demo.order;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.Item;
import ua.edu.ucu.apps.demo.payment.PayPalPayment;
import ua.edu.ucu.apps.demo.payment.Payment;

import java.util.ArrayList;

@Getter @Setter
public class Order {

    ArrayList<Item> items = new ArrayList<>();
    Payment paymentStrategy = new PayPalPayment();
    Delivery deliverStrategy = new PostDeliveryStrategy();
    public boolean paid = false;
    public boolean proccessed = false;
    public void processOrder(){
        if(paymentStrategy.pay(this)){
            deliverStrategy.deliver();
            proccessed = true;
        }


    }

    public void add(Item item) {
        items.add(item);
    }

    public Item getItem(int i) {
        return items.get(i);
    }

    public void setDelivery(Delivery delivery1) {
        this.deliverStrategy = delivery1;
    }

//    public Payment getPaymentStrategy(PayPalPayment payment1, void paymentStrategy) {
//    }
}
