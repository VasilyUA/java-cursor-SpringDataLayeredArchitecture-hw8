package com.example.javacursorspringdatalayeredarchitecturehw8.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Healthy {
    @GetMapping
    public String healthy() {
        return "Hello world!";
    }
}
