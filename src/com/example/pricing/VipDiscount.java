package com.example.pricing;

public class VipDiscount implements DiscountStrategy {
    public double apply(double total) {
        return total * 0.95;
    }
}