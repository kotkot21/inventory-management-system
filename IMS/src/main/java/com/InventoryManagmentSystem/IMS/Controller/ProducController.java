package com.InventoryManagmentSystem.IMS.Controller;

import com.InventoryManagmentSystem.IMS.Entity.Product;
import com.InventoryManagmentSystem.IMS.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Product")
public class ProducController {

    @Autowired
    private ProductService productService;

    @PostMapping()
    public Product addProduct(@RequestBody Product product) {
        return productService.AddProduct(product);
    }
    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        return productService.DeleteProduct(id);
    }
    @PutMapping("{id}")
    public String updateProduct(@PathVariable("id") Integer id, @RequestBody Product product) {
        return productService.UpdateProduct(id, product);
    }
}
