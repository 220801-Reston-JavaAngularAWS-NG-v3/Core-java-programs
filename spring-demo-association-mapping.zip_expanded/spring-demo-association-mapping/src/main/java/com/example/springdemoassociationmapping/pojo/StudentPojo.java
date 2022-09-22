package com.example.springdemoassociationmapping.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.example.springdemoassociationmapping.entity.CourseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StudentPojo {
private int studentId;
	
	private String studentName;
	private int studentContact;
	private int studentMark;
	private String studentCity;
	List<CoursePojo> allCourses;
}
