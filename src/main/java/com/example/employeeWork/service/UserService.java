package com.example.employeeWork.service;

import com.example.employeeWork.entity.User;

import java.util.List;
public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUser();

    void deleteUser(Long userId);
}
