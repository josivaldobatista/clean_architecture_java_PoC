package com.jfb.cleanarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CleanarchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanarchitectureApplication.class, args);
    }

}
