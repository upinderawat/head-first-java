package com.headfirst.implementation.condiments;

import com.headfirst.Beverage;

public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();

    public abstract double cost();
}
