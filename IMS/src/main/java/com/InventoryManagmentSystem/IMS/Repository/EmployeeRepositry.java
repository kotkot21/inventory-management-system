package com.InventoryManagmentSystem.IMS.Repository;

import com.InventoryManagmentSystem.IMS.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositry extends JpaRepository<Employee, Integer> {
}
