package com.tuespot.JPA_Mappings.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.JPA_Mappings.entity.Address;
import com.tuespot.JPA_Mappings.entity.Category;
import com.tuespot.JPA_Mappings.entity.Laptop;
import com.tuespot.JPA_Mappings.entity.Product;
import com.tuespot.JPA_Mappings.entity.Student;
import com.tuespot.JPA_Mappings.repository.CategoryRepository;
import com.tuespot.JPA_Mappings.repository.ProductRepository;
import com.tuespot.JPA_Mappings.repository.StudentRepository;

@RestController
@RequestMapping("/Mappings")
public class Controller {

	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	//One To One
	@PostMapping("/save")
	public void save() {
//		Student student = new Student();
//		student.setStudentName("vijay");
//		student.setAbout("hellooooo");
//		
//
//		Laptop laptop = new Laptop();
//		laptop.setModelNumber("2334");
//		laptop.setBrand("Dell");
//		laptop.setLaptopId(1);
//
//		laptop.setStudent(student);
//
//		//student.setLaptop(laptop);
//
//		repository.save(student);
	}

	@GetMapping("/get")
	public void get() {
		Student student = this.repository.findById(1).get();
		System.out.println(student.getStudentName());
		
		Laptop laptop = student.getLaptop();
		System.out.println(laptop.getBrand()+""+laptop.getModelNumber());
	}
	
	
	
	//One To Many   //ManyToOne
	@PostMapping("/oneToMany")
	public void saveSt() {
		Student student = new Student();
		student.setStudentName("rajesh");
		student.setAbout("hellooooo");
		student.setStudentId(2);

		Address address = new Address();
		address.setAddressId(12);
		address.setStreet("85");
		address.setCity("chd");
		address.setCountry("india");
		address.setStudent(student);
		
		Address address2 = new Address();
		address2.setAddressId(13);
		address2.setStreet("12");
		address2.setCity("pkl");
		address2.setCountry("india");
		address2.setStudent(student);
		
		ArrayList<Address> addressList = new ArrayList<>();
		addressList.add(address);
		addressList.add(address2);
		
		student.setAddresses(addressList);
		
		repository.save(student);
		
	}
	
	@GetMapping("/getOneToMany")
	public void oneToMany() {
		Student student = this.repository.findById(2).get();
		System.out.println(student.getStudentName());
		
		List<Address> addresses = student.getAddresses();
		System.out.println(addresses);
	}
	
	
	//Many to Many
	@PostMapping("/ManyToMany")
	public void ManyToMany() {
		Product product = new Product();
		product.setId(123);
		product.setProductName("Samsung s22 ultra");
		
		Product product2 = new Product();
		product2.setId(456);
		product2.setProductName("Samsung TV");
		
		Product product3 = new Product();
		product3.setId(478);
		product3.setProductName("Iphone");
		
		Category category=new Category();
		category.setId(2);
		category.setTitle("Electronics");
		
		Category category2=new Category();
		category2.setId(3);
		category2.setTitle("Electronics");
		
	}

}
