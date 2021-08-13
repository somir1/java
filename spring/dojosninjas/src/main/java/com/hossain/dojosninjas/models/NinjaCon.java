package com.hossain.dojosninjas.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ninjas")
public class NinjaCon {
	
	//member varibles and table columns
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=3, max = 100)
	private String first_name;
	
	@NotNull
	@Size(min=3, max = 100)
	private String last_name;
	
	@NotNull(message = "Age is required")
	@Min(value = 1)
	@Max(value = 105)
	private Integer age;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	//Auto update the created at and updated at 
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	// empty and loaded contructor
	public NinjaCon() {
		
	}
	
	public NinjaCon(String first_name, String last_name, Integer age) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}

	// many to one relationship 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dojo_id") //naming the foreign key
    private DojoCon dojo; //dojo is the new mapped by for the one to many 
	
	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	public DojoCon getDojo() {
		return dojo;
	}

	public void setDojo(DojoCon dojo) {
		this.dojo = dojo;
	}
	
	

}
