package ObserverPattern;
import DataModels.*;
/**
 * 
 * Interfacce (observer) สำหรับผู้สังเกตการณ์
 */
public interface OrderObserver {
    public void update (Order order);
} 
