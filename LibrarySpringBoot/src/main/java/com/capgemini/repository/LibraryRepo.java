package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Library;

public interface LibraryRepo extends CrudRepository<Library , Integer> {

}
