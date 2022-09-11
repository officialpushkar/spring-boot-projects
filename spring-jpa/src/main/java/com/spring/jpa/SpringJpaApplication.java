package com.spring.jpa;

import com.spring.jpa.bank.service.UserPaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableCaching
@OpenAPIDefinition(info = @Info(title = "Product API", version = "2.0",description = "Product MicroService"))
@EnableAspectJAutoProxy
public class SpringJpaApplication {

	public static void main(String[] args) {

		// ApplicationContext applicationContext =
		 SpringApplication.run(SpringJpaApplication.class, args);

		/*
		 * AlienName alienName = new AlienName(); alienName.setFname("Delta");
		 * alienName.setMname("Samson"); alienName.setLname("Charlie");
		 * 
		 * Laptop laptop = new Laptop(); laptop.setLname("samba");
		 * 
		 * Alien alien = new Alien(); alien.setColor("Green");
		 * alien.setAlienName(alienName); alien.getLaptop().add(laptop);
		 */

		// laptop.getAlien().add(alien);

	}

}
