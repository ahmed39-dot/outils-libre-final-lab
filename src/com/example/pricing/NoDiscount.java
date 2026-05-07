package com.example.pricing;

public class NoDiscount implements DiscountStrategy {
    public double apply(double total) {
        return total;
    }
}