package com.design.pattern.structural_2.proxy.simpleProxy;

public class ConcreteSubject extends Subject{
    @Override
    void doSomeWork() {
        System.out.println(">>> Inside doSomeWork() in ConcreteSubject remote class <<<");
    }
}
