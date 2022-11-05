import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.order.Order;
import ua.edu.ucu.apps.demo.payment.CreditCardPayment;
import ua.edu.ucu.apps.demo.payment.PayPalPayment;
import ua.edu.ucu.apps.demo.payment.Payment;

public class TestPayments {
    @Test
    public void testDelivery(){
        Order order1 = new Order();
        Flower flower = new Flower("red", 30, 200, 1l);
        order1.add(flower);
        Assertions.assertEquals(flower, order1.getItem(0));
        order1.processOrder();
        Assertions.assertEquals(true, order1.proccessed);
        PayPalPayment payment1 = new PayPalPayment();
        order1.setPaymentStrategy(payment1);
        Assertions.assertEquals(payment1, order1.getPaymentStrategy());
        CreditCardPayment payment2 = new CreditCardPayment();
        order1.setPaymentStrategy(payment2);
        Assertions.assertEquals(payment2, order1.getPaymentStrategy());

    }
}
