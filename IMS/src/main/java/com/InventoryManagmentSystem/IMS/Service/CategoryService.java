package com.InventoryManagmentSystem.IMS.Service;

import com.InventoryManagmentSystem.IMS.Entity.Category;
import com.InventoryManagmentSystem.IMS.Repository.CategoryRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepositry categoryRepositry;

    public Category AddCategory(Category category) {
        return categoryRepositry.save(category);
    }
    public List<Category> GetAllCategories() {
        return categoryRepositry.findAll();
    }
    public String DeleteCategory(Integer id) {
         categoryRepositry.deleteById(id);
         return "Category deleted";
    }

    public String updateCategory(Integer id,Category category) {
        categoryRepositry.save(category);
        return "category updated";
    }

}
