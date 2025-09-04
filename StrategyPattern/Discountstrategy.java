package StrategyPattern;
import DataModels.*;

/**
 * Interface สำหรับกลยุทธ์ส่วนลด
 */

public interface Discountstrategy {
double applyDiscount(Order order );
    
} 