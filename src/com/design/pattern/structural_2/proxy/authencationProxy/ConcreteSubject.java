package com.design.pattern.structural_2.proxy.authencationProxy;

import java.util.Objects;

public class ConcreteSubject extends Subject {

    private static ConcreteSubject concreteSubject;

    private ConcreteSubject() {
    }

    public static Subject getInstance() {
        if (Objects.isNull(concreteSubject)) {
            concreteSubject = new ConcreteSubject();
        } else {
            System.out.println("\n>>>>You already have an instance of Concreate subject class");
        }
        return concreteSubject;
    }

    @Override
    void doSomeWork(String username) {
        System.out.println(">>>>> INSIDE CONCRETE SUBJECT <<<<<<" + " doing work: " + username);
    }
}
