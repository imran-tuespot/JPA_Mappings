package com.tuespot.JPA_Mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuespot.JPA_Mappings.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
