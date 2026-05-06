package com.example.pricing;

public class TaxService {

    private static final double TAX_RATE = 0.19;

    public double apply(double amount) {
        return amount + (amount * TAX_RATE);
    }
}
