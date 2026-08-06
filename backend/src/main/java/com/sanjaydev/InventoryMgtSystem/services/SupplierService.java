package com.sanjaydev.InventoryMgtSystem.services;

import com.sanjaydev.InventoryMgtSystem.dtos.Response;
import com.sanjaydev.InventoryMgtSystem.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
