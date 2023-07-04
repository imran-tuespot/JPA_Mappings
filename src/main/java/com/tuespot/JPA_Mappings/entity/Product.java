package com.tuespot.JPA_Mappings.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product {

	@Id
	private int id;
	private String productName;
	
	@ManyToMany
	private List<Category> categories=new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", categories=" + categories + "]";
	}
	public Product(int id, String productName, List<Category> categories) {
		super();
		this.id = id;
		this.productName = productName;
		this.categories = categories;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
