package com.InventoryManagmentSystem.IMS.Repository;

import com.InventoryManagmentSystem.IMS.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositry extends JpaRepository<Category, Integer> {

}
