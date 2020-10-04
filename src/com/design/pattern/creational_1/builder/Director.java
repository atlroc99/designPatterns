package com.design.pattern.creational_1.builder;

public class Director {
    Builder builder;
    private int numberOfWheels;

    public Director(Builder builder) {
        this.builder = builder;
        builder.startUpOperation();
        builder.addBody();

        if (builder instanceof Car) {
            this.numberOfWheels = 4;
        }

        builder.addWheels(numberOfWheels);
        builder.addHeadLights();
        builder.addColor();
    }
}
