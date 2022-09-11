package com.spring.springioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Airtel");
	}

	@Override
	public void data() {
		System.out.println("Browsing using Airtel sim");

	}

}
