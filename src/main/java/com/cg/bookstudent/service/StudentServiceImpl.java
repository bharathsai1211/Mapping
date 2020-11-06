package com.cg.bookstudent.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstudent.dao.IStudentdao;
import com.cg.bookstudent.entites.Student;
@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentdao dao;
	@Override
	public Student add(Student student) {
		return dao.save(student);
	}

	@Override
	public Student update(Student student) {
		return dao.save(student);
	}

	@Override
	public Student findById(Integer id) {
		return dao.findById(id).get();
	}

}
