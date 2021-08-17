package com.hossain.productsandcat.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hossain.productsandcat.models.CategoryModel;
import com.hossain.productsandcat.models.ProductModel;
import com.hossain.productsandcat.repositories.CategoryRepo;
import com.hossain.productsandcat.repositories.ProductsRepo;

@Service
public class MainService {
	
	//member varables
	private final ProductsRepo productsRepo;
	private final CategoryRepo categoryRepo;
	
	//loaded constructor
	public MainService(ProductsRepo productsRepo, CategoryRepo categoryRepo) {
		this.categoryRepo = categoryRepo;
		this.productsRepo = productsRepo;			
	}
	
	//service methods
	//products service
	public ProductModel newProduct(ProductModel p) {
		return this.productsRepo.save(p);
	}
	
	public List<ProductModel> getallProducts(){
		return (List<ProductModel>)this.productsRepo.findAll();
	}
	
	public ProductModel getprodBYID(Long id) {
		return this.productsRepo.findById(id).orElse(null);
	}
	
	
	//category methods
	public List<CategoryModel> getallCat(){
		return (List<CategoryModel>)this.categoryRepo.findAll();
	}
	
	public CategoryModel getCATBYID(Long id) {
		return this.categoryRepo.findById(id).orElse(null);
	}
	
	public void updatecat(ProductModel p) {
		this.productsRepo.save(p);
	}
	
	public CategoryModel newCategory(CategoryModel c) {
		return this.categoryRepo.save(c);
	}
}
