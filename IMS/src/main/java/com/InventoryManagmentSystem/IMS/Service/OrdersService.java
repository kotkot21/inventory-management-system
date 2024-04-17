package com.InventoryManagmentSystem.IMS.Service;

import com.InventoryManagmentSystem.IMS.Entity.Orders;
import com.InventoryManagmentSystem.IMS.Repository.OrdersRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    OrdersRepositry ordersRepositry;

    public Orders AddOrder(Orders order) {
        return ordersRepositry.save(order);
    }

    public List<Orders> getAllOrders() {
        return ordersRepositry.findAll();
    }
    public String DeleteOrder(Integer id) {
        ordersRepositry.deleteById(id);
        return "Order deleted";
    }
    public String UpdateOrder(Integer id, Orders order) {
        ordersRepositry.save(order);
        return "Order updated";
    }
}
