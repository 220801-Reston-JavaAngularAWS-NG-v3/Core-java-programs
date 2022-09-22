package com.example.springdemoassociationmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemoassociationmapping.pojo.DepartmentPojo;
import com.example.springdemoassociationmapping.pojo.StudentPojo;
import com.example.springdemoassociationmapping.service.DepartmentService;
import com.example.springdemoassociationmapping.service.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {

	@Autowired
	StudentService studService;
	
	@GetMapping("")
	public List<StudentPojo> getAllStudents(){
		return studService.getAllStudent();
	}
	
	@GetMapping("{sid}")
	public StudentPojo getAStudent(@PathVariable("sid") int studId){
		return studService.getAStudent(studId);
	}
}
