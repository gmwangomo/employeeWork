package com.example.employeeWork.controller

import com.example.employeeWork.entity.Manager
import com.example.employeeWork.service.ManagerService
import lombok.AllArgsConstructor
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@AllArgsConstructor
@RequestMapping("api/managers")
class MangerController {
    var managerService: ManagerService? = null
    @PostMapping
    private fun createManager(@RequestBody manager: Manager): ResponseEntity<Manager> {
        val savedManager = managerService!!.createManager(manager)
        return ResponseEntity(savedManager, HttpStatus.CREATED)
    }

    @get:GetMapping("all")
    private val allManager: ResponseEntity<List<Manager>>
        private get() {
            val managerList = managerService!!.allManger
            return ResponseEntity(managerList, HttpStatus.OK)
        }

    @GetMapping("{id}")
    private fun getById(@PathVariable("id") managerId: Long): ResponseEntity<Manager> {
        val getmanager = managerService!!.getManagerById(managerId)
        return ResponseEntity(getmanager, HttpStatus.OK)
    }

    @PutMapping("{id}")
    private fun updateManger(
        @PathVariable("id") managerId: Long,
        @RequestBody manager: Manager
    ): ResponseEntity<Manager> {
        manager.id = managerId
        val updateManager = managerService!!.updateManger(manager)
        return ResponseEntity(updateManager, HttpStatus.OK)
    }

    @DeleteMapping("{id}")
    private fun deleteManager(@PathVariable("id") managerId: Long): ResponseEntity<String> {
        managerService!!.deleteManager(managerId)
        return ResponseEntity("Manager successfully deleted!", HttpStatus.OK)
    }
}
