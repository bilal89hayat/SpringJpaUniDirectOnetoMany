package com.example.hibernate.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hibernate.model.Student;
import com.example.hibernate.model.Student_Profile;
import com.example.hibernate.repository.StudentRepo;
import com.example.hibernate.repository.Student_Profile_Repo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping("/api")

public class StudentController {

	@Autowired
	Student_Profile_Repo student_Profile_Repo;

	@Autowired
	StudentRepo studentRepo;

	ObjectMapper mapper = new ObjectMapper();
	
	@PostMapping("/createStudent_fromprofile")
	public Student_Profile createStudent(@Valid @RequestBody Student_Profile student_Profile) {

		return student_Profile_Repo.save(student_Profile);

	}

	@PostMapping("/createStudent")
	public Student createStudent(@Valid @RequestBody Student student) throws JsonProcessingException {

		System.out.println("object is :" + mapper.writeValueAsString(student));
		
		return studentRepo.save(student);

	}

}
