package com.cg.bookstudent.service;

import com.cg.bookstudent.entites.Student;

public interface IStudentService {
	Student add(Student student);
	Student update(Student student);
	Student findById(Integer id);

}
