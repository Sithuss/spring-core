package com.demo.cglib;

import com.demo.jdk.Greeting;

public class Main {
    public static void main(String[] args) {
        MyGreeting greetingProxy = new GreetingProxy();
        System.out.println(greetingProxy.greet("harry"));
    }
}
