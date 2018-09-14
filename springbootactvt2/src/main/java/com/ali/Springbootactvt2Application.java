package com.ali;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Springbootactvt2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootactvt2Application.class, args);
    }
}
