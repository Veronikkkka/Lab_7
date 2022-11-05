package ua.edu.ucu.apps.demo.delivery;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public void deliver() {
        System.out.println("You chose delivery by post");
    }
}
