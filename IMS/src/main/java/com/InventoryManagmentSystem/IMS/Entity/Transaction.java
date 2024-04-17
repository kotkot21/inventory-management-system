package com.InventoryManagmentSystem.IMS.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Transaction {
    @Id
    @GeneratedValue
    Integer TransactionID;
    Integer Quantity, TotalPrice;
    @ManyToOne
    private Product ProductID;
    @ManyToOne
    private WarHouse WarhouseID;
    @ManyToOne
    private Employee EmployeeID;
    LocalDate TransactionDate;
    String TransactionType;
}

