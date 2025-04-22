package com.headfirst.implementation;
import com.headfirst.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
        price = 1.99;
    }

    public double cost() {
        return price;
    }
    public String getDescription() {
        return description;
    }
}
