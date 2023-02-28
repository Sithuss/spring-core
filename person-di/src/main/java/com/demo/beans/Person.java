package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component

public class Person {
    private String name = "Thaw thaw";

    private final Address address;

    public Person(Address address){
        this.address = address;
    }

    @PostConstruct
    public void init() {
        System.out.println("Post construct: address:: " + address.getClass().getSimpleName());
    }

    public String personInfo() {
        return name + "::" + address.getStreetName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
