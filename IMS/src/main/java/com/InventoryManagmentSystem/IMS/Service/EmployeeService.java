package com.InventoryManagmentSystem.IMS.Service;

import com.InventoryManagmentSystem.IMS.Entity.Employee;
import com.InventoryManagmentSystem.IMS.Repository.EmployeeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepositry employeeRepositry;

    public Employee addEmployee(Employee employee) {
        return employeeRepositry.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepositry.findAll();
    }
    public String deleteEmployee(Integer id) {
        employeeRepositry.deleteById(id);
        return "Employee deleted";
    }
    public String updateEmployee(Integer id,Employee employee) {
        employeeRepositry.save(employee);
        return "Employee updated";
    }
}
