package org.example.orderservice.service;

import org.example.orderservice.valueObject.ResponseValueObject;
import org.example.orderservice.valueObject.Customer;
import org.example.orderservice.valueObject.Employee;
import org.example.orderservice.entity.Order;
import org.example.orderservice.valueObject.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.example.orderservice.repository.OrderRepository;

@Service
public class OrderService {
  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private RestTemplate restTemplate;

  public Order saveOrder(Order order){ return orderRepository.save(order);}

  public Order findOrderById(String Id){return orderRepository.findOrderById(Id);}


  public ResponseValueObject getUserWithDepartment(String orderId) {
    try {
      ResponseValueObject ResponseValueObject = new ResponseValueObject();
      Order order = orderRepository.findOrderById(orderId);
      Product product = restTemplate.getForObject("http://localhost:9005/products/" + order.getProductId(), Product.class);
      Customer customer = restTemplate.getForObject("http://localhost:9004/customers/" + order.getCustomerId(), Customer.class);
      Employee employee = restTemplate.getForObject("http://localhost:9002/employees/" + order.getEmployeeId(), Employee.class);

      ResponseValueObject.setCustomer(customer);
      ResponseValueObject.setProduct(product);
      ResponseValueObject.setEmployee(employee);
      ResponseValueObject.setOrder(order);
      return ResponseValueObject;
    }catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      return null;
    }
  }
}