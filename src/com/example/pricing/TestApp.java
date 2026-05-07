package com.example.pricing;

public class TestApp {
    public static void main(String[] args) {

        PricingEngine engine = new PricingEngine(new Save10());

        Order order = new Order(
            new double[]{100},
            new int[]{1}
        );

        double result = engine.calculate(order);

        if (result > 100) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
}