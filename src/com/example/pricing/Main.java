package com.example.pricing;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(
            new double[]{100, 50},
            new int[]{1, 2}
        );

        PricingEngine engine = new PricingEngine(new Save10());

        System.out.println("Final Price = " + engine.calculate(order));
    }
}