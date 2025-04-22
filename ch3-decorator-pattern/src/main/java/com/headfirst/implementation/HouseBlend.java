package com.headfirst.implementation;
import com.headfirst.Beverage;

public class HouseBlend extends Beverage{
    String description = "House Blend Coffee";

    public HouseBlend() {
    }

    public double cost() {
        return .89;
    }

    public String getDescription() {
        return description;
    }
}
