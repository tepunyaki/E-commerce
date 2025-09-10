package ObserverPattern;
import DataModels.*;
/**
 * Concrete Observers : ระบบส่งอีเมล
 */

public class EmailService implements OrderObserver {

    @Override
    public void update(Order order) {
       System.out.println("Confirmation email sent to [customerEmaill]"+ order.customerEmail()+ "for oder :" + order.orderId());
    }
    
}
