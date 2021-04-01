package com.shopelectrolic.demo.Repository;

import com.shopelectrolic.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
