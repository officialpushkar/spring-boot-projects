package com.spring.jpa.controller;

import com.spring.jpa.model.Course;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class CourseController {

    public List<Course> getCourses() {

        return Stream.of(new Course(1, "BE"), new Course(2, "BA")).collect(Collectors.toList());

    }

}
