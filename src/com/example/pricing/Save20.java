package com.example.pricing;

public class Save20 implements DiscountStrategy {
    public double apply(double total) {
        return total * 0.8;
    }
}