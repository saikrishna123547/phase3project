package com.demo.mainService;

import java.util.List;


import com.demo.main.PurchaseItems;

public interface PurchaseitemsService {
	public PurchaseItems addPurchaseItems(PurchaseItems PurchaseItems);
	public PurchaseItems getItemById(long id);
	public List<PurchaseItems> getAllItemsByPurchaseId(long purchaseId);
	public PurchaseItems updateItem(PurchaseItems item);
	public void deleteItem(long id);
	public void deleteAllItemsForPurchaseId(long purchaseId);
}
