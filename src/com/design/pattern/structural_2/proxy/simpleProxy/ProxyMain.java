package com.design.pattern.structural_2.proxy.simpleProxy;

public class ProxyMain {
    public static void main(String[] args) {
        Proxy proxy = Proxy.getInstance();
        proxy.doSomeWork();

        Proxy proxy2 = Proxy.getInstance();
        proxy2.doSomeWork();

        Proxy proxy3 = Proxy.getInstance();
        proxy3.doSomeWork();
    }
}
