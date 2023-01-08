package com.siilo.rest.RestAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id @GeneratedValue
	private int empId;
	
	private String name;
	
	private String skills;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, String skills)
	{
		this.skills=skills;
		this.name = name;
	}
	
	public int getEmpId() {
		
		return empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", skills=" + skills + "]";
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
