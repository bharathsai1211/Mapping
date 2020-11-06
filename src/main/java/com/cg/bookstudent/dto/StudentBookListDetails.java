package com.cg.bookstudent.dto;

import java.util.List;

public class StudentBookListDetails {
	private Integer id;
	private String name;
	private List<BookDetails> bookDetails;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BookDetails> getBookDetails() {
		return bookDetails;
	}
	public void setBookDetails(List<BookDetails> bookDetails) {
		this.bookDetails = bookDetails;
	}
	

}
