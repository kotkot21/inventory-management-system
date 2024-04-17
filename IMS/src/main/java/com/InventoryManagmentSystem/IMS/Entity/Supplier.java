package com.InventoryManagmentSystem.IMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Supplier {
    @Id
    @GeneratedValue
    Integer SupplierID;
    String SupplierName,ContactInformation,Address;
}
