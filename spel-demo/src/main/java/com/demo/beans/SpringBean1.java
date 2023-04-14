package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class SpringBean1 {

    @Value("${app.name}")
    private String name;

    @Value("#{${invoice.amount} * 0.2}")
    private Double invoiceDiscount;

    @Value("#{'Creek Bridge Road' .toUpperCase()}")
    private String streetName;

    @Value("#{bean2.hobby}")
    private String hobbyName;

    @Value("${app.fruits}")
    private List<String> fruits;

    @Value("#{${app.map}}")
    private Map<String, Integer> map;

    public String getStreetName() {
        return streetName;
    }

    public void print() {
        fruits.stream().map(a -> a.toString()).forEach(System.out::println);
        System.out.println("map: " + map);
        System.out.println("Name:" + name);
        System.out.println("Discount: " +invoiceDiscount);
        System.out.println("Street name: " + streetName);
        System.out.println("Hobby name: " + hobbyName);
    }
}
