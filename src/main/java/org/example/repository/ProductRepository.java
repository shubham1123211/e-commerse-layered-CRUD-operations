package org.example.repository;

import org.example.db.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ProductRepository {
    DatabaseConnection dbConnection;

    public ProductRepository(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addItem(String id, Map<String , Object> detials) {
        dbConnection.saveItem(id, detials);
    }

    public Map<String, Object> getItem(String id) {
        return dbConnection.showItem(id);
    }

    public Map<String, Map<String, Object>> getAllItems() {
        return dbConnection.showAllItems();
    }
}
