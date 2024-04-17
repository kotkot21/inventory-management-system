package com.InventoryManagmentSystem.IMS.Repository;

import com.InventoryManagmentSystem.IMS.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepositry extends JpaRepository<Supplier, Integer> {
}
