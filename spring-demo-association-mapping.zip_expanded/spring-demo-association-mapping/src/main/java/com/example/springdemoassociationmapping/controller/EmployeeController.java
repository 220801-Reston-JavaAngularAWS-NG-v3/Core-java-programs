package com.example.springdemoassociationmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemoassociationmapping.pojo.DepartmentPojo;
import com.example.springdemoassociationmapping.pojo.EmployeePojo;
import com.example.springdemoassociationmapping.service.DepartmentService;
import com.example.springdemoassociationmapping.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("")
	public List<EmployeePojo> getAllEmployees(){
		return empService.getAllEmployee();
	}
	
	@GetMapping("{eid}")
	public EmployeePojo getAEmployee(@PathVariable("eid") int empId){
		return empService.getAEmployee(empId);
	}

}
