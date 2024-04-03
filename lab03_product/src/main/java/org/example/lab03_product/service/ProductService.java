package org.example.lab03_product.service;

import org.example.lab03_product.model.Product;
import org.example.lab03_product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public void deleteProductById(String productId) {
    productRepository.deleteById(productId);
  }

  public void deleteAllProducts() {
    productRepository.deleteAll();
  }

  public Product saveProduct(Product product) {
    return productRepository.save(product);
  }

  public Product findProductById(String productId) {
    return productRepository.findProductById(productId);
  }

  public Iterable<Product> listProducts() {
    return productRepository.findAll();
  }
}
