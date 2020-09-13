package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.model.Book;
import com.capgemini.model.Library;
import com.capgemini.service.LibraryService;


@Controller
public class LibraryController {
	
	@Autowired
	LibraryService libraryService;
	
	
	@RequestMapping("/home")
	public String index()
	{
		System.out.println("index");
		return "index.jsp";
	}
	
	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public ModelAndView addBook(Library library,Book book)
	{			
		ModelAndView modelView = new ModelAndView("AddLib.jsp");
		book.setLibrary(library);
		library.getBook().add(book);	
		Library library2=libraryService.add(library);
		modelView.addObject(library2);
		return modelView;
		
	}
	
	
	
	@RequestMapping(value = "/searchbook",method = RequestMethod.GET)
	public ModelAndView searchBook(@RequestParam int libraryId, @RequestParam int bookId) 
	{
		ModelAndView modelView = new ModelAndView("SearchLib.jsp");
		Library library = libraryService.searchBook(libraryId);
		Book book=libraryService.searchBookId(bookId);
		modelView.addObject(library);
		modelView.addObject(book);
		return modelView;
	}
	
	@RequestMapping(value="/deletebook",method=RequestMethod.GET)
	public String deleteBook(@RequestParam int libraryId) 
	{
		libraryService.deleteBook(libraryId);
		return "Delete.jsp";
	}
		
	
	@RequestMapping(value = "/updatebook",method = RequestMethod.POST)
	public ModelAndView updateBook(@RequestParam int bookId, @RequestParam String bookName,
			@RequestParam String author, @RequestParam String publisher) 
	{
		ModelAndView modelView = new ModelAndView("UpdateLib.jsp");
		Book book = libraryService.updateBookDetails(bookId,bookName,author,publisher);
		modelView.addObject(book);
		return modelView;
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(@RequestParam int libraryId, @RequestParam String libraryName, Book book)
	{
		Library library = libraryService.searchBook(libraryId);
		library.setLibraryName(libraryName);		
		book.setLibrary(library);
		library.getBook().add(book);
		libraryService.add(library);
		return "AddLib.jsp";
	
	}

}
