package org.example.lab03_product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab03ProductApplication {

  public static void main(String[] args) {
    SpringApplication.run(Lab03ProductApplication.class, args);
  }

}
