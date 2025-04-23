package com.headfirst;

public abstract class Beverage {
    public String description = "Unknown Beverage";
    public enum Size {
        TALL,
        GRANDE,
        VENTI
    }
    public Size size;
    public double price = 0.0;

    public String getDescription() {
        return description;
    }
    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return this.size;
    }

    public abstract double cost();
}