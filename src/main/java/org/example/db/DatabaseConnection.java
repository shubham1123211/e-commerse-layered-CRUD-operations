package org.example.db;

import org.example.exceptions.ItemNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DatabaseConnection {
    private final Map<String, Map<String, Object>> productDB;

    public DatabaseConnection(Map<String, Map<String, Object>> productDB) {
        this.productDB = new HashMap<>();
    }
    public void saveItem(String productID, Map<String, Object> details) {
        productDB.put(productID, details);
    }

    public Map<String, Object>  showItem(String Id) {
        if(productDB.containsKey(Id)) {
            return productDB.get(Id);
        }
        throw new ItemNotFoundException();
    }

    public Map<String, Map<String, Object>> showAllItems() {
        if(!productDB.isEmpty()) return productDB;
        throw new ItemNotFoundException();
    }
}
