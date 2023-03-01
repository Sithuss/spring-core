package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("${app.invoice}")
    private int invoice;
    @Value("${app.name}")
    private String name;
    @Value("${app.vm.name}")
    private String vm;

    @Value("${os.name}")
    private String javaHome;

    public void print() {
        System.out.println("Invoice: " + invoice);
        System.out.println("Name: " + name);
        System.out.println("Vm Properties: " + vm);
        System.out.println("Java home: " + javaHome);
    }
}
