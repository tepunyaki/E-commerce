package StrategyPattern;
import DataModels.Order;

/**
 * กลยุทธ์ส่วนลดราคาจำนวนเงินคงที่
 */
public class FixedDiscount implements Discountstrategy {
    private final double amount ;

    public FixedDiscount(double amount){
     this.amount = amount ;
    }


    @Override
    public double applyDiscount(Order order) {
       return Math.max(0,order.getTotalPrice() - amount);
    }

}

   