package com.tuespot.JPA_Mappings.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.JPA_Mappings.model.LaptopModel;
import com.tuespot.JPA_Mappings.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

	private LaptopService laptopService;
	
	@PostMapping("/")
	public void assignLaptopToStudent(@RequestBody LaptopModel laptopModel) {
		this.laptopService.assignLaptop(laptopModel);
	}
	
}
