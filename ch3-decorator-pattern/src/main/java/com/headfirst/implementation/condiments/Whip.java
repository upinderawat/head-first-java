package com.headfirst.implementation.condiments;
import com.headfirst.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        switch (this.size) {
            case TALL:
                price = 0.10;
                break;
            case GRANDE:
                price = 0.15;
                break;
            case VENTI:
                price = 0.20;
                break;
        }
        return this.price + beverage.cost();
    }
    
}
