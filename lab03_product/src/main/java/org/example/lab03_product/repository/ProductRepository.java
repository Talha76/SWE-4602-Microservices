package org.example.lab03_product.repository;

import org.example.lab03_product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
  Product findProductById(String productId);
}
