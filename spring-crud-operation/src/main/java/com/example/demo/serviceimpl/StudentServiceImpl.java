package com.example.demo.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentData;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentServie;

@Service
public class StudentServiceImpl implements StudentServie {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void studentData() {

		StudentData student = new StudentData();
		student.setFirstName("pushkar");
		student.setLastName("Devi");
		studentRepository.save(student);

	}
	
	
	public List<StudentData> getStudentData() {
		System.out.println(Arrays.asList(studentRepository.findAll()));
		
		System.out.println(studentRepository.findAll().size());
		return studentRepository.findAll();
	}

}
