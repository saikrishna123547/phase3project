package com.demo.maindao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.Purchase;


public interface PurchaseDao  extends JpaRepository<Purchase, Long>{

	
}
