class Employee {
	int employeeNumber;
	String employeeName;
	float employeeSalary;
	
	Employee(){
		System.out.println("*********");
	}

	void getDetails(){
		System.out.println(employeeNumber + " | " + employeeName + " | " + employeeSalary);		
	}
} //Employee
	
class ConstructorTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}
