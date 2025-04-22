package com.headfirst.implementation.condiments;
import com.headfirst.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.price = .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return this.price + beverage.cost();
    }
    
}
