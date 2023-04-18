package com.example.employeeWork.service;

import com.example.employeeWork.entity.Employee;

import java.util.List;


public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    List<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long employeeId);
}
