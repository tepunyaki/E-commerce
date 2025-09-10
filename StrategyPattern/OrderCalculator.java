package StrategyPattern;
import DataModels.*;

public class OrderCalculator {
    public double calculateFinalPrice(Order order , Discountstrategy strategy ){
        return strategy.applyDiscount(order);
    }
    
}