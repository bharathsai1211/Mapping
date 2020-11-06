package com.cg.bookstudent.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstudent.dao.IBookdao;
import com.cg.bookstudent.dao.IStudentdao;
import com.cg.bookstudent.entites.Book;
import com.cg.bookstudent.entites.Student;


@Service
@Transactional
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookdao dao;
	
	@Autowired
	private IStudentdao daostu;
	@Override
	public Book add(Book book) {
		
		return dao.save(book);
	}

	@Override
	public Book update(Book book) {
		return dao.save(book);
	}

	@Override
	public Book allot(Integer bookId, Integer studentId) {
		Optional<Book> book=dao.findById(bookId);
		Optional<Student> Student=daostu.findById(studentId);
		Book b=book.get();
		b.setStudent(Student.get());
		Student s=Student.get();
		List<Book> books=s.getBooklist();
		if(books==null)
		{
			books=new ArrayList<>();
			s.setBooklist(books);
		}
		books.add(b);
		return book.get();
	}
	

}
