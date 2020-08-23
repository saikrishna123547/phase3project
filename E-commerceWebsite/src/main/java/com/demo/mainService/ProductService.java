package com.demo.mainService;

import java.util.List;

import com.demo.main.Product;


public interface ProductService {
	public Product addProduct(Product Product);
	public Product getProductById(long id);
	public Product updateProduct(Product product);
	public void deleteProduct(long id);
	public List<Product> getAllProducts();
	
}

