package com.InventoryManagmentSystem.IMS.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class WarHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer WarHouseId;

    private Integer Capacity;
    private String Location;

}
