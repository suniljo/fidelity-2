package com.example.ems.dto;

public class Employee {
	private Integer employeeNo;
	private String employeeName;
	private Float employeeSal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer employeeNo, String employeeName, Float employeeSal) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeSal = employeeSal;
	}
	public Integer getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(Integer employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Float getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(Float employeeSal) {
		this.employeeSal = employeeSal;
	}

	@Override
	public String toString() {
		String emp = String.format("%-3d  %-20s  %.2f", this.employeeNo, this.employeeName, this.employeeSal);
		return emp;
	}
	
	
}
