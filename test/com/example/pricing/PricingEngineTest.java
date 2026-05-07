package com.example.pricing;

public class PricingEngineTest {

    public static void main(String[] args) {

        testNoDiscount();
        testSave10();
        testVip();

    }

    static void testNoDiscount() {
        PricingEngine engine = new PricingEngine(new NoDiscount());

        Order order = new Order(
                new double[]{100},
                new int[]{1}
        );

        double result = engine.calculate(order);

        assert result > 100 : "NoDiscount failed";
        System.out.println("✔ testNoDiscount passed");
    }

    static void testSave10() {
        PricingEngine engine = new PricingEngine(new Save10());

        Order order = new Order(
                new double[]{100},
                new int[]{1}
        );

        double result = engine.calculate(order);

        assert result < 120 : "Save10 failed";
        System.out.println("✔ testSave10 passed");
    }

    static void testVip() {
        PricingEngine engine = new PricingEngine(new VipDiscount());

        Order order = new Order(
                new double[]{200},
                new int[]{1}
        );

        double result = engine.calculate(order);

        assert result > 0 : "VIP failed";
        System.out.println("✔ testVip passed");
    }
}