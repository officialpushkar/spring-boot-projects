package com.spring.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProfilesApplication implements CommandLineRunner {

	@Autowired
	Animal animal;

	@Value("${my.sys.name}")
	private String myPcName;
	 

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("PCNAME: "+myPcName);
		animal.makeSound();

	}

	@Bean
	Cat obj() {
		return new Cat();
	}

}
