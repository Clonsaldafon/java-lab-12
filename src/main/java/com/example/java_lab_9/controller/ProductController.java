package com.example.java_lab_9.controller;

import com.example.java_lab_9.dto.AddProductDTO;
import com.example.java_lab_9.model.Product;
import com.example.java_lab_9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ArrayList<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/products")
    public HttpStatus addProduct(@RequestBody AddProductDTO addProductDTO) {
        productService.addProduct(addProductDTO.name);

        return HttpStatus.OK;
    }

    @DeleteMapping("/products/{id}")
    public HttpStatus deleteProduct(@PathVariable String id) {
        productService.deleteProduct(UUID.fromString(id));

        return HttpStatus.OK;
    }

    @PutMapping("products/{id}")
    public HttpStatus buyProduct(@PathVariable String id) {
        productService.buyProduct(UUID.fromString(id));

        return HttpStatus.OK;
    }
}
