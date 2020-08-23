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

import com.demo.main.Category;
import com.demo.main.Product;
import com.demo.mainService.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable long id) {

		return productService.getProductById(id);
	}

	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		
		return productService.updateProduct(product);
	}

	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable long id) {
		productService.deleteProduct(id);
		
	}

	@GetMapping("/productss")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
	}

	@PostMapping("/Product")
	public Product addProduct(Product Product) {
		
		return productService.addProduct(Product);
	} 



}
