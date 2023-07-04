package com.tuespot.JPA_Mappings.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.JPA_Mappings.entity.Laptop;
import com.tuespot.JPA_Mappings.model.LaptopModel;
import com.tuespot.JPA_Mappings.repository.LaptopRepository;
import com.tuespot.JPA_Mappings.repository.StudentRepository;
import com.tuespot.JPA_Mappings.service.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService {

	
	@Autowired
	private LaptopRepository laptopRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void assignLaptop(LaptopModel laptopModel) {
		Laptop lap = new Laptop();
		lap.setBrand("HP");
		lap.setModelNumber("122");
		lap.setStudent(this.studentRepository.findById(laptopModel.getStudentId()).get());
	}

}
