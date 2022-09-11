package com.spring.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MathClient {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(MathClient.class, args);
		Math math = context.getBean(Math.class);
		//MathCheat mathCheat = context.getBean(MathCheat.class);
		math.cheating();
	
		

		
		
	}

}
