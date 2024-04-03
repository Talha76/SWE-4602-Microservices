package org.example.lab03.service;

import org.example.lab03.model.Employee;
import org.example.lab03.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;
  public Employee saveEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }
  public Employee findEmployeeById(String userId) {
    return employeeRepository.findEmployeeById(userId);
  }
}