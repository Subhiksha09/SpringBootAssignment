package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Book;

public interface BookRepo extends CrudRepository<Book , Integer>{

}
