package com.example.pricing;

public class Order {
    private double[] prices;
    private int[] quantities;

    public Order(double[] prices, int[] quantities) {
        this.prices = prices;
        this.quantities = quantities;
    }

    public double getSubtotal() {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i] * quantities[i];
        }
        return total;
    }
}
