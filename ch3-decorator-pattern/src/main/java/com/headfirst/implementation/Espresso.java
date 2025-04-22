package com.headfirst.implementation;
import com.headfirst.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
    public String getDescription() {
        return description;
    }
}
