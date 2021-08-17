package com.hossain.productsandcat.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hossain.productsandcat.models.CategoryModel;
import com.hossain.productsandcat.models.ProductModel;
import com.hossain.productsandcat.services.MainService;

@Controller
public class HomeCon {
	private final MainService mainService;

	public HomeCon( MainService mainService) {
		this.mainService = mainService;
	}
	
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/view/product")
	public String showProduct(Model model){
		List<ProductModel> p = this.mainService.getallProducts();
		model.addAttribute("allprod",p);

		return "showP.jsp";
	}
	
	@GetMapping("/add/product")
	public String addProduct(@ModelAttribute("products") ProductModel product) {
		return "addP.jsp";
	}
	
	@PostMapping("/make/products")
	public String makeProduct(@Valid @ModelAttribute("products") ProductModel product, BindingResult result) {
		if(result.hasErrors()) {
			return "addP.jsp";
		}
		
		this.mainService.newProduct(product);
		
		return "redirect:/";
	}
	
	@GetMapping("/showproduct/{id}")
	public String showProdID(@PathVariable("id")Long id, Model model) {
		ProductModel p = this.mainService.getprodBYID(id);
		model.addAttribute("prod", p);
		
		List<CategoryModel> c = this.mainService.getallCat();
		model.addAttribute("cat", c);
		
		List<CategoryModel> cm = p.getCatModel();
		model.addAttribute("cats",cm);
		return "singleprod.jsp";
	}
	
	@PostMapping("/addcategory/{id}")
	public String addcattoProd(@PathVariable("id")Long prodID, @RequestParam("categories")Long categories) {
		System.out.println(prodID);
		System.out.println(categories);
		
		//retireve products by id
		ProductModel prodmodel = this.mainService.getprodBYID(prodID);
		
		//retrieve category by id
		CategoryModel categoryModel = this.mainService.getCATBYID(categories);
		
		List<CategoryModel> currentcat = prodmodel.getCatModel();
		currentcat.add(categoryModel);
		
		prodmodel.setCatModel(currentcat);
		this.mainService.updatecat(prodmodel);
		
		
		return "redirect:/showproduct/" + prodID;
	}
	
	@GetMapping("/add/cat")
	public String addCat(@ModelAttribute("categories")CategoryModel category, Model model) {
		
		List<CategoryModel> p = this.mainService.getallCat();
		model.addAttribute("allcat",p);
		return "showC.jsp";
	}
	
	@PostMapping("/make/cat")
	public String addCat(@Valid @ModelAttribute("categories") CategoryModel categoryModel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<CategoryModel> allcat = this.mainService.getallCat();
			model.addAttribute("allcat",allcat);
			return "showC.jsp";
		}
		this.mainService.newCategory(categoryModel);
		return "redirect:/add/cat";
	}
	
}
