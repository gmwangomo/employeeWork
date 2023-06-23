package com.example.employeeWork.controller;

import com.example.employeeWork.entity.Manager;
import com.example.employeeWork.service.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/managers")
public class MangerController {
    public ManagerService managerService;

    @PostMapping()
    private ResponseEntity<Manager> createManager(@RequestBody Manager manager){
        Manager savedManager = managerService.createManager(manager);
        return new ResponseEntity<>(savedManager, HttpStatus.CREATED);
    }

    @GetMapping("all")
    private ResponseEntity<List<Manager>> getAllManager(){
        List<Manager> managerList = managerService.getAllManger();
        return new ResponseEntity<>(managerList, HttpStatus.OK);
    }

    @GetMapping("{id}")
    private ResponseEntity<Manager> getById(@PathVariable("id") Long managerId){
        Manager getmanager = managerService.getManagerById(managerId);
        return new ResponseEntity<>(getmanager, HttpStatus.OK);
    }

    @PutMapping("{id}")
    private ResponseEntity<Manager> updateManger(@PathVariable("id") Long managerId, @RequestBody Manager manager){
        manager.setId(managerId);
        Manager updateManager = managerService.updateManger(manager);
        return new ResponseEntity<>(updateManager, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    private ResponseEntity<String> deleteManager(@PathVariable("id") Long managerId){
        managerService.deleteManager(managerId);
        return new ResponseEntity<>("Manager successfully deleted!", HttpStatus.OK);
    }
}
