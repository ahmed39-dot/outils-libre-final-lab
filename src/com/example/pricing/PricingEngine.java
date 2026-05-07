package com.example.pricing;

public class PricingEngine {

    private DiscountStrategy discount;
    private TaxService tax = new TaxService();

    public PricingEngine(DiscountStrategy discount) {
        this.discount = discount;
    }

    public double calculate(Order order) {

        double total = 0;

        for (int i = 0; i < order.prices.length; i++) {
            total += order.prices[i] * order.qty[i];
        }

        total = discount.apply(total);
        total = tax.apply(total);

        return total;
    }
}