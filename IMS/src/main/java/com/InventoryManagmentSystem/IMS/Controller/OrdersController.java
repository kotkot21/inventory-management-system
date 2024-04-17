package com.InventoryManagmentSystem.IMS.Controller;

import com.InventoryManagmentSystem.IMS.Entity.Orders;
import com.InventoryManagmentSystem.IMS.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @PostMapping()
    public Orders addOrder(@RequestBody Orders order) {
        return ordersService.AddOrder(order);
    }
    @GetMapping()
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }
    @DeleteMapping("{id}")
    public String deleteOrder(@PathVariable Integer id) {
        return ordersService.DeleteOrder(id);
    }
    @PutMapping("{id}")
    public String updateOrder(@PathVariable Integer id, @RequestBody Orders order) {
        return ordersService.UpdateOrder(id, order);
    }
}
