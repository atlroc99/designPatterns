package com.design.pattern.creational_1.builder;

public class Car implements Builder {
    private Product product;

    public Car() {
        product = new Product();
    }

    @Override
    public void startUpOperation() {
        System.out.println("1. >>>> START CAR BUILDING OPERATIONS >>>>");
    }

    @Override
    public void addBody() {
        System.out.println("CAR: Adding body >>>>");
    }

    @Override
    public void addWheels(int numberOfWheels) {
        System.out.println("CAR: Adding number of "+ numberOfWheels + " wheels");
        product.addParts("Number of whees: " + numberOfWheels);
    }

    @Override
    public void addHeadLights() {
        System.out.println("CAR: Adding Head lights to the");
        product.addParts("HeadLights added");
    }

    @Override
    public void addColor() {
        System.out.println("CAR: Adding color: " );
        product.addParts("Color added:" );
    }

    @Override
    public void endOperation() {
        System.out.println("CAR: END BUILDING CAR OPERATIONS <<<<<<< ");
    }

    @Override
    public Product getVehicle() {
        return this.product;
    }
}
