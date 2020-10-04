package com.design.pattern.creational_1.builder;

public interface Builder {
    void startUpOperation();
    void addBody();
    void addWheels(int numberOfWheels);
    void addHeadLights();
    void addColor();
    void endOperation();
    Product getVehicle();
}
