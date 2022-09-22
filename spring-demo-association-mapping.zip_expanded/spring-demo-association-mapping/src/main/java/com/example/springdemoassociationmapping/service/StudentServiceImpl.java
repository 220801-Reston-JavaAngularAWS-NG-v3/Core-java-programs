package com.example.springdemoassociationmapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemoassociationmapping.dao.StudentDao;
import com.example.springdemoassociationmapping.entity.StudentEntity;
import com.example.springdemoassociationmapping.pojo.StudentPojo;
import com.example.springdemoassociationmapping.pojo.CoursePojo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<StudentPojo> getAllStudent() {
		List<StudentEntity> allStudentsEntity = studentDao.findAll(); // this will fetch all the students and a collection of all the 
																		//courses that each student has enrolled for
		// now lets copy allStudentsEntity into allStudentsPojo
		List<StudentPojo> allStudentsPojo = new ArrayList<StudentPojo>();
		// now iterate through allStudentsEntity and copy each object 
		allStudentsEntity.forEach((eachStudentEntity)->{
			StudentPojo insertStudentPojo = new StudentPojo();
			BeanUtils.copyProperties(eachStudentEntity, insertStudentPojo);
			
			// now each student entity has a collection of course entity, that also has to be copied
			List<CoursePojo> allCoursePojo = new ArrayList<CoursePojo>();
			eachStudentEntity.getAllCourses().forEach((eachCourseEntity)->{
				CoursePojo insertCoursePojo = new CoursePojo();
				BeanUtils.copyProperties(eachCourseEntity, insertCoursePojo);
				
				allCoursePojo.add(insertCoursePojo);
			});
			
			insertStudentPojo.setAllCourses(allCoursePojo);
			allStudentsPojo.add(insertStudentPojo);
		});
		return allStudentsPojo;
	}

	@Override
	public StudentPojo getAStudent(int studId) {
		StudentEntity fetchedStudentEntity = studentDao.findById(studId).get();
		
		StudentPojo insertStudentPojo = new StudentPojo();
		BeanUtils.copyProperties(fetchedStudentEntity, insertStudentPojo);
		
		List<CoursePojo> allCoursePojo = new ArrayList<CoursePojo>();
		fetchedStudentEntity.getAllCourses().forEach((eachCourseEntity)->{
			CoursePojo insertCoursePojo = new CoursePojo();
			BeanUtils.copyProperties(eachCourseEntity, insertCoursePojo);
			
			allCoursePojo.add(insertCoursePojo);
		});
		insertStudentPojo.setAllCourses(allCoursePojo);
		return insertStudentPojo;
	}

}
