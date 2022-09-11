package com.spring.jpa.model;


import javax.persistence.Entity;

//@Entity
public class Course {

    private int id;
    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
