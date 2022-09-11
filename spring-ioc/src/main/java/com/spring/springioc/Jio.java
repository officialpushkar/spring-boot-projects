package com.spring.springioc;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim {

	@Override
	public void calling() {
		System.out.println("Caaling from Jio");

	}

	@Override
	public void data() {
		System.out.println("");

	}

}
