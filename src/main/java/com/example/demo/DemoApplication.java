package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class DemoApplication {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
