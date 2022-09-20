package com.example.springdemoassociationmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemoassociationmapping.pojo.DepartmentPojo;
import com.example.springdemoassociationmapping.service.DepartmentService;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {
	
	@Autowired
	DepartmentService deptService;
	
	@GetMapping("")
	public List<DepartmentPojo> getAllDepartments(){
		return deptService.getAllDepartment();
	}
	
	@GetMapping("{did}")
	public DepartmentPojo getADepartment(@PathVariable("did") int deptId){
		return deptService.getADepartment(deptId);
	}

}
