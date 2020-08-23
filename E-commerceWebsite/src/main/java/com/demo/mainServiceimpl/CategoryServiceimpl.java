package com.demo.mainServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.Category;
import com.demo.mainService.CategoryService;
import com.demo.maindao.CategoryDao;

@Service
public class CategoryServiceimpl implements CategoryService{
	@Autowired
private CategoryDao dao;
	@Override
	public Category getCategoryById(long id) {
		
		return dao.findById(id).get();
	}
	@Override
	public Category updateCategory(Category category) {
		
		return dao.save(category);
	}
	@Override
	public void deleteCategoryById(long id) {
	 deleteCategoryById(id);
	}
	@Override
	public List<Category> getALLCategories() {
	
		return dao.findAll();
	}
	@Override
	public Category getCategoriesDropDown1(long id) {
		
		return dao.findById(id).get();
	}
	@Override
	public Category addCategory(Category Category) {
		
		return dao.save(Category);
	}



}
