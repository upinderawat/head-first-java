package com.headfirst;
import com.headfirst.implementation.Espresso;
import com.headfirst.implementation.HouseBlend;
import com.headfirst.implementation.condiments.*;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.Size.TALL);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend(Beverage.Size.TALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
