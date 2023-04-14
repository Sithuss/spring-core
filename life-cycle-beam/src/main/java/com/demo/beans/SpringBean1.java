package com.demo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean1 implements InitializingBean, DisposableBean {
    private SpringBean2 springBean2;

    public SpringBean1() {
        System.out.println(this.getClass().getSimpleName() + " ::constructor");
    }

    @PostConstruct
    private void Init() {
        System.out.println(this.getClass().getSimpleName() + " ::Post construct.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(this.getClass().getSimpleName() + " ::PreDestroy");
    }


    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println("setting springBean1 to:: " + this.getClass().getSimpleName());
        this.springBean2 = springBean2;
    }

    public void customInit() {
        System.out.println(this.getClass().getSimpleName() + " ::custom init.");
    }

    public void customDestroy() {
        System.out.println(this.getClass().getSimpleName() + " ::custom destroy.");
    }

    public String sayGreeting() {
        return "Hello";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "::afterPropertiesSet.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean's destroy::");
    }

}
