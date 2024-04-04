package org.example.orderservice.controller;

import org.example.orderservice.valueObject.ResponseValueObject;
import org.example.orderservice.entity.Order;
import org.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController{
  @Autowired
  private OrderService orderService;

  @GetMapping("/")
  public String getEmployee(){
    return "Hello";
  }
  @GetMapping("/{id}")
  public ResponseValueObject findOrderById(@PathVariable String id){
    System.out.println("In Response Value Object");
    return orderService.getUserWithDepartment(id);
  }

  @PostMapping("/")
  public Order saveCustomer(@RequestBody Order order){
    return orderService.saveOrder(order);
  }
}