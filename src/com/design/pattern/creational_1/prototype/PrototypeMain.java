package com.design.pattern.creational_1.prototype;

import java.util.Objects;

public class PrototypeMain {
    public static void main(String[] args) throws Exception {

        CarBase lexus = new Lexus();
        lexus.setName("Lexus");
        lexus.setModel("ES 350");
        lexus.setPrice(45000);
        System.out.println(lexus);

        CarBase toyota = new Toyota();
        toyota.setName("Toyota");
        toyota.setModel("Corolla 2021");
        toyota.setPrice(31000);
        System.out.println(toyota);
        System.out.println("\nLexus and Toyota are equal: " + lexus.equals(toyota));

        CarBase modifiedLexus;
        modifiedLexus = lexus.clone();
        modifiedLexus.setModel("GS 350");
        modifiedLexus.setPrice(68000);

        System.out.println(modifiedLexus);
        System.out.println("\nLexus and modifiedLexus are equal: " + lexus.equals(modifiedLexus));

        CarBase rc;
        rc = lexus.clone();
        System.out.println("RC HashCode: " + rc.hashCode());
        System.out.println("Modified lexus HashCode: " + modifiedLexus.hashCode());
        rc.setModel("RC 760");
        rc.setPrice(90000);

        System.out.println("\nrc and lexus are equal: " + rc.equals(lexus));
        System.out.println("rc and modifiedLexus are equal: " + rc.equals(modifiedLexus));
        System.out.println("rc instance of Lexus: " + (rc instanceof Lexus));
        System.out.println("rc instance of Carbase: " + (rc instanceof CarBase));
        System.out.println("RC HashCode: " + rc.hashCode());
        System.out.println("Modifiedlexus HashCode: " + modifiedLexus.hashCode());
    }


}
