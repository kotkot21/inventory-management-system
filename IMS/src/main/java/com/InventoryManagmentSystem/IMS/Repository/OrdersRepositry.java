package com.InventoryManagmentSystem.IMS.Repository;

import com.InventoryManagmentSystem.IMS.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepositry extends JpaRepository<Orders, Integer> {
}
