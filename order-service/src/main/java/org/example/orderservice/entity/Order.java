package org.example.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Setter
@Document(collection = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

  @Id
  private String id;

  @Field
  private LocalDateTime date = LocalDateTime.now();

  @Field
  private String customerId;
  @Field
  private String productId;
  @Field
  private String employeeId;
}