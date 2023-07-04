package com.tuespot.JPA_Mappings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tuespot.JPA_Mappings.entity.Student;
import com.tuespot.JPA_Mappings.repository.StudentRepository;

@SpringBootApplication
public class JpaMappingsApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(JpaMappingsApplication.class, args);
		
	}

}
