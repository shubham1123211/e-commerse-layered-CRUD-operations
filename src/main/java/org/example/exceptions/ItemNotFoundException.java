package org.example.exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException() {
        super("Item is not available");
    }
}
