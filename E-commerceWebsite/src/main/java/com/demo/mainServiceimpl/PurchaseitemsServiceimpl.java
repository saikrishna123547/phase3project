package com.demo.mainServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.PurchaseItems;
import com.demo.mainService.PurchaseitemsService;

import com.demo.maindao.PurchaseitemDao;
@Service
public class PurchaseitemsServiceimpl implements PurchaseitemsService {
@Autowired
public PurchaseitemDao dao;
	@Override
	public PurchaseItems getItemById(long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<PurchaseItems> getAllItemsByPurchaseId(long purchaseId) {
		
		return dao.findAll();
	}

	@Override
	public PurchaseItems updateItem(PurchaseItems item) {
		
		return dao.save(item);
	}

	@Override
	public void deleteItem(long id) {
		dao.deleteById(id);
		
	}

	@Override
	public void deleteAllItemsForPurchaseId(long purchaseId) {
		
		dao.deleteById(purchaseId);
		
	}

	@Override
	public PurchaseItems addPurchaseItems(PurchaseItems PurchaseItems) {
		
		return dao.save(PurchaseItems);
	}

}
