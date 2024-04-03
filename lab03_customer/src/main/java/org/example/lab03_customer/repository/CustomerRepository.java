package org.example.lab03_customer.repository;

import org.example.lab03_customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
  Customer findCustomerById(String userId);
}
