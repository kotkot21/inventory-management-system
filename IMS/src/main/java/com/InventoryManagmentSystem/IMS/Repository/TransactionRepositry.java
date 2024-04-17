package com.InventoryManagmentSystem.IMS.Repository;

import com.InventoryManagmentSystem.IMS.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepositry extends JpaRepository<Transaction, Integer> {
}
