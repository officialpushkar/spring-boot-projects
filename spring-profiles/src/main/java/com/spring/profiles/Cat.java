package com.spring.profiles;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Primary
//@Component
@Profile("cat")
public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Meoow...!");
	}

}
