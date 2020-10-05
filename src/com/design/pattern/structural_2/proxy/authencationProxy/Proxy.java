package com.design.pattern.structural_2.proxy.authencationProxy;

import java.util.*;
import java.util.stream.Collectors;

public class Proxy extends Subject {
    private Subject subject;
    private static Proxy proxy;
    private static List<User> userList;

    static {
        if (userList == null) {
            userList = new ArrayList<>();
        }
        User amit = new User();
        amit.setMember(true);
        amit.setName("Amit");

        User jon = new User();
        jon.setMember(true);
        jon.setName("Jon");

        User david = new User();
        david.setName("David");
        david.setMember(true);

        User ron = new User();
        ron.setName("Ron");
        ron.setMember(false);

        User kevin = new User();
        kevin.setName("Kevin");
        kevin.setMember(false);

        userList.addAll(Arrays.asList(david, amit, jon));
    }

    private Proxy(){
    }

    public static Proxy getInstance() {
        if (Objects.isNull(proxy)) {
            proxy = new Proxy();
        } else {
            System.out.println("You already have a proxy instance.");
        }
        return proxy;
    }

    @Override
    void doSomeWork(String username) {
        if (Objects.isNull(subject)) {
            subject = ConcreteSubject.getInstance();
        }

        Optional<User> userOpt = userList.stream().filter(user -> user.getName().equalsIgnoreCase(username)).findFirst();
        boolean isUser = userOpt.isPresent();

        System.out.println("\nIs user : " + username+ " a user: " + isUser);

        if (isUser && userOpt.get().isMember()) {
            subject.doSomeWork(userOpt.get().getName());
        } else {
            System.out.println("User: " + username + " is NOT AUTHORIZED to work!!!");
        }
    }
}
