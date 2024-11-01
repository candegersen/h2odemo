package com.h2demo.h2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.h2demo.h2demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
