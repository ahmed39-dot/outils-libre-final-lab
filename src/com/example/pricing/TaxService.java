package com.example.pricing;

public class TaxService {
    public double apply(double total) {
        return total + (total * 0.19);
    }
}