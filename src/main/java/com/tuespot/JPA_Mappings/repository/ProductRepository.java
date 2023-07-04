package com.tuespot.JPA_Mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuespot.JPA_Mappings.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
