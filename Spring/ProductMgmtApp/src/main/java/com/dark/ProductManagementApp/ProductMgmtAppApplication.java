package com.dark.ProductManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductMgmtAppApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProductMgmtAppApplication.class, args);
    }
}
