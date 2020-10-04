package com.design.pattern.creational_1.builder;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        if (parts == null ) {
            parts = new LinkedList<>();
        }
    }

    public void addParts(String partName) {
        parts.addLast(partName);
    }

    private LinkedList<String> getParts() {
        return this.parts;
    }

    public void showProduct(Product product) {
        System.out.println("showing product...");
        product.getParts().forEach(System.out::println);
    }
}
