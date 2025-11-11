package com.pm.ex1;

public class Employee 
{
	private String empName;
	private Integer empId;
	private String city;
	private String designation;
	
	
	//no-param constructor
	public Employee() {
		super();
	}
	
	public Employee(String empName, Integer empId, String city, String designation) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.city = city;
		this.designation = designation;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", city=" + city + ", designation=" + designation
				+ "]";
	}
	
	

}
