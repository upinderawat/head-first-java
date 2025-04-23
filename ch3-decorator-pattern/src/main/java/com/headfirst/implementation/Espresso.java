package com.headfirst.implementation;
import com.headfirst.Beverage;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        description = "Espresso";
        this.size = size;
    }

    public double cost() {
        switch (size) {
            case TALL:
                price = 1.99;
                break;
            case GRANDE:
                price = 2.49;
                break;
            case VENTI:
                price = 2.99;
                break;
        }
        return price;
    }
    public String getDescription() {
        return description;
    }
}
