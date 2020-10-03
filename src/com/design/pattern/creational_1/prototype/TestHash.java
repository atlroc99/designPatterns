package com.design.pattern.creational_1.prototype;

public class TestHash {
    public static void main(String[] args) throws Exception{
        CarBase l1 = new Lexus();
        l1.setName("Lexus");
        l1.setModel("GS 450");
        l1.setPrice(80000);

        CarBase l2 = new Lexus();
        l2.setName("Lexus");
        l1.setModel("GS 450");
        l1.setPrice(80000);

        System.out.println(l1.hashCode() + ": l1");
        System.out.println(l2.hashCode() + ": l2");

        CarBase l3 = l1.clone();
        System.out.println(l3.hashCode() + ": l3");
        System.out.println("l1 and l3 are equal: " + l1.equals(l3));

        System.out.println("Equal hash l1 & l2: " + (l1.hashCode() == l2.hashCode()));
        System.out.println("Equal hash l1 & l3: " + (l1.hashCode() == l3.hashCode()));
    }
}
