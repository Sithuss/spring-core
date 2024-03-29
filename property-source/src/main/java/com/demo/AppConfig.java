package com.demo;

import com.ocpsoft.pretty.time.PrettyTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:/application.properties")
@Configuration
@ComponentScan
public class AppConfig {

    @Bean(value = {"p1", "p2", "p3"})
    public PrettyTime prettyTime() {
        return new PrettyTime();
    }
}
