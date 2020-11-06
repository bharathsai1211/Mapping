package com.cg.bookstudent.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstudent.entites.Book;

public interface IBookdao extends JpaRepository<Book,Integer>{

}
