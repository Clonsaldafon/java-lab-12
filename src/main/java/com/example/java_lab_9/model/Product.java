package com.example.java_lab_9.model;

import java.util.UUID;

public class Product {

    private final UUID id;
    private String name;
    private boolean isBought = false;

    public Product(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought() {
        this.isBought = true;
    }
}
