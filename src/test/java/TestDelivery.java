import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.order.Order;
import org.junit.jupiter.api.Test;

public class TestDelivery {
    @Test
    public void testDelivery(){
        Order order1 = new Order();
        Flower flower = new Flower("red", 30, 200, 1l);
        order1.add(flower);
        Assertions.assertEquals(flower, order1.getItem(0));
        order1.processOrder();
        Assertions.assertEquals(true, order1.proccessed);
        PostDeliveryStrategy delivery1 = new PostDeliveryStrategy();
        order1.setDelivery(delivery1);
        Assertions.assertEquals(delivery1, order1.getDeliverStrategy());
        Delivery delivery2 = new DHLDeliveryStrategy();
        Order order2 = new Order();
        order2.setDelivery(delivery2);
        Assertions.assertEquals(false, order2.proccessed);
        order2.processOrder();
        Assertions.assertEquals(true, order2.proccessed);
        Assertions.assertEquals(delivery2, order2.getDeliverStrategy());
    }
}
