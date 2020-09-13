package com.capgemini.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Book;
import com.capgemini.model.Library;
import com.capgemini.repository.BookRepo;
import com.capgemini.repository.LibraryRepo;


@Service
public class LibraryService {
	
	@Autowired
	LibraryRepo libraryRepo;
	
	@Autowired
	BookRepo bookRepo;
	
	public Library add(Library library)
	{
		return libraryRepo.save(library);
		
	}
	
	
	public Library searchBook(Integer libraryId) { 
		
		Optional<Library> optional =libraryRepo.findById(libraryId);
		Library library = optional.get();
		return library;		
	}
	
	public Book searchBookId(Integer bookId) { 
		
		Optional<Book> optional =bookRepo.findById(bookId);
		Book book = optional.get();
		return book;
	}
	
	public void deleteBook(Integer libraryId)
	{
		
		Library library = searchBook(libraryId);
		libraryRepo.delete(library);
		
	}

	
	public Book updateBookDetails(int ubookId, String ubookName, String bookAuthor, String bookPublisher) {
	
	Book book = searchBookId(ubookId);
	
    book.setBookName(ubookName);
	book.setAuthor(bookAuthor);
	book.setPublisher(bookPublisher);
	bookRepo.save(book);
	return book;
	}



}
