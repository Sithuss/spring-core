package com.example.demobootprofile.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

    @Value("${app.name}")
    private String name;

    public void print() {
        System.out.println("Name: " + name);
    }
}
