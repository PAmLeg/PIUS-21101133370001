package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository<Supplier> extends JpaRepository<Supplier, Long> {

}
