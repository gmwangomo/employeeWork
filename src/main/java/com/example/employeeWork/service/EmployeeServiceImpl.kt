package com.example.employeeWork.service

import com.example.employeeWork.entity.Employee
import com.example.employeeWork.repository.EmployeeRepository
import lombok.AllArgsConstructor
import org.springframework.stereotype.Service

@Service
@AllArgsConstructor
class EmployeeServiceImpl : EmployeeService {
    private val employeeRepository: EmployeeRepository? = null
    override fun createEmployee(employee: Employee): Employee {
        return employeeRepository!!.save(employee)
    }

    override fun getEmployeeById(employeeId: Long): Employee {
        val optionalEmployee = employeeRepository!!.findById(employeeId)
        return optionalEmployee.get()
    }

    override fun getAllEmployee(): MutableList<Employee?> {
        return employeeRepository!!.findAll()
    }

    override fun updateEmployee(employee: Employee): Employee {
        val existingEmployee = employeeRepository!!.findById(employee.getId()).get()
          existingEmployee.
//        existingEmployee.setLastname(employee.getLastname())
//        existingEmployee.setDepartment(employee.getDepartment())
//        existingEmployee.setEmail(employee.getEmail())
        return existingEmployee
    }

    override fun deleteEmployee(employeeId: Long) {
        employeeRepository!!.deleteById(employeeId)
    }
}
