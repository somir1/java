package com.hossain.productsandcat.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="products")
public class ProductModel {

	//member variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=1, max = 85, message = "\"Field must contain 1 to 85 characters.")
	private String name;
	
	@NotNull
	@Size(min=1, max = 500, message = "Field must contain 1 to 500 characters.")
	private String description;
	
	@NotNull
	@Min (value = 0, message = "Price should be greater then 0")
	private double price;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	//auto update created at and updated at
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	//empty contructor
	public ProductModel() {
		
	}

	//loaded construcor
	public ProductModel(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	//many relationship
	//making the new table that would conect to the other 2 tables and make the columns with the forgein key
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "cat_prod",
		joinColumns = @JoinColumn(name = "cat_id"), 
		inverseJoinColumns = @JoinColumn(name = "prod_id")
			)
	//member variable
	private List<CategoryModel> catModel;


	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	public List<CategoryModel> getCatModel() {
		return catModel;
	}
	
	public void setCatModel(List<CategoryModel> catModel) {
		this.catModel = catModel;
	}

}
