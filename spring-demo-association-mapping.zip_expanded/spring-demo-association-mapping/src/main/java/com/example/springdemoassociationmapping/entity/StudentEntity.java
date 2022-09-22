package com.example.springdemoassociationmapping.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

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

@Entity
@Table(name="student_details")
public class StudentEntity {
	
	@Id
	@Column(name="stud_id")
	private int studentId;
	
	@Column(name="stud_name")
	private String studentName;
	
	@Column(name="stud_contact")
	private int studentContact;
	
	@Column(name="stud_mark")
	private int studentMark;
	
	@Column(name="stud_city")
	private String studentCity;
	
	// since we have a many to many relation between student_details and course_details, we will use the @ManyToMany annotation here
	// since one student can enroll for many course, we represent all those courses as a collection of CourseEntity here 
	// the join table specified below is the third table of the many to many relation between the 2 tables student_details and course_details
	// this represents the uni-directional side of the relation from student_details to course_details
	@ManyToMany
	@JoinTable(name="student_course_details", 
			  joinColumns = @JoinColumn(name = "stud_id"), 
			  inverseJoinColumns = @JoinColumn(name = "course_id"))
	List<CourseEntity> allCourses;
}
