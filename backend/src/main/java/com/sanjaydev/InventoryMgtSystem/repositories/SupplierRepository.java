package com.sanjaydev.InventoryMgtSystem.repositories;

import com.sanjaydev.InventoryMgtSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
