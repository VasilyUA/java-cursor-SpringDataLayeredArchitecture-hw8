package com.example.javacursorspringdatalayeredarchitecturehw8.entitys;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String street;
    private String name;
    private int numberOfEmployees;
    private boolean hasWebsite;
}