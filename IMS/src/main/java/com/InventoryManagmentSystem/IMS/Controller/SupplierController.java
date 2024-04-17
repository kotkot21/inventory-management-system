package com.InventoryManagmentSystem.IMS.Controller;

import com.InventoryManagmentSystem.IMS.Entity.Supplier;
import com.InventoryManagmentSystem.IMS.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @PostMapping()
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return supplierService.createSupplier(supplier);
    }
    @GetMapping()
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }
    @DeleteMapping("{id}")
    public String deleteSupplier(@PathVariable Integer id) {
        return supplierService.DeleteSupplier(id);
    }
    @PutMapping("{id}")
    public String updateSupplier(@PathVariable Integer id, @RequestBody Supplier supplier) {
        return supplierService.UpdateSupplier(id, supplier);
    }


}
