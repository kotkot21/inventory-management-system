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
public class Orders {

    @Id
    @GeneratedValue
    Integer OrderID;
    Integer TotalAmount;
    @OneToOne
    private Customer CustomerID;
    @OneToOne
    private Employee EmployeeID;
    @ManyToOne
    private Product ProductID;
    LocalDate OrderDate,DeliveryDate;


}
