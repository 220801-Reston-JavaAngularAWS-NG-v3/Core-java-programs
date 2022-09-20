package com.example.springdemoassociationmapping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemoassociationmapping.dao.DepartmentDao;
import com.example.springdemoassociationmapping.entity.DepartmentEntity;
import com.example.springdemoassociationmapping.pojo.DepartmentPojo;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentDao deptDao;
	
	@Override
	public List<DepartmentPojo> getAllDepartment() {
		List<DepartmentEntity> allDeptEntity = deptDao.findAll();
		List<DepartmentPojo> allDeptPojo = new ArrayList<DepartmentPojo>();
		allDeptEntity.forEach((eachEntity)->{
			DepartmentPojo deptPojo = new DepartmentPojo();
			BeanUtils.copyProperties(eachEntity, deptPojo);
			allDeptPojo.add(deptPojo);
		});
		
		return allDeptPojo;
	}

	@Override
	public DepartmentPojo getADepartment(int deptId) {
		Optional deptOptional = deptDao.findById(deptId);
		DepartmentPojo deptPojo = new DepartmentPojo();
		BeanUtils.copyProperties(deptOptional.get(), deptPojo);
		return deptPojo;
	}

}
