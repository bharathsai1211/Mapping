package com.cg.bookstudent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstudent.dto.StudentBookListDetails;
import com.cg.bookstudent.dto.StudentDetails;
import com.cg.bookstudent.entites.Student;
import com.cg.bookstudent.service.IStudentService;
import com.cg.bookstudent.util.StudentUtil;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private IStudentService service;
	@PostMapping("/addstudent")
	public StudentDetails add(@RequestBody Student student)
	{
		StudentDetails details=new StudentDetails();
		details.setStudentName(student.getStudentName());
		service.add(student);
		return details;
	}
	@PutMapping("/updatestudent")
	public Student update(@RequestBody Student student)
	{
		return service.update(student);
	}
	@GetMapping("/by/id/{id}")
	public StudentBookListDetails studentList(@PathVariable Integer id)
	{
		
		Student student=service.findById(id);
		StudentBookListDetails details=StudentUtil.todetails(student);
		return details;
	}

}
