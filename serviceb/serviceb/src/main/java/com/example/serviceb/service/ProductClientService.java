package com.example.serviceb.service;

import com.example.serviceb.dto.Product;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductClientService {

    private final RestTemplate restTemplate;

    public ProductClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public List<Product> getProducts() {
        String url = "http://192.168.3.63:8048/serviceA/products";

        ResponseEntity<List<Product>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>() {}
        );

        return response.getBody();
    }
}
