package com.example.pricing;

public class Save10 implements DiscountStrategy {
    public double apply(double total) {
        return total * 0.9;
    }
}
