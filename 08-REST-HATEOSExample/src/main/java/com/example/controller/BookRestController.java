package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/book/{bookId}"
/*				produces = {"application/json"},
				consumes = {"application/json"}
*/				)
	public Book getBookInfo(@PathVariable("bookId") int id) {
	//	Book b = new Book();
		Book book = new Book(111, "Spring", 280.00, "RodJohnson");
		/*Book book1 = new Book(222, "Java", 290.00, "JamesGosling");
		Book book2 = new Book(333, "REST", 270.00, "RoyField");
		*/
		/*if(id==111) {
			return book;
		}else if(id==222) {
			return book1;
		}*/
	     //WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(null, null))
		
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class)
												  .getAllBook()).withRel("ALL-BOOKS");
		
		book.add(link);
		
		
		return book;
			
		
	}
	
	@GetMapping(value = "/getAllBooks"
			/*	produces = "application/json",
				consumes = "application/json"*/)
	public List<Book> getAllBook() {
		
		Book b1 = new Book(123,"Mysql",170.00,"mysqlAuthor");
		Book b2 = new Book(124, "Python", 250.00, "pythonAuthor");
		Book b3 = new Book(125,"Microservices",400.00,"DataStructure");
		Book b4 = new Book(126, "Hibernet", 210.00, "hibernetAuthor");
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(b4);
		list.add(b3);
		list.add(b2);
		list.add(b1);
		
		return list;
		
		
	}
}
