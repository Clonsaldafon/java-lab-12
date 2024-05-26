package com.example.java_lab_9.service;

import com.example.java_lab_9.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ProductService {

    private ArrayList<Product> products = new ArrayList<>();

    public Product addProduct(String name) {
        Product product = new Product(UUID.randomUUID(), name);
        products.add(product);

        return product;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void deleteProduct(UUID id) {
        products.remove(getProductById(id));
    }

    public Product getProductById(UUID id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    public void buyProduct(UUID id) {
        getProductById(id).setBought();
    }
}
