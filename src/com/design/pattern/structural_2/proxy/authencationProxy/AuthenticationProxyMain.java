package com.design.pattern.structural_2.proxy.authencationProxy;

public class AuthenticationProxyMain {
    public static void main(String[] args) {
        Proxy proxy = Proxy.getInstance();
        proxy.doSomeWork("amit");
        proxy.doSomeWork("jon");
        proxy.doSomeWork("ron");
        proxy.doSomeWork("Kevin");
        proxy.doSomeWork("David");
    }
}
