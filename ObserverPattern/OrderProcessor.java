package ObserverPattern;
import java.util.ArrayList;
import java.util.List;
import DataModels.*;

/*
 * Subject(Publisher) ที่คอยแจ้งข่าวสาร
 */
public class OrderProcessor {
    private final List<OrderObserver> observers = new ArrayList<>();

    public void register (OrderObserver observer){
        observers.add(observer);

    }

    public void unregister (OrderObserver observer){
        observers.remove(observer);

    }

    private void notifyObservers (Order order){
     for (OrderObserver observer : observers){
        observer.update(order);
     }
    }

    public void processOder(Order order){
        System.out.println("\n Processing order "+ order.orderId()+"...");

        // ตรรกะการประมวลผลคำสั่งซื้ออื่นๆ
        System.out.println("Order proccessfully.");

        //แจ้งเตือนผู้ติดตามทั้งหมด
        notifyObservers(order);
    }
 }
