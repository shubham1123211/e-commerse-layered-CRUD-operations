package org.example;

import org.example.config.AppConfig;
import org.example.controller.ProductController;
import org.example.repository.ProductRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductController controller = context.getBean(ProductController.class);
        Map<String, Object> detail = new HashMap<>(Map.of("Product name", "Watch", "product price", 3400));
        controller.addItem("PD01", detail);
        System.out.println(controller.getItem("PD01"));
        System.out.println(controller.getAllItems());
    }
}
