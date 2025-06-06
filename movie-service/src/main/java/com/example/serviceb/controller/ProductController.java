package com.example.serviceb.controller;

import com.example.serviceb.dto.Product;
import com.example.serviceb.service.ProductClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/local-products")
public class ProductController {

    private final ProductClientService productClientService;

    public ProductController(ProductClientService productClientService) {
        this.productClientService = productClientService;
    }

    @GetMapping
    public List<Product> getProductsFromExternal() {
        return productClientService.getProducts();
    }
}
