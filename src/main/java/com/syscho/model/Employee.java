package com.syscho.model;

public class Employee {

	Employee() {

	}

	private String empId;

	private String empName;

	private String designation;
	private String experience;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Employee(String empId, String empName, String designation, String experience) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.experience = experience;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}
