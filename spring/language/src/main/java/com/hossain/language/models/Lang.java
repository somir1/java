package com.hossain.language.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="languages")
public class Lang {

	//member varibale for the table columns
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 2, max =20)
	private String name;

	@NotNull
	@Size(min = 2, max =20)
	private String creator;

	@NotNull(message = "Field can not be blank")
	private double version;

	//timestamps and formats for created and updated at
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	//empty constructor for making a new instance 
	public Lang() {
		
	}
	
	//constructor overloading
	//loaded constructor for calling object
	public Lang(String name,String creator,double version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
	}

	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
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
	
	//auto update the created and updated at 
	 @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	  
	@PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
