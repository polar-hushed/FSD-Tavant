package com.tavant.spring.jdbc.beans;

public class Employee {
	private String employeeName;
	private String employeeDept;
	private Integer employeeID;
	private Integer employeeNumber;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String employeeName, String employeeDept, Integer employeeID, Integer employeeNumber) {
		super();
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeID = employeeID;
		this.employeeNumber = employeeNumber;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeDept=" + employeeDept + ", employeeID="
				+ employeeID + ", employeeNumber=" + employeeNumber + "]";
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	

}
