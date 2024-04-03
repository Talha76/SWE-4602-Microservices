package org.example.lab03_customer.controllers;

import org.example.lab03_customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.lab03_customer.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerControllers {
  @Autowired
  private CustomerService customerService;

  @PostMapping("/")
  public Customer saveCustomer(@RequestBody Customer customer){
    return customerService.saveCustomer(customer);
  }

  @GetMapping("/{id}")
  public Customer findCustomerById(@PathVariable("id") String customerId){
    return customerService.findCustomerById(customerId);
  }
}
