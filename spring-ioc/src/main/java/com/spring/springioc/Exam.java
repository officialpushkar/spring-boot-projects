package com.spring.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Exam.class, args);
		Student student = context.getBean(Student.class);
		student.setName("Pushkar");
		
		
		System.out.println(student);
	}

}
