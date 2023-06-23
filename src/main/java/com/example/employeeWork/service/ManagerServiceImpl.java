package com.example.employeeWork.service;

import com.example.employeeWork.entity.Manager;
import com.example.employeeWork.repository.ManagerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ManagerServiceImpl implements ManagerService{
    private ManagerRepository managerRepository;
    @Override
    public Manager createManager(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public Manager getManagerById(Long managerId) {
        Optional<Manager> optionalManager = managerRepository.findById(managerId);
        return optionalManager.get();
    }

    @Override
    public List<Manager> getAllManger() {
        return managerRepository.findAll();
    }

    @Override
    public Manager updateManger(Manager manager) {
        Manager existingManager = managerRepository.findById(manager.getId()).get();
        existingManager.setFirstName(manager.getFirstName());
        existingManager.setLastName(manager.getLastName());
        existingManager.setSex(manager.getSex());
        existingManager.setEmail(manager.getEmail());
        return existingManager;
    }

    @Override
    public void deleteManager(Long managerId) {
        managerRepository.deleteById(managerId);
    }
}
