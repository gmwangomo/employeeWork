package com.example.employeeWork.repository;

import com.example.employeeWork.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
