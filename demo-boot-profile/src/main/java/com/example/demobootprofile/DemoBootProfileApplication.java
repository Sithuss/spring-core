package com.example.demobootprofile;

import com.example.demobootprofile.beans.SpringBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DemoBootProfileApplication {

    @Autowired
    private SpringBean1 springBean1;

    public static void main(String[] args) {
        SpringApplication.run(DemoBootProfileApplication.class, args);
    }

    @Bean @Profile("dev")
    public ApplicationRunner runner() {
        return r -> {
            springBean1.print();
        };
    }
}
