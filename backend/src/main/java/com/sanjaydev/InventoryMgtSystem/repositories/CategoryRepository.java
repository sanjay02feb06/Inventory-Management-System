package com.sanjaydev.InventoryMgtSystem.repositories;

import com.sanjaydev.InventoryMgtSystem.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
