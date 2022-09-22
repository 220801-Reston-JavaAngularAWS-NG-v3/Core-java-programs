
CREATE DATABASE sample;

\c sample;

CREATE TABLE department_details(dept_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
								dept_name VARCHAR(50));

CREATE TABLE employee_details(emp_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
							  emp_name VARCHAR(50),
							  emp_salary INT,
							  dept_id INT REFERENCES department_details(dept_id));
								
CREATE TABLE student_details(stud_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, 
							 stud_name VARCHAR(50),
							 stud_contact INT,
							 stud_mark INT,
							 stud_city VARCHAR(50));

CREATE TABLE course_details(course_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, 
							course_name VARCHAR(50));

CREATE TABLE student_course_details(stud_course_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, 
									stud_id INT REFERENCES student_details(stud_id), 
									course_id INT REFERENCES course_details(course_id));