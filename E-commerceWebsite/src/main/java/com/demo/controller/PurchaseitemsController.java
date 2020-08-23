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

import com.demo.main.PurchaseItems;
import com.demo.mainService.PurchaseitemsService;
@RestController
public class PurchaseitemsController {
	@Autowired
	private PurchaseitemsService purchaseitemsService;
	@PostMapping("/PurchaseItems")
	public PurchaseItems addPurchaseItems(@RequestBody PurchaseItems PurchaseItems) {
		
		return purchaseitemsService.addPurchaseItems(PurchaseItems) ;
	}

	@GetMapping("/PurchaseItems/{id}")
	public PurchaseItems getItemById(@PathVariable long id) {
		
		return purchaseitemsService.getItemById(id);
	}

	@GetMapping("/PurchaseItems/{purchaseId}")
	public List<PurchaseItems> getAllItemsByPurchaseId(@PathVariable long purchaseId) {
		
		return purchaseitemsService.getAllItemsByPurchaseId(purchaseId);
	}

	@PutMapping("/PurchaseItems/{item}")
	public PurchaseItems updateItem(@RequestBody PurchaseItems item) {
	
		return purchaseitemsService.updateItem(item);
	}
@DeleteMapping("/id")
	public void deleteItem(@PathVariable long id) {
		purchaseitemsService.deleteItem(id);
	}

	@DeleteMapping("purchaseId")
	public void deleteAllItemsForPurchaseId(@PathVariable long purchaseId) {
	
		purchaseitemsService.deleteAllItemsForPurchaseId(purchaseId);
	}

	
	
	
}
