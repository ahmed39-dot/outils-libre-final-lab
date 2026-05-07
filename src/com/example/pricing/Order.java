package com.example.pricing;

public class Order {
    double[] prices;
    int[] qty;

    public Order(double[] prices, int[] qty) {
        this.prices = prices;
        this.qty = qty;
    }
}