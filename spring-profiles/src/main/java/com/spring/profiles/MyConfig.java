package com.spring.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:mydatasource.properties")
@Configuration
public class MyConfig {

	@Bean
	public MyDataSource myDataSource(@Value("${mydatasource.username}") String username,
			@Value("${mydatasource.password}") String password) {
		MyDataSource myDataSource = new MyDataSource();
		myDataSource.setPassword(password);
		myDataSource.setUsername(username);

		System.out.println(myDataSource.getPassword());
		System.out.println(myDataSource.getUsername());
		return myDataSource;
	}

}
