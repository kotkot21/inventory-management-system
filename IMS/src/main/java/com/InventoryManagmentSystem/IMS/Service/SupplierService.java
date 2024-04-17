package com.InventoryManagmentSystem.IMS.Service;

import com.InventoryManagmentSystem.IMS.Entity.Supplier;
import com.InventoryManagmentSystem.IMS.Repository.SupplierRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    SupplierRepositry supplierRepositry;
    public Supplier createSupplier(Supplier supplier) {
        return supplierRepositry.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepositry.findAll();
    }
    public String DeleteSupplier(Integer id) {
        supplierRepositry.deleteById(id);
        return "Supplier deleted";
    }
    public String UpdateSupplier(Integer id, Supplier supplier) {
        supplierRepositry.save(supplier);
        return "Supplier updated";
    }


}
