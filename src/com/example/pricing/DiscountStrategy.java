package com.example.pricing;

public interface DiscountStrategy {
    double apply(double total);
}