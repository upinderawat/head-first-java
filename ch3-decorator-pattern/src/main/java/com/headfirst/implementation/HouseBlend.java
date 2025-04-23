package com.headfirst.implementation;
import com.headfirst.Beverage;

public class HouseBlend extends Beverage{

    public HouseBlend(Beverage.Size size) {
        description = "House Blend Coffee";
        this.size = size;
    }

    public double cost() {
        switch (size) {
            case TALL:
                price = 0.89;
                break;
            case GRANDE:
                price = 0.99;
                break;
            case VENTI:
                price = 1.09;
                break;
        }
        return price;
    }

    public String getDescription() {
        return description;
    }
}
