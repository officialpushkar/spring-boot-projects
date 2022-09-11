package com.spring.graphql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class BookDataFetcher implements DataFetcher<Book> {

	
	@Autowired
	BookRepository repository;
	
	@Override
	public Book get(DataFetchingEnvironment environment) {
		
		String isn = environment.getArgument("id");
		
		return repository.findOne(isn);
	}
	
	

}
