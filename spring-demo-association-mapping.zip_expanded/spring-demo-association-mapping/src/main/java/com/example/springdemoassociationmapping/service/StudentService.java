package com.example.springdemoassociationmapping.service;

import java.util.List;

import com.example.springdemoassociationmapping.pojo.EmployeePojo;
import com.example.springdemoassociationmapping.pojo.StudentPojo;

public interface StudentService {

	List<StudentPojo> getAllStudent();
	StudentPojo getAStudent(int studId);
}
