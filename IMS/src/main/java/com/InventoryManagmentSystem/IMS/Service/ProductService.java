package com.InventoryManagmentSystem.IMS.Service;

import com.InventoryManagmentSystem.IMS.Entity.Product;
import com.InventoryManagmentSystem.IMS.Repository.ProductRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepositry productRepository;
    public Product AddProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public String DeleteProduct(Integer id) {
        productRepository.deleteById(id);
        return "Product deleted";
    }
    public String UpdateProduct(Integer id , Product product) {
        productRepository.save(product);
        return "Product updated";
    }
}
