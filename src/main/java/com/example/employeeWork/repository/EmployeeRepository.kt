package com.example.employeeWork.repository

import com.example.employeeWork.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee?, Long?>
