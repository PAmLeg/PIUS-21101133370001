package com.example.services;

import java.util.List;

public interface SupplierService {

    List<SupplierService> getAllSuppliers();

    SupplierService getSupplierById(Long id);

    void saveOrUpdateSupplier(SupplierService supplier);

    void deleteSupplier(Long id);

}
