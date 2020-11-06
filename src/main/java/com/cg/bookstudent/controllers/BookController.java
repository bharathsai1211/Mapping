package com.cg.bookstudent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstudent.dto.AllDetails;
import com.cg.bookstudent.dto.BookCustomerDetails;
import com.cg.bookstudent.entites.Book;
import com.cg.bookstudent.service.IBookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private IBookService service;
	@PostMapping("/addbook")
	public Book add(@RequestBody Book book)
	{
		return service.add(book);
	}
	@PutMapping("/updatebook")
	public Book update(@RequestBody Book book)
	{
		return service.update(book);
	}
	@PutMapping("/allot")
	public  AllDetails allot(@RequestBody BookCustomerDetails bookCustomer)
	{
		AllDetails details=new AllDetails();
		Book book=service.allot(bookCustomer.getBookId(),bookCustomer.getStudentId());
		details.setId(book.getStudent().getId());
		details.setBookName(book.getBookName());
		details.setStudentName(book.getStudent().getStudentName());
		return details;
	}

}
