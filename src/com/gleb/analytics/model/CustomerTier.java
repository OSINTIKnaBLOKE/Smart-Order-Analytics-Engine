package com.gleb.analytics.model;

public enum CustomerTier {
    STANDARD(0.0),
    VIP(0.1),
    PREMIUM(0.2);

    private final double discountRate;

    CustomerTier(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
