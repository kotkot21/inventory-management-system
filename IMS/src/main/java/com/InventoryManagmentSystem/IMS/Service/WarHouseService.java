package com.InventoryManagmentSystem.IMS.Service;

import com.InventoryManagmentSystem.IMS.DTO.WarHouseDTO;
import com.InventoryManagmentSystem.IMS.Entity.WarHouse;
import com.InventoryManagmentSystem.IMS.Repository.WarHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarHouseService {

    @Autowired
    private WarHouseRepository warHouseRepository;


    public WarHouse addWarHouse(WarHouse warHouse) {
        return warHouseRepository.save(warHouse);

    }

    public List<WarHouse> getAllWarHouses() {
        return warHouseRepository.findAll();
    }

    public String DeleteWarHouse(int id) {
        warHouseRepository.deleteById(id);
        return "WarHouse deleted";
    }

    public String UpdateWarHouse(Integer id, WarHouse warHouse) {
        warHouseRepository.save(warHouse);
        return "WarHouse updated";
    }
//
//    private WarHouseDTO mapToDTO(WarHouse warHouse) {
//        WarHouseDTO warHouseDTO = new WarHouseDTO();
//        warHouseDTO.setWarHouseId(warHouse.getWarHouseId());
//        warHouseDTO.setCapacity(warHouse.getCapacity());
//        warHouseDTO.setLocation(warHouse.getLocation());
//        return warHouseDTO;
//    }
//
//    private WarHouse mapToEntity(WarHouseDTO warHouseDTO) {
//        WarHouse warHouse = new WarHouse();
//        warHouse.setWarHouseId(warHouseDTO.getWarHouseId());
//        warHouse.setCapacity(warHouseDTO.getCapacity());
//        warHouse.setLocation(warHouseDTO.getLocation());
//        return warHouse;
//    }

}




