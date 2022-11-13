package com.iiitb.springmvc;

import java.util.HashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String countryName;
	private String gender;
	private String[] operatingSystems;
	
	private HashMap<String,String> countryOptions;
	
	public Student(){
		countryOptions=new HashMap<String,String>();
		countryOptions.put("India","India");
		countryOptions.put("Australia","Australia");
		countryOptions.put("Canada","Canada");
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
