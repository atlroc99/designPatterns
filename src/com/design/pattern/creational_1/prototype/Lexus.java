package com.design.pattern.creational_1.prototype;

public class Lexus extends CarBase {

    @Override
    public String toString() {
        return "\nLexus Name: " + this.getName() + " | Model: " + this.getModel() +  " | Price: $" + this.getPrice();
    }

    @Override
    protected CarBase clone() throws CloneNotSupportedException {
        return (Lexus) super.clone();
    }
}
