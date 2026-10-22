package com.fidelity.java.oops;

public class Employee {
	int employeeNumber;
	String employeeName;
	float employeeSalary;
	
	void getDetails(){
		System.out.println(employeeNumber + " | " + employeeName + " | " + employeeSalary);
	}
	
	void modifyDetails() {
		employeeNumber = 101;
		employeeName = "Sanjay Patil";
		employeeSalary = 25000f;
	}	
	
	public static void main(String[] args) {
		//create an instance of Employee type
		Employee emp = new Employee();
		
		//access the state of object/instance using reference
		System.out.println(emp.employeeNumber + " | " + emp.employeeName + " | " + emp.employeeSalary);
		
		//access the state of object/instance using reference and method
		emp.getDetails();
		
		
		//modify the state of an instance using reference
		emp.employeeName = "Sanjay";
		emp.getDetails();
		
		//modify the state of an instance using reference and method
		emp.modifyDetails();
		emp.getDetails();
	}


}
