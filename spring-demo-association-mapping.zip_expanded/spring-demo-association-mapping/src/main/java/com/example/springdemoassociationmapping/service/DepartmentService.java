package com.example.springdemoassociationmapping.service;

import java.util.List;

import com.example.springdemoassociationmapping.pojo.DepartmentPojo;

public interface DepartmentService {
	
	List<DepartmentPojo> getAllDepartment();
	DepartmentPojo getADepartment(int deptId);
	
}
