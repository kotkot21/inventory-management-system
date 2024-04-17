package com.InventoryManagmentSystem.IMS.Controller;

import com.InventoryManagmentSystem.IMS.Entity.Employee;
import com.InventoryManagmentSystem.IMS.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @GetMapping()
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        return employeeService.deleteEmployee(id);
    }
    @PutMapping("{id}")
    public String updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }
}
