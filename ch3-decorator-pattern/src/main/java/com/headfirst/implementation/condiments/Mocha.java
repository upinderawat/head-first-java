package com.headfirst.implementation.condiments;

import com.headfirst.Beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.price = .20;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        return this.price + beverage.cost();
    }
}
