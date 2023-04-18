package com.example.employeeWork.controller;

import com.example.employeeWork.entity.Employee;
import com.example.employeeWork.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    // building create Employee REST API
    @PostMapping
    public ResponseEntity<Employee> createEmployee( Employee employee){
        Employee savedEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    // building get All Employee REST API
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees = employeeService.getAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    // Building Update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long employeeId,
                                                   @RequestParam Employee employee){
        employee.setId(employeeId);
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    // Build Delete Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>("Employee detail successfully deleted!", HttpStatus.OK);
    }
}
