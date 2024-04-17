package com.InventoryManagmentSystem.IMS.Service;

import com.InventoryManagmentSystem.IMS.Entity.Customer;
import com.InventoryManagmentSystem.IMS.Repository.CategoryRepositry;
import com.InventoryManagmentSystem.IMS.Repository.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepositry customerRepository;
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public String deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
        return "Customer deleted";
    }
    public String updateCustomer(Integer id, Customer customer) {
        customerRepository.save(customer);
        return "Customer updated";
    }
}
