package com.example.javacursorspringdatalayeredarchitecturehw8.exeptions;

public class ShopNotFound extends RuntimeException{
    public ShopNotFound(String message) {
        super(message);
    }
}