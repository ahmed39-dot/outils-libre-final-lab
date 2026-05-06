package com.example.pricing;

public class PriceCalculator {

    public double calculate(double[] prices, int[] qty, String customerType, String discountCode) {

        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i] * qty[i];
        }

        if ("SAVE10".equals(discountCode)) {
            total -= total * 0.1;
        } else if ("SAVE20".equals(discountCode)) {
            total -= total * 0.2;
        }

        if ("VIP".equals(customerType)) {
            total -= total * 0.05;
        }

        total += total * 0.19;

        return total;
      }  }
