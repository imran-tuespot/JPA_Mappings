package com.tuespot.JPA_Mappings.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="tbl_category")
public class Category {

	@Id
	private int id;
	private String title;
	
	@ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
	private List<Product> products=new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + ", products=" + products + "]";
	}
	public Category(int id, String title, List<Product> products) {
		super();
		this.id = id;
		this.title = title;
		this.products = products;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
