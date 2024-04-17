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
public class Employee {

    @Id
    @GeneratedValue
    Integer EmployeeID;
    Integer Salary;

    @ManyToOne
    private WarHouse warHouseID;

    String EmployeeName;
    String ContactInformation;
    String Position;
}
