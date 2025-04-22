package com.headfirst;

public abstract class Beverage {
    public String description = "Unknown Beverage";
    public String size = "Unknown Size";
    public double price = 0.0;

    public String getDescription() {
        return description;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }

    public abstract double cost();
}