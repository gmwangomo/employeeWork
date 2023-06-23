package com.example.employeeWork.service;

import com.example.employeeWork.entity.Manager;

import java.util.List;

public interface ManagerService {
    Manager createManager(Manager manager);

    Manager getManagerById(Long managerId);

    List<Manager> getAllManger();
    Manager updateManger(Manager manager);

    void deleteManager(Long managerId);
}
