package com.design.pattern.structural_2.proxy;

public class ConcreteSubject extends Subject{
    @Override
    void doSomeWork() {
        System.out.println(">>> Inside doSomeWork() in ConcreteSubject remote class <<<");
    }
}
