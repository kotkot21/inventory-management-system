package com.InventoryManagmentSystem.IMS.Repository;

import com.InventoryManagmentSystem.IMS.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositry extends JpaRepository<Customer,Integer> {

}
