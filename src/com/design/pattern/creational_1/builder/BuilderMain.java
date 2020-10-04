package com.design.pattern.creational_1.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Builder ford = new Car();
        Director director = new Director(ford);
        Product product = ford.getVehicle();
        product.showProduct(product);

    }

}
