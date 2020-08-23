package com.demo.mainService;

import java.util.List;

import com.demo.main.Purchase;


public interface PurchaseService {
	public Purchase addPurchase(Purchase Purchase);
	public Purchase getPurchaseById(long id);
	public List<Purchase> getAllItems();
	public Purchase  updatePurchase(Purchase purchase);
	public void deletePurchase(long id);
	

}
