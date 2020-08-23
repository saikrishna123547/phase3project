package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.Purchase;
import com.demo.mainService.PurchaseService;

@RestController
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;
	@PostMapping("/Purchase")
	public Purchase addPurchase(@RequestBody Purchase Purchase) {
		
		return purchaseService.addPurchase(Purchase);
	}

@GetMapping("/Purchase/{id}")
	public Purchase getPurchaseById(@PathVariable long id) {
		
		return purchaseService.getPurchaseById(id);
	}

@GetMapping("/Purchase")
	public List<Purchase> getAllItems() {
		
		return purchaseService.getAllItems();
	}

	@PutMapping("/Purchase")
	public Purchase updatePurchase(@RequestBody Purchase purchase) {
 
		return purchaseService.updatePurchase(purchase);
	}

	@DeleteMapping("/Purchase/{id}")
	public void deletePurchase(@PathVariable long id) {
		
		purchaseService.deletePurchase(id);
	}


}
