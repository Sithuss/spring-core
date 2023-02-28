package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component @Priority(3)
public class SpringBean1 implements MyInterface {
    public SpringBean1() {
        System.out.println("Spring Bean 1");
    }

}
