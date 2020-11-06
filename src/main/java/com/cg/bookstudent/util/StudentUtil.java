package com.cg.bookstudent.util;

import java.util.List;

import com.cg.bookstudent.dto.BookDetails;
import com.cg.bookstudent.dto.StudentBookListDetails;
import com.cg.bookstudent.entites.Book;
import com.cg.bookstudent.entites.Student;

public class StudentUtil {
	public static StudentBookListDetails todetails(Student student)
	{
		List<Book> books=student.getBooklist();
		List<BookDetails> booksDetail=null;
		if(books!=null)
		{
			booksDetail=BookUtil.todetails(books);
		}
		StudentBookListDetails details=new StudentBookListDetails();
		details.setBookDetails(booksDetail);
		details.setId(student.getId());
		details.setName(student.getStudentName());
		return details;
		
	}
	

}
