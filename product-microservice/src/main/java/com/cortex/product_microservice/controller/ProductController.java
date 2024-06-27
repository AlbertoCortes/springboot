package com.cortex.product_microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.cortex.product_microservice.entity.ProductEntity;
import com.cortex.product_microservice.repository.ProductRepository;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<ProductEntity> getAllProduct() {

    return productRepository.findAll();

  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void createProduct(@RequestBody ProductEntity productEntity) {
    productRepository.save(productEntity);
  }

}
