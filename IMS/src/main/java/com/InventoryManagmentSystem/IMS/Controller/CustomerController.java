package com.InventoryManagmentSystem.IMS.Controller;

import com.InventoryManagmentSystem.IMS.Entity.Customer;
import com.InventoryManagmentSystem.IMS.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping()
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
    @GetMapping()
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    @DeleteMapping("{id}")
    public String deleteCustomer(@PathVariable("id") Integer id) {
        return customerService.deleteCustomer(id);
    }
    @PutMapping("{id}")
    public String updateCustomer(@PathVariable("id") Integer id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

}
