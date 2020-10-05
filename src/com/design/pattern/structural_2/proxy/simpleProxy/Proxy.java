package com.design.pattern.structural_2.proxy.simpleProxy;

import java.util.Objects;

public class Proxy extends Subject {
    Subject subject;
    private  static Proxy proxy = null;

    private Proxy() {
        // private constructor to avoid extending this class / creating a instance of proxy object via new keyword
    }

    //Applying singleton Pattern to limit to return same proxy object via getInstance method call
    public static Proxy getInstance() {
        System.out.println("\nInside getInstance method in Proxy class...");
        if (proxy == null) {
            System.out.println("Instantiating a new Proxy instance...");
            proxy = new Proxy();
        } else {
            System.out.println("\nYou already have a proxy ...use that. Not creating a new one based on Singleton Pattern");
        }

        return proxy;
    }

    @Override
    void doSomeWork() {
        if (Objects.isNull(subject)) {
            // Not instantiating the object until the method is called.
            System.out.println("\nInstantiating a new concrete Subject object");
            subject = new ConcreteSubject();
        }

        subject.doSomeWork();
    }
}
