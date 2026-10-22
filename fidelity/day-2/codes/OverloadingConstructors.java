class Employee {
	int employeeNumber;
	String employeeName;
	float employeeSalary;
	
	Employee(){	}
	
	Employee(int employeeNumber, String employeeName){
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
	}
	
	Employee(int a, String b, float c){
		/*
		this.employeeNumber = a;
		this.employeeName = b;
		*/
		this(a, b);
		this.employeeSalary = c;
	}

	void getDetails(){
		System.out.println(this.employeeNumber + " | " + this.employeeName + " | " + this.employeeSalary);		
	}
} //Employee
	
class OverloadingConstructors {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(101, "Sunil");
		Employee emp3 = new Employee(102, "Ujjwal", 2500f);

		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}
