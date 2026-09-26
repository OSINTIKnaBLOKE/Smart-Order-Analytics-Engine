package com.gleb.analytics.model;

public record CustomerProfile(String name,
                              String customerId,
                              String email,
                              CustomerTier tier) {}
