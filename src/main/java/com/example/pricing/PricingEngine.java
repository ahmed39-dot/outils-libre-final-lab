package com.example.pricing;

public class PricingEngine {

    private DiscountService discountService;
    private TaxService taxService;

    public PricingEngine() {
        discountService = new DiscountService();
        taxService = new TaxService();
    }

    public double calculate(Order order, String customerType, String discountCode) {

        double total = order.getSubtotal();

        total = discountService.apply(total, discountCode);

        if ("VIP".equals(customerType)) {
            total *= 0.95;
        }

        total = taxService.apply(total);

        return total;
    }
}
