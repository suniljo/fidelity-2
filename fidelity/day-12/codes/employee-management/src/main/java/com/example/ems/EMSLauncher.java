package com.example.ems;

import java.util.Scanner;

import com.example.ems.dto.Employee;
import com.example.ems.services.EmployeeService;
import com.example.ems.services.impl.EmployeeServiceImpl;

public class EMSLauncher {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		EmployeeService service = new EmployeeServiceImpl();
	
		Employee emp;
		int eno;
		
		while(true) {
			System.out.println("1. New Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. All Employees");
			System.out.println("6. Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				 emp = generateEmployee();
				 service.saveEmployee(emp);
				 break;
			 case 2:
				 System.out.print("search employee with eno: ");
				 eno = sc.nextInt();
				 emp = service.getEmployeeById(eno);
				 if(emp != null) {
					 System.out.println(emp);					 
				 }else {
					 System.err.println("search failed --- no employee found - " + eno);
				 }
				 break;	
			 case 3:
				 System.out.println("I will do now!!!!");
				 break;	
			 case 4:
				 System.out.print("enter employee no to delete: ");
				 eno = sc.nextInt();
				 emp = service.getEmployeeById(eno);
				 if(emp != null) {
					 System.out.println(emp);
					 System.out.print("\ndo you want to delete above employee-"+eno+"? [Y/N]: ");
					 String req = sc.next();
					 if(req.equalsIgnoreCase("Y")) {
						 service.deleteEmployeeById(eno);
					 }
				 }else {
					 System.err.println("search failed --- no employee found - " + eno);
				 }
				 break;	
			 case 5:
				 service.getAllEmployees();
				 break;	
			 case 6:
				 System.out.println("application designed & developed by");
				 System.out.println("\t team @ capgemini");
				 sc.close();
				 System.exit(0);
				 break;	
			 default:
				 System.err.println("Wrong Option Selection ---- Try Again");
			}
			System.out.println("=".repeat(100) + "\n");
		} //while		
	}

	private static Employee generateEmployee() {
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("enter employee salary: ");
		float sal = sc.nextFloat();
		
		return new Employee(eno, name, sal);
	}

}
