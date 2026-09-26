package com.gleb.analytics.model;

import java.time.LocalDate;

public record OrderRecord(String orderID,
                          String customerID,
                          double rawAmount,
                          OrderStatus status,
                          LocalDate orderDate) {
    public OrderRecord {
        if (rawAmount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
