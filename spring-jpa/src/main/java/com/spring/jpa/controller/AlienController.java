package com.spring.jpa.controller;

import com.spring.jpa.model.Alien;
import com.spring.jpa.scopes.Request;
import com.spring.jpa.scopes.Singletone;
import com.spring.jpa.serviceimpl.AlienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AlienController {

	@Autowired
	AlienServiceImpl impl;

	@Autowired
	private Singletone singletone;

	@Autowired
	private Request request;

	

	@GetMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable int aid) throws InterruptedException {
		return impl.getAliens(aid);
	}

	@GetMapping("/scopes")
	public String getScopes() {
		System.out.println(singletone.getPrototype());
		System.out.println(singletone.getPrototype());
		request.setName("Pushkar");
		System.out.println(request.getName());

		return "scopes";
	}

	

}
