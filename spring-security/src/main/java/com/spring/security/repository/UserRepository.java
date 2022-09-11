package com.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.model.Users;

public interface UserRepository extends JpaRepository<Users, String> {

	Users findByUsername(String username);
}
