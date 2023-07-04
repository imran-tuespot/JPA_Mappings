package com.tuespot.JPA_Mappings.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "tbl_address")
public class Address {

	@Id
	private int addressId;
	private String street;
	private String city;
	private String country;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", country=" + country
				+ "]";
	}
	public Address(int addressId, String street, String city, String country) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();

	}
	
	

}
