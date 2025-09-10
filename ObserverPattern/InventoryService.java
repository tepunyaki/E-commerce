package ObserverPattern;
import DataModels.*;
/**
 *  Concrete Observers : ระบบจัดการคลังสินค้า
 */

public class InventoryService implements OrderObserver {

    @Override
    public void update(Order order) {
       System.out.println("Inventory ubdate for order [orderId]"+ order.orderId());
    }
    
}
