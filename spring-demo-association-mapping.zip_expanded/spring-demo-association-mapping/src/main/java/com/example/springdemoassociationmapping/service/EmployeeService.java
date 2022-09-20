package com.example.springdemoassociationmapping.service;

import java.util.List;

import com.example.springdemoassociationmapping.pojo.DepartmentPojo;
import com.example.springdemoassociationmapping.pojo.EmployeePojo;

public interface EmployeeService {

	List<EmployeePojo> getAllEmployee();
	EmployeePojo getAEmployee(int empId);
}
