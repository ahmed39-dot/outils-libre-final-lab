package com.example.pricing;

public class DiscountService {

    public double apply(double amount, String code) {
        if ("SAVE10".equals(code)) return amount * 0.9;
        if ("SAVE20".equals(code)) return amount * 0.8;
        return amount;
    }
}
