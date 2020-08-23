package com.demo.maindao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.Product;

public interface ProductDao extends JpaRepository<Product, Long> {

}
