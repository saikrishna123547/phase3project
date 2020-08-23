package com.demo.maindao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.PurchaseItems;

public interface PurchaseitemDao extends JpaRepository<PurchaseItems, Long>{

}
