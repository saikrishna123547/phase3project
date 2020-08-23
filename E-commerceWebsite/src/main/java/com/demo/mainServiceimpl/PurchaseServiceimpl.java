package com.demo.mainServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.Purchase;
import com.demo.mainService.PurchaseService;
import com.demo.maindao.PurchaseDao;
@Service
public class PurchaseServiceimpl implements PurchaseService {
@Autowired
public PurchaseDao dao;
	@Override
	public Purchase getPurchaseById(long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Purchase> getAllItems() {
		
		return dao.findAll();
	}



	@Override
	public Purchase updatePurchase(Purchase purchase) {
		
		return dao.save(purchase);
	}

	@Override
	public void deletePurchase(long id) {
		dao.deleteById(id);
	}

	@Override
	public Purchase addPurchase(Purchase Purchase) {
		
		return dao.save(Purchase);
	}

}
