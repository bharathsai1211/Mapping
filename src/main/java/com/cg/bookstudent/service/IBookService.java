package com.cg.bookstudent.service;

import com.cg.bookstudent.entites.Book;

public interface IBookService {
	Book add(Book book);
	Book update(Book book);
	Book allot(Integer bookId, Integer studentId);

}
