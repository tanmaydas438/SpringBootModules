package com.iiitb.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.iiitb.springmvc.validation.CourseCode;


public class Customer {
	private String firstName;
	
	@NotNull(message="Is Required")
	@Size(min = 1,message = "Is Required")
	private String lastName;
	
	@Min(value = 1,message = "Min passes is 1")
	@Max(value = 10,message="Max passes is 10")
	private int freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "Enter Valid Postal Code")
	private String postalCode;
	
	@CourseCode(value = "CS",message = "Must Start with CS")
	private String courseCode;
	
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
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
	
}
