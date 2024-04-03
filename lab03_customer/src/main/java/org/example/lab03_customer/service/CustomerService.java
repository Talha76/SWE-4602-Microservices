package org.example.lab03_customer.service;

import org.example.lab03_customer.model.Customer;
import org.example.lab03_customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  @Autowired
  private CustomerRepository customerRepository;
  public Customer saveCustomer(Customer customer) {
    return customerRepository.save(customer);
  }
  public Customer findCustomerById(String userId) {
    return customerRepository.findCustomerById(userId);
  }
}
