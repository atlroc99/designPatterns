package com.design.pattern.creational_1.singleton;

import java.util.Objects;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Get captain...");
        Captain c = Captain.getCaptain();

        System.out.println("Is captain null: " + Objects.isNull(c));

        if (Objects.nonNull(c)) {
            c.setCaptainName("Captain planet");
        }
        if (Objects.nonNull(c)) {
            printCaptainName(c);
        }

        System.out.println("\nSecond Captain...c2");
        Captain c2 = Captain.getCaptain();
        if (Objects.nonNull(c2)){
            printCaptainName(c2);
        }

        System.out.println("\nThird Captain...c3");
        Captain c3 = getCaptain();
        if (Objects.nonNull(c3)) {
            printCaptainName(c3);
        }
    }

    private static void printCaptainName(Captain c) {
        System.out.println("Your captain is: " + c.getCaptainName());
    }

    private static Captain getCaptain() {
        Captain c3 = Captain.getCaptain();
        return c3;
    }

}
