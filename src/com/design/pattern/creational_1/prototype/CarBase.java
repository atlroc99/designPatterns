package com.design.pattern.creational_1.prototype;

import java.util.Objects;

public abstract class CarBase implements Cloneable {
    private String name;
    private String model;
    private int price;

    public CarBase() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBase carBase = (CarBase) o;
        return price == carBase.price &&
                Objects.equals(name, carBase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    protected CarBase clone() throws CloneNotSupportedException {
        return (CarBase) super.clone();
    }
}
