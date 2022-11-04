package ua.edu.ucu.apps.demo.delivery;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void deliver() {
        System.out.println("Delivery by DHL");
    }
}
