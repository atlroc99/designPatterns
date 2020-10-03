package com.design.pattern.creational_1.prototype;

public class Toyota extends CarBase {

    @Override
    public String toString() {
        return "\nToyota Name: " + this.getName() + " | Model: " + this.getModel() +  " | Price: $" + this.getPrice();
    }

    @Override
    protected CarBase clone() throws CloneNotSupportedException {
        return (Toyota) super.clone();
    }
}
