package com.spring.jpa.controller;

import com.spring.jpa.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class StudentController {


    @GetMapping("/students")
    public List<Student> getStudents() {
        return Stream.of(new Student(1, "Pushkar"), new Student(2, "Saket")).collect(Collectors.toList());
    }
}
