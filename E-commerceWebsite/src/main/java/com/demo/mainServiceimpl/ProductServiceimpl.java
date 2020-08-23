package com.demo.mainServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.Product;
import com.demo.mainService.ProductService;
import com.demo.maindao.ProductDao;
@Service
public class ProductServiceimpl implements ProductService {
@Autowired
public ProductDao dao;
	@Override
	public Product getProductById(long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {
		
		return dao.save(product);
	}

	@Override
	public void deleteProduct(long id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Product> getAllProducts() {
	
		return dao.findAll();
	}

	@Override
	public Product addProduct(Product Product) {
		
		return dao.save(Product);
	}

}
