package org.example.controller;

import org.example.service.ProductService;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void addItem(String id, Map<String , Object> detail) {
        productService.addItem(id, detail);
    }

    public Map<String, Object> getItem(String id) {
        return productService.getItem(id);
    }

    public Map<String, Map<String, Object>> getAllItems() {
        return productService.getAllItems();
    }
}
