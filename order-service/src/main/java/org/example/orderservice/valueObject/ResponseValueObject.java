package org.example.orderservice.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.orderservice.entity.Order;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseValueObject{
  private Customer customer;
  private Product product;
  private Employee employee;
  private Order order;
}