package com.InventoryManagmentSystem.IMS.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Product {

    @Id
    @GeneratedValue
    Integer ProductID;
    Integer Price,QuantityAvailable;
    @ManyToOne
    private Category CategoryID;
    @ManyToOne
    private Supplier SupplierID;
    String ProductName,Description;
}
