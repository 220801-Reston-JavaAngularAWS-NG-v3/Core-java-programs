package com.example.springdemoassociationmapping.pojo;

import javax.persistence.Column;

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
public class EmployeePojo {
	private int empId;
	private String empName;
	private int empSalary;
	private DepartmentPojo deptPojo;
}
