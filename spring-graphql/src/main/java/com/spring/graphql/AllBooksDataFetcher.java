package com.spring.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>>  {

	
	@Autowired
	BookRepository repository;
	
	@Override
	public List<Book> get(DataFetchingEnvironment environment) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
