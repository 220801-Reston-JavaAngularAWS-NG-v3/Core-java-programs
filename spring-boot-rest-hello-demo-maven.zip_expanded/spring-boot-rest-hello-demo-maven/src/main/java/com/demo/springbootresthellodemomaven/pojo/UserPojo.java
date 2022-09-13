package com.demo.springbootresthellodemomaven.pojo;

public class UserPojo {
	private String firstName;
	private String lastName;
	
	public UserPojo() {
		super();
	}

	public UserPojo(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "UserPojo [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
