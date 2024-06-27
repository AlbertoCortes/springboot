package com.cortex.product_microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cortex.product_microservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
