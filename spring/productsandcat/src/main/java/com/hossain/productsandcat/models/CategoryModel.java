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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="catgorgies")
public class CategoryModel {

	//member variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=1, max = 80, message = "The name must be between 1 and 80 characters.")
	private String name;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	//auto update created at and updates at 
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	//empty construcor
	public CategoryModel() {
		
	}

	//loaded con
	public CategoryModel(String name) {
		
		this.name = name;
	}
	
	//many relationship
	//making the new table that would conect to the other 2 tables and make the columns with the forgein key
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "cat_prod",
		joinColumns = @JoinColumn(name = "prod_id"), 
		inverseJoinColumns = @JoinColumn(name = "cat_id")
			)
	//member variable
	private List<ProductModel> prodModel;
	
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

	public List<ProductModel> getProdModel() {
		return prodModel;
	}

	public void setProdModel(List<ProductModel> prodModel) {
		this.prodModel = prodModel;
	}
	
	
	
	
}
