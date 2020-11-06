package com.cg.bookstudent.util;

import java.util.ArrayList;
import java.util.List;

import com.cg.bookstudent.dto.BookDetails;
import com.cg.bookstudent.entites.Book;

public class BookUtil {
	public static BookDetails todetail(Book book)
	{
		BookDetails b=new BookDetails();
		b.setBookId(book.getId());
		b.setBookName(book.getBookName());
		return b;
	}
	public static List<BookDetails> todetails(List<Book> books)
	{
		
		List<BookDetails> bookList=new ArrayList<>();
		for(Book book:books)
		{
			bookList.add(todetail(book));
		}
		return bookList;
	}

}
