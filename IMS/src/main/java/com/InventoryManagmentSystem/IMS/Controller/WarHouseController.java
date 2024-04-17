package com.InventoryManagmentSystem.IMS.Controller;


import com.InventoryManagmentSystem.IMS.DTO.WarHouseDTO;
import com.InventoryManagmentSystem.IMS.Entity.WarHouse;
import com.InventoryManagmentSystem.IMS.Repository.WarHouseRepository;
import com.InventoryManagmentSystem.IMS.Service.WarHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/WarHouse")
public class WarHouseController  {

    @Autowired
    private WarHouseService warHouseService;

    @PostMapping()
    public WarHouse createWarHouse(@RequestBody WarHouse warHouse) {
        return warHouseService.addWarHouse(warHouse);
    }

    @GetMapping()
    public List<WarHouse> getAllWarHouses() {
        return warHouseService.getAllWarHouses();
    }
    @DeleteMapping("{id}")
    public String deleteWarHouse(@PathVariable("id") Integer id) {
        return warHouseService.DeleteWarHouse(id);
    }
    @PutMapping("{id}")
    public String updateWarHouse(@PathVariable("id") Integer id, @RequestBody WarHouse warHouse) {
        return warHouseService.UpdateWarHouse(id,warHouse);
    }


}
