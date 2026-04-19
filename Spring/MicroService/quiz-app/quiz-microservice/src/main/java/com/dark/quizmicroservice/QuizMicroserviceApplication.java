package com.dark.quizmicroservice;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class QuizMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizMicroserviceApplication.class, args);
    }

}
