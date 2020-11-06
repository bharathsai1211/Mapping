package com.cg.bookstudent.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstudent.entites.Student;

public interface IStudentdao extends JpaRepository<Student,Integer>{

}
