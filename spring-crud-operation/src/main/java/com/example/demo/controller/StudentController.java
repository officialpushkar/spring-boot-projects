package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentData;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentServie;
import com.example.demo.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServie studentServie;
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@GetMapping("/save")
	public String saveData() {
		
		studentServie.studentData();
		return "saved";

	}
	
	@GetMapping("/getData")
		public String getData() {
		studentServiceImpl.getStudentData();
		return "gotdata";
	}

}
