package com.InventoryManagmentSystem.IMS.Controller;

import com.InventoryManagmentSystem.IMS.Entity.Category;
import com.InventoryManagmentSystem.IMS.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping()
    public Category addCategory(@RequestBody Category category) {
        return categoryService.AddCategory(category);
    }
    @GetMapping()
    public List<Category> getCategory() {
        return categoryService.GetAllCategories();
    }

    @DeleteMapping("{id}")
    public String deleteCategory(@PathVariable("id") Integer id) {
         return categoryService.DeleteCategory(id);
    }
    @PutMapping("{id}")
    public String updateCategory(@PathVariable("id") Integer id, @RequestBody Category category) {
        return categoryService.updateCategory(id,category);
    }

}
