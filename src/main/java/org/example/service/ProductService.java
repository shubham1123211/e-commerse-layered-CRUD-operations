package org.example.service;

import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductService {
    ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }


    public void addItem(String id, Map<String, Object> detail) {
        repository.addItem(id, detail);
    }

    public Map<String, Object> getItem(String id) {
        return repository.getItem(id);
    }

    public Map<String, Map<String, Object>> getAllItems() {
        return repository.getAllItems();
    }
}
