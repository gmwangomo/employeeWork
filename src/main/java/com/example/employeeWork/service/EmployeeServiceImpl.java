package com.example.employeeWork.service;

import com.example.employeeWork.entity.Employee;
import com.example.employeeWork.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        return optionalEmployee.get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).get();
        existingEmployee.setFirstname(employee.getFirstname());
        existingEmployee.setLastname(employee.getLastname());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setEmail(employee.getEmail());
        return null;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
