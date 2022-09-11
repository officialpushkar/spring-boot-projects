package com.spring.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringIocApplication.class, args);
		Sim sim = context.getBean(Jio.class);
		sim.calling();
		sim.data();

	}

}
