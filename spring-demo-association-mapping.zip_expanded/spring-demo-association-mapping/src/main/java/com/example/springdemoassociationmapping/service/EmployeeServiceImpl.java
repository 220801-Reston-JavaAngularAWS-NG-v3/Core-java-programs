package com.example.springdemoassociationmapping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemoassociationmapping.dao.EmployeeDao;
import com.example.springdemoassociationmapping.entity.EmployeeEntity;
import com.example.springdemoassociationmapping.pojo.DepartmentPojo;
import com.example.springdemoassociationmapping.pojo.EmployeePojo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public List<EmployeePojo> getAllEmployee() {
		List<EmployeeEntity> allEmpEntity = empDao.findAll();
		List<EmployeePojo> allEmpPojo = new ArrayList<EmployeePojo>();
		
		allEmpEntity.forEach((eachEntity)->{
			EmployeePojo empPojo = new EmployeePojo();
			DepartmentPojo deptPojo = new DepartmentPojo();
			
			BeanUtils.copyProperties(eachEntity, empPojo);
			
			BeanUtils.copyProperties(eachEntity.getDeptEntity(), deptPojo);
			empPojo.setDeptPojo(deptPojo);
			
			allEmpPojo.add(empPojo);
		});
		
		return allEmpPojo;
	}

	@Override
	public EmployeePojo getAEmployee(int empId) {
		Optional<EmployeeEntity> empOptional = empDao.findById(empId);
		EmployeeEntity empEntity = empOptional.get();
				
		// copy empEntity into empPojo
		EmployeePojo empPojo = new EmployeePojo();
		BeanUtils.copyProperties(empEntity, empPojo);
		
		// copy the nested object also
		DepartmentPojo deptPojo = new DepartmentPojo();
		BeanUtils.copyProperties(empEntity.getDeptEntity(), deptPojo);
		empPojo.setDeptPojo(deptPojo);
		
		return empPojo;
	}

}
