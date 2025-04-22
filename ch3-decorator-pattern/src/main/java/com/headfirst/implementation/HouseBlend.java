package com.headfirst.implementation;
import com.headfirst.Beverage;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
        price = .89;
    }

    public double cost() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
