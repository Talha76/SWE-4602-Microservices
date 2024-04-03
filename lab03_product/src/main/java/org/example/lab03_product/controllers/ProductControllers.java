package org.example.lab03_product.controllers;

import org.example.lab03_product.model.Product;
import org.example.lab03_product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductControllers {
  @Autowired
  private ProductService productService;

  @PostMapping("/")
  public Product saveProduct(@RequestBody Product product){
    return productService.saveProduct(product);
  }

  @GetMapping("/{id}")
  public Product findProductById(@PathVariable("id") String productId){
    return productService.findProductById(productId);
  }

  @GetMapping("/list")
  public Iterable<Product> listProducts(){
    return productService.listProducts();
  }
}
