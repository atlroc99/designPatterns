package com.design.pattern.creational_1.singleton;

public final class Captain {
    private static Captain captain = null;
    private String captainName;

    private Captain() {
        System.out.println("*** *** *** INSIDE THE CAPTAIN CONSTRUCTOR...*** *** ***");
    }

    public static Captain getCaptain() {

        if (captain == null) {
            System.out.println("Captain is null...");
            captain = new Captain();
            return captain;
        } else {
            System.out.println("\nWARNING!!! You already have a captain...\n");
        }

        return captain;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }
}
