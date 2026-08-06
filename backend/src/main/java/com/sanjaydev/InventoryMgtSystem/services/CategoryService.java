package com.sanjaydev.InventoryMgtSystem.services;

import com.sanjaydev.InventoryMgtSystem.dtos.CategoryDTO;
import com.sanjaydev.InventoryMgtSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
